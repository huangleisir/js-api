/*
* Copyright (c) 2015-2018 SHENZHEN GUIYI SCIENCE AND TECHNOLOGY DEVELOP CO., LTD. All rights reserved.
*
* 注意：本内容仅限于深圳市捷顺金科研发有限公司内部传阅，禁止外泄以及用于其他的商业目的 
*/
package com.jst.prodution.park.serviceBean;

import com.jst.prodution.base.bean.BaseBean;

public class ParkOrderPayMentBean extends BaseBean{

	 /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String userId ;
	 private String orderId ;
	 private String payreqtype;
	 private String carSeatNo;
	 private String parktime;
	 private String amt;
	 
	 private String parkstime;
	 private String parketime;
	 private String parkpayssn;
	 private String sysCurrentTime ;
	 
	 private String overtime ;
	 
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public String getOrderId() {
		return orderId;
	}
	public void setOrderId(String orderId) {
		this.orderId = orderId;
	}
	public String getPayreqtype() {
		return payreqtype;
	}
	public void setPayreqtype(String payreqtype) {
		this.payreqtype = payreqtype;
	}
	public String getCarSeatNo() {
		return carSeatNo;
	}
	public void setCarSeatNo(String carSeatNo) {
		this.carSeatNo = carSeatNo;
	}
	public String getParktime() {
		return parktime;
	}
	public void setParktime(String parktime) {
		this.parktime = parktime;
	}
	public String getAmt() {
		return amt;
	}
	public void setAmt(String amt) {
		this.amt = amt;
	}
	public String getParkstime() {
		return parkstime;
	}
	public void setParkstime(String parkstime) {
		this.parkstime = parkstime;
	}
	public String getParkpayssn() {
		return parkpayssn;
	}
	public void setParkpayssn(String parkpayssn) {
		this.parkpayssn = parkpayssn;
	}
	public String getParketime() {
		return parketime;
	}
	public void setParketime(String parketime) {
		this.parketime = parketime;
	}
	public String getOvertime() {
		return overtime;
	}
	public void setOvertime(String overtime) {
		this.overtime = overtime;
	}
	
	public String getSysCurrentTime() {
		return sysCurrentTime;
	}
	public void setSysCurrentTime(String sysCurrentTime) {
		this.sysCurrentTime = sysCurrentTime;
	}
	@Override
	public String toString() {
		return "ParkOrderPayMentBean [userId=" + userId + ", orderId=" + orderId + ", payreqtype=" + payreqtype
				+ ", carSeatNo=" + carSeatNo + ", parktime=" + parktime + ", amt=" + amt + ", parkstime=" + parkstime
				+ ", parketime=" + parketime + ", parkpayssn=" + parkpayssn + ", overtime=" + overtime + "]";
	}

	
}
