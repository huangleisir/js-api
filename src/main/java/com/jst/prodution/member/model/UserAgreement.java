package com.jst.prodution.member.model;

import java.io.Serializable;

/**
 * 
* @Description: 代扣签约实体  
* @author hewen
*
 */
public class UserAgreement implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	/**
	 * 主键 
	 */
	private String id;
	/**
	 * 商户号  
	 */
	private String merchantId ;
	
	/**
	 * 商户名称
	 */
	private String companyName;
	
	/**
	 * 会员号 
	 */
	private String userId;
	
	/**
	 * 注册手机号
	 */
	private String mobile;
	
	/**
	 * appId
	 */
	private String appId;
	
	/**
	 * 渠道号  JYF ：捷易付  
	 */
	private String channelNo;
	/**
	 * 主协议号（用户id）
	 */
	private String masterAgreement;
	
	/**
	 * 子协议号()
	 */
	private String 	subAgreement ;
	
	/**
	 * 商户签约号 
	 */
	private String merchantSignNo;
	
	/**
	 * 状态  Y：签约  ，N：解约 
	 */
	private String status;
	/**
	 * 创建时间 
	 */
	private String createTime;
	
    /**
     * 签约时间 
     */
	private String signTime;
	
	/**
	 * 解约时间 
	 */
	private String rescissionTime ;
	
	/**
	 * 用户设置额度
	 */
	private Long position;
	
	/**
	 * 系统默认额度
	 */
	private Long sysPosition;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}
	
	public String getMerchantId() {
		return merchantId;
	}

	public void setMerchantId(String merchantId) {
		this.merchantId = merchantId;
	}
	
	public String getCompanyName() {
		return companyName;
	}

	public void setCompanyName(String companyName) {
		this.companyName = companyName;
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

	public String getAppId() {
		return appId;
	}

	public void setAppId(String appId) {
		this.appId = appId;
	}

	public String getMasterAgreement() {
		return masterAgreement;
	}

	public void setMasterAgreement(String masterAgreement) {
		this.masterAgreement = masterAgreement;
	}

	public String getSubAgreement() {
		return subAgreement;
	}

	public void setSubAgreement(String subAgreement) {
		this.subAgreement = subAgreement;
	}

	
	public String getMerchantSignNo() {
		return merchantSignNo;
	}

	public void setMerchantSignNo(String merchantSignNo) {
		this.merchantSignNo = merchantSignNo;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getCreateTime() {
		return createTime;
	}

	public void setCreateTime(String createTime) {
		this.createTime = createTime;
	}

	public String getSignTime() {
		return signTime;
	}

	public void setSignTime(String signTime) {
		this.signTime = signTime;
	}

	public String getRescissionTime() {
		return rescissionTime;
	}

	public void setRescissionTime(String rescissionTime) {
		this.rescissionTime = rescissionTime;
	}
	public String getChannelNo() {
		return channelNo;
	}
	public void setChannelNo(String channelNo) {
		this.channelNo = channelNo;
	}

	public Long getPosition() {
		return position;
	}

	public void setPosition(Long position) {
		this.position = position;
	}

	public Long getSysPosition() {
		return sysPosition;
	}

	public void setSysPosition(Long sysPosition) {
		this.sysPosition = sysPosition;
	}
}
