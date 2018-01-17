package com.jst.prodution.settlement.model;

import java.util.Date;

public class TranClearBook implements java.io.Serializable{
    /**
     * 
     */
    private static final long serialVersionUID = 1L;

    private String clearSeq;

    private Integer clearDate;

    private String merchantExtenalNo;

    private Integer tranDate;

    private String tranSeq;

    private String tranState;

    private String tranType;

    private String merchantId;

    private String merchantMemberId;

    private String merchantName;

    private String payMemberId;

    private String payMemberName;

    private Long tranAmount;

    private Long disCountAmt;

    private Long payAmount;
    private String upMerchantId;

    private String upMerchantMemberId;

    private String upMerchantName;

    private String clearStatus;

    private Date createdOn;

    private Date updatedOn;

    private String payChannelId;//支付渠道

    private String thirdPayMch;//第三方付款商户

    public String getClearSeq() {
        return clearSeq;
    }

    public void setClearSeq(String clearSeq) {
        this.clearSeq = clearSeq == null ? null : clearSeq.trim();
    }

    public Integer getClearDate() {
        return clearDate;
    }

    public void setClearDate(Integer clearDate) {
        this.clearDate = clearDate;
    }

    public String getMerchantExtenalNo() {
        return merchantExtenalNo;
    }

    public void setMerchantExtenalNo(String merchantExtenalNo) {
        this.merchantExtenalNo = merchantExtenalNo == null ? null : merchantExtenalNo.trim();
    }
    public Long getDisCountAmt() {
        return disCountAmt;
    }

    public void setDisCountAmt(Long disCountAmt) {
        this.disCountAmt = disCountAmt;
    }

    public Long getPayAmount() {
        return payAmount;
    }

    public void setPayAmount(Long payAmount) {
        this.payAmount = payAmount;
    }
    public Integer getTranDate() {
        return tranDate;
    }

    public void setTranDate(Integer tranDate) {
        this.tranDate = tranDate;
    }

    public String getTranSeq() {
        return tranSeq;
    }

    public void setTranSeq(String tranSeq) {
        this.tranSeq = tranSeq == null ? null : tranSeq.trim();
    }

    public String getTranState() {
        return tranState;
    }

    public void setTranState(String tranState) {
        this.tranState = tranState == null ? null : tranState.trim();
    }

    public String getTranType() {
        return tranType;
    }

    public void setTranType(String tranType) {
        this.tranType = tranType == null ? null : tranType.trim();
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

    public Long getTranAmount() {
        return tranAmount;
    }

    public void setTranAmount(Long tranAmount) {
        this.tranAmount = tranAmount;
    }

    public String getUpMerchantId() {
        return upMerchantId;
    }

    public void setUpMerchantId(String upMerchantId) {
        this.upMerchantId = upMerchantId == null ? null : upMerchantId.trim();
    }

    public String getUpMerchantMemberId() {
        return upMerchantMemberId;
    }

    public void setUpMerchantMemberId(String upMerchantMemberId) {
        this.upMerchantMemberId = upMerchantMemberId == null ? null : upMerchantMemberId.trim();
    }

    public String getUpMerchantName() {
        return upMerchantName;
    }

    public void setUpMerchantName(String upMerchantName) {
        this.upMerchantName = upMerchantName == null ? null : upMerchantName.trim();
    }

    public String getClearStatus() {
        return clearStatus;
    }

    public void setClearStatus(String clearStatus) {
        this.clearStatus = clearStatus == null ? null : clearStatus.trim();
    }

    public Date getCreatedOn() {
        return createdOn;
    }

    public void setCreatedOn(Date createdOn) {
        this.createdOn = createdOn;
    }

    public Date getUpdatedOn() {
        return updatedOn;
    }

    public void setUpdatedOn(Date updatedOn) {
        this.updatedOn = updatedOn;
    }

    public String getPayChannelId() {
        return payChannelId;
    }

    public void setPayChannelId(String payChannelId) {
        this.payChannelId = payChannelId;
    }

    public String getThirdPayMch() {
        return thirdPayMch;
    }

    public void setThirdPayMch(String thirdPayMch) {
        this.thirdPayMch = thirdPayMch;
    }
}