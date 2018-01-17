package com.jst.prodution.member.model;

/** 
* @ClassName: Smsgsed 
* @Description: 验证码短信发送记录表
* @author liaozr 
* @date 2016-07-26 上午11:38:35 
*  
*/

public class MsgSed implements java.io.Serializable {
	private static final long serialVersionUID = 1L;
	private String msgId;			//发送ID
	private String phone;  			//手机号
	private String msg_date;		//发送日期	
	private String msg_time;		//发送时间
	private String cus_name;		//接收人姓名
	private String msg_txt;			//信息内容
	private String msg_staste;		//发送状态：0已发送 1 未发送 

	public String getMsgId() {
		return msgId;
	}
	public void setMsgId(String msgId) {
		this.msgId = msgId;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getMsg_date() {
		return msg_date;
	}
	public void setMsg_date(String msg_date) {
		this.msg_date = msg_date;
	}
	public String getMsg_time() {
		return msg_time;
	}
	public void setMsg_time(String msg_time) {
		this.msg_time = msg_time;
	}
	public String getCus_name() {
		return cus_name;
	}
	public void setCus_name(String cus_name) {
		this.cus_name = cus_name;
	}
	public String getMsg_txt() {
		return msg_txt;
	}
	public void setMsg_txt(String msg_txt) {
		this.msg_txt = msg_txt;
	}
	public String getMsg_staste() {
		return msg_staste;
	}
	public void setMsg_staste(String msg_staste) {
		this.msg_staste = msg_staste;
	}

}