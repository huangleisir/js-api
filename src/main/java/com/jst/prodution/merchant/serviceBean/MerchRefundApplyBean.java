package com.jst.prodution.merchant.serviceBean;

import java.util.Date;

import com.jst.prodution.base.bean.BaseBean;

/**
 * 退款申请bean
 * @author Administrator
 *
 */
public class MerchRefundApplyBean extends BaseBean {
	private static final long serialVersionUID = 1L;
//	private String busNo; //交易流水号（必输）
//	private String state; //0-成功，1-待处理，2-处理中，3-失败
//	private String busType;//交易类型：1-支付，2-退款
//	private String linkPayNo;//关联支付交易流水号
//	private Long tranFee;//手续费
//	private Integer tranDate;//交易日期
//	private String refundType; //退款类型1，退款至余额2，退款至银行卡（必输）
//	private String merchantExtenalNo;//外部订单号+外部订单日期（检索商户订单唯一性）（可输）
	private String refundAmount;//退款金额（可输）
	private String payMobile; //用户手机号（可输）
	private String operUser; //操作人                可输

//	private String merchantId;//商户id
//	private String merchantMemberId;//商户的会员id
//	private String payMemberId;//支付用户id(C会员ID)
//	private Long tranAmount;//交易金额
//	private Date expiredTime;//外部订单过期时间
//	private String orderName;//订单名称
//	private String orderDes;//订单描述
////	private String resultNoticeUrl;
////	private String resultPageUrl;
//	private String sceneCode;//场景码（必输）
//	private String matchStatus;//00：未对账01：对账中02：平账03：不平账04：无需对账
//	private String settlementState;//0-未结算，1-已结算
//	private String settlementNo;//结算流水号
//	private Integer settlementDate;//结算日期
//	private String callType;//1-补单，2-销单,0-正常
//	private String remark; //备注
//	private String createUser;//创建人（系统默认“99”，其它为运营人员ID号）
//	private String updateUser;//最后更新人
//	private Date createTime;//新增时间
//	private Date updateTime;//最后更新时间
	
	private String busNo; //支付流水号                                                                     必输
	private Date applyTime;//退款申请时间					     必输
	private String refundType; //退款类型1，退款至余额2，原路退款        必输
	private String merchantExtenalNo;//外部订单号                                   sourceFrom为商户后台时 必输
    private String merchantId ;//申请退款商户Id               必输
    private String merchantMemberId;//申请退款商户会员标识     	      必输
	private String sourceFrom;//退款发起源 0：B门户，1：商户后台(app），2：OMS  必输          

	private String orderName;//订单名称                                                                 可输
	private String orderDes;//订单描述						      可输
	private String remark; //备注							      可输
//    private String merchantName; //商户名称     				      可输
    
	private String refundDate;//退款时间
    private String refundStatus;//退款状态(00：退款成功，01退款中，02退款失败)
    private String merchantName; //商户名称
    private String linkPayNo;//关联主订单号（商户订单号）
    private String busType; //交易类型
	private String createTime;//新增时间
	
	
	public String getBusNo() {
		return busNo;
	}
	public void setBusNo(String busNo) {
		this.busNo = busNo;
	}
	public String getRefundAmount() {
		return refundAmount;
	}
	public void setRefundAmount(String refundAmount) {
		this.refundAmount = refundAmount;
	}
	public String getMerchantExtenalNo() {
		return merchantExtenalNo;
	}
	public void setMerchantExtenalNo(String merchantExtenalNo) {
		this.merchantExtenalNo = merchantExtenalNo;
	}
	
	public String getRefundType() {
		return refundType;
	}
	public void setRefundType(String refundType) {
		this.refundType = refundType;
	}
	public String getPayMobile() {
		return payMobile;
	}
	public void setPayMobile(String payMobile) {
		this.payMobile = payMobile;
	}
	public String getOperUser() {
		return operUser;
	}
	public void setOperUser(String operUser) {
		this.operUser = operUser;
	}
	public String getRefundDate() {
		return refundDate;
	}
	public void setRefundDate(String refundDate) {
		this.refundDate = refundDate;
	}
	public String getRefundStatus() {
		return refundStatus;
	}
	public void setRefundStatus(String refundStatus) {
		this.refundStatus = refundStatus;
	}
	public String getMerchantName() {
		return merchantName;
	}
	public void setMerchantName(String merchantName) {
		this.merchantName = merchantName;
	}
	public String getLinkPayNo() {
		return linkPayNo;
	}
	public void setLinkPayNo(String linkPayNo) {
		this.linkPayNo = linkPayNo;
	}
	public String getBusType() {
		return busType;
	}
	public void setBusType(String busType) {
		this.busType = busType;
	}
	public String getCreateTime() {
		return createTime;
	}
	public void setCreateTime(String createTime) {
		this.createTime = createTime;
	}
	public String getRemark() {
		return remark;
	}
	public void setRemark(String remark) {
		this.remark = remark;
	}
	public Date getApplyTime() {
		return applyTime;
	}
	public void setApplyTime(Date applyTime) {
		this.applyTime = applyTime;
	}
	public String getMerchantId() {
		return merchantId;
	}
	public void setMerchantId(String merchantId) {
		this.merchantId = merchantId;
	}
	public String getMerchantMemberId() {
		return merchantMemberId;
	}
	public void setMerchantMemberId(String merchantMemberId) {
		this.merchantMemberId = merchantMemberId;
	}
	public String getSourceFrom() {
		return sourceFrom;
	}
	public void setSourceFrom(String sourceFrom) {
		this.sourceFrom = sourceFrom;
	}
	public String getOrderName() {
		return orderName;
	}
	public void setOrderName(String orderName) {
		this.orderName = orderName;
	}
	public String getOrderDes() {
		return orderDes;
	}
	public void setOrderDes(String orderDes) {
		this.orderDes = orderDes;
	}
	
	
	
}
