package com.jst.prodution.lanefront.serviceBean;

import com.jst.prodution.base.bean.BaseBean;

public class LaneFrontInComeBean extends BaseBean {
	
	private static final long serialVersionUID = 1L;

	//支付流水号	必输	支付系统流水号
	private String  payNo;
	//交易流水号	必输	业务系统流水号(交易核心为交易订单号)。
	private String  busNo;
	// 银行卡号	必输	
	private String  bankCardNo;
	// 交易金额	必输	 	格式整数，单位为分
	private Long  tranAmount;
	// 业务类型	必输	订单交易类型
	private String  busTranType;
	// 交易日期	必输	 8位整型，例如：20150409
	private Integer  busTransDate;
	// 业务来源	必输	（1-APP，2-OMS）
	private String  sourceFrom;
	// 会员号	必输	
	private String  userId;
	// 会员名称	可输
	private String  userName;
	// 短信动态码
	private String  smsTraceCode;//短信跟踪编号
	// 短信动态码
	private String smsCode;	
	// 备注	可输	
	private String  remark;
	// 操作用户	可输	 后台操作人必输，默认99
	private String  operUser;
	// 子通道编码	必输   00101 一键支付  00102 快捷支付
	private String  channelCode;
	// 系统参考号
	private String refNumber;
	
	public String getBusNo() {
		return busNo;
	}
	public String getSmsTraceCode() {
		return smsTraceCode;
	}
	public void setSmsTraceCode(String smsTraceCode) {
		this.smsTraceCode = smsTraceCode;
	}
	public String getSmsCode() {
		return smsCode;
	}
	public void setSmsCode(String smsCode) {
		this.smsCode = smsCode;
	}
	public void setBusNo(String busNo) {
		this.busNo = busNo;
	}
	public String getBankCardNo() {
		return bankCardNo;
	}
	public void setBankCardNo(String bankCardNo) {
		this.bankCardNo = bankCardNo;
	}
	public Long getTranAmount() {
		return tranAmount;
	}
	public void setTranAmount(Long tranAmount) {
		this.tranAmount = tranAmount;
	}
	public String getBusTranType() {
		return busTranType;
	}
	public void setBusTranType(String busTranType) {
		this.busTranType = busTranType;
	}
	public Integer getBusTransDate() {
		return busTransDate;
	}
	public void setBusTransDate(Integer busTransDate) {
		this.busTransDate = busTransDate;
	}
	public String getSourceFrom() {
		return sourceFrom;
	}
	public void setSourceFrom(String sourceFrom) {
		this.sourceFrom = sourceFrom;
	}
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getRemark() {
		return remark;
	}
	public void setRemark(String remark) {
		this.remark = remark;
	}
	public String getOperUser() {
		return operUser;
	}
	public void setOperUser(String operUser) {
		this.operUser = operUser;
	}
	public String getPayNo() {
		return payNo;
	}
	public void setPayNo(String payNo) {
		this.payNo = payNo;
	}
	public String getChannelCode() {
		return channelCode;
	}
	public void setChannelCode(String channelCode) {
		this.channelCode = channelCode;
	}
	public String getRefNumber() {
		return refNumber;
	}
	public void setRefNumber(String refNumber) {
		this.refNumber = refNumber;
	}
	
}
