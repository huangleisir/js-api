package com.jst.prodution.park.serviceBean;

import com.jst.prodution.base.bean.BaseBean;
/**
 * 类名: UserInfoSynYunPlatformBean</br>
 * 作者: lin
 * 描述: 同步用户信息到云平台 
 * 创建时间: 2017年9月23日下午2:16:06
 * 版权及版本: Copyright(C)2017 jst版权所有
 */
public class UserInfoSynYunPlatformBean extends BaseBean{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String userId;
	private String optype;
	private String userName; //账号（手机号）
	private String nickName; //昵称
	private String phone; //手机号
	private String regType; //注册类型1-安卓，2-ios,3-WEIXIN
	private String regTime; //注册时间yyyymmddhhmmss
	private String balance; //余额，单位分
	private int carCount; //绑定车牌数
	private String bindCarTime; //车牌绑定时间yyyymmddhhmmss
	private String lastLoginTime; //最近登录时间yyyymmddhhmmss
	private String status; //1、正常 2、禁用 3、冻结 4、注销
	
	
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public String getOptype() {
		return optype;
	}
	public void setOptype(String optype) {
		this.optype = optype;
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
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getRegType() {
		return regType;
	}
	public void setRegType(String regType) {
		this.regType = regType;
	}
	public String getRegTime() {
		return regTime;
	}
	public void setRegTime(String regTime) {
		this.regTime = regTime;
	}
	public String getBalance() {
		return balance;
	}
	public void setBalance(String balance) {
		this.balance = balance;
	}
	public int getCarCount() {
		return carCount;
	}
	public void setCarCount(int carCount) {
		this.carCount = carCount;
	}
	public String getBindCarTime() {
		return bindCarTime;
	}
	public void setBindCarTime(String bindCarTime) {
		this.bindCarTime = bindCarTime;
	}
	public String getLastLoginTime() {
		return lastLoginTime;
	}
	public void setLastLoginTime(String lastLoginTime) {
		this.lastLoginTime = lastLoginTime;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
}
