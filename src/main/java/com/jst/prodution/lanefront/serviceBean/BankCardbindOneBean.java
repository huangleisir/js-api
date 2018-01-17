package com.jst.prodution.lanefront.serviceBean;

import com.jst.prodution.base.bean.BaseBean;

/**
 * 第一次鉴权
 * 
 * @author
 *
 */
public class BankCardbindOneBean extends BaseBean {

	private static final long serialVersionUID = 1L;
	private String userId;
	private String certNo;
	private String userName;
	private String bankId;
	private String bankCardNo;
	private String bankCardType;
	private String expireDate;
	private String checkCode;
	private String telephone;
	private String cardLastFourNo;
	private String channelCode;// 通道编码
	private String authenflowNo;// 客户号
	private String externalRefNumber;// 外部跟踪编号
	private String token;// 令牌信息

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

	public String getBankId() {
		return bankId;
	}

	public void setBankId(String bankId) {
		this.bankId = bankId;
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

	public String getCardLastFourNo() {
		return cardLastFourNo;
	}

	public void setCardLastFourNo(String cardLastFourNo) {
		this.cardLastFourNo = cardLastFourNo;
	}

	public String getChannelCode() {
		return channelCode;
	}

	public void setChannelCode(String channelCode) {
		this.channelCode = channelCode;
	}

	public String getAuthenflowNo() {
		return authenflowNo;
	}

	public void setAuthenflowNo(String authenflowNo) {
		this.authenflowNo = authenflowNo;
	}

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

}
