package com.jst.prodution.settlement.serviceBean;

import com.jst.prodution.base.bean.BaseBean;

import java.util.Date;

/**
 * Created by Administrator on 2017/8/14.
 */
public class InsInfoBean extends BaseBean {

    private static final long serialVersionUID = 1L;
    private String insCd;

    private String insName;

    private String cnShort;

    private String instEngName;

    private String instEngAbbr;

    private String isSettle;

    private Integer settlePri;

    private String settleType;

    private String creator;


    private String createTime;

    private String updator;

    private String updateTime;

    public String getInsCd() {
        return insCd;
    }

    public void setInsCd(String insCd) {
        this.insCd = insCd;
    }

    public String getInsName() {
        return insName;
    }

    public void setInsName(String insName) {
        this.insName = insName;
    }

    public String getCnShort() {
        return cnShort;
    }

    public void setCnShort(String cnShort) {
        this.cnShort = cnShort;
    }

    public String getInstEngName() {
        return instEngName;
    }

    public void setInstEngName(String instEngName) {
        this.instEngName = instEngName;
    }

    public String getInstEngAbbr() {
        return instEngAbbr;
    }

    public void setInstEngAbbr(String instEngAbbr) {
        this.instEngAbbr = instEngAbbr;
    }

    public String getIsSettle() {
        return isSettle;
    }

    public void setIsSettle(String isSettle) {
        this.isSettle = isSettle;
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
        this.settleType = settleType;
    }

    public String getCreator() {
        return creator;
    }

    public void setCreator(String creator) {
        this.creator = creator;
    }

    public String getCreateTime() {
        return createTime;
    }

    public void setCreateTime(String createTime) {
        this.createTime = createTime;
    }

    public String getUpdator() {
        return updator;
    }

    public void setUpdator(String updator) {
        this.updator = updator;
    }

    public String getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(String updateTime) {
        this.updateTime = updateTime;
    }


}
