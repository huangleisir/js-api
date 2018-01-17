package com.jst.prodution.member.serviceBean;

import com.jst.prodution.base.bean.BaseBean;

public class ResetMerchantPwdServiceBean extends BaseBean {

	private static final long serialVersionUID = 1L;

	private String merchantId;			//商务号
	private String userType;			//会员类型
	private String password;			//密码
	private String passwordType;		//密码类型:：1登录密码  2支付密码
	
	public String getMerchantId() {
		return merchantId;
	}
	public void setMerchantId(String merchantId) {
		this.merchantId = merchantId;
	}
	public String getUserType() {
		return userType;
	}
	public void setUserType(String userType) {
		this.userType = userType;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getPasswordType() {
		return passwordType;
	}
	public void setPasswordType(String passwordType) {
		this.passwordType = passwordType;
	}
	
}
