package com.jst.prodution.cashdeskfront.serviceBean;

import com.jst.prodution.base.bean.BaseBean;

/**
 * @author ningxuzhou
 *
 */
public class JYFRechargeBean extends BaseBean {

    /**
     *
     */
    private static final long serialVersionUID = 1L;

    //支付渠道
    private String payChannelId;
    //支付类型
    private String payType;
    //支付场景码
    private String sceneCode;
    //订单描述
    private String orderDesc;
    private String orderName;
    private String remark;
    private String mobile;
    private String userId;
    private String tranAmount;
    private String payAmount;
    private String sourceFrom;
    private String rechargeWay;
    private String deviceFinger;
    private String clientIp;
    private String pageUrl;
    private String rkey;
    private String verifyCode;
    private String key;
    private String busNo;
    private String token;
    private String appId;
    private String merchantNo;
    private String marketingId;
    private String discountType;
    private String discountValue;
    private String promoteType;
    private String acctAmount;
    private String promoteAmount;
    private String promoteMchId;
    private String activityJoinNo;
    private String nonceStr;
    private String signature;
    public String getPayChannelId() {
        return payChannelId;
    }
    public void setPayChannelId(String payChannelId) {
        this.payChannelId = payChannelId;
    }
    public String getPayType() {
        return payType;
    }
    public void setPayType(String payType) {
        this.payType = payType;
    }
    public String getSceneCode() {
        return sceneCode;
    }
    public void setSceneCode(String sceneCode) {
        this.sceneCode = sceneCode;
    }
    public String getOrderDesc() {
        return orderDesc;
    }
    public void setOrderDesc(String orderDesc) {
        this.orderDesc = orderDesc;
    }
    public String getOrderName() {
        return orderName;
    }
    public void setOrderName(String orderName) {
        this.orderName = orderName;
    }
    public String getRemark() {
        return remark;
    }
    public void setRemark(String remark) {
        this.remark = remark;
    }
    public String getMobile() {
        return mobile;
    }
    public void setMobile(String mobile) {
        this.mobile = mobile;
    }
    public String getUserId() {
        return userId;
    }
    public void setUserId(String userId) {
        this.userId = userId;
    }
    public String getTranAmount() {
        return tranAmount;
    }
    public void setTranAmount(String tranAmount) {
        this.tranAmount = tranAmount;
    }
    public String getPayAmount() {
        return payAmount;
    }
    public void setPayAmount(String payAmount) {
        this.payAmount = payAmount;
    }
    public String getSourceFrom() {
        return sourceFrom;
    }
    public void setSourceFrom(String sourceFrom) {
        this.sourceFrom = sourceFrom;
    }
    public String getRechargeWay() {
        return rechargeWay;
    }
    public void setRechargeWay(String rechargeWay) {
        this.rechargeWay = rechargeWay;
    }
    public String getDeviceFinger() {
        return deviceFinger;
    }
    public void setDeviceFinger(String deviceFinger) {
        this.deviceFinger = deviceFinger;
    }
    public String getClientIp() {
        return clientIp;
    }
    public void setClientIp(String clientIp) {
        this.clientIp = clientIp;
    }
    public String getPageUrl() {
        return pageUrl;
    }
    public void setPageUrl(String pageUrl) {
        this.pageUrl = pageUrl;
    }
    public String getRkey() {
        return rkey;
    }
    public void setRkey(String rkey) {
        this.rkey = rkey;
    }
    public String getVerifyCode() {
        return verifyCode;
    }
    public void setVerifyCode(String verifyCode) {
        this.verifyCode = verifyCode;
    }
    public String getKey() {
        return key;
    }
    public void setKey(String key) {
        this.key = key;
    }
    public String getBusNo() {
        return busNo;
    }
    public void setBusNo(String busNo) {
        this.busNo = busNo;
    }
    public String getToken() {
        return token;
    }
    public void setToken(String token) {
        this.token = token;
    }
    public String getAppId() {
        return appId;
    }
    public void setAppId(String appId) {
        this.appId = appId;
    }
    public String getMerchantNo() {
        return merchantNo;
    }
    public void setMerchantNo(String merchantNo) {
        this.merchantNo = merchantNo;
    }
    public String getMarketingId() {
        return marketingId;
    }
    public void setMarketingId(String marketingId) {
        this.marketingId = marketingId;
    }
    public String getDiscountType() {
        return discountType;
    }
    public void setDiscountType(String discountType) {
        this.discountType = discountType;
    }
    public String getDiscountValue() {
        return discountValue;
    }
    public void setDiscountValue(String discountValue) {
        this.discountValue = discountValue;
    }
    public String getPromoteType() {
        return promoteType;
    }
    public void setPromoteType(String promoteType) {
        this.promoteType = promoteType;
    }
    public String getAcctAmount() {
        return acctAmount;
    }
    public void setAcctAmount(String acctAmount) {
        this.acctAmount = acctAmount;
    }
    public String getPromoteAmount() {
        return promoteAmount;
    }
    public void setPromoteAmount(String promoteAmount) {
        this.promoteAmount = promoteAmount;
    }
    public String getPromoteMchId() {
        return promoteMchId;
    }
    public void setPromoteMchId(String promoteMchId) {
        this.promoteMchId = promoteMchId;
    }
    public String getActivityJoinNo() {
        return activityJoinNo;
    }
    public void setActivityJoinNo(String activityJoinNo) {
        this.activityJoinNo = activityJoinNo;
    }
    public String getNonceStr() {
        return nonceStr;
    }
    public void setNonceStr(String nonceStr) {
        this.nonceStr = nonceStr;
    }
    public String getSignature() {
        return signature;
    }
    public void setSignature(String signature) {
        this.signature = signature;
    }
    
    @Override
    public String toString() {
        return "JYFRechargeBean [payChannelId=" + payChannelId + ", payType=" + payType + ", sceneCode=" + sceneCode
                + ", orderDesc=" + orderDesc + ", orderName=" + orderName + ", remark=" + remark + ", mobile=" + mobile
                + ", userId=" + userId + ", tranAmount=" + tranAmount + ", payAmount=" + payAmount + ", sourceFrom="
                + sourceFrom + ", rechargeWay=" + rechargeWay + ", deviceFinger=" + deviceFinger + ", clientIp="
                + clientIp + ", pageUrl=" + pageUrl + ", rkey=" + rkey + ", verifyCode=" + verifyCode + ", key=" + key
                + ", busNo=" + busNo + ", token=" + token + ", appId=" + appId + ", merchantNo=" + merchantNo
                + ", marketingId=" + marketingId + ", discountType=" + discountType + ", discountValue=" + discountValue
                + ", promoteType=" + promoteType + ", acctAmount=" + acctAmount + ", promoteAmount=" + promoteAmount
                + ", promoteMchId=" + promoteMchId + ", activityJoinNo=" + activityJoinNo + ", nonceStr=" + nonceStr
                + ", signature=" + signature + "]";
    }
    
}
