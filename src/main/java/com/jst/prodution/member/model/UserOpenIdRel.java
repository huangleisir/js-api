package com.jst.prodution.member.model;

import com.jst.prodution.base.bean.BaseBean;


public class UserOpenIdRel extends BaseBean{

	// Fields
	private static final long serialVersionUID = 1L;
	private String id;					
	private String userId;					
	private String appId;                       // appId
	private String openId;
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public String getAppId() {
		return appId;
	}
	public void setAppId(String appId) {
		this.appId = appId;
	}
	public String getOpenId() {
		return openId;
	}
	public void setOpenId(String openId) {
		this.openId = openId;
	}
   
}