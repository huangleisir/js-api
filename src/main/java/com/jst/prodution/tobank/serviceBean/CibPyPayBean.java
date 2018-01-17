package com.jst.prodution.tobank.serviceBean;

import com.jst.prodution.base.bean.BaseBean;

/**
 * Created by Administrator on 2017/8/30.
 */
public class CibPyPayBean extends BaseBean{

    private static final long serialVersionUID = 1L;



    String subMrch;
    String orderNo;
    String toBankNo;
    String toAcctNo;
    String toAcctName;
    String acctType;
    String cur;
    String transAmt;
    String transUsage;
    String bsbankNo;
    String bsbankName;


    boolean bsFalg;

    String timestamp;
    String appid;
    String service;
    String ver;
    String sign_type;
    String mac;



    String remark;
    String sno;
    String mrchNo;
    String subMrchName;
    String transDate;
    String transTime;
    String tranStatus;
    String transFee;

    String errcode;
    String errmsg;
    public String getErrcode() {
        return errcode;
    }

    public void setErrcode(String errcode) {
        this.errcode = errcode;
    }

    public String getErrmsg() {
        return errmsg;
    }

    public void setErrmsg(String errmsg) {
        this.errmsg = errmsg;
    }


    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }
    public String getMrchNo() {
        return mrchNo;
    }

    public void setMrchNo(String mrchNo) {
        this.mrchNo = mrchNo;
    }

    public String getSubMrchName() {
        return subMrchName;
    }

    public void setSubMrchName(String subMrchName) {
        this.subMrchName = subMrchName;
    }

    public String getTransDate() {
        return transDate;
    }

    public void setTransDate(String transDate) {
        this.transDate = transDate;
    }

    public String getTransTime() {
        return transTime;
    }

    public void setTransTime(String transTime) {
        this.transTime = transTime;
    }

    public String getTranStatus() {
        return tranStatus;
    }

    public void setTranStatus(String tranStatus) {
        this.tranStatus = tranStatus;
    }

    public String getTransFee() {
        return transFee;
    }

    public void setTransFee(String transFee) {
        this.transFee = transFee;
    }




    public String getSno() {
        return sno;
    }

    public void setSno(String sno) {
        this.sno = sno;
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


    public String getSubMrch() {
        return subMrch;
    }

    public void setSubMrch(String subMrch) {
        this.subMrch = subMrch;
    }

    public String getOrderNo() {
        return orderNo;
    }

    public void setOrderNo(String orderNo) {
        this.orderNo = orderNo;
    }

    public String getToBankNo() {
        return toBankNo;
    }

    public void setToBankNo(String toBankNo) {
        this.toBankNo = toBankNo;
    }

    public String getToAcctNo() {
        return toAcctNo;
    }

    public void setToAcctNo(String toAcctNo) {
        this.toAcctNo = toAcctNo;
    }

    public String getToAcctName() {
        return toAcctName;
    }

    public void setToAcctName(String toAcctName) {
        this.toAcctName = toAcctName;
    }

    public String getAcctType() {
        return acctType;
    }

    public void setAcctType(String acctType) {
        this.acctType = acctType;
    }

    public String getCur() {
        return cur;
    }

    public void setCur(String cur) {
        this.cur = cur;
    }

    public String getTransAmt() {
        return transAmt;
    }

    public void setTransAmt(String transAmt) {
        this.transAmt = transAmt;
    }

    public String getTransUsage() {
        return transUsage;
    }

    public void setTransUsage(String transUsage) {
        this.transUsage = transUsage;
    }

    public String getBsbankNo() {
        return bsbankNo;
    }

    public void setBsbankNo(String bsbankNo) {
        this.bsbankNo = bsbankNo;
    }

    public String getBsbankName() {
        return bsbankName;
    }

    public void setBsbankName(String bsbankName) {
        this.bsbankName = bsbankName;
    }
    public boolean isBsFalg() {
        return bsFalg;
    }

    public void setBsFalg(boolean bsFalg) {
        this.bsFalg = bsFalg;
    }
}
