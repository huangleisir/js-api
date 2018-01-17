/*
* Copyright (c) 2015-2018 SHENZHEN GUIYI SCIENCE AND TECHNOLOGY DEVELOP CO., LTD. All rights reserved.
*
* 注意：本内容仅限于深圳市捷顺金科研发有限公司内部传阅，禁止外泄以及用于其他的商业目的 
*/
package com.jst.prodution.park.serviceBean;

import java.util.List;

import com.jst.prodution.base.bean.BaseBean;

/**
 * 订单详情Bean
 * 
 * @Package: com.jst.prodution.park.serviceBean  
 * @ClassName: ParkQueryorderOutputBean 
 * @Description: TODO
 *
 * @author: Administrator 
 * @date: 2017年2月24日 下午7:30:27 
 * @version V1.0 
 

 */ 
public class ParkQueryorderOutputBean extends BaseBean {

    /**
     * 
     */
    private static final long serialVersionUID = 1L;

    private String orderstatus; // 订单状态 ,01-已下单；02-已取消；03-停车中；04-代扣失败；05-已完成

    private String ifneedpay;// 是否需要支付,Y-是；N-否

    private String parkid;// 车场ID

    private String parkname;// 车场名称

    private String ifpropay;// 是否支持代扣 Y-是；N-否

    private String carseatid;// 车位ID 路边的必填，室内不填

    private String parktime;// 停车时长 单位：秒

    private String carno;// 车牌号

    private String intime;// 入场时间

    private String outtime;

    private String outvalidtime;

    private String amtpayed;// 支付费用 单位：分

    private String overtime;// 超时时长 单位：秒，停车中的订单为当前的超时时长，已完成的订单为全部的超时时长

    private String amtovertime;// 补交费用 单位：分，停车中的订单为需补交的费用，已完成的订单为已经补交的费用

    private String amtreturn;// 退费费用 单位：分，已完成的订单为已经退款的费用

    private List<ParkPayOrder> ordlist;// 支付流水列表

    private String resultcode;         //0000：成功,0001：失败

    private String ordtype;//订单类型   10-路边；20-室内
    
    private String ordId;
    

    public String getOrdId() {
		return ordId;
	}

	public void setOrdId(String ordId) {
		this.ordId = ordId;
	}

	public String getOrderstatus() {
        return orderstatus;
    }

    public void setOrderstatus(String orderstatus) {
        this.orderstatus = orderstatus;
    }

    public String getIfneedpay() {
        return ifneedpay;
    }

    public void setIfneedpay(String ifneedpay) {
        this.ifneedpay = ifneedpay;
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

    public String getCarseatid() {
        return carseatid;
    }

    public void setCarseatid(String carseatid) {
        this.carseatid = carseatid;
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

    public String getOutvalidtime() {
        return outvalidtime;
    }

    public void setOutvalidtime(String outvalidtime) {
        this.outvalidtime = outvalidtime;
    }

    public String getAmtpayed() {
        return amtpayed;
    }

    public void setAmtpayed(String amtpayed) {
        this.amtpayed = amtpayed;
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

    public String getAmtreturn() {
        return amtreturn;
    }

    public void setAmtreturn(String amtreturn) {
        this.amtreturn = amtreturn;
    }

    public List<ParkPayOrder> getOrdlist() {
        return ordlist;
    }

    public void setOrdlist(List<ParkPayOrder> ordlist) {
        this.ordlist = ordlist;
    }

    public String getResultcode() {
        return resultcode;
    }

    public void setResultcode(String resultcode) {
        this.resultcode = resultcode;
    }

	public String getOrdtype() {
		return ordtype;
	}

	public void setOrdtype(String ordtype) {
		this.ordtype = ordtype;
	}
}