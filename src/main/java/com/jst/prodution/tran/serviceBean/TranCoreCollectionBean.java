package com.jst.prodution.tran.serviceBean;

import com.jst.prodution.base.bean.BaseBean;

public class TranCoreCollectionBean extends BaseBean{
	/**
	 * 
	 */
	private static final long serialVersionUID = 7432878064006910594L;
	//外部订单号
	private String busNo;
	//登陆手机号
	private String userMobile;

	//支付方式
	private String payWay;
	
	//支付凭证号
	private String payCerNo;
	
	//支付凭证号备注
	private String payCerNoMark;

	//备注
	private String remark;	
	//支付金额
	private Long payAmount;
	
	//子通道
	private String subChannelCode;
	
	//短信验证码
	private String smsCode;
	//短信跟踪编码
	private String smsTraceCode;	

	public String getBusNo() {
		return busNo;
	}
	public void setBusNo(String busNo) {
		this.busNo = busNo;
	}
	
	public String getPayWay() {
		return payWay;
	}
	public void setPayWay(String payWay) {
		this.payWay = payWay;
	}
	public String getRemark() {
		return remark;
	}
	public void setRemark(String remark) {
		this.remark = remark;
	}
	public String getPayCerNo() {
		return payCerNo;
	}
	public void setPayCerNo(String payCerNo) {
		this.payCerNo = payCerNo;
	}
	public String getPayCerNoMark() {
		return payCerNoMark;
	}
	public void setPayCerNoMark(String payCerNoMark) {
		this.payCerNoMark = payCerNoMark;
	}
	public Long getPayAmount() {
		return payAmount;
	}
	public void setPayAmount(Long payAmount) {
		this.payAmount = payAmount;
	}
	public String getSubChannelCode() {
		return subChannelCode;
	}
	public void setSubChannelCode(String subChannelCode) {
		this.subChannelCode = subChannelCode;
	}
	public String getSmsCode() {
		return smsCode;
	}
	public void setSmsCode(String smsCode) {
		this.smsCode = smsCode;
	}
	public String getSmsTraceCode() {
		return smsTraceCode;
	}
	public void setSmsTraceCode(String smsTraceCode) {
		this.smsTraceCode = smsTraceCode;
	}
	public String getUserMobile() {
		return userMobile;
	}
	public void setUserMobile(String userMobile) {
		this.userMobile = userMobile;
	}
	
}
