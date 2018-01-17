package com.jst.prodution.tran.serviceBean;

import com.jst.prodution.base.bean.BaseBean;

public class TranCoreCollectionOrderRegistBean extends BaseBean {
	private static final long serialVersionUID = 1L;
	//输入
	
	private String merchantExtenalNo;//外部订单号 
	private String merchantId       ;//商户号
	private String merchantName		;//商户名称
    private String busType			;//交易类型 1，小贷代扣
	private String merchantMemberId ;//商户用户标识
	private String payMemberId      ;//支付用户标识
	private String payMemberName	;//付款会员名称
	private Long tranAmount         ;//支付金额
	private String orderName        ;//订单名称  可输
	private String orderDes         ;//订单描述  可输
	private String remark         	;//备注
	private String resultNoticeUrl  ;//支付结果通知URL
	private String resultPageUrl    ;//支付结果跳转URL
	private String sceneCode        ;//支付场景码  020100002
    private String payType			;//微信支付模式：APP、JSAPI、NATIVE  支付宝支付模式：APP、WAP、NATIVE   捷易付支付模式：H5
	private String payChannelId		;//支付渠道号 WeChat:微信，Alipay：支付宝，JYF：捷易付
	private String payMemberMobile	;//付款方手机号
	private String terminalType		;//终端类型（M：移动用户，P：PC用户
	private String deviceType		;//设备类型 1安卓，2ios
	private String name;			;//银行卡开户名
    private String idCard			;//身份证号
    private String bankName;		;//银行名称
    private String bankCard;		;//银行卡号
	//输出
	private String busNo  			;//交易订单号
	
	
	
	public String getBusType() {
		return busType;
	}

	public void setBusType(String busType) {
		this.busType = busType;
	}

	public String getPayMemberMobile() {
		return payMemberMobile;
	}

	public void setPayMemberMobile(String payMemberMobile) {
		this.payMemberMobile = payMemberMobile;
	}

	public String getPayType() {
		return payType;
	}

	public void setPayType(String payType) {
		this.payType = payType;
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

	public String getPayChannelId() {
		return payChannelId;
	}

	public void setPayChannelId(String payChannelId) {
		this.payChannelId = payChannelId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getIdCard() {
		return idCard;
	}

	public void setIdCard(String idCard) {
		this.idCard = idCard;
	}

	public String getBankName() {
		return bankName;
	}

	public void setBankName(String bankName) {
		this.bankName = bankName;
	}

	public String getBankCard() {
		return bankCard;
	}

	public void setBankCard(String bankCard) {
		this.bankCard = bankCard;
	}
	
}
