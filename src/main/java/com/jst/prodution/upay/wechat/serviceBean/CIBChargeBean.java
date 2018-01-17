package com.jst.prodution.upay.wechat.serviceBean;

import com.jst.prodution.base.bean.BaseBean;
/**
 * 
 * @Package: com.jst.prodution.upay.wechat.serviceBean
 * @ClassName: CIBChargeBean.java
 * @Description: 兴业微信H5下单bean
 *
 * @author: wanghuai
 * @date: 2017年8月23日 下午2:30:51 
 * @version: V1.0
 *
 */
public class CIBChargeBean extends BaseBean {

	private static final long serialVersionUID = 1L;
	/**
	 * 支付记录主键id
	 */
	private String id;	
	/**
	 * 应用id
	 */
	private String jstAppId; 
	/**
	 * 商户id
	 */
	private String jstMchId; 	
	/**
	 * 随机字符串
	 */
	private String jstNonceStr; 	 
	/**
	 * 签名
	 */
	private String jstSign; 		 

	/**
	 * 支付状态
	 */
	private String payStatus;	
	/**
	 * 支付渠道id
	 */
	private String payChannelId;
	/**
	 * 商户订单号
	 */
	private String orderId; 	
	/**
	 * 客户端ip
	 */
	private String clientIp;
	/**
	 * 订单金额
	 */
	private int totalAmount; 
	/**
	 * 货币代码，人民币为 cny
	 */
	private String currency; 
	/**
	 * 订单名称
	 */
	private String subject; 	
	/**
	 * 订单创建时间"20171002124556"
	 */
	private String createTime;	
	/**
	 * 订单过期时间"20171002124556"
	 */
	private String expireTime; 	
	/**
	 * 支付凭证
	 */
	private Object credential; 	
	/**
	 * 后台通知url
	 */
	private String notifyUrl; 	
	/**
	 * 页面通知url
	 */
	private String pageUrl; 	
	/**
	 * 支付模式
	 */
	private String payType; 	
	/**
	 * 用户手机号
	 */
	private String userMobile; 	
	/**
	 * 捷易付场景吗
	 */
	private String sceneCode; 	
	/**
	 * 用户openid
	 */
	private String openId;		
	/**
	 * 交易系统流水号
	 */
	private String busNo; 		
	/**
	 * 商户订单前缀
	 */
	private String preSeq;		
	/**
	 * 订单类型：充值订单，支付订单
	 */
	private String orderType;	
	/**
	 * no_credit--指定不能使用信用卡支付
	 */
	private String limitPay;  
	/**
	 * 应用类型
	 */
	private String deviceInfo;
	/**
	 * 应用名称
	 */
	private String mchAppName;
	/**
	 * 应用标识
	 */
	private String mchAppId;
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
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
	public String getPayStatus() {
		return payStatus;
	}
	public void setPayStatus(String payStatus) {
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
	public String getClientIp() {
		return clientIp;
	}
	public void setClientIp(String clientIp) {
		this.clientIp = clientIp;
	}
	public int getTotalAmount() {
		return totalAmount;
	}
	public void setTotalAmount(int totalAmount) {
		this.totalAmount = totalAmount;
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
	public Object getCredential() {
		return credential;
	}
	public void setCredential(Object credential) {
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
	public String getUserMobile() {
		return userMobile;
	}
	public void setUserMobile(String userMobile) {
		this.userMobile = userMobile;
	}
	public String getSceneCode() {
		return sceneCode;
	}
	public void setSceneCode(String sceneCode) {
		this.sceneCode = sceneCode;
	}
	public String getOpenId() {
		return openId;
	}
	public void setOpenId(String openId) {
		this.openId = openId;
	}
	public String getBusNo() {
		return busNo;
	}
	public void setBusNo(String busNo) {
		this.busNo = busNo;
	}
	public String getPreSeq() {
		return preSeq;
	}
	public void setPreSeq(String preSeq) {
		this.preSeq = preSeq;
	}
	public String getOrderType() {
		return orderType;
	}
	public void setOrderType(String orderType) {
		this.orderType = orderType;
	}
	public String getLimitPay() {
		return limitPay;
	}
	public void setLimitPay(String limitPay) {
		this.limitPay = limitPay;
	}
	public String getDeviceInfo() {
		return deviceInfo;
	}
	public void setDeviceInfo(String deviceInfo) {
		this.deviceInfo = deviceInfo;
	}
	public String getMchAppName() {
		return mchAppName;
	}
	public void setMchAppName(String mchAppName) {
		this.mchAppName = mchAppName;
	}
	public String getMchAppId() {
		return mchAppId;
	}
	public void setMchAppId(String mchAppId) {
		this.mchAppId = mchAppId;
	}
}
