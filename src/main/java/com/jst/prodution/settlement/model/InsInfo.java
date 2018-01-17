package com.jst.prodution.settlement.model;

import java.util.Date;

public class InsInfo {
    private String insCd;

    private String insName;

    private String cnShort;

    private String instEngName;

    private String instEngAbbr;

    private String isSettle;

    private Integer settlePri;

    private String settleType;

    private String creator;

    private Date createTime;

    private String updator;

    private Date updateTime;

    public String getInsCd() {
        return insCd;
    }

    public void setInsCd(String insCd) {
        this.insCd = insCd == null ? null : insCd.trim();
    }

    public String getInsName() {
        return insName;
    }

    public void setInsName(String insName) {
        this.insName = insName == null ? null : insName.trim();
    }

    public String getCnShort() {
        return cnShort;
    }

    public void setCnShort(String cnShort) {
        this.cnShort = cnShort == null ? null : cnShort.trim();
    }

    public String getInstEngName() {
        return instEngName;
    }

    public void setInstEngName(String instEngName) {
        this.instEngName = instEngName == null ? null : instEngName.trim();
    }

    public String getInstEngAbbr() {
        return instEngAbbr;
    }

    public void setInstEngAbbr(String instEngAbbr) {
        this.instEngAbbr = instEngAbbr == null ? null : instEngAbbr.trim();
    }

    public String getIsSettle() {
        return isSettle;
    }

    public void setIsSettle(String isSettle) {
        this.isSettle = isSettle == null ? null : isSettle.trim();
    }

    public Integer getSettlePri() {
        return settlePri;
    }

    public void setSettlePri(Integer settlePri) {
        this.settlePri = settlePri;
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