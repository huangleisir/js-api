/*
* Copyright (c) 2015-2018 SHENZHEN GUIYI SCIENCE AND TECHNOLOGY DEVELOP CO., LTD. All rights reserved.
*
* 注意：本内容仅限于深圳市捷顺金科研发有限公司内部传阅，禁止外泄以及用于其他的商业目的 
*/
package com.jst.prodution.park.serviceBean;

import com.jst.prodution.base.bean.BaseBean;

/**
 * 订单列表Bean
 * 
 * @Package: com.jst.prodution.park.serviceBean
 * @ClassName: ParkBean
 * @Description: TODO
 *
 * @author: Administrator
 * @date: 2017年2月24日 上午9:47:22
 * @version V1.0
 * 
 * 
 */
public class ParkQueryorderlistInputBean extends BaseBean {

    /**
     * 
     */
    private static final long serialVersionUID = 1L;

    private String carno; // 车牌号,无用户ID时，按照车牌只能查停车中的订单
    private String carseatId; // 泊位号,无用户ID时，按照车牌只能查停车中的订单

    private String userid;// 用户ID

//    private String pageNo;// 第几页,从0开始，缺省：0
    /*
     * 订单状态,01-已下单； 02-已取消； 03-停车中； 04-离场待支付； 05-已完成； 支持多个，多个用逗号分开如01,02
     */
    private String ordstatus;

    private String if_needlastflag;// 0-否，默认；1-是。1的时候，如果无订单，则返回最近一笔订单

    private String if_needoutfare;// 是否需要补交,0-否；1-是

    private String attach; // 备用字段,Json格式字符串:{}

    private String mac; // 报文通讯mac

    
    public String getCarseatId() {
		return carseatId;
	}

	public void setCarseatId(String carseatId) {
		this.carseatId = carseatId;
	}

	public String getCarno() {
        return carno;
    }

    public void setCarno(String carno) {
        this.carno = carno;
    }

    public String getUserid() {
        return userid;
    }

    public void setUserid(String userid) {
        this.userid = userid;
    }

    public String getOrdstatus() {
        return ordstatus;
    }

    public void setOrdstatus(String ordstatus) {
        this.ordstatus = ordstatus;
    }

    public String getIf_needlastflag() {
        return if_needlastflag;
    }

    public void setIf_needlastflag(String if_needlastflag) {
        this.if_needlastflag = if_needlastflag;
    }

    public String getIf_needoutfare() {
        return if_needoutfare;
    }

    public void setIf_needoutfare(String if_needoutfare) {
        this.if_needoutfare = if_needoutfare;
    }

    public String getAttach() {
        return attach;
    }

    public void setAttach(String attach) {
        this.attach = attach;
    }

    public String getMac() {
        return mac;
    }

    public void setMac(String mac) {
        this.mac = mac;
    }

}
