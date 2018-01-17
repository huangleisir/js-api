package com.jst.prodution.tran.serviceBean;

import java.util.Date;

import com.jst.prodution.base.bean.BaseBean;

public class PayResUpdateBean extends BaseBean {
	
	private static final long serialVersionUID = 1L;

    private String busNo;

    private String state; //0-成功，1-待处理，2-处理中，3-失败,4,已退款

    private String busType;

    private String linkPayNo;

    private Long refundAmount; //已退款金额

    private String refundType;

    private Long tranFee;

    private Integer tranDate;

    private String merchantExtenalNo;

    private String merchantId;

    private String merchantMemberId;

    private String merchantName;

    private String payMemberId;

    private String payMemberName;

    private String payMemberMobile;

    private Long tranAmount;

    private Date expiredTime;

    private String orderName;

    private String orderDes;

    private String resultNoticeUrl;

    private String resultPageUrl;

    private String sceneCode;

    private String matchStatus;

    private String refundStatus;//退款状态(00：退款成功，01退款中，02退款失败)

    private String settlementState;

    private String settlementNo;

    private Integer settlementDate;

    private String callType;

    private String remark;

    private String createUser;

    private String updateUser;

    private Date createTime;

    private Date updateTime;
    
    private String payType;//微信支付模式：APP、JSAPI、NATIVE  支付宝支付模式：APP、WAP、NATIVE   捷易付支付模式：H5

	private String payChannelId		;//(添加字段)支付渠道号 WeChat:微信，Alipay：支付宝，JYF：捷易付

    //增加统计用字段
    private Integer settlementNumber;
    private Long tranAcount;

    public String getPayType() {
		return payType;
	}

	public void setPayType(String payType) {
		this.payType = payType;
	}

	public String getBusNo() {
        return busNo;
    }

    public void setBusNo(String busNo) {
        this.busNo = busNo == null ? null : busNo.trim();
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state == null ? null : state.trim();
    }

    public String getBusType() {
        return busType;
    }

    public void setBusType(String busType) {
        this.busType = busType == null ? null : busType.trim();
    }

    public String getLinkPayNo() {
        return linkPayNo;
    }

    public void setLinkPayNo(String linkPayNo) {
        this.linkPayNo = linkPayNo == null ? null : linkPayNo.trim();
    }

    public Long getRefundAmount() {
        return refundAmount;
    }

    public void setRefundAmount(Long refundAmount) {
        this.refundAmount = refundAmount;
    }

    public String getRefundType() {
        return refundType;
    }

    public void setRefundType(String refundType) {
        this.refundType = refundType == null ? null : refundType.trim();
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
        this.merchantExtenalNo = merchantExtenalNo == null ? null : merchantExtenalNo.trim();
    }

    public String getMerchantId() {
        return merchantId;
    }

    public void setMerchantId(String merchantId) {
        this.merchantId = merchantId == null ? null : merchantId.trim();
    }

    public String getMerchantMemberId() {
        return merchantMemberId;
    }

    public void setMerchantMemberId(String merchantMemberId) {
        this.merchantMemberId = merchantMemberId == null ? null : merchantMemberId.trim();
    }

    public String getMerchantName() {
        return merchantName;
    }

    public void setMerchantName(String merchantName) {
        this.merchantName = merchantName == null ? null : merchantName.trim();
    }

    public String getPayMemberId() {
        return payMemberId;
    }

    public void setPayMemberId(String payMemberId) {
        this.payMemberId = payMemberId == null ? null : payMemberId.trim();
    }

    public String getPayMemberName() {
        return payMemberName;
    }

    public void setPayMemberName(String payMemberName) {
        this.payMemberName = payMemberName == null ? null : payMemberName.trim();
    }

    public String getPayMemberMobile() {
        return payMemberMobile;
    }

    public void setPayMemberMobile(String payMemberMobile) {
        this.payMemberMobile = payMemberMobile == null ? null : payMemberMobile.trim();
    }

    public Long getTranAmount() {
        return tranAmount;
    }

    public void setTranAmount(Long tranAmount) {
        this.tranAmount = tranAmount;
    }

    public Date getExpiredTime() {
        return expiredTime;
    }

    public void setExpiredTime(Date expiredTime) {
        this.expiredTime = expiredTime;
    }

    public String getOrderName() {
        return orderName;
    }

    public void setOrderName(String orderName) {
        this.orderName = orderName == null ? null : orderName.trim();
    }

    public String getOrderDes() {
        return orderDes;
    }

    public void setOrderDes(String orderDes) {
        this.orderDes = orderDes == null ? null : orderDes.trim();
    }

    public String getResultNoticeUrl() {
        return resultNoticeUrl;
    }

    public void setResultNoticeUrl(String resultNoticeUrl) {
        this.resultNoticeUrl = resultNoticeUrl == null ? null : resultNoticeUrl.trim();
    }

    public String getResultPageUrl() {
        return resultPageUrl;
    }

    public void setResultPageUrl(String resultPageUrl) {
        this.resultPageUrl = resultPageUrl == null ? null : resultPageUrl.trim();
    }

    public String getSceneCode() {
        return sceneCode;
    }

    public void setSceneCode(String sceneCode) {
        this.sceneCode = sceneCode == null ? null : sceneCode.trim();
    }

    public String getMatchStatus() {
        return matchStatus;
    }

    public void setMatchStatus(String matchStatus) {
        this.matchStatus = matchStatus == null ? null : matchStatus.trim();
    }

    public String getRefundStatus() {
        return refundStatus;
    }

    public void setRefundStatus(String refundStatus) {
        this.refundStatus = refundStatus == null ? null : refundStatus.trim();
    }

    public String getSettlementState() {
        return settlementState;
    }

    public void setSettlementState(String settlementState) {
        this.settlementState = settlementState == null ? null : settlementState.trim();
    }

    public String getSettlementNo() {
        return settlementNo;
    }

    public void setSettlementNo(String settlementNo) {
        this.settlementNo = settlementNo == null ? null : settlementNo.trim();
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
        this.callType = callType == null ? null : callType.trim();
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }

    public String getCreateUser() {
        return createUser;
    }

    public void setCreateUser(String createUser) {
        this.createUser = createUser == null ? null : createUser.trim();
    }

    public String getUpdateUser() {
        return updateUser;
    }

    public void setUpdateUser(String updateUser) {
        this.updateUser = updateUser == null ? null : updateUser.trim();
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }
    
    public Integer getSettlementNumber(){
    	return settlementNumber;
    }
    
    public void setSettlementNumber(Integer settlementNumber){
    	this.settlementNumber = settlementNumber;
    }
    
    public Long getTranAcount(){
    	return tranAcount;
    }
    
    public void setTranAcount(Long tranAcount){
    	this.tranAcount = tranAcount;
    }

	public String getPayChannelId() {
		return payChannelId;
	}

	public void setPayChannelId(String payChannelId) {
		this.payChannelId = payChannelId;
	}
    
}
