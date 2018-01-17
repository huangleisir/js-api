package com.jst.prodution.member.serviceBean;

import com.jst.prodution.base.bean.BaseBean;
/**
 * 外部商户签约注册bean
 * @author hewen
 *
 */
public class ThirdUserRegisterBean extends BaseBean{
	private static final long serialVersionUID = 1L;
	//用户id
	private String userId;
	//第三方用户id
	private String thirdUserId;
	//手机号码 
	private String  mobile ;
	
	//商户签约号  
	private String merchantSignNo;
	//商户号 
	private String merchantId;
	// appId 
	private String appId;
	
	// 开通渠道号  
	private String channelNo;
	//渠道来源 
	private String regChannel;

	private String token;		//token值
	private String access;       //access值
	private String sign;      //加密验签
	
	private String notifyUrl;
	
	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getThirdUserId() {
		return thirdUserId;
	}

	public void setThirdUserId(String thirdUserId) {
		this.thirdUserId = thirdUserId;
	}

	public String getMobile() {
		return mobile;
	}

	public void setMobile(String mobile) {
		this.mobile = mobile;
	}

	public String getMerchantSignNo() {
		return merchantSignNo;
	}

	public void setMerchantSignNo(String merchantSignNo) {
		this.merchantSignNo = merchantSignNo;
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

	public String getSign() {
		return sign;
	}

	public void setSign(String sign) {
		this.sign = sign;
	}

	public String getMerchantId() {
		return merchantId;
	}

	public void setMerchantId(String merchantId) {
		this.merchantId = merchantId;
	}

	public String getAppId() {
		return appId;
	}

	public void setAppId(String appId) {
		this.appId = appId;
	}

	public String getChannelNo() {
		return channelNo;
	}
	public void setChannelNo(String channelNo) {
		this.channelNo = channelNo;
	}

	public String getRegChannel() {
		return regChannel;
	}
	public void setRegChannel(String regChannel) {
		this.regChannel = regChannel;
	}
	public String getNotifyUrl() {
		return notifyUrl;
	}
	public void setNotifyUrl(String notifyUrl) {
		this.notifyUrl = notifyUrl;
	}
	
}
