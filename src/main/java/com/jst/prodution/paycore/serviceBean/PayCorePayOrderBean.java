package com.jst.prodution.paycore.serviceBean;

import com.jst.prodution.base.bean.BaseBean;

/**
 *@description:支付核心发起支付bean
 *@author  widon
 *@date: 2017年10月12日 下午5:30:42
 *@since: JDK 1.8
 *@version:V1.0.0
 */
public class PayCorePayOrderBean extends BaseBean {
    /* 输入参数 */
    private String busNo;        //交易流水号   ,必输
    private String jstAppId;     //应用id   ,必输
    private String jstMchId;     //商户id   ,必输
    private String userId;       //用户id
    private String orderId;      //商户订单号   ,必输
    private String subject;      //订单标题    ，微信支付宝必输
    private String description;   //订单描述   ，微信支付宝必输
    private String payChannelId;// 支付渠道id   ,必输
    private String payType;     // 支付模式      ,必输
    private String orderType;    //订单业务类型
    private Long   totalAmount;    //订单金额(通道实际支付金额)      ,必输
    private String currency;    // 货币代码，人民币为 cny  ,必输
    private String expireTime;  // 支付订单过期时间"20171002124556"
    private String sceneCode;   // 支付场景码       ,必输
    private String userMobile;  // 用户手机号 ,银行预留手机号
    private String clientIp;    // 客户端ip
    private Integer payStatus;   //支付状态 , 0-成功,1-支付中,3-支付失败,4-已关闭,6-支付已完成(不可退款)
    
    /* 微信独有*/
    private String openId;      //用户openid
    
    private String authCode;    //微信刷卡支付新增字段   支付宝条码支付增加字段
    private String pageUrl;     //微信H5、支付宝WAP支付，跳转页面地址
   
    /*支付宝条码支付增加字段*/
    private String scene;   
    //private String authCode;   支付宝条码支付增加字段
    
    /*银联相关字段*/
    private String unionToken;	//银联无跳转签约token
    
    /*块钱增加字段*/
    private String  smsTraceCode;//短信跟踪编号
    private String  smsCode;   // 短信动态码
    private String  channelCode;  // 子通道编码    必输   00101 一键支付  00102 快捷支付
    private String  bankCardNo;  //银行卡号，预付卡号
    private String  updateUser;  //操作更新人员
    
    /*预付卡支付相关字段*/
    //private String  bankCardNo;  //银行卡号，预付卡号
    private String yfkMchId;   //预付卡商户号
    private String termId;   //线上终端号
    private String termFlag;  //线上终端标识,pos扫码有，固定二维码没有
    private String paySuccessTime;  // 支付订单创建时间"20171002124556" 
    /*输出特有参数*/
    private String payNo;       //支付流水号
    private Object credential;  // 支付凭证
    private String createTime;  // 支付订单创建时间"20171002124556" 

    public String getYfkMchId() {
        return yfkMchId;
    }
    public void setYfkMchId(String yfkMchId) {
        this.yfkMchId = yfkMchId;
    }
    public String getTermId() {
        return termId;
    }
    public void setTermId(String termId) {
        this.termId = termId;
    }
    public String getTermFlag() {
        return termFlag;
    }
    public void setTermFlag(String termFlag) {
        this.termFlag = termFlag;
    }
    public String getOrderType() {
        return orderType;
    }
    public void setOrderType(String orderType) {
        this.orderType = orderType;
    }
    
    public String getUpdateUser() {
        return updateUser;
    }
    public void setUpdateUser(String updateUser) {
        this.updateUser = updateUser;
    }
    public String getUserId() {
        return userId;
    }
    public void setUserId(String userId) {
        this.userId = userId;
    }
    public String getBankCardNo() {
        return bankCardNo;
    }
    public void setBankCardNo(String bankCardNo) {
        this.bankCardNo = bankCardNo;
    }
    public String getPageUrl() {
        return pageUrl;
    }
    public void setPageUrl(String pageUrl) {
        this.pageUrl = pageUrl;
    }
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
    public String getOrderId() {
        return orderId;
    }
    public void setOrderId(String orderId) {
        this.orderId = orderId;
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
    public Long getTotalAmount() {
        return totalAmount;
    }
    public void setTotalAmount(Long totalAmount) {
        this.totalAmount = totalAmount;
    }
    public String getCurrency() {
        return currency;
    }
    public void setCurrency(String currency) {
        this.currency = currency;
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
    public String getClientIp() {
        return clientIp;
    }
    public void setClientIp(String clientIp) {
        this.clientIp = clientIp;
    }
    public String getOpenId() {
        return openId;
    }
    public void setOpenId(String openId) {
        this.openId = openId;
    }
    public String getAuthCode() {
        return authCode;
    }
    public void setAuthCode(String authCode) {
        this.authCode = authCode;
    }
    public String getScene() {
        return scene;
    }
    public void setScene(String scene) {
        this.scene = scene;
    }
    
    public String getPaySuccessTime() {
		return paySuccessTime;
	}
	public void setPaySuccessTime(String paySuccessTime) {
		this.paySuccessTime = paySuccessTime;
	}
	public String getUnionToken() {
		return unionToken;
	}
	public void setUnionToken(String unionToken) {
		this.unionToken = unionToken;
	}
	public String getSmsTraceCode() {
        return smsTraceCode;
    }
    public void setSmsTraceCode(String smsTraceCode) {
        this.smsTraceCode = smsTraceCode;
    }
    public String getSmsCode() {
        return smsCode;
    }
    public void setSmsCode(String smsCode) {
        this.smsCode = smsCode;
    }
    public String getChannelCode() {
        return channelCode;
    }
    public void setChannelCode(String channelCode) {
        this.channelCode = channelCode;
    }
    public String getPayNo() {
        return payNo;
    }
    public void setPayNo(String payNo) {
        this.payNo = payNo;
    }
    public Integer getPayStatus() {
        return payStatus;
    }
    public void setPayStatus(Integer payStatus) {
        this.payStatus = payStatus;
    }
    public Object getCredential() {
        return credential;
    }
    public void setCredential(Object credential) {
        this.credential = credential;
    }
    
    
    
    
}
