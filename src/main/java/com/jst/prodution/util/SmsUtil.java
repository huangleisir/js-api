package com.jst.prodution.util;

import java.io.IOException;

import org.apache.http.client.ClientProtocolException;

import com.alibaba.fastjson.JSONObject;

/**
 * 调用短信平台工具类
 * @author 汤广海
 *
 */
public class SmsUtil {

	public static void main(String[] args) {
		JSONObject json2 = new JSONObject();
        JSONObject json1 = new JSONObject();
        json2.put("merchant_name", "test");
        json2.put("merchant_no", "10006");
        json2.put("init_pwd", "123321");
        json1.put("terminal_type", "M");
        json1.put("phone", "18825265187");
        json1.put("template_code", "1003");//1003 风控短信提醒  1001 发送短信验证码
        json1.put("template_data", json2);
        try {
			String recive = sendMsg("http://10.101.130.212:11380/jst-sms/message/sendVerify", json1.toJSONString());
			System.out.println(recive);
			
		} catch (ClientProtocolException e) {
		} catch (IOException e) {
		}
	}
	/**
	 * 调用短信平台发送短信(普通短信、验证码)
	 * @return
	 * @throws IOException 
	 * @throws ClientProtocolException 
	 */
	public static String sendMsg(String url, String json) throws ClientProtocolException, IOException{
        return HttpRequest.sendPostJson(url, json);
	}
}
