package com.jst.prodution.market.dubbo.serviceBean;

import com.jst.prodution.base.bean.BaseBean;

public class RedPacketResultBean extends BaseBean {
  /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String redPacketActStatus = "0";
	/**
	 * 红包金额
	 */
	private Long redPacketAmt;
	/**
	 * 活动名称
	 */
	private String activityName;
	/**
	 * 投放类型 1直接投放  2页面领用  3注册送
	 */
	private String distriType="3";

	public String getRedPacketActStatus() {
	return redPacketActStatus;
	}

	public void setRedPacketActStatus(String redPacketActStatus) {
	this.redPacketActStatus = redPacketActStatus;
	}

	public Long getRedPacketAmt() {
		return redPacketAmt;
	}

	public void setRedPacketAmt(Long redPacketAmt) {
		this.redPacketAmt = redPacketAmt;
	}

	public String getActivityName() {
		return activityName;
	}

	public void setActivityName(String activityName) {
		this.activityName = activityName;
	}

	public String getDistriType() {
		return distriType;
	}

	public void setDistriType(String distriType) {
		this.distriType = distriType;
	}

	@Override
	public String toString() {
		return "RedPacketResultBean [redPacketActStatus=" + redPacketActStatus + ", redPacketAmt=" + redPacketAmt
				+ ", activityName=" + activityName + ", distriType=" + distriType + "]";
	}
	
  
}
