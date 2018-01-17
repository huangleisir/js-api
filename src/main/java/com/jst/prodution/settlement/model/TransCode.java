package com.jst.prodution.settlement.model;

import java.util.Date;

public class TransCode implements java.io.Serializable{

	private static final long serialVersionUID = 1L;

	private String transCode;

    private String transName;

    private String isSettle;

    private String acqDcFlag;

    private String payDcFlag;

    private String feeDirIn;

    private String settleType;

    private String creator;

    private Date createTime;

    private String updator;

    private Date updateTime;

    public String getTransCode() {
        return transCode;
    }

    public void setTransCode(String transCode) {
        this.transCode = transCode == null ? null : transCode.trim();
    }

    public String getTransName() {
        return transName;
    }

    public void setTransName(String transName) {
        this.transName = transName == null ? null : transName.trim();
    }

    public String getIsSettle() {
        return isSettle;
    }

    public void setIsSettle(String isSettle) {
        this.isSettle = isSettle == null ? null : isSettle.trim();
    }

    public String getAcqDcFlag() {
        return acqDcFlag;
    }

    public void setAcqDcFlag(String acqDcFlag) {
        this.acqDcFlag = acqDcFlag == null ? null : acqDcFlag.trim();
    }

    public String getPayDcFlag() {
        return payDcFlag;
    }

    public void setPayDcFlag(String payDcFlag) {
        this.payDcFlag = payDcFlag == null ? null : payDcFlag.trim();
    }

    public String getFeeDirIn() {
        return feeDirIn;
    }

    public void setFeeDirIn(String feeDirIn) {
        this.feeDirIn = feeDirIn == null ? null : feeDirIn.trim();
    }

    public String getSettleType() {
        return settleType;
    }

    public void setSettleType(String settleType) {
        this.settleType = settleType == null ? null : settleType.trim();
    }

    public String getCreator() {
        return creator;
    }

    public void setCreator(String creator) {
        this.creator = creator == null ? null : creator.trim();
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public String getUpdator() {
        return updator;
    }

    public void setUpdator(String updator) {
        this.updator = updator == null ? null : updator.trim();
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }
}