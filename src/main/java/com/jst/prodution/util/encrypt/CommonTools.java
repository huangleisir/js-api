package com.jst.prodution.util.encrypt;

import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.security.NoSuchAlgorithmException;

import javax.crypto.KeyGenerator;
import javax.crypto.SecretKey;
import javax.crypto.spec.SecretKeySpec;

import com.jst.prodution.constants.ApiConstants;
import com.jst.prodution.util.ILogger;

import sun.misc.BASE64Decoder;
import sun.misc.BASE64Encoder;
/**
 * @ClassName: CommonTools
 * @Description: 密钥生成辅助通用工具类
 * @author 汤广海
 * @date 2016-09-13 11:30
 */
public class CommonTools {

	private static ILogger log = new ILogger(ApiConstants.JST_FINANCE_API, CommonTools.class);
	/**
	 * 将字符串译码成字节数组
	 * @param serializerStr
	 * @return
	 */
	public byte[] stringToByteArray(String serializerStr){
		BASE64Decoder decoder = new BASE64Decoder();
		byte[] strByte = null;
		try {
			strByte = decoder.decodeBuffer(serializerStr);
		} catch (IOException e) {
			log.info("将String译码为Byte数组异常:" + e.getMessage());
		}
		return strByte;
	}
	
	/**
	 * 将字节数组译码成字符串
	 * @param byt
	 * @return
	 */
	public String byteArrayToString(byte[] byt){
		BASE64Encoder enc = new BASE64Encoder();
		return enc.encode(byt);
	}
	
	/**
	 * 创建一个DES密钥
	 * @return
	 */
	public String createSecretKey(){
		String secKey = null;
		try {
			KeyGenerator keyGenerator = KeyGenerator.getInstance("DESede");
			keyGenerator.init(168);
			SecretKey secretKey = keyGenerator.generateKey();
			byte[] arrayKey = secretKey.getEncoded();
			secKey = byteArrayToString(arrayKey);
		} catch (NoSuchAlgorithmException e) {
			log.info("创建密钥失败:" + e.getMessage());
		}
		return secKey;
	}
	
	/**
	 * 读取key.dvc文件
	 * @param keyDvcPath
	 * @return
	 */
	public SecretKeySpec readKeyinfo(String keyDvcPath){
		SecretKeySpec secretKeySpec = null;
		try {
			FileInputStream fis = new FileInputStream(keyDvcPath);
			ObjectInputStream ois = new ObjectInputStream(fis);
			secretKeySpec = (SecretKeySpec) ois.readObject();
			fis.close();
			ois.close();
		} catch (FileNotFoundException e) {
			log.info("找不到文件" + keyDvcPath + ":" + e.getMessage());
		} catch (ClassNotFoundException e) {
			log.info("找不到文件" + keyDvcPath + ":" + e.getMessage());
		} catch (IOException e) {
			log.info("IOException:"+e.getMessage());
		}
		return secretKeySpec;
	}
	
	/**
	 * 向指定文件里写入数据
	 * @param path
	 * @param obj
	 * @throws IOException
	 */
	public static void writeInformation(String path, String obj) throws IOException{
		FileOutputStream fos = new FileOutputStream(path);
		DataOutputStream dos = new DataOutputStream(fos);
		dos.writeBytes(obj);
		dos.flush();
		dos.close();
		fos.close();
	}
	
	/**
	 * 读取文件内容
	 * @param path
	 * @return
	 */
	public String readInformation(String path){
		String keyGenerator = null;
		byte[] buff = new byte[32];
		try {
			FileInputStream fis = new FileInputStream(path);
			StringBuffer sb = new StringBuffer();
			int offset = 0;
			while((offset = fis.read(buff)) != -1){
				sb.append(new String(buff));
			}
			keyGenerator = sb.toString();
		} catch (FileNotFoundException e) {
			log.info("找到不到文件" + path + ":" + e.getMessage());
		} catch (IOException e) {
			log.info("IO流异常:" + e.getMessage());
		}
		return keyGenerator;
	}
	
}
