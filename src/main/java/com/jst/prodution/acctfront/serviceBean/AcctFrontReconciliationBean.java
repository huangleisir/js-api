package com.jst.prodution.acctfront.serviceBean;

import com.jst.prodution.base.bean.BaseBean;

public class AcctFrontReconciliationBean extends BaseBean {

	private static final long serialVersionUID = 1L;
	private String channelCode;//渠道号 001-快钱、00201-建行、PPCD-预付卡、Alipay-支付宝、WeChat-微信 JSJK-捷顺金科
	private String provisionAcctId;//备付金账号
//对账类型(01-代扣清算，02-代扣长款挂账、03-代扣短款挂账、04-代扣短款冲销、05-代扣长款冲销、
//06-代付长款挂账、07-代付短款挂账、08-代付长款冲销、09-代付短款冲销   )可以多选，用“,” 隔开如：01,03
	private String reconTypes;
	private Long clearAmount;//资金清算金额
	private Long longHangAmount;//长款挂账金额
	private Long shortHangAmount;//短款挂账金额
	private Long longDestroyAmount;//长款冲销金额
	private Long shortDestroyAmount;//短款冲销金额
    private Integer cutDate;        //日切
    private String busNo;        //交易订单号
    private String channelName;  //渠道名称
    private String sourceFrom;  //业务来源（1-APP，2-OMS）
    private String remark;      //备注
    private String opUser;      //操作人
	private String limtAmtFlag;//限额标识(限额标识0-限额，1-不限额)
    private Integer busTransDate;

	public String getChannelCode() {
		return channelCode;
	}
	public void setChannelCode(String channelCode) {
		this.channelCode = channelCode;
	}
	public String getReconTypes() {
		return reconTypes;
	}
	public void setReconTypes(String reconTypes) {
		this.reconTypes = reconTypes;
	}
	public Long getClearAmount() {
		return clearAmount;
	}
	public void setClearAmount(Long clearAmount) {
		this.clearAmount = clearAmount;
	}
	public Long getLongHangAmount() {
		return longHangAmount;
	}
	public void setLongHangAmount(Long longHangAmount) {
		this.longHangAmount = longHangAmount;
	}
	public Long getShortHangAmount() {
		return shortHangAmount;
	}
	public void setShortHangAmount(Long shortHangAmount) {
		this.shortHangAmount = shortHangAmount;
	}
	public Long getLongDestroyAmount() {
		return longDestroyAmount;
	}
	public void setLongDestroyAmount(Long longDestroyAmount) {
		this.longDestroyAmount = longDestroyAmount;
	}
	public Long getShortDestroyAmount() {
		return shortDestroyAmount;
	}
	public void setShortDestroyAmount(Long shortDestroyAmount) {
		this.shortDestroyAmount = shortDestroyAmount;
	}
	public String getProvisionAcctId() {
		return provisionAcctId;
	}
	public void setProvisionAcctId(String provisionAcctId) {
		this.provisionAcctId = provisionAcctId;
	}
	public Integer getCutDate() {
		return cutDate;
	}
	public void setCutDate(Integer cutDate) {
		this.cutDate = cutDate;
	}
	public String getBusNo() {
		return busNo;
	}
	public void setBusNo(String busNo) {
		this.busNo = busNo;
	}
	public String getChannelName() {
		return channelName;
	}
	public void setChannelName(String channelName) {
		this.channelName = channelName;
	}
	public String getSourceFrom() {
		return sourceFrom;
	}
	public void setSourceFrom(String sourceFrom) {
		this.sourceFrom = sourceFrom;
	}
	public String getRemark() {
		return remark;
	}
	public void setRemark(String remark) {
		this.remark = remark;
	}
	public String getOpUser() {
		return opUser;
	}
	public void setOpUser(String opUser) {
		this.opUser = opUser;
	}
	public String getLimtAmtFlag() {
		return limtAmtFlag;
	}
	public void setLimtAmtFlag(String limtAmtFlag) {
		this.limtAmtFlag = limtAmtFlag;
	}
	public Integer getBusTransDate() {
		return busTransDate;
	}
	public void setBusTransDate(Integer busTransDate) {
		this.busTransDate = busTransDate;
	}
	
}
