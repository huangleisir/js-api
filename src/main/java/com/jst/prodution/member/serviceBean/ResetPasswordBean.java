package com.jst.prodution.member.serviceBean;

import com.jst.prodution.base.bean.BaseBean;

/**
 * 重置密码（设置支付密码）
 * @author liang
 *
 */
public class ResetPasswordBean extends BaseBean {
	private static final long serialVersionUID = 1L;
	private String userId;		//会员ID
	private String mobile;  	//登录账号（手机号）
	private String password;	// 新密码	
	private String pwdType;		// 操作类型 1：重置登录密码 2重置支付密码 3设置支付密码 
	private String userType;	//会员类型：C个人 B商户
	private String email;		//邮箱
	private String verifyNum;  //验证码
	private String systemType; //系统来源  "APP"
	private String appId;      // 
	
	
	public String getAppId() {
		return appId;
	}
	public void setAppId(String appId) {
		this.appId = appId;
	}
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public String getMobile() {
		return mobile;
	}
	public void setMobile(String mobile) {
		this.mobile = mobile;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getPwdType() {
		return pwdType;
	}
	public void setPwdType(String pwdType) {
		this.pwdType = pwdType;
	}
	public String getUserType() {
		return userType;
	}
	public void setUserType(String userType) {
		this.userType = userType;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
    public String getVerifyNum() {
        return verifyNum;
    }
    public void setVerifyNum(String verifyNum) {
        this.verifyNum = verifyNum;
    }
	public String getSystemType() {
		return systemType;
	}
	public void setSystemType(String systemType) {
		this.systemType = systemType;
	}
	
    
}
