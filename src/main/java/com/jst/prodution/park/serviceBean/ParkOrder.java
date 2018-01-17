/*
* Copyright (c) 2015-2018 SHENZHEN GUIYI SCIENCE AND TECHNOLOGY DEVELOP CO., LTD. All rights reserved.
*
* 注意：本内容仅限于深圳市捷顺金科研发有限公司内部传阅，禁止外泄以及用于其他的商业目的 
*/
package com.jst.prodution.park.serviceBean;

import java.io.Serializable;

public class ParkOrder implements Serializable {
    /**
     * 
     */
    private static final long serialVersionUID = 1L;

    private String ordid;// 支付请求流水

    private String ordtype;//订单类型   10-路边；20-室内

    private String needpayamt;//金额

    private String ordstatus;//订单状态 01-已下单；02-已取消； 03-停车中； 04-代扣失败； 05-已完成；


    private String mchntid;//商户ID   停车场所属商户

    private String mchntname;//商户名称

    private String carseatid;//车位ID

    private String carseatdesc;//车位描述

    private String parkid;

    private String parkname;

    private String ifpropay;//是否支持代扣    Y-是；N-否

    private String parktime;

    private String carno;

    private String ifneedpay;//是否需要支付   Y-是；N-否

    private String intime;

    private String outtime;

    private String overtime;

    private String amtovertime;

    private String returnamt;

    private String outvalidtime;

    public String getOrdid() {
        return ordid;
    }

    public void setOrdid(String ordid) {
        this.ordid = ordid;
    }

    public String getOrdtype() {
        return ordtype;
    }

    public void setOrdtype(String ordtype) {
        this.ordtype = ordtype;
    }

    public String getNeedpayamt() {
        return needpayamt;
    }

    public void setNeedpayamt(String needpayamt) {
        this.needpayamt = needpayamt;
    }

    public String getOrdstatus() {
        return ordstatus;
    }

    public void setOrdstatus(String ordstatus) {
        this.ordstatus = ordstatus;
    }

    public String getMchntid() {
        return mchntid;
    }

    public void setMchntid(String mchntid) {
        this.mchntid = mchntid;
    }

    public String getMchntname() {
        return mchntname;
    }

    public void setMchntname(String mchntname) {
        this.mchntname = mchntname;
    }

    public String getCarseatid() {
        return carseatid;
    }

    public void setCarseatid(String carseatid) {
        this.carseatid = carseatid;
    }

    public String getCarseatdesc() {
        return carseatdesc;
    }

    public void setCarseatdesc(String carseatdesc) {
        this.carseatdesc = carseatdesc;
    }

    public String getParkid() {
        return parkid;
    }

    public void setParkid(String parkid) {
        this.parkid = parkid;
    }

    public String getParkname() {
        return parkname;
    }

    public void setParkname(String parkname) {
        this.parkname = parkname;
    }

    public String getIfpropay() {
        return ifpropay;
    }

    public void setIfpropay(String ifpropay) {
        this.ifpropay = ifpropay;
    }

    public String getParktime() {
        return parktime;
    }

    public void setParktime(String parktime) {
        this.parktime = parktime;
    }

    public String getCarno() {
        return carno;
    }

    public void setCarno(String carno) {
        this.carno = carno;
    }

    public String getIfneedpay() {
        return ifneedpay;
    }

    public void setIfneedpay(String ifneedpay) {
        this.ifneedpay = ifneedpay;
    }

    public String getIntime() {
        return intime;
    }

    public void setIntime(String intime) {
        this.intime = intime;
    }

    public String getOuttime() {
        return outtime;
    }

    public void setOuttime(String outtime) {
        this.outtime = outtime;
    }

    public String getOvertime() {
        return overtime;
    }

    public void setOvertime(String overtime) {
        this.overtime = overtime;
    }

    public String getAmtovertime() {
        return amtovertime;
    }

    public void setAmtovertime(String amtovertime) {
        this.amtovertime = amtovertime;
    }

    public String getReturnamt() {
        return returnamt;
    }

    public void setReturnamt(String returnamt) {
        this.returnamt = returnamt;
    }

    public String getOutvalidtime() {
        return outvalidtime;
    }

    public void setOutvalidtime(String outvalidtime) {
        this.outvalidtime = outvalidtime;
    }
    
    
}
