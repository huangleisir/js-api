package com.jst.prodution.jsyun.serviceBean;

import com.jst.prodution.base.bean.BaseBean;

public class OrderInfoBean extends BaseBean{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private String orderId ;
	
	private String orderstatus ;
	private String parkid ;
	private String parkname ;
	private String ifpropay ;   //
	private String carNo ;
	private String ifneedpay ;  //
	private String intime ;
	private String outtime ;
	private String outvalidtime ;
	private String amtpayed ;
	private String needPay ;
	private Object payList ;
	private String intype ;
	
	private String orderType ;
	private String parktime ;
	private String overtime ;
	private String amtouttime ;
	private String amtreturn ;
	
	
	
	public String getOrderId() {
		return orderId;
	}
	public void setOrderId(String orderId) {
		this.orderId = orderId;
	}
	public String getOrderstatus() {
		return orderstatus;
	}
	public void setOrderstatus(String orderstatus) {
		this.orderstatus = orderstatus;
	}
	public String getParkid() {
		return parkid;
	}
	public void setParkid(String parkid) {
		this.parkid = parkid;
	}
	public String getParkname() {
		return parkname;
	}
	public void setParkname(String parkname) {
		this.parkname = parkname;
	}
	public String getIfpropay() {
		return ifpropay;
	}
	public void setIfpropay(String ifpropay) {
		this.ifpropay = ifpropay;
	}
	public String getCarNo() {
		return carNo;
	}
	public void setCarNo(String carNo) {
		this.carNo = carNo;
	}
	public String getIfneedpay() {
		return ifneedpay;
	}
	public void setIfneedpay(String ifneedpay) {
		this.ifneedpay = ifneedpay;
	}
	public String getIntime() {
		return intime;
	}
	public void setIntime(String intime) {
		this.intime = intime;
	}
	public String getOuttime() {
		return outtime;
	}
	public void setOuttime(String outtime) {
		this.outtime = outtime;
	}
	public String getOutvalidtime() {
		return outvalidtime;
	}
	public void setOutvalidtime(String outvalidtime) {
		this.outvalidtime = outvalidtime;
	}
	public String getAmtpayed() {
		return amtpayed;
	}
	public void setAmtpayed(String amtpayed) {
		this.amtpayed = amtpayed;
	}
	public String getNeedPay() {
		return needPay;
	}
	public void setNeedPay(String needPay) {
		this.needPay = needPay;
	}
	public Object getPayList() {
		return payList;
	}
	public void setPayList(Object payList) {
		this.payList = payList;
	}
	public String getIntype() {
		return intype;
	}
	public void setIntype(String intype) {
		this.intype = intype;
	}
	public String getOrderType() {
		return orderType;
	}
	public void setOrderType(String orderType) {
		this.orderType = orderType;
	}
	public String getParktime() {
		return parktime;
	}
	public void setParktime(String parktime) {
		this.parktime = parktime;
	}
	public String getOvertime() {
		return overtime;
	}
	public void setOvertime(String overtime) {
		this.overtime = overtime;
	}
	public String getAmtouttime() {
		return amtouttime;
	}
	public void setAmtouttime(String amtouttime) {
		this.amtouttime = amtouttime;
	}
	public String getAmtreturn() {
		return amtreturn;
	}
	public void setAmtreturn(String amtreturn) {
		this.amtreturn = amtreturn;
	}

	
}