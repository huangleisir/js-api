/*
* Copyright (c) 2015-2018 SHENZHEN GUIYI SCIENCE AND TECHNOLOGY DEVELOP CO., LTD. All rights reserved.
*
* 注意：本内容仅限于深圳市捷顺金科研发有限公司内部传阅，禁止外泄以及用于其他的商业目的 
*/
package com.jst.prodution.park.serviceBean;

import java.util.List;

import com.jst.prodution.base.bean.BaseBean;

public class SideParkOrderAddBean extends BaseBean{
	
	private String userId ;
	private String carSeatNo ;
	private String parkstime ; //停车开始时间
	private String parktime ;  //预计停车时长	hhmmss
	private String amt ;   //金额	分
	private String ordid ;   //	Y	string	订单号	同请求
	private String parkpayssn ;   //	Y	string	平台支付流水号	可用于支付结果查询
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public String getCarSeatNo() {
		return carSeatNo;
	}
	public void setCarSeatNo(String carSeatNo) {
		this.carSeatNo = carSeatNo;
	}
	public String getParkstime() {
		return parkstime;
	}
	public void setParkstime(String parkstime) {
		this.parkstime = parkstime;
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
	public String getOrdid() {
		return ordid;
	}
	public void setOrdid(String ordid) {
		this.ordid = ordid;
	}
	public String getParkpayssn() {
		return parkpayssn;
	}
	public void setParkpayssn(String parkpayssn) {
		this.parkpayssn = parkpayssn;
	}
	
	

}
