package com.jst.prodution.member.serviceBean;

import com.jst.prodution.base.bean.BaseBean;

public class CertPictureUrlBean extends BaseBean{

	/**
	 * 保存身份证图片url调用服务Bean
	 */
	private static final long serialVersionUID = -184033942093313648L;

	private String userId;						// 用户id
	private String cerFrontPictureUrl;			//身份证正面照url
	private String cerBackPictureUrl;			//身份证反面照url
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public String getCerFrontPictureUrl() {
		return cerFrontPictureUrl;
	}
	public void setCerFrontPictureUrl(String cerFrontPictureUrl) {
		this.cerFrontPictureUrl = cerFrontPictureUrl;
	}
	public String getCerBackPictureUrl() {
		return cerBackPictureUrl;
	}
	public void setCerBackPictureUrl(String cerBackPictureUrl) {
		this.cerBackPictureUrl = cerBackPictureUrl;
	}
	
}
