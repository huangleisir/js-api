/*
* Copyright (c) 2015-2018 SHENZHEN GUIYI SCIENCE AND TECHNOLOGY DEVELOP CO., LTD. All rights reserved.
*
* 注意：本内容仅限于深圳市捷顺金科研发有限公司内部传阅，禁止外泄以及用于其他的商业目的 
*/
package com.jst.prodution.park.serviceBean;

import java.io.Serializable;

public class Park implements Serializable {
    /**
     * 
     */
    private static final long serialVersionUID = 1L;

    private String parkelecid;

    private String type;

    private String name;

    private String adr;

    private String gps;

    private String range;//距离   与用户的距离

    private String carseatsum;

    private String carseatleft;

    private String ifsupporthold;//是否支持代扣   0：不支持,1：支持
    
    private String ifparse;

    private String parkelecsum;

    private String parkelecleft;

    private String elecprice;

    private String ifelec;

    private String fareruleid;

    /** 简述规则 */
    private String sketchRules; //简述规则
    
    private String fareruledesc;

    private String chargeshow;
    
    private String parktype ; //1-路边停车场；02-室内停车场；03-充电场；04-两用（可停车、可充电）

    /**
     * 方法名: getSketchRules
     * 描述: 简述规则
     * @return
     */
    public String getSketchRules() {
		return sketchRules;
	}
    /**
     * 方法名: setSketchRules
     * 描述: 简述规则
     * @param sketchRules
     */
	public void setSketchRules(String sketchRules) {
		this.sketchRules = sketchRules;
	}

	public String getParkelecid() {
        return parkelecid;
    }

    public void setParkelecid(String parkelecid) {
        this.parkelecid = parkelecid;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAdr() {
        return adr;
    }

    public void setAdr(String adr) {
        this.adr = adr;
    }

    public String getGps() {
        return gps;
    }

    public void setGps(String gps) {
        this.gps = gps;
    }

    public String getRange() {
        return range;
    }

    public void setRange(String range) {
        this.range = range;
    }

    public String getCarseatsum() {
        return carseatsum;
    }

    public void setCarseatsum(String carseatsum) {
        this.carseatsum = carseatsum;
    }

    public String getCarseatleft() {
        return carseatleft;
    }

    public void setCarseatleft(String carseatleft) {
        this.carseatleft = carseatleft;
    }

    public String getIfparse() {
        return ifparse;
    }

    public void setIfparse(String ifparse) {
        this.ifparse = ifparse;
    }

    public String getParkelecsum() {
        return parkelecsum;
    }

    public void setParkelecsum(String parkelecsum) {
        this.parkelecsum = parkelecsum;
    }

    public String getParkelecleft() {
        return parkelecleft;
    }

    public void setParkelecleft(String parkelecleft) {
        this.parkelecleft = parkelecleft;
    }

    public String getElecprice() {
        return elecprice;
    }

    public void setElecprice(String elecprice) {
        this.elecprice = elecprice;
    }

    public String getIfelec() {
        return ifelec;
    }

    public void setIfelec(String ifelec) {
        this.ifelec = ifelec;
    }

    public String getFareruleid() {
        return fareruleid;
    }

    public void setFareruleid(String fareruleid) {
        this.fareruleid = fareruleid;
    }

    public String getFareruledesc() {
        return fareruledesc;
    }

    public void setFareruledesc(String fareruledesc) {
        this.fareruledesc = fareruledesc;
    }

    public String getChargeshow() {
        return chargeshow;
    }

    public void setChargeshow(String chargeshow) {
        this.chargeshow = chargeshow;
    }

    public String getIfsupporthold() {
        return ifsupporthold;
    }

    public void setIfsupporthold(String ifsupporthold) {
        this.ifsupporthold = ifsupporthold;
    }
	public String getParktype() {
		return parktype;
	}
	public void setParktype(String parktype) {
		this.parktype = parktype;
	}
    
}
