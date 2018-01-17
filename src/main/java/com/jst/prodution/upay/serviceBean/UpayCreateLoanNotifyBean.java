package com.jst.prodution.upay.serviceBean;

import com.jst.prodution.base.bean.BaseBean;

/**
 *@description:交易核心代付回调OCD实体类
 *@author  widon
 *@date: 2017年5月10日 下午3:31:53
 *@since: JDK 1.8
 *@version:V1.0.0
 */
public class UpayCreateLoanNotifyBean extends BaseBean {

    private static final long serialVersionUID = -8795123216514407141L;
    private String jstAppId;            //应用id
    private String jstMchId;            //商户id
    private String notifyUrl;           //小贷系统代付结果异步通知URL
    private String orderId;             //小贷系统生成的订单号
    private String status;              //代付状态(与交易核心保持一致) ： 0—成功 1—支付待处理  2—支付处理中 3-处理失败
    private String resultMsg;           // 处理结果描述
    private String busNo;               //交易流水号
    private long totalAmount;            //申请贷款金额
    private String userId;              //第三方userId
    private String idCardNo;            //身份证号
    private String userName;            //用户姓名
    private String bankName;            //开户银行
    private String bankCardNo;          //银行卡号 
    private String userMobile;          //用户电话号码
    private String successTime;         //处理成功时间  格式为yyyyMMddHHmmss
    private String paySuccessTime;      //付款中心打款时间
    
    
    public String getPaySuccessTime() {
        return paySuccessTime;
    }
    public void setPaySuccessTime(String paySuccessTime) {
        this.paySuccessTime = paySuccessTime;
    }
    public String getJstAppId() {
        return jstAppId;
    }
    public void setJstAppId(String jstAppId) {
        this.jstAppId = jstAppId;
    }
    public String getJstMchId() {
        return jstMchId;
    }
    public void setJstMchId(String jstMchId) {
        this.jstMchId = jstMchId;
    }
    public String getNotifyUrl() {
        return notifyUrl;
    }
    public void setNotifyUrl(String notifyUrl) {
        this.notifyUrl = notifyUrl;
    }
    public String getOrderId() {
        return orderId;
    }
    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }
    public String getStatus() {
        return status;
    }
    public void setStatus(String status) {
        this.status = status;
    }
    public String getBusNo() {
        return busNo;
    }
    public void setBusNo(String busNo) {
        this.busNo = busNo;
    }
    public long getTotalAmount() {
        return totalAmount;
    }
    public void setTotalAmount(long totalAmount) {
        this.totalAmount = totalAmount;
    }
    public String getUserId() {
        return userId;
    }
    public void setUserId(String userId) {
        this.userId = userId;
    }
    public String getIdCardNo() {
        return idCardNo;
    }
    public void setIdCardNo(String idCardNo) {
        this.idCardNo = idCardNo;
    }
    public String getUserName() {
        return userName;
    }
    public void setUserName(String userName) {
        this.userName = userName;
    }
    public String getBankName() {
        return bankName;
    }
    public void setBankName(String bankName) {
        this.bankName = bankName;
    }
    public String getBankCardNo() {
        return bankCardNo;
    }
    public void setBankCardNo(String bankCardNo) {
        this.bankCardNo = bankCardNo;
    }
    public String getUserMobile() {
        return userMobile;
    }
    public void setUserMobile(String userMobile) {
        this.userMobile = userMobile;
    }
    public String getSuccessTime() {
        return successTime;
    }
    public void setSuccessTime(String successTime) {
        this.successTime = successTime;
    }
    public String getResultMsg() {
        return resultMsg;
    }
    public void setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
    }
    
    
    
    

}
