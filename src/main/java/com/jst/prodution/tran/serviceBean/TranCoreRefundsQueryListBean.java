package com.jst.prodution.tran.serviceBean;

import java.util.List;

import com.jst.prodution.base.bean.BaseBean;

public class TranCoreRefundsQueryListBean extends BaseBean {

	private static final long serialVersionUID = 1L;

    private String busNo; //交易流水号

    private String state;//0-成功，1-待处理，2-处理中，3-失败,4,已退款5,已过期

    private String busType;//1-支付，2-退款

    private String linkPayNo;//关联支付交易流水号   

    private Integer refundAmount;//已退款金额

    private String refundType;//1，退款至余额2，退款至银行卡

    private Long tranFee;//支付订单手续费

    private Integer tranDate;//交易日期

    private String merchantExtenalNo;//外部订单号+外部订单日期（检索商户订单唯一性）

    private String refundExtenalNo;//外部订单号+外部订单日期（检索商户订单唯一性）

    private String merchantId;//商户号

    private String merchantMemberId;//商户用户标识

    private String merchantName;//商户名

    private String payMemberId;//支付用户标识

    private String payMemberName;//支付用户姓名

    private String payMemberMobile;//支付用户手机号

    private Long tranAmount;//支付金额

    private String expiredTime;//外部订单过期时间

    private String orderName;//订单名称        

    private String orderDes;//订单描述

    private String resultNoticeUrl;//支付结果通知URL

    private String resultPageUrl;//支付结果跳转URL

    private String sceneCode;//支付场景码

    private String matchStatus;//00：未对账01：对账中02：平账03：不平账04：无需对账

    private String refundStatus;//退款状态(00：退款成功，01退款中，02退款失败)

    private String settlementState;//0-未结算，1-已结算

    private String settlementNo;//结算流水号

    private Integer settlementDate;//结算日期

    private String callType;//1-补单，2-销单,0-正常

    private String remark;//备注

    private String createUser;//创建人（系统默认“99”，其它为运营人员ID号）

    private String updateUser;//最后更新人

    private String createTime;//新增时间
    
    private String createEndTime;//新增时间

    private String createStartTime;//新增时间

    private String updateTime;//最后更新时间
    
    private String payType;//微信支付模式：APP、JSAPI、NATIVE  支付宝支付模式：APP、WAP、NATIVE   捷易付支付模式：H5

    private String payChannelId;//支付渠道号 WeChat:微信，Alipay：支付宝，JYF：捷易付
    
    private String terminalType	;//终端类型（M：移动用户，P：PC用户
    
  	private String deviceType	;//设备类型 1安卓，2ios
  	
	private String isByPage;// 是否分页 Y , N

    private List<TranCorePayOrderBean> tranCoreRefundOrderBeanList;

	
    
	public String getRefundExtenalNo() {
		return refundExtenalNo;
	}

	public void setRefundExtenalNo(String refundExtenalNo) {
		this.refundExtenalNo = refundExtenalNo;
	}

	public String getTerminalType() {
		return terminalType;
	}

	public void setTerminalType(String terminalType) {
		this.terminalType = terminalType;
	}

	public String getDeviceType() {
		return deviceType;
	}

	public void setDeviceType(String deviceType) {
		this.deviceType = deviceType;
	}

	public String getBusNo() {
		return busNo;
	}

	public void setBusNo(String busNo) {
		this.busNo = busNo;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getBusType() {
		return busType;
	}

	public void setBusType(String busType) {
		this.busType = busType;
	}

	public String getLinkPayNo() {
		return linkPayNo;
	}

	public void setLinkPayNo(String linkPayNo) {
		this.linkPayNo = linkPayNo;
	}

	public Integer getRefundAmount() {
		return refundAmount;
	}

	public void setRefundAmount(Integer refundAmount) {
		this.refundAmount = refundAmount;
	}

	public String getRefundType() {
		return refundType;
	}

	public void setRefundType(String refundType) {
		this.refundType = refundType;
	}

	public Long getTranFee() {
		return tranFee;
	}

	public void setTranFee(Long tranFee) {
		this.tranFee = tranFee;
	}

	public Integer getTranDate() {
		return tranDate;
	}

	public void setTranDate(Integer tranDate) {
		this.tranDate = tranDate;
	}

	public String getMerchantExtenalNo() {
		return merchantExtenalNo;
	}

	public void setMerchantExtenalNo(String merchantExtenalNo) {
		this.merchantExtenalNo = merchantExtenalNo;
	}

	public String getMerchantId() {
		return merchantId;
	}

	public void setMerchantId(String merchantId) {
		this.merchantId = merchantId;
	}

	public String getMerchantMemberId() {
		return merchantMemberId;
	}

	public void setMerchantMemberId(String merchantMemberId) {
		this.merchantMemberId = merchantMemberId;
	}

	public String getMerchantName() {
		return merchantName;
	}

	public void setMerchantName(String merchantName) {
		this.merchantName = merchantName;
	}

	public String getPayMemberId() {
		return payMemberId;
	}

	public void setPayMemberId(String payMemberId) {
		this.payMemberId = payMemberId;
	}

	public String getPayMemberName() {
		return payMemberName;
	}

	public void setPayMemberName(String payMemberName) {
		this.payMemberName = payMemberName;
	}

	public String getPayMemberMobile() {
		return payMemberMobile;
	}

	public void setPayMemberMobile(String payMemberMobile) {
		this.payMemberMobile = payMemberMobile;
	}

	public Long getTranAmount() {
		return tranAmount;
	}

	public void setTranAmount(Long tranAmount) {
		this.tranAmount = tranAmount;
	}
	
	public String getExpiredTime() {
		return expiredTime;
	}

	public void setExpiredTime(String expiredTime) {
		this.expiredTime = expiredTime;
	}

	public String getOrderName() {
		return orderName;
	}

	public void setOrderName(String orderName) {
		this.orderName = orderName;
	}

	public String getOrderDes() {
		return orderDes;
	}

	public void setOrderDes(String orderDes) {
		this.orderDes = orderDes;
	}

	public String getResultNoticeUrl() {
		return resultNoticeUrl;
	}

	public void setResultNoticeUrl(String resultNoticeUrl) {
		this.resultNoticeUrl = resultNoticeUrl;
	}

	public String getResultPageUrl() {
		return resultPageUrl;
	}

	public void setResultPageUrl(String resultPageUrl) {
		this.resultPageUrl = resultPageUrl;
	}

	public String getSceneCode() {
		return sceneCode;
	}

	public void setSceneCode(String sceneCode) {
		this.sceneCode = sceneCode;
	}

	public String getMatchStatus() {
		return matchStatus;
	}

	public void setMatchStatus(String matchStatus) {
		this.matchStatus = matchStatus;
	}

	public String getRefundStatus() {
		return refundStatus;
	}

	public void setRefundStatus(String refundStatus) {
		this.refundStatus = refundStatus;
	}

	public String getSettlementState() {
		return settlementState;
	}

	public void setSettlementState(String settlementState) {
		this.settlementState = settlementState;
	}

	public String getSettlementNo() {
		return settlementNo;
	}

	public void setSettlementNo(String settlementNo) {
		this.settlementNo = settlementNo;
	}

	public Integer getSettlementDate() {
		return settlementDate;
	}

	public void setSettlementDate(Integer settlementDate) {
		this.settlementDate = settlementDate;
	}

	public String getCallType() {
		return callType;
	}

	public void setCallType(String callType) {
		this.callType = callType;
	}

	public String getPayType() {
		return payType;
	}

	public void setPayType(String payType) {
		this.payType = payType;
	}

	public String getPayChannelId() {
		return payChannelId;
	}

	public void setPayChannelId(String payChannelId) {
		this.payChannelId = payChannelId;
	}

	public String getRemark() {
		return remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}

	public String getCreateUser() {
		return createUser;
	}

	public void setCreateUser(String createUser) {
		this.createUser = createUser;
	}

	public String getUpdateUser() {
		return updateUser;
	}

	public void setUpdateUser(String updateUser) {
		this.updateUser = updateUser;
	}

	public String getCreateTime() {
		return createTime;
	}

	public void setCreateTime(String createTime) {
		this.createTime = createTime;
	}

	public String getCreateEndTime() {
		return createEndTime;
	}

	public void setCreateEndTime(String createEndTime) {
		this.createEndTime = createEndTime;
	}

	public String getCreateStartTime() {
		return createStartTime;
	}

	public void setCreateStartTime(String createStartTime) {
		this.createStartTime = createStartTime;
	}

	public String getUpdateTime() {
		return updateTime;
	}

	public void setUpdateTime(String updateTime) {
		this.updateTime = updateTime;
	}
	
	public String getIsByPage() {
		return isByPage;
	}

	public void setIsByPage(String isByPage) {
		this.isByPage = isByPage;
	}

	public List<TranCorePayOrderBean> getTranCoreRefundOrderBeanList() {
		return tranCoreRefundOrderBeanList;
	}

	public void setTranCoreRefundOrderBeanList(List<TranCorePayOrderBean> tranCoreRefundOrderBeanList) {
		this.tranCoreRefundOrderBeanList = tranCoreRefundOrderBeanList;
	}

}
