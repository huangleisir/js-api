package com.jst.prodution.member.serviceBean;

import com.jst.prodution.base.bean.BaseBean;

/**
 * 修改会员bean
 * @author liang
 *
 */
public class ModifyMemberBean extends BaseBean {

	private static final long serialVersionUID = 1L;
	private String userId;		//用户ID
	private String sign;       //加密验签
	private String systemType;       //登录系统来源
	   
	private String appId;//appid
    private String oldMobile;   // 原手机号码
    private String newMobile;   // 修改后的手机号码
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
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
	public String getAppId() {
		return appId;
	}
	public void setAppId(String appId) {
		this.appId = appId;
	}
	public String getOldMobile() {
		return oldMobile;
	}
	public void setOldMobile(String oldMobile) {
		this.oldMobile = oldMobile;
	}
	public String getNewMobile() {
		return newMobile;
	}
	public void setNewMobile(String newMobile) {
		this.newMobile = newMobile;
	}	
	
}
