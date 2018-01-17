package com.jst.prodution.member.serviceBean;

import com.jst.prodution.base.bean.BaseBean;

/**
 * 签约状态查询bean
 * @author hewen
 *
 */
public class SelSignStatusBean extends BaseBean{
	private static final long serialVersionUID = 1L;
	
	/**
	 *  主协议号 
	 */
	private String masterAgreement ;
	
	
	/**
	 * appID
	 */
	private String appId;
	
	/**
	 * 商户号
	 */
	private String merchantId;
	
	/**
	 * 渠道号  
	 */
	private String channelNo;
	
	/**
	 * 子协议号 
	 */
	private String subAgreement;
	
	/**
	 *  状态 Y：签约 ，N ：解约   ，无返回值说明协议不存在 
	 */
	private String status;
	
	/**
	 * 支付金额 (分)
	 */
	private Long  payAmount;

	public String getMasterAgreement() {
		return masterAgreement;
	}
	public void setMasterAgreement(String masterAgreement) {
		this.masterAgreement = masterAgreement;
	}
	
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public String getAppId() {
		return appId;
	}
	public void setAppId(String appId) {
		this.appId = appId;
	}
	public String getMerchantId() {
		return merchantId;
	}
	public void setMerchantId(String merchantId) {
		this.merchantId = merchantId;
	}
	public String getChannelNo() {
		return channelNo;
	}
	public void setChannelNo(String channelNo) {
		this.channelNo = channelNo;
	}
	public String getSubAgreement() {
		return subAgreement;
	}
	public void setSubAgreement(String subAgreement) {
		this.subAgreement = subAgreement;
	}
	public Long getPayAmount() {
		return payAmount;
	}
	public void setPayAmount(Long payAmount) {
		this.payAmount = payAmount;
	}
}
