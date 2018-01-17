package com.jst.prodution.util;
 
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.net.InetSocketAddress;
import java.util.Iterator;
import java.util.List;
import java.util.StringTokenizer;

import org.apache.poi.hssf.usermodel.HSSFWorkbook;

import sun.net.TelnetOutputStream;
import sun.net.ftp.FtpClient;
import sun.net.ftp.FtpProtocolException;
/**
 * FTP客户端
 * @author 汤广海 2017-05-22
 *
 */
public class FtpJDK7Utils {
 
   /**
    * 
    * @Title: connectFTP   
    * @Description: 连接FTP
    * @param: @param ftpClient FTP客户端
    * @param: @param url  远程的连接ip
    * @param: @param port 端口号
    * @param: @param user  用户名
    * @param: @param password 用户密码
    * @param: @param remoteFilePath 连接后进入的初始目录
    * @param: @return
    * @param: @throws FtpProtocolException      
    * @return: FtpClient      
    * @throws
    */
    public static FtpClient connectFTP(FtpClient ftpClient,String url,int port,String user,String password,String remoteFilePath) throws FtpProtocolException {
    	try {
            ftpClient = FtpClient.create();
            ftpClient.connect(new InetSocketAddress(url, port));
            ftpClient.login(user, password.toCharArray());
            ftpClient.setBinaryType();
            if (!"".equals(remoteFilePath) && remoteFilePath != null) {
                ftpClient.changeDirectory(remoteFilePath);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    	return ftpClient;
    }
 
    /**
     * 关闭FTP链接
     */
    public static void closeFTP(FtpClient ftpClient) {
        try {
            if (ftpClient != null) {
                ftpClient.close();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
 
    /**
     * 上传文件到FTP
     * @param file file文件，struts2从页面得到的File类型
     * @param file file文件，struts2从页面得到的File类型
     * @param file file文件，struts2从页面得到的File类型

     * @param filePath 要保存在FTP上的路径（文件夹）
     * @param fileName 文件名（test001.jpg）
     * @return 文件是否上传成功
     * @throws Exception
     */

    public static boolean upload(FtpClient ftpClient,File file, String filePath, String remoteFilePath, String fileName) {
        TelnetOutputStream to = null;
        FileInputStream fi = null;
        filePath = remoteFilePath + filePath;
        try {
            if (file != null) {
//                connectFTP();
                if (!isDirExist(ftpClient,filePath.replace("\\", "/"))) {
                    createDir(ftpClient,filePath.replace("\\", "/"));
                    ftpClient.changeDirectory(filePath.replace("\\", "/"));
                }
                fi = new FileInputStream(file);
                to = (TelnetOutputStream) ftpClient.putFileStream(fileName, true);
                byte[] bytes = new byte[1024];
                int i = fi.read(bytes);
                while (i != -1) {
                    to.write(bytes);
                    i = fi.read(bytes);
                }
            }
            return true;
        } catch (FileNotFoundException e1) {
            return false;
        } catch (IOException e2) {
            return false;
        }catch (Exception e) {
            return false;
        }finally {
            if (fi != null) {
                try {
                    fi.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            if (to != null) {
                try {
                    to.flush();
                    to.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            closeFTP(ftpClient);
        }
    }
    
    /**
     * 
     * @Title: writerRemoteExcelFile   
     * @Description: 写入远程excel文件   
     * @param: @param ftpClient
     * @param: @param fileStrList
     * @param: @param filePath
     * @param: @param remoteFilePath
     * @param: @param fileName
     * @param: @return      
     * @return: boolean      
     * @throws
     */
    public static boolean writerRemoteExcelFile(FtpClient ftpClient,List<Object[]> fileStrList, String filePath, String remoteFilePath, String fileName) {
      TelnetOutputStream to = null;
//      FileInputStream fi = null;
      String[] billsName = fileName.split(".xls");
		int[] colWidth = {180, 180, 180,180,180, 180, 180, 180, 180, 230, 180, 180, 180, 180, 180, 180, 180, 180, 180, 180, 180, 180, 180, 180, 180, 180, 180, 180, 180, 180};
		CreateExcelUtil ex = new CreateExcelUtil(billsName[0], billsName[0], colWidth, fileStrList);  
        HSSFWorkbook workbook = new HSSFWorkbook();                     // 创建工作簿对象  
		try {
			workbook = ex.export();
		} catch (Exception e3) {
			e3.printStackTrace();
		}  
		
      filePath = remoteFilePath + filePath;
      try {
          if (fileStrList != null) {
              if (!isDirExist(ftpClient,filePath.replace("\\", "/"))) {
                  createDir(ftpClient,filePath.replace("\\", "/"));
                  ftpClient.changeDirectory(filePath.replace("\\", "/"));
              }
              try {
                  ftpClient.deleteFile(fileName);
				} catch (Exception e) {
					System.out.println(fileName+"不存在");
				}
              if(workbook !=null){  
            	  to = (TelnetOutputStream) ftpClient.putFileStream(fileName, true);
                  workbook.write(to);
              }
          }
      } catch (FileNotFoundException e1) {
      	e1.printStackTrace();
          return false;
      } catch (IOException e2) {
      	e2.printStackTrace();
          return false;
      }catch (Exception e) {
      	e.printStackTrace();
          return false;
      }finally {
          if (to != null) {
              try {
                  to.flush();
                  to.close();
              } catch (IOException e) {
                  e.printStackTrace();
              }
          }
          closeFTP(ftpClient);
      }
      return true;
  }
	 /**
	  * 
	  * @Title: writerRemoteFile   
	  * @Description: FTP远程写入文件
	  * @param: @param ftpClient FTP客户端
	  * @param: @param fileStrList 写入的字符串集合
	  * @param: @param filePath  写入的文件所在的文件夹
	  * @param: @param remoteFilePath 写入的文件所在的路径
	  * @param: @param fileName 写入的文件名
	  * @param: @return      
	  * @return: boolean 是否写入成功     
	  * @throws
	  */
    public static boolean writerRemoteFile(FtpClient ftpClient,List<String> fileStrList, String filePath, String remoteFilePath, String fileName) {
//        TelnetOutputStream to = null;
//        FileInputStream fi = null;
    	PrintWriter pw = null;
        filePath = remoteFilePath + filePath;
        try {
            if (fileStrList != null) {
//                connectFTP();
                if (!isDirExist(ftpClient,filePath.replace("\\", "/"))) {
                    createDir(ftpClient,filePath.replace("\\", "/"));
                    ftpClient.changeDirectory(filePath.replace("\\", "/"));
                }
                try {
                    ftpClient.deleteFile(fileName);
				} catch (Exception e) {
					System.out.println(fileName+"不存在");
				}
                pw = new  PrintWriter(ftpClient.putFileStream(fileName, true)); // 写入的文件名 
                Iterator<String> iterator = fileStrList.iterator();
                while(iterator.hasNext()){
                	String lineStr = (String)iterator.next();
                	 pw.write(lineStr);
                     pw.println();
                }
            }
        } catch (FileNotFoundException e1) {
        	e1.printStackTrace();
            return false;
        } catch (IOException e2) {
        	e2.printStackTrace();
            return false;
        }catch (Exception e) {
        	e.printStackTrace();
            return false;
        }finally {
            if (pw != null) {
                pw.flush();
				pw.close();
            }
            closeFTP(ftpClient);
        }
        return true;
    }
    
    /**
     * 
     * @Title: deleteFileFtp   
     * @Description: 删除FTP制定目录下的文件
     * @param: @param ftpClient FTP客户端
     * @param: @param filePath 文件在FTP文件夹
     * @param: @param remoteFilePath 文件在FTP存储的路径
     * @param: @param fileName 要删除的文件名称
     * @param: @return      
     * @return: boolean 是否删除成功  
     * @throws
     */
    public static boolean deleteFileFtp(FtpClient ftpClient,String filePath, String remoteFilePath, String fileName){  
        try{
            filePath = remoteFilePath + filePath ;
            if (!isDirExist(ftpClient,filePath.replace("\\", "/"))) {
                return false;
            }
            ftpClient.changeDirectory(filePath.replace("\\", "/"));
            ftpClient.deleteFile(fileName);
            return true;
        }catch (Exception e) {
            e.printStackTrace();
            return false;
        }finally {
            closeFTP(ftpClient);
        }
    }
    /**
     * 检查文件夹是否存在
     * 
     * @param dir
     * @param ftpClient
     * @return
     */
    private static Boolean isDirExist(FtpClient ftpClient,String dir) {
        try {
            ftpClient.changeDirectory(dir);
        } catch (Exception e) {
            return false;
        }
        return true;
    }
 
    /**
     * 创建文件夹
     * 
     * @param dir
     * @param ftpClient
     * @throws Exception
     */
    private static void createDir(FtpClient ftpClient,String dir) throws Exception {
        ftpClient.setAsciiType();
        StringTokenizer s = new StringTokenizer(dir, "/"); // sign
        s.countTokens();
        String pathName = "";
        while (s.hasMoreElements()) {
            pathName = pathName + "/" + (String) s.nextElement();
            try {
                ftpClient.makeDirectory(pathName);
            } catch (Exception e) {
                e = null;
            }
        }
        ftpClient.setBinaryType();
 
    }
 
}