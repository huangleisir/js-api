package com.jst.prodution.util;

import java.io.File;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.security.InvalidKeyException;
import java.security.Key;
import java.security.NoSuchAlgorithmException;

import javax.crypto.BadPaddingException;
import javax.crypto.Cipher;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.NoSuchPaddingException;

import com.jst.prodution.constants.ApiConstants;
import com.jst.prodution.util.ILogger;
import com.jst.prodution.util.encrypt.CommonTools;

/**
 * @ClassName: EncryptUtils
 * @Description: MD5加解密
 * @author 汤广海
 * @date 2016-09-13 11:19
 */
public class EncryptUtils {

	private static ILogger log = new ILogger(ApiConstants.JST_FINANCE_API, EncryptUtils.class);
	private static Key key = null;
	private static Cipher cipher = null;
	private static final String WORK_PATH = Thread.currentThread().getContextClassLoader().getResource("").getPath();
	private static final String KEY_PATH = WORK_PATH + "config" + File.separator + "Key.dvc";
	private static CommonTools cts = new CommonTools();
	public static final String KEY_NAME = "DESede";
	
//	public static void main(String[] args) {
//		String plaintext = "1000232";
//		String ciphertext = EncryptUtils.encrypt(plaintext);
//		log.info("加密---------------" + ciphertext);
//		log.info("解密---------------" + EncryptUtils.deEncrypt(ciphertext));
//	}
	
	/**
	 * 加密字符串
	 * @param plaintext
	 * @return
	 */
	public static String encrypt(String plaintext){
		init();
		String ciphertext = "";
		byte[] encryptArray = new byte[0];
		//opmode:1-ENCRYPT_MODE,2-DECRYPT_MODE,3-WRAP_MODE,4-UNWRAP_MODE
		try {
			cipher.init(Cipher.ENCRYPT_MODE, key);
			byte[] arrayStr = plaintext.getBytes("UTF-8");
			encryptArray = cipher.doFinal(arrayStr);
			ciphertext = cts.byteArrayToString(encryptArray);
		} catch (InvalidKeyException e) {
			log.info("加密算法|密钥无效：" + e.getMessage());
		} catch (UnsupportedEncodingException e) {
			log.info("加密算法|字符集编码不支持：" + e.getMessage());
		} catch (IllegalBlockSizeException e) {
			log.info("加密算法：" + e.getMessage());
		} catch (BadPaddingException e) {
			log.info("加密算法：" + e.getMessage());
		}
		return ciphertext;
	}
	
	/**
	 * 解密字符串
	 * @param ciphertext
	 * @return
	 */
	public static String deEncrypt(String ciphertext){
		init();
		byte[] dencryptArray = new byte[0];
		try {
			String value = new String(ciphertext.getBytes("UTF-8"));
			byte[] dencStr = cts.stringToByteArray(value);
			cipher.init(Cipher.DECRYPT_MODE, key);
			dencryptArray = cipher.doFinal(dencStr);
		} catch (InvalidKeyException e) {
			log.info("解密算法|密钥无效：" + e.getMessage());
		} catch (UnsupportedEncodingException e) {
			log.info("解密算法|字符集编码不支持：" + e.getMessage());
		} catch (IllegalBlockSizeException e) {
			log.info("解密算法：" + e.getMessage());
		} catch (BadPaddingException e) {
			log.info("解密算法：" + e.getMessage());
		}
		return new String(dencryptArray);
	}
	
	/**
	 * 创建密钥文件
	 * @return
	 */
	public boolean createKeyFile(){
		String secretKey = cts.createSecretKey();
		try {
			CommonTools.writeInformation(WORK_PATH + File.separator + "JSTkey.dvc", secretKey);
			return true;
		} catch (IOException e) {
			log.info("创建密钥文件失败：" + e.getMessage());
			return false;
		}
	}
	
	private static void init() {
		if(cipher == null){
			if(key == null){
				key = cts.readKeyinfo(KEY_PATH);
			}
			try {
				cipher = Cipher.getInstance(KEY_NAME);
			} catch (NoSuchAlgorithmException e) {
				log.info("实例化对称密钥对象失败：" + e.getMessage());
			} catch (NoSuchPaddingException e) {
				log.info("实例化对称密钥对象失败：" + e.getMessage());
			}
		}
	}
}
