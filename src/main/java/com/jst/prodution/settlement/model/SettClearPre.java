package com.jst.prodution.settlement.model;

public class SettClearPre {
    private String acqOrderNo;

    private String refundSeq;

    private String payInsCd;

    private Long tranAmt;

    private Long promoteAmount;

    private Long totalAmt;

    private Integer tranDate;

    private String tranCode;

    private String mchntCd;

    private Integer jobDate;

    private String thirdChannelId;

    private String clearStatus;

    private String merchantId;

    private String uuid;

    public String getAcqOrderNo() {
        return acqOrderNo;
    }

    public void setAcqOrderNo(String acqOrderNo) {
        this.acqOrderNo = acqOrderNo == null ? null : acqOrderNo.trim();
    }

    public String getRefundSeq() {
        return refundSeq;
    }

    public void setRefundSeq(String refundSeq) {
        this.refundSeq = refundSeq == null ? null : refundSeq.trim();
    }

    public String getPayInsCd() {
        return payInsCd;
    }

    public void setPayInsCd(String payInsCd) {
        this.payInsCd = payInsCd == null ? null : payInsCd.trim();
    }

    public Long getTranAmt() {
        return tranAmt;
    }

    public void setTranAmt(Long tranAmt) {
        this.tranAmt = tranAmt;
    }

    public Long getPromoteAmount() {
        return promoteAmount;
    }

    public void setPromoteAmount(Long promoteAmount) {
        this.promoteAmount = promoteAmount;
    }

    public Long getTotalAmt() {
        return totalAmt;
    }

    public void setTotalAmt(Long totalAmt) {
        this.totalAmt = totalAmt;
    }

    public Integer getTranDate() {
        return tranDate;
    }

    public void setTranDate(Integer tranDate) {
        this.tranDate = tranDate;
    }

    public String getTranCode() {
        return tranCode;
    }

    public void setTranCode(String tranCode) {
        this.tranCode = tranCode == null ? null : tranCode.trim();
    }

    public String getMchntCd() {
        return mchntCd;
    }

    public void setMchntCd(String mchntCd) {
        this.mchntCd = mchntCd == null ? null : mchntCd.trim();
    }

    public Integer getJobDate() {
        return jobDate;
    }

    public void setJobDate(Integer jobDate) {
        this.jobDate = jobDate;
    }

    public String getThirdChannelId() {
        return thirdChannelId;
    }

    public void setThirdChannelId(String thirdChannelId) {
        this.thirdChannelId = thirdChannelId == null ? null : thirdChannelId.trim();
    }

    public String getClearStatus() {
        return clearStatus;
    }

    public void setClearStatus(String clearStatus) {
        this.clearStatus = clearStatus == null ? null : clearStatus.trim();
    }

    public String getMerchantId() {
        return merchantId;
    }

    public void setMerchantId(String merchantId) {
        this.merchantId = merchantId == null ? null : merchantId.trim();
    }

    public String getUuid() {
        return uuid;
    }

    public void setUuid(String uuid) {
        this.uuid = uuid == null ? null : uuid.trim();
    }
}