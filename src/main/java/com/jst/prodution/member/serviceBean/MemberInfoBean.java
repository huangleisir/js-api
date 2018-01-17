package com.jst.prodution.member.serviceBean;

import com.jst.prodution.base.bean.BaseBean;

public class MemberInfoBean extends BaseBean{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private String userId;
	private String userType; //会员类型：B.商户 C.个人
	private String status;
	private String mobile;
	private String email;
	private String userName;
	private String nickName;
	private String createTime; //注册/创建时间
	private String lastLoginTime; //最近登录时间yyyymmddhhmmss
	private String balance; //余额，单位分
	private String deviceType; //注册来源类型1-安卓，2-ios,3-WEIXIN
	
	
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
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getNickName() {
		return nickName;
	}
	public void setNickName(String nickName) {
		this.nickName = nickName;
	}
	public String getCreateTime() {
		return createTime;
	}
	public void setCreateTime(String createTime) {
		this.createTime = createTime;
	}
	public String getLastLoginTime() {
		return lastLoginTime;
	}
	public void setLastLoginTime(String lastLoginTime) {
		this.lastLoginTime = lastLoginTime;
	}
	public String getBalance() {
		return balance;
	}
	public void setBalance(String balance) {
		this.balance = balance;
	}
	public String getDeviceType() {
		return deviceType;
	}
	public void setDeviceType(String deviceType) {
		this.deviceType = deviceType;
	}
	
}
