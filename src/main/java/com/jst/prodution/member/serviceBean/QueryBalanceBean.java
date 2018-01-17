package com.jst.prodution.member.serviceBean;

import com.jst.prodution.base.bean.BaseBean;

/**
 * 账户余额查询
 * @author liang
 *
 */
public class QueryBalanceBean extends BaseBean {

	private static final long serialVersionUID = 1L;
	private String mobile;  	//手机号（登录账号）

	private String userId;		//用户ID

	private String userType;	//用户类型
	private String appId;//捷停车appid
	private String terminalType;//终端类型（M：移动用户，P：PC用户）
	private String token;		//token值
	private String access;       //access值
	private String salt;       //加密盐值
	private String sign;      //加密验签
	private String systemType;      //登录系统来源
	private String regChannel;         //模块渠道1.APP 2.WEB 3.OMS 4.API 5.JTC 
	private String BalanceMoney;      //账户金额

	
    public String getRegChannel() {
        return regChannel;
    }

    public void setRegChannel(String regChannel) {
        this.regChannel = regChannel;
    }

    public String getAppId() {
        return appId;
    }

    public void setAppId(String appId) {
        this.appId = appId;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
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

    public String getTerminalType() {
        return terminalType;
    }

    public void setTerminalType(String terminalType) {
        this.terminalType = terminalType;
    }

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }

    public String getAccess() {
        return access;
    }

    public void setAccess(String access) {
        this.access = access;
    }

    public String getSalt() {
        return salt;
    }

    public void setSalt(String salt) {
        this.salt = salt;
    }

    public String getSign() {
        return sign;
    }

    public void setSign(String sign) {
        this.sign = sign;
    }

    public String getSystemType() {
        return systemType;
    }

    public void setSystemType(String systemType) {
        this.systemType = systemType;
    }

    public String getBalanceMoney() {
        return BalanceMoney;
    }

    public void setBalanceMoney(String balanceMoney) {
        BalanceMoney = balanceMoney;
    }
	
	 

    
    
	
	
}
