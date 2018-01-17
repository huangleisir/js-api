/*
* Copyright (c) 2015-2018 SHENZHEN GUIYI SCIENCE AND TECHNOLOGY DEVELOP CO., LTD. All rights reserved.
*
* 注意：本内容仅限于深圳市捷顺金科研发有限公司内部传阅，禁止外泄以及用于其他的商业目的 
*/
package com.jst.prodution.payment.serviceBean;

public class QueryRefund {

    private String busNo; // 由统一支付平台返回的支付交易流水号

    private String jstAppId; // 统一支付平台为第三方系统分配的接入id标识

    private String jstMchId; // 统一支付平台为第三方系统分配分配的商户收款账号。

    private String jstNonceStr; // 随机字符串

    private String jstSign; // 签名

    private int payStatus; // 支付状态: 0—支付成功 1—待支付 2—支付处理中 3—支付失败 4—已退款 5—已关闭(保留)

    private String payChannelId; // 支付使用的第三方支付渠道

    private String orderId; // 商户订单号，必须在商户系统内唯一

    private int totalAmount; // 订单总金额，单位为分，只能为整数

    private int refundAmount; // 已退款总金额，单位为分，只能为整数，

    private int settleAmount; // 清算金额，单位为分，只能为整数

    private String currency; // 3 位 ISO 货币代码，人民币为 CNY 。

    private String subject; // 订单标题，该参数最长为 32 个 Unicode 字符

    private String description; // 订单描述，该参数最长为 128 个 Unicode 字符

    private String createTime; // 订单生成时间，格式为yyyyMMddHHmmss，如2009年12月25日9点10分10秒表示为20091225091010。

    private String expireTime; // 订单失效时间，格式为yyyyMMddHHmmss，如2009年12月25日9点10分10秒表示为20091225091010。其他详见时间规则失效时间不能小于5分钟

    private String settleTime; // 清算时间，格式为yyyyMMddHHmmss，如2009年12月25日9点10分10秒表示为20091225091010。其他详见时间规则

    private String credential; // 支付凭证，用于客户端调起第三方支付接口。详见 credential_schema

    private String notifyUrl; // 接收统一支付平台异步通知回调地址，通知url必须为直接可访问的url，不能携带参数。

    private String pageUrl; // 支付结果跳转URL

    private String payType;// 支付模式： 微信支付模式：APP、JSAPI、NATIVE
                           // 支付宝支付模式：APP、WAP、NATIVE 捷易付支付模式：H5

    private String sceneCode; // 场景码

    private String userMobile; // 支付用户手机号

    private String thirdUserId; // 第三方用户ID

    private String extra; // 特定渠道请求支付的额外参数 和 用户自定义参数

    private String refunds; // 退款记录

    public String getBusNo() {
        return busNo;
    }

    public void setBusNo(String busNo) {
        this.busNo = busNo;
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

    public String getJstNonceStr() {
        return jstNonceStr;
    }

    public void setJstNonceStr(String jstNonceStr) {
        this.jstNonceStr = jstNonceStr;
    }

    public String getJstSign() {
        return jstSign;
    }

    public void setJstSign(String jstSign) {
        this.jstSign = jstSign;
    }

    public int getPayStatus() {
        return payStatus;
    }

    public void setPayStatus(int payStatus) {
        this.payStatus = payStatus;
    }

    public String getPayChannelId() {
        return payChannelId;
    }

    public void setPayChannelId(String payChannelId) {
        this.payChannelId = payChannelId;
    }

    public String getOrderId() {
        return orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

    public int getTotalAmount() {
        return totalAmount;
    }

    public void setTotalAmount(int totalAmount) {
        this.totalAmount = totalAmount;
    }

    public int getRefundAmount() {
        return refundAmount;
    }

    public void setRefundAmount(int refundAmount) {
        this.refundAmount = refundAmount;
    }

    public int getSettleAmount() {
        return settleAmount;
    }

    public void setSettleAmount(int settleAmount) {
        this.settleAmount = settleAmount;
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getCreateTime() {
        return createTime;
    }

    public void setCreateTime(String createTime) {
        this.createTime = createTime;
    }

    public String getExpireTime() {
        return expireTime;
    }

    public void setExpireTime(String expireTime) {
        this.expireTime = expireTime;
    }

    public String getSettleTime() {
        return settleTime;
    }

    public void setSettleTime(String settleTime) {
        this.settleTime = settleTime;
    }

    public String getCredential() {
        return credential;
    }

    public void setCredential(String credential) {
        this.credential = credential;
    }

    public String getNotifyUrl() {
        return notifyUrl;
    }

    public void setNotifyUrl(String notifyUrl) {
        this.notifyUrl = notifyUrl;
    }

    public String getPageUrl() {
        return pageUrl;
    }

    public void setPageUrl(String pageUrl) {
        this.pageUrl = pageUrl;
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

    public String getUserMobile() {
        return userMobile;
    }

    public void setUserMobile(String userMobile) {
        this.userMobile = userMobile;
    }

    public String getThirdUserId() {
        return thirdUserId;
    }

    public void setThirdUserId(String thirdUserId) {
        this.thirdUserId = thirdUserId;
    }

    public String getExtra() {
        return extra;
    }

    public void setExtra(String extra) {
        this.extra = extra;
    }

    public String getRefunds() {
        return refunds;
    }

    public void setRefunds(String refunds) {
        this.refunds = refunds;
    }

}
