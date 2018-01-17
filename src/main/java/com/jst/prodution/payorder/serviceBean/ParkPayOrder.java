/*
* Copyright (c) 2015-2018 SHENZHEN GUIYI SCIENCE AND TECHNOLOGY DEVELOP CO., LTD. All rights reserved.
*
* 注意：本内容仅限于深圳市捷顺金科研发有限公司内部传阅，禁止外泄以及用于其他的商业目的 
*/
package com.jst.prodution.payorder.serviceBean;

import java.util.Map;

import com.jst.prodution.base.bean.BaseBean;

/** 
 * 平台支付流水
 * @Package: com.jst.prodution.park.serviceBean  
 * @ClassName: PayOrder 
 * @Description: TODO
 *
 * @author: Administrator 
 * @date: 2017年3月2日 上午10:33:09 
 * @version V1.0 
 

 */ 
public class ParkPayOrder  extends BaseBean{
	
	/**
     * 
     */
    private static final long serialVersionUID = 1L;

	
    private String respTime ;
    private String payreqtype ;
    private String overtime	;//支付有效时长	单位秒
    private String amt ;
    private String parkpayssn ;
    private String payStatus ;
    private String payTime ;
    private String carNo;
    private String carseatId;
    private Map<String, String> orderMap ;
    private Map<String, String> orderPayMap ;
    private Map<String, String> monthPayMap ;
    
    private  String  orderNo; //订单号  
    
	public String getCarNo() {
		return carNo;
	}
	public void setCarNo(String carNo) {
		this.carNo = carNo;
	}
	public String getCarseatId() {
		return carseatId;
	}
	public void setCarseatId(String carseatId) {
		this.carseatId = carseatId;
	}
	public String getRespTime() {
		return respTime;
	}
	public void setRespTime(String respTime) {
		this.respTime = respTime;
	}
	public String getPayreqtype() {
		return payreqtype;
	}
	public void setPayreqtype(String payreqtype) {
		this.payreqtype = payreqtype;
	}
	public String getAmt() {
		return amt;
	}
	public void setAmt(String amt) {
		this.amt = amt;
	}
	public String getParkpayssn() {
		return parkpayssn;
	}
	public void setParkpayssn(String parkpayssn) {
		this.parkpayssn = parkpayssn;
	}
	public String getPayStatus() {
		return payStatus;
	}
	public void setPayStatus(String payStatus) {
		this.payStatus = payStatus;
	}
	public String getPayTime() {
		return payTime;
	}
	public void setPayTime(String payTime) {
		this.payTime = payTime;
	}
	public Map<String, String> getOrderMap() {
		return orderMap;
	}
	public void setOrderMap(Map<String, String> orderMap) {
		this.orderMap = orderMap;
	}
	public Map<String, String> getOrderPayMap() {
		return orderPayMap;
	}
	public void setOrderPayMap(Map<String, String> orderPayMap) {
		this.orderPayMap = orderPayMap;
	}
	public Map<String, String> getMonthPayMap() {
		return monthPayMap;
	}
	public void setMonthPayMap(Map<String, String> monthPayMap) {
		this.monthPayMap = monthPayMap;
	}
	public String getOvertime() {
		return overtime;
	}
	public void setOvertime(String overtime) {
		this.overtime = overtime;
	}
	public String getOrderNo() {
		return orderNo;
	}
	public void setOrderNo(String orderNo) {
		this.orderNo = orderNo;
	}

	 
}
