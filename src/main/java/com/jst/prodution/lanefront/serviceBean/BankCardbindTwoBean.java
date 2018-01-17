package com.jst.prodution.lanefront.serviceBean;

import com.jst.prodution.base.bean.BaseBean;



/**
 * 第二次鉴权
 * @author 
 *
 */
public class BankCardbindTwoBean extends BaseBean {
	

	private static final long serialVersionUID = 1L;
	private String externalRefNumber;
	private String token;
	private String userId;  
	private String certNo; 
	private String userName; 
	private String bankCardNo; 
	private String bankCardType; 
	private String expireDate; 
	private String checkCode; 
	private String telephone; 
	private String authenflowNo; 
	private String verifyNum; 
	private String cardLastFourNo;

	public String getExternalRefNumber() {
		return externalRefNumber;
	}

	public void setExternalRefNumber(String externalRefNumber) {
		this.externalRefNumber = externalRefNumber;
	}

	public String getToken() {
		return token;
	}

	public void setToken(String token) {
		this.token = token;
	}

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getCertNo() {
		return certNo;
	}

	public void setCertNo(String certNo) {
		this.certNo = certNo;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getBankCardNo() {
		return bankCardNo;
	}

	public void setBankCardNo(String bankCardNo) {
		this.bankCardNo = bankCardNo;
	}

	public String getVerifyNum() {
		return verifyNum;
	}

	public void setVerifyNum(String verifyNum) {
		this.verifyNum = verifyNum;
	}

	public String getBankCardType() {
		return bankCardType;
	}

	public void setBankCardType(String bankCardType) {
		this.bankCardType = bankCardType;
	}

	public String getExpireDate() {
		return expireDate;
	}

	public void setExpireDate(String expireDate) {
		this.expireDate = expireDate;
	}

	public String getCheckCode() {
		return checkCode;
	}

	public void setCheckCode(String checkCode) {
		this.checkCode = checkCode;
	}



	public String getTelephone() {
		return telephone;
	}

	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}

	public String getAuthenflowNo() {
		return authenflowNo;
	}

	public void setAuthenflowNo(String authenflowNo) {
		this.authenflowNo = authenflowNo;
	}

	public String getCardLastFourNo() {
		return cardLastFourNo;
	}

	public void setCardLastFourNo(String cardLastFourNo) {
		this.cardLastFourNo = cardLastFourNo;
	}    


	
}
