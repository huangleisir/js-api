package com.jst.prodution.mblrchg.dubbo.bean;

import java.util.Date;

import com.jst.prodution.base.bean.BaseBean;

public class MobileRechargeBean extends BaseBean {
	/**
	 * 
	 */
	private static final long serialVersionUID = 8260011076940483714L;
	/**
	 * 订单流水号
	 */
	private long orderNo;
	/**
	 * 渠道ＩＤ
	 */
	private String channelId;
	/**
	 * 用户ID
	 */
	private String userId;
	/**
	 * 充值手机号
	 */
	private String mobile;
	/**
	 * 充值金额（单位：分）
	 */
	private long rechargeAmount;
	/**
	 * 不含税（价格与面额相除）比率
	 */
	private float rate;
	/**
	 * 含税（价格与面额相除）比率
	 */
	private float taxRate;
	/**
	 * 支付金额 单位：分
	 */
	private long payAmount;
	/**
	 * 话费充值订单状态 status 0
	 */
	private String status;
	/**
	 * 创建时间
	 */
	
	private Date createTime;
	/**
	 * 最后更新时间
	 */
	private Date lastUpdateTime;
	/**
	 * 为保证状态有序性
	 * @return
	 */
	private String oldStatus;
	/**
	 * 地区名称
	 */
	private String areaName;
	/**
	 * 运营商名称
	 */
	private String carrierName;
	
	
	
	public String getAreaName() {
		return areaName;
	}
	public void setAreaName(String areaName) {
		this.areaName = areaName;
	}
	public String getCarrierName() {
		return carrierName;
	}
	public void setCarrierName(String carrierName) {
		this.carrierName = carrierName;
	}
	public long getOrderNo() {
		return orderNo;
	}
	public void setOrderNo(long orderNo) {
		this.orderNo = orderNo;
	}
	public String getChannelId() {
		return channelId;
	}
	public void setChannelId(String channelId) {
		this.channelId = channelId;
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
	public long getRechargeAmount() {
		return rechargeAmount;
	}
	public void setRechargeAmount(long rechargeAmount) {
		this.rechargeAmount = rechargeAmount;
	}
	public float getRate() {
		return rate;
	}
	public void setRate(float rate) {
		this.rate = rate;
	}
	public float getTaxRate() {
		return taxRate;
	}
	public void setTaxRate(float taxRate) {
		this.taxRate = taxRate;
	}
	public long getPayAmount() {
		return payAmount;
	}
	public void setPayAmount(long payAmount) {
		this.payAmount = payAmount;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public Date getCreateTime() {
		return createTime;
	}
	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}
	public Date getLastUpdateTime() {
		return lastUpdateTime;
	}
	public void setLastUpdateTime(Date lastUpdateTime) {
		this.lastUpdateTime = lastUpdateTime;
	}
	public String getOldStatus() {
		return oldStatus;
	}
	public void setOldStatus(String oldStatus) {
		this.oldStatus = oldStatus;
	}
	@Override
	public String toString() {
		return "MobileRechargeBean [orderNo=" + orderNo + ", channelId=" + channelId + ", userId=" + userId
				+ ", mobile=" + mobile + ", rechargeAmount=" + rechargeAmount + ", rate=" + rate + ", taxRate="
				+ taxRate + ", payAmount=" + payAmount + ", status=" + status + ", createTime=" + createTime
				+ ", lastUpdateTime=" + lastUpdateTime + ", oldStatus=" + oldStatus + ", areaName=" + areaName
				+ ", carrierName=" + carrierName + "]";
	}
	
	
	
}
