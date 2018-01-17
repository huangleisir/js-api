/*
* Copyright (c) 2015-2018 SHENZHEN GUIYI SCIENCE AND TECHNOLOGY DEVELOP CO., LTD. All rights reserved.
*
* 注意：本内容仅限于深圳市捷顺金科研发有限公司内部传阅，禁止外泄以及用于其他的商业目的 
*/
package com.jst.prodution.park.serviceBean;

import java.util.List;

import com.jst.prodution.base.bean.BaseBean;

public class OrderInfoBean extends BaseBean{
	
	/**
     * 
     */
    private static final long serialVersionUID = 1L;

    private String orderId ;  //
	
	private String carNo ;  //输入车牌号后仅按照车牌号查询当前停车
	
	private String carseatid ;//泊位号

	private String respTime; 
	
	private String orderstatus ;  //01-已下单；02-已取消；03-停车中；04-代扣失败；05-已完成
	
	private String parkid ;
	
	private String parkname ;
	
	private String ifpropay	;  //  Y	String	是否支持代扣	Y-是；N-否
	
	private String orderType	 ;  //N	String	类型	01-路内停车场；02-路外停车场； 
	private String ifneedpay ;  //	Y	String	是否需要支付	Y-是；N-否
	private String parktime ;  //	Y	N	停车时长	单位：秒
	private String intime	 ;  //Y	String	入场时间	yyyyMMddHHmmss
	private String outtime	 ;  //N	String	出场时间	yyyyMMddHHmmss
	private String outvalidtime	 ;  //N	String	离场有效时间	yyyyMMddHHmmss
	private String outvalidsec	 ;  //N	String	离场剩余时间	单位：秒
	private String amtpayed	 ;  //Y	N	支付费用	单位：分
	private String overtime	 ;  //Y	N	超时时长	单位：秒
	private String prepayamt	 ;  //Y	预购金额	单位：分
	private String pretime	 ;  //Y	N	预购时长	单位：秒
	private String amtouttime  ;  // 补交费用	单位：分，停车中的订单为需补交的费用，已完成的订单为已经缴费的费用
	private String amtreturn	 ;  //Y	N	退费费用	单位：分，已完成的订单为已经退款的费用
	//private List<TimeoutRefundInfo> timeoutList	 ;  //N	List<map>	超时列表	
	//private List<TimeoutRefundInfo> refundList	 ;  //N	List<map>	退费列表	
	private List<TimeoutRefundInfo> payList	 ;  //N	List<map>	
	private List<TimeoutRefundInfo> needPayList	 ;  //N	List<map>	
	private String intype ;	//N		入场类型	只有室内订单有 00：临时卡入场01：分享入场02：月卡入场03：预定入场
	private String queryamt;//是否要查询金额	0无需查询（默认），1需要查询
	private String ifpropayorder;//是否代扣订单:0-非代扣订单;1代扣订单;如果是空则为非代扣订单
	
	public String getIfpropayorder() {
		return ifpropayorder;
	}
	public void setIfpropayorder(String ifpropayorder) {
		this.ifpropayorder = ifpropayorder;
	}
	public String getOrderId() {
		return orderId;
	}
	public void setOrderId(String orderId) {
		this.orderId = orderId;
	}
	public String getCarNo() {
		return carNo;
	}
	public void setCarNo(String carNo) {
		this.carNo = carNo;
	}
	public String getRespTime() {
		return respTime;
	}
	public void setRespTime(String respTime) {
		this.respTime = respTime;
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
	public String getOrderType() {
		return orderType;
	}
	public void setOrderType(String orderType) {
		this.orderType = orderType;
	}
	public String getIfneedpay() {
		return ifneedpay;
	}
	public void setIfneedpay(String ifneedpay) {
		this.ifneedpay = ifneedpay;
	}
	public String getParktime() {
		return parktime;
	}
	public void setParktime(String parktime) {
		this.parktime = parktime;
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
	public String getOutvalidsec() {
		return outvalidsec;
	}
	public void setOutvalidsec(String outvalidsec) {
		this.outvalidsec = outvalidsec;
	}
	public String getAmtpayed() {
		return amtpayed;
	}
	public void setAmtpayed(String amtpayed) {
		this.amtpayed = amtpayed;
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

	public List<TimeoutRefundInfo> getPayList() {
		return payList;
	}
	public void setPayList(List<TimeoutRefundInfo> payList) {
		this.payList = payList;
	}
	public String getCarseatid() {
		return carseatid;
	}
	public void setCarseatid(String carseatid) {
		this.carseatid = carseatid;
	}
	public List<TimeoutRefundInfo> getNeedPayList() {
		return needPayList;
	}
	public void setNeedPayList(List<TimeoutRefundInfo> needPayList) {
		this.needPayList = needPayList;
	}
	public String getIntype() {
		return intype;
	}
	public void setIntype(String intype) {
		this.intype = intype;
	}
	public String getPrepayamt() {
		return prepayamt;
	}
	public void setPrepayamt(String prepayamt) {
		this.prepayamt = prepayamt;
	}
	public String getPretime() {
		return pretime;
	}
	public void setPretime(String pretime) {
		this.pretime = pretime;
	}
	public String getQueryamt() {
		return queryamt;
	}
	public void setQueryamt(String queryamt) {
		this.queryamt = queryamt;
	}
	

}
