package com.jst.prodution.member.serviceBean;

import com.jst.prodution.base.bean.BaseBean;

public class UserLoansCardBean extends BaseBean{
  
	private static final long serialVersionUID = 1L;
	private String userId ;            	//用户标识
	private String userName;		   	//用户名称
	private String cardId;           	//卡号
	private String bankCode;			//银行简写
	private String bankName;          	//银行名称             
	private String openName;          	//开户名  
	private String telphone;			//手机号码
	private String certNo;				//身份证
	private String isLock;				//是否锁定为贷款卡
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getCardId() {
		return cardId;
	}
	public void setCardId(String cardId) {
		this.cardId = cardId;
	}
	
	public String getBankCode() {
		return bankCode;
	}
	public void setBankCode(String bankCode) {
		this.bankCode = bankCode;
	}
	public String getBankName() {
		return bankName;
	}
	public void setBankName(String bankName) {
		this.bankName = bankName;
	}
	public String getOpenName() {
		return openName;
	}
	public void setOpenName(String openName) {
		this.openName = openName;
	}
	public String getTelphone() {
		return telphone;
	}
	public void setTelphone(String telphone) {
		this.telphone = telphone;
	}
	public String getCertNo() {
		return certNo;
	}
	public void setCertNo(String certNo) {
		this.certNo = certNo;
	}
	public String getIsLock() {
		return isLock;
	}
	public void setIsLock(String isLock) {
		this.isLock = isLock;
	}
}
