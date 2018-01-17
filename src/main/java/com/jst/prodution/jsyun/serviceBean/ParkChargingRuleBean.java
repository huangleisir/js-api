package com.jst.prodution.jsyun.serviceBean;

import java.io.Serializable;

public class ParkChargingRuleBean implements Serializable{
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
     * 记录编号
     */
    private String id;

    /**
     * 停车场编号
     */
    private String parkCode;

    /**
     * 标题
     */
    private String title;
    
    /**
     * 计费规则说明
     */
    private String ruleDescribe;

    /**
     * 首小时收费
     */
    private String firstFee;

    /** 简述规则 */
    private String sketchRules; //简述规则
    
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
    
    /**
     * 记录编号
     * @return id 记录编号
     */
    public String getId() {
        return id;
    }

    /**
     * 记录编号
     * @param id 记录编号
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * 停车场编号
     * @return park_code 停车场编号
     */
    public String getParkCode() {
        return parkCode;
    }

    /**
     * 停车场编号
     * @param parkCode 停车场编号
     */
    public void setParkCode(String parkCode) {
        this.parkCode = parkCode;
    }

    /**
     * 标题
     * @return title 标题
     */
    public String getTitle() {
        return title;
    }

    /**
     * 标题
     * @param title 标题
     */
    public void setTitle(String title) {
        this.title = title;
    }

    /**
     * 计费规则说明
     * @return rule_describe 计费规则说明
     */
    public String getRuleDescribe() {
        return ruleDescribe;
    }

    /**
     * 计费规则说明
     * @param ruleDescribe 计费规则说明
     */
    public void setRuleDescribe(String ruleDescribe) {
        this.ruleDescribe = ruleDescribe;
    }

    /**
     * 
     * @return first_fee 
     */
    public String getFirstFee() {
        return firstFee;
    }

    /**
     * 
     * @param firstFee 
     */
    public void setFirstFee(String firstFee) {
        this.firstFee = firstFee;
    }
}