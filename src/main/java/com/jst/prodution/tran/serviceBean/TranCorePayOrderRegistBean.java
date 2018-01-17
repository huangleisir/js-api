package com.jst.prodution.tran.serviceBean;

import java.util.Date;

import com.jst.prodution.base.bean.BaseBean;
import com.jst.prodution.paycore.serviceBean.PayCorePayOrderBean;

public class TranCorePayOrderRegistBean extends BaseBean {
	private static final long serialVersionUID = 1L;
	//输入
	private String merchantExtenalNo;//外部订单号 必输
	private String merchantId       ;//商户号 必输
	private String merchantName		;//商户名称   必输
	private String childMerchantSimpleName;//商户简称
    private String childMerchantId	;//子商户号
    private String childMerchantName;//子商户名称
	private String merchantMemberId ;//商户用户标识  必输
	private String payMemberId      ;//支付用户标识  可输
	private String payMemberName	;//付款会员名称   可输
	private Long tranAmount         ;//支付金额(到账金额(单位:分))   必输
	private Date expiredTime      	;//外部订单过期时间   必输
	private String orderName        ;//订单名称  可输
	private String orderDes         ;//订单描述  可输
	private String remark         	;//备注 可输
	private String resultNoticeUrl  ;//支付结果通知URL 可输
	private String resultPageUrl    ;//支付结果跳转URL 可输
	private String sceneCode        ;//支付场景码 必输
    private String payType			;//微信支付模式：APP、JSAPI、NATIVE  支付宝支付模式：APP、WAP、NATIVE   捷易付支付模式：H5 必输
	private String payChannelId		;//支付渠道号 WeChat:微信，Alipay：支付宝，JYF：捷易付 必输
	private String payMemberMobile	;//付款方手机号 可输
    private String isFreePwd		;//是否免密支付（是否代扣）'Y','N'  必输
	private String terminalType		;//终端类型（M：移动用户，P：PC用户 可输
	private String deviceType		;//设备类型 1安卓，2ios 可输
    private String busType			;//订单交易类型 1-支付，2-退款，3-代扣 ，4-扫码支付 ，5-主动还款
    private String orderFrom		;//订单标识jstappid+jstmchid
    
    //营销添加字段
	private String marketingId;//活动ID
	private String discountType;//折扣类型(1-金额,2-比率)
	private String discountValue;//折扣值(如:20或20%)
	private String promoteType;//优惠类型(1-满减,2-满赠)
//	private Long acctAmount;//到账金额(单位:分)
	private Long payAmount;//实际支付金额(单位:分)
	private Long promoteAmount;//优惠金额(单位:分)
	private String promoteMchId;//优惠承担商户ID
	private String activityJoinNo;//活动参与流水
	
	//输出
	private String busNo  			;
	private String extra;		//扩展字段

	private PayCorePayOrderBean payCorePayOrderBean;
	
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

	public Long getPayAmount() {
		return payAmount;
	}

	public void setPayAmount(Long payAmount) {
		this.payAmount = payAmount;
	}

	public Long getPromoteAmount() {
		return promoteAmount;
	}

	public void setPromoteAmount(Long promoteAmount) {
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

	public String getPayMemberMobile() {
		return payMemberMobile;
	}

	public void setPayMemberMobile(String payMemberMobile) {
		this.payMemberMobile = payMemberMobile;
	}

	public String getChildMerchantSimpleName() {
		return childMerchantSimpleName;
	}

	public void setChildMerchantSimpleName(String childMerchantSimpleName) {
		this.childMerchantSimpleName = childMerchantSimpleName;
	}

	public String getChildMerchantId() {
		return childMerchantId;
	}

	public void setChildMerchantId(String childMerchantId) {
		this.childMerchantId = childMerchantId;
	}

	public String getChildMerchantName() {
		return childMerchantName;
	}

	public void setChildMerchantName(String childMerchantName) {
		this.childMerchantName = childMerchantName;
	}

	public String getPayType() {
		return payType;
	}

	public void setPayType(String payType) {
		this.payType = payType;
	}

	public String getIsFreePwd() {
		return isFreePwd;
	}

	public void setIsFreePwd(String isFreePwd) {
		this.isFreePwd = isFreePwd;
	}

	public String getRemark() {
		return remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}

	public String getMerchantName() {
		return merchantName;
	}

	public void setMerchantName(String merchantName) {
		this.merchantName = merchantName;
	}

	public String getPayMemberName() {
		return payMemberName;
	}

	public void setPayMemberName(String payMemberName) {
		this.payMemberName = payMemberName;
	}

	public void setMerchantExtenalNo(String merchantExtenalNo){
		this.merchantExtenalNo = merchantExtenalNo;
	}
	
	public String getMerchantExtenalNo(){
		return this.merchantExtenalNo;
	}

	public void setMerchantId(String merchantId ){
		this.merchantId = merchantId;
	}
	public String getMerchantId(){
		return this.merchantId;
	}

	public void setMerchantMemberId(String merchantMemberId){
		this.merchantMemberId = merchantMemberId;
	}
	public String getMerchantMemberId(){
		return this.merchantMemberId;
	}

	public void setPayMemberId(String payMemberId){
		this.payMemberId = payMemberId;
	}
	public String getPayMemberId(){
		return this.payMemberId;
	}

	public void setTranAmount(Long tranAmount){
		this.tranAmount = tranAmount;
	}
	public Long getTranAmount(){
		return this.tranAmount;
	}

	public Date getExpiredTime() {
		return expiredTime;
	}

	public void setExpiredTime(Date expiredTime) {
		this.expiredTime = expiredTime;
	}

	public void setOrderName(String orderName){
		this.orderName = orderName;
	}
	public String getOrderName(){
		return this.orderName;
	}

	public void setOrderDes(String orderDes){
		this.orderDes = orderDes;
	}
	public String getOrderDes(){
		return this.orderDes;
	}

	public void setResultNoticeUrl(String resultNoticeUrl){
		this.resultNoticeUrl = resultNoticeUrl;
	}
	public String getResultNoticeUrl(){
		return this.resultNoticeUrl;
	}

	public void setResultPageUrl(String resultPageUrl){
		this.resultPageUrl = resultPageUrl;
	}
	public String getResultPageUrl(){
		return this.resultPageUrl;
	}

	public void setSceneCode(String sceneCode){
		this.sceneCode = sceneCode;
	}
	public String getSceneCode(){
		return this.sceneCode;
	}
	
	public String getTerminalType() {
		return terminalType;
	}

	public void setTerminalType(String terminalType) {
		this.terminalType = terminalType;
	}

	public String getDeviceType() {
		return deviceType;
	}

	public void setDeviceType(String deviceType) {
		this.deviceType = deviceType;
	}

	public void setBusNo(String busNo){
		this.busNo = busNo;
	}
	
	public String getBusNo(){
		return this.busNo;
	}
	
	public String getBusType() {
		return busType;
	}

	public String getOrderFrom() {
		return orderFrom;
	}

	public void setOrderFrom(String orderFrom) {
		this.orderFrom = orderFrom;
	}

	public void setBusType(String busType) {
		this.busType = busType;
	}

	public String getPayChannelId() {
		return payChannelId;
	}

	public void setPayChannelId(String payChannelId) {
		this.payChannelId = payChannelId;
	}
	
	public PayCorePayOrderBean getPayCorePayOrderBean() {
		return payCorePayOrderBean;
	}

	public void setPayCorePayOrderBean(PayCorePayOrderBean payCorePayOrderBean) {
		this.payCorePayOrderBean = payCorePayOrderBean;
	}

	public String getExtra() {
		return extra;
	}

	public void setExtra(String extra) {
		this.extra = extra;
	}
}
