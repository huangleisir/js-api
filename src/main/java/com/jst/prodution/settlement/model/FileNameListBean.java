package com.jst.prodution.settlement.model;

import java.util.List;

import com.jst.prodution.base.bean.BaseBean;

/**
 * 手动获取文件名
 * @author tomy
 *
 */
public class FileNameListBean extends BaseBean {

	private static final long serialVersionUID = 1L;
	
	private String fileName;//
	private String channelType;//
	private String userName;//
	private String tranDate;//交易日期
	private List<FileNameListBean> fileNamelist;
	

    /**
     * @return the userName
     */
    public String getUserName() {
        return userName;
    }
    /**
     * @param userName the userName to set
     */
    public void setUserName(String userName) {
        this.userName = userName;
    }
    /**
     * @return the channelType
     */
    public String getChannelType() {
        return channelType;
    }
    /**
     * @param channelType the channelType to set
     */
    public void setChannelType(String channelType) {
        this.channelType = channelType;
    }
    /**
     * @return the fileName
     */
    public String getFileName() {
        return fileName;
    }
    /**
     * @param fileName the fileName to set
     */
    public void setFileName(String fileName) {
        this.fileName = fileName;
    }
    /**
     * @return the tranDate
     */
    public String getTranDate() {
        return tranDate;
    }
    /**
     * @param tranDate the tranDate to set
     */
    public void setTranDate(String tranDate) {
        this.tranDate = tranDate;
    }
    /**
     * @return the fileNamelist
     */
    public List<FileNameListBean> getFileNamelist() {
        return fileNamelist;
    }
    /**
     * @param fileNamelist the fileNamelist to set
     */
    public void setFileNamelist(List<FileNameListBean> fileNamelist) {
        this.fileNamelist = fileNamelist;
    }


}
