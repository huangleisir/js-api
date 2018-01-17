package com.jst.prodution.tobank.serviceBean;

import com.jst.prodution.base.bean.BaseBean;

/**
 * Created by Administrator on 2017/8/30.
 */
public class CibPyQueryBean extends BaseBean{

    private static final long serialVersionUID = 1L;



    String orderNo;

    String timestamp;
    String appid;
    String service;
    String ver;
    String sign_type;
    String mac;
    public String getOrderNo() {
        return orderNo;
    }

    public void setOrderNo(String orderNo) {
        this.orderNo = orderNo;
    }
    public String getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(String timestamp) {
        this.timestamp = timestamp;
    }

    public String getAppid() {
        return appid;
    }

    public void setAppid(String appid) {
        this.appid = appid;
    }

    public String getService() {
        return service;
    }

    public void setService(String service) {
        this.service = service;
    }

    public String getVer() {
        return ver;
    }

    public void setVer(String ver) {
        this.ver = ver;
    }

    public String getSign_type() {
        return sign_type;
    }

    public void setSign_type(String sign_type) {
        this.sign_type = sign_type;
    }

    public String getMac() {
        return mac;
    }

    public void setMac(String mac) {
        this.mac = mac;
    }


}
