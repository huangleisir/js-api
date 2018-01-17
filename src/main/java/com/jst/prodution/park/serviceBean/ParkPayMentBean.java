/*
* Copyright (c) 2015-2018 SHENZHEN GUIYI SCIENCE AND TECHNOLOGY DEVELOP CO., LTD. All rights reserved.
*
* 注意：本内容仅限于深圳市捷顺金科研发有限公司内部传阅，禁止外泄以及用于其他的商业目的 
*/
package com.jst.prodution.park.serviceBean;

import java.util.Map;

import com.jst.prodution.base.bean.BaseBean;

public class ParkPayMentBean extends BaseBean{
	
	private String appid ;

	 private String parkpayssn ;
	   
	   private String payChannelId ;
	   
	   private String payType ;
	   
	   private String openid ;
	   
	   private String callbackUrl ;
	   /**
	    * 营销活动	ID
	    */
	   private String activityId;
	   /**
	    * 优惠券ID
	    */
	   private String couponId;
	   
	 /*  private String appId ;
		private String mchId;
		private String nonceStr;
		private String codeUrl;
		private String sign;
		private String prePayId;
		private String timestamp;
		private String nativePackage;*/
	   
	   Map<String, Object> data ;
	   
	   private String userPhone ;
	   
	   private String userId ;
	   
	   private String token ;
	   
	   private String appChannel ;

	   
	   
	public String getCouponId() {
		return couponId;
	}

	public void setCouponId(String couponId) {
		this.couponId = couponId;
	}

	public String getActivityId() {
		return activityId;
	}

	public void setActivityId(String activityId) {
		this.activityId = activityId;
	}

	public String getAppChannel() {
		return appChannel;
	}

	public void setAppChannel(String appChannel) {
		this.appChannel = appChannel;
	}

	public String getAppid() {
		return appid;
	}

	public void setAppid(String appid) {
		this.appid = appid;
	}

	public String getParkpayssn() {
		return parkpayssn;
	}

	public void setParkpayssn(String parkpayssn) {
		this.parkpayssn = parkpayssn;
	}

	public String getPayChannelId() {
		return payChannelId;
	}

	public void setPayChannelId(String payChannelId) {
		this.payChannelId = payChannelId;
	}

	
	public String getPayType() {
		return payType;
	}

	public void setPayType(String payType) {
		this.payType = payType;
	}

	public String getCallbackUrl() {
		return callbackUrl;
	}

	public void setCallbackUrl(String callbackUrl) {
		this.callbackUrl = callbackUrl;
	}
	
	public Map<String, Object> getData() {
		return data;
	}

	public void setData(Map<String, Object> data) {
		this.data = data;
	}

	public String getUserPhone() {
		return userPhone;
	}

	public void setUserPhone(String userPhone) {
		this.userPhone = userPhone;
	}

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getToken() {
		return token;
	}

	public void setToken(String token) {
		this.token = token;
	}

	public String getOpenid() {
		return openid;
	}

	public void setOpenid(String openid) {
		this.openid = openid;
	}

	@Override
	public String toString() {
		return "ParkPayMentBean [appid=" + appid + ", parkpayssn=" + parkpayssn + ", payChannelId=" + payChannelId
				+ ", payType=" + payType + ", openid=" + openid + ", callbackUrl=" + callbackUrl + ", data=" + data
				+ ", userPhone=" + userPhone + ", userId=" + userId + ", token=" + token + ", appChannel=" + appChannel
				+ "]";
	}

	
}
