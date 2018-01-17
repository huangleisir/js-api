package com.jst.prodution.tobank.serviceBean;

import com.jst.prodution.base.bean.BaseBean;

/**
 * Created by Administrator on 2017/8/30.
 */
public class CibQueryBalanceBean extends BaseBean{

    private static final long serialVersionUID = 1L;

    String mrchNo ;      //商户代号
    String acctNo; //账号
    String accountBalance;     //账户余额
    String availableBalance;   //可用余额
    String blockedBalance;   //冻结余额
    String controlledBalance; //控制余额
    //异常情况
    String errcode;
    String errmsg;
    String sign_type;
    String mac;

    public String getMrchNo() {
        return mrchNo;
    }

    public void setMrchNo(String mrchNo) {
        this.mrchNo = mrchNo;
    }

    public String getAcctNo() {
        return acctNo;
    }

    public void setAcctNo(String acctNo) {
        this.acctNo = acctNo;
    }

    public String getAccountBalance() {
        return accountBalance;
    }

    public void setAccountBalance(String accountBalance) {
        this.accountBalance = accountBalance;
    }

    public String getAvailableBalance() {
        return availableBalance;
    }

    public void setAvailableBalance(String availableBalance) {
        this.availableBalance = availableBalance;
    }

    public String getBlockedBalance() {
        return blockedBalance;
    }

    public void setBlockedBalance(String blockedBalance) {
        this.blockedBalance = blockedBalance;
    }

    public String getControlledBalance() {
        return controlledBalance;
    }

    public void setControlledBalance(String controlledBalance) {
        this.controlledBalance = controlledBalance;
    }

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
