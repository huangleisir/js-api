package com.jst.prodution.settlement.model;

import java.util.Date;

public class TranFeeOrder implements java.io.Serializable{
    /**
     * 
     */
    private static final long serialVersionUID = 1L;

    private String tranFeeId;

    private Integer tranFeeDate;

    private String merchantId;

    private String merchantMemberId;

    private String busNo;

    private String settlementNo;

    private Integer tranAmount;

    private Integer settlementAmount;

    private Integer tranFeeSeq;

    private String tranFeeFlag;

    private String oppMerchantId;

    private String oppMerchantMemberId;

    private Integer tranFeeAmount;

    private String createUser;

    private String updateUser;
    
    private Integer cutDate;

    private Date createTime;

    private Date updateTime;

    
    public Integer getCutDate() {
		return cutDate;
	}

	public void setCutDate(Integer cutDate) {
		this.cutDate = cutDate;
	}

	public String getTranFeeId() {
        return tranFeeId;
    }

    public void setTranFeeId(String tranFeeId) {
        this.tranFeeId = tranFeeId == null ? null : tranFeeId.trim();
    }

    public Integer getTranFeeDate() {
        return tranFeeDate;
    }

    public void setTranFeeDate(Integer tranFeeDate) {
        this.tranFeeDate = tranFeeDate;
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

    public String getBusNo() {
        return busNo;
    }

    public void setBusNo(String busNo) {
        this.busNo = busNo == null ? null : busNo.trim();
    }

    public String getSettlementNo() {
        return settlementNo;
    }

    public void setSettlementNo(String settlementNo) {
        this.settlementNo = settlementNo == null ? null : settlementNo.trim();
    }

    public Integer getTranAmount() {
        return tranAmount;
    }

    public void setTranAmount(Integer tranAmount) {
        this.tranAmount = tranAmount;
    }

    public Integer getSettlementAmount() {
        return settlementAmount;
    }

    public void setSettlementAmount(Integer settlementAmount) {
        this.settlementAmount = settlementAmount;
    }

    public Integer getTranFeeSeq() {
        return tranFeeSeq;
    }

    public void setTranFeeSeq(Integer tranFeeSeq) {
        this.tranFeeSeq = tranFeeSeq;
    }

    public String getTranFeeFlag() {
        return tranFeeFlag;
    }

    public void setTranFeeFlag(String tranFeeFlag) {
        this.tranFeeFlag = tranFeeFlag == null ? null : tranFeeFlag.trim();
    }

    public String getOppMerchantId() {
        return oppMerchantId;
    }

    public void setOppMerchantId(String oppMerchantId) {
        this.oppMerchantId = oppMerchantId == null ? null : oppMerchantId.trim();
    }

    public String getOppMerchantMemberId() {
        return oppMerchantMemberId;
    }

    public void setOppMerchantMemberId(String oppMerchantMemberId) {
        this.oppMerchantMemberId = oppMerchantMemberId == null ? null : oppMerchantMemberId.trim();
    }

    public Integer getTranFeeAmount() {
        return tranFeeAmount;
    }

    public void setTranFeeAmount(Integer tranFeeAmount) {
        this.tranFeeAmount = tranFeeAmount;
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
}