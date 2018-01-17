package com.jst.prodution.member.model;

/**
 * 
* @ClassName: 
* @Description: 会员实体
* @author liaozr 
* @date 2016-07-23 下午3:35:36 
*
 */

public class HyCusInf  implements java.io.Serializable {

	private static final long serialVersionUID = 1L;
	private String userId;  //f
	private String userType;
	private String status;
	private String mobile;
	private String email;
	private String cerType;
	private String cerno;
	private String regChannel;
	private String verificationLevel;
	private String certification;
	private String userLevel;
	private String riskTolerance;
	private String picWay;
	private String createTime;
	private String modifyTime;

	public HyCusInf() {
	}

	public HyCusInf(String userId, String userType, String status,
			String mobile, String email, String cerType,
			String cerno, String regChannel, String verificationLevel,
			String certification, String userLevel, String riskTolerance,
			String picWay, String createTime, String modifyTime) {
		this.userId = userId;
		this.userType = userType;
		this.status = status;
		this.mobile = mobile;
		this.email = email;
		this.cerType = cerType;
		this.cerno = cerno;
		this.regChannel = regChannel;
		this.verificationLevel = verificationLevel;
		this.certification = certification;
		this.userLevel = userLevel;
		this.riskTolerance = riskTolerance;
		this.picWay = picWay;
		this.createTime = createTime;
		this.modifyTime = modifyTime;
	}

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getUserType() {
		return userType;
	}

	public void setUserType(String userType) {
		this.userType = userType;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getMobile() {
		return mobile;
	}

	public void setMobile(String mobile) {
		this.mobile = mobile;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getCerType() {
		return cerType;
	}

	public void setCerType(String cerType) {
		this.cerType = cerType;
	}

	public String getCerno() {
		return cerno;
	}

	public void setCerno(String cerno) {
		this.cerno = cerno;
	}

	public String getRegChannel() {
		return regChannel;
	}

	public void setRegChannel(String regChannel) {
		this.regChannel = regChannel;
	}

	public String getVerificationLevel() {
		return verificationLevel;
	}

	public void setVerificationLevel(String verificationLevel) {
		this.verificationLevel = verificationLevel;
	}

	public String getCertification() {
		return certification;
	}

	public void setCertification(String certification) {
		this.certification = certification;
	}

	public String getUserLevel() {
		return userLevel;
	}

	public void setUserLevel(String userLevel) {
		this.userLevel = userLevel;
	}

	public String getRiskTolerance() {
		return riskTolerance;
	}

	public void setRiskTolerance(String riskTolerance) {
		this.riskTolerance = riskTolerance;
	}

	public String getPicWay() {
		return picWay;
	}

	public void setPicWay(String picWay) {
		this.picWay = picWay;
	}

	public String getCreateTime() {
		return createTime;
	}

	public void setCreateTime(String createTime) {
		this.createTime = createTime;
	}

	public String getModifyTime() {
		return modifyTime;
	}

	public void setModifyTime(String modifyTime) {
		this.modifyTime = modifyTime;
	}


}