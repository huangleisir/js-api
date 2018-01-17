package com.jst.prodution.member.model;

import com.jst.prodution.base.bean.BaseBean;

public class OcdMemberInfo extends BaseBean {
	private static final long serialVersionUID = 1L;
	
	private String userId;			//第三方系统（商户系统）/会员系统 的用户Id 
	private String idCardNo;		//身份证号 
	private String userName;		//用户姓名 
	private String bankName;		//开户银行 
	private String bankCardNo;		//银行卡号 
	private String bankCode;		//银行编码
	
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public String getIdCardNo() {
		return idCardNo;
	}
	public void setIdCardNo(String idCardNo) {
		this.idCardNo = idCardNo;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getBankName() {
		return bankName;
	}
	public void setBankName(String bankName) {
		this.bankName = bankName;
	}
	public String getBankCardNo() {
		return bankCardNo;
	}
	public void setBankCardNo(String bankCardNo) {
		this.bankCardNo = bankCardNo;
	}
	public String getBankCode() {
		return bankCode;
	}
	public void setBankCode(String bankCode) {
		this.bankCode = bankCode;
	}
}
