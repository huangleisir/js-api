package com.jst.prodution.member.serviceBean;

import java.io.Serializable;

import com.jst.prodution.base.bean.BaseBean;

/**
 * @Description 会员鉴权信息
 * @author caojianhua
 * @date 2017/2/14
 *
 */
public class MemberAuthInfoBean extends BaseBean implements Serializable{
	private String userId;		//会员id
	private String userName;	//会员名称
	private String authName;	//鉴权渠道名称
	private String authTime;	//鉴权时间
	private String cardId;		//银行卡号

	private String userType;	//会员类型
	private String mobile;		//会员手机号
	private String channelNum;	//认证渠道数量
	private String accountLevel; //账户等级
	
	
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
	public String getAuthName() {
		return authName;
	}
	public void setAuthName(String authName) {
		this.authName = authName;
	}
	public String getAuthTime() {
		return authTime;
	}
	public void setAuthTime(String authTime) {
		this.authTime = authTime;
	}
	public String getCardId() {
		return cardId;
	}
	public void setCardId(String cardId) {
		this.cardId = cardId;
	}
	public String getUserType() {
		return userType;
	}
	public void setUserType(String userType) {
		this.userType = userType;
	}
	public String getMobile() {
		return mobile;
	}
	public void setMobile(String mobile) {
		this.mobile = mobile;
	}
	public String getChannelNum() {
		return channelNum;
	}
	public void setChannelNum(String channelNum) {
		this.channelNum = channelNum;
	}
	public String getAccountLevel() {
		return accountLevel;
	}
	public void setAccountLevel(String accountLevel) {
		this.accountLevel = accountLevel;
	}
	
}
