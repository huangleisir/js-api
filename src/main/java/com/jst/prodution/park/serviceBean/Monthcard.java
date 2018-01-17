/*
* Copyright (c) 2015-2018 SHENZHEN GUIYI SCIENCE AND TECHNOLOGY DEVELOP CO., LTD. All rights reserved.
*
* 注意：本内容仅限于深圳市捷顺金科研发有限公司内部传阅，禁止外泄以及用于其他的商业目的 
*/
package com.jst.prodution.park.serviceBean;

import java.io.Serializable;

public class Monthcard implements Serializable {
    /**
     * 
     */
    private static final long serialVersionUID = 1L;

    private String monthcardid;// 月卡ID （主键）（车场月卡用户ID）

    private String parkid;// 车场id

    private String parkname;// 车场名称

    private String status;// 状态 1、正常 2、禁用 3、冻结 4、注销

    private String cartype;// 车型

    private String carno;// 车牌号

    private String phone;// 手机号

    private String valtime;// 有效期

    private String username;// 用户名字

    private String certtype;// 证件类型

    private String certno;// 证件号码

    private String strtime;// 开始时间 yyyyMMdd

    private String endtime;// 结束时间 yyyyMMdd

    private String crttime;// 创建时间 yyyyMMdd

    public String getMonthcardid() {
        return monthcardid;
    }

    public void setMonthcardid(String monthcardid) {
        this.monthcardid = monthcardid;
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

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }


    public String getCartype() {
        return cartype;
    }

    public void setCartype(String cartype) {
        this.cartype = cartype;
    }

    public String getCarno() {
        return carno;
    }

    public void setCarno(String carno) {
        this.carno = carno;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getValtime() {
        return valtime;
    }

    public void setValtime(String valtime) {
        this.valtime = valtime;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getCerttype() {
        return certtype;
    }

    public void setCerttype(String certtype) {
        this.certtype = certtype;
    }

    public String getCertno() {
        return certno;
    }

    public void setCertno(String certno) {
        this.certno = certno;
    }

    public String getStrtime() {
        return strtime;
    }

    public void setStrtime(String strtime) {
        this.strtime = strtime;
    }

    public String getEndtime() {
        return endtime;
    }

    public void setEndtime(String endtime) {
        this.endtime = endtime;
    }

    public String getCrttime() {
        return crttime;
    }

    public void setCrttime(String crttime) {
        this.crttime = crttime;
    }

}
