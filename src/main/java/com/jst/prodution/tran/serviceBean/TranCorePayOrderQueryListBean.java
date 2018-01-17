package com.jst.prodution.tran.serviceBean;

import java.util.List;

import com.jst.prodution.base.bean.BaseBean;

public class TranCorePayOrderQueryListBean extends BaseBean {

	private static final long serialVersionUID = 1L;

    private String busNo; //交易流水号

    private String state;//0-成功，1-支付中，5,关闭
    
	private String[] states;//0-成功，1-支付中，5,关闭

    private String busType;//1-支付，2-退款，3-代扣 ，4-扫码支付，5-主动还款

    private Long refundAmount;//已退款金额

    private Long tranFee;//支付订单手续费

    private String merchantExtenalNo;//外部订单号+外部订单日期（检索商户订单唯一性）

    private String payLaneNo;    //支付流水

    private String merchantId;//商户号
    
	private String[] merchantIds;

    private String childMerchantSimpleName; //子商户简称
    
    private String childMerchantId; //子商户号
    
    private String childMerchantName; //子商户名称
    
    private String merchantMemberId;//商户用户标识 --对应useId

	private String[] merchantMemberIds;

    private String merchantName;//商户名

    private String payMemberId;//支付用户标识

    private String payMemberName;//支付用户姓名

    private String payMemberMobile;//支付用户手机号

    private Long tranAmount;//支付金额

    private String expiredTime;//外部订单过期时间

    private String orderName;//订单名称        

    private String orderDes;//订单描述

    private String payCerNo; //支付凭证号（卡号）

    private String resultNoticeUrl;//支付结果通知URL

    private String resultPageUrl;//支付结果跳转URL

    private String sceneCode;//支付场景码
    
    private String isExpire;//是否已过期0：已过期，1：未过期
    
    private String isRefund;//是否已退款0：已退款,1：未退款
    
    private String payType;//微信支付模式：APP、JSAPI、NATIVE  支付宝支付模式：APP、WAP、NATIVE   捷易付支付模式：H5

    private String remark;//备注

    private String errorMsg;

    private String createUser;//创建人（系统默认“99”，其它为运营人员ID号）

    private String updateUser;//最后更新人

    private String createTime;//新增时间
    
    private String createEndTime;//新增时间

    private String createStartTime;//新增时间

    private String updateTime;//最后更新时间
    
    private String payChannelId;//支付渠道号 WeChat:微信，Alipay：支付宝，JYF：捷易付
    
	private String  payChannelCode	;// 二级支付方式 WeChat:微信，Alipay：支付宝，JST：捷顺通卡，KQ：快钱（银行卡） ，BAL：余额，JYF:捷易付

	private String  appId ; 
    
	private String isByPage;// 是否分页 Y , N
	
	
	private String isFreePwd;// 是否免密Y , N
	
	private Long tranAmountSum;// 交易金额汇总

	private Long refundAmountSum;//已退款金额汇总

    private Long tranFeeSum;//支付订单手续费汇总
    
    private Long payAmountSum;//实际支付金额汇总
    
    private Long promoteAmountSum;//优惠金额汇总

    //添加营销系统优惠相关字段
	private String marketingId;//活动ID
	private String discountType;//折扣类型(1-金额,2-比率)
	private String discountValue;//折扣值(如:20或20%)
	private String promoteType;//优惠类型(1-满减,2-满赠)
	private Long payAmount;//实际支付金额(单位:分)
	private Long promoteAmount;//优惠金额(单位:分)
	private String promoteMchId;//优惠承担商户ID
	private String activityJoinNo;//活动流水号
	
	private String[] busTypes;// 交易类型1-支付，2-退款，3-代扣 ，4-扫码支付，5-主动还款
	
	private String paySuccStartTime;//支付成功开始时间
	
	private String paySuccEndTime; //支付成功结束时间
	
	private String orderSuccStartTime;//订单成功开始时间
	
	private String orderSuccEndTime; //订单成功结束时间
	
	private String closeOrderFlag; //是否关单 Y:是  N:否

	
    private List<TranCorePayOrderBean> tranCorePayOrderBeanList;

	
    public Long getPayAmountSum() {
        return payAmountSum;
    }

    public void setPayAmountSum(Long payAmountSum) {
        this.payAmountSum = payAmountSum;
    }

    public Long getPromoteAmountSum() {
        return promoteAmountSum;
    }

    public void setPromoteAmountSum(Long promoteAmountSum) {
        this.promoteAmountSum = promoteAmountSum;
    }

	public String[] getMerchantIds() {
		return merchantIds;
	}

	public void setMerchantIds(String[] merchantIds) {
		this.merchantIds = merchantIds;
	}

	public String getBusNo() {
		return busNo;
	}

	public void setBusNo(String busNo) {
		this.busNo = busNo;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}
	
	public String getPayChannelCode() {
		return payChannelCode;
	}

	public void setPayChannelCode(String payChannelCode) {
		this.payChannelCode = payChannelCode;
	}

	public String[] getStates() {
		return states;
	}

	public void setStates(String[] states) {
		this.states = states;
	}

	public String getIsExpire() {
		return isExpire;
	}

	public void setIsExpire(String isExpire) {
		this.isExpire = isExpire;
	}

	public String getIsRefund() {
		return isRefund;
	}

	public void setIsRefund(String isRefund) {
		this.isRefund = isRefund;
	}

	public String getCloseOrderFlag() {
		return closeOrderFlag;
	}

	public void setCloseOrderFlag(String closeOrderFlag) {
		this.closeOrderFlag = closeOrderFlag;
	}

	public String getBusType() {
		return busType;
	}

	public void setBusType(String busType) {
		this.busType = busType;
	}
	
	public String getPaySuccStartTime() {
		return paySuccStartTime;
	}

	public void setPaySuccStartTime(String paySuccStartTime) {
		this.paySuccStartTime = paySuccStartTime;
	}

	public String getPaySuccEndTime() {
		return paySuccEndTime;
	}

	public void setPaySuccEndTime(String paySuccEndTime) {
		this.paySuccEndTime = paySuccEndTime;
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

	public Long getTranAmountSum() {
		return tranAmountSum;
	}

	public void setTranAmountSum(Long tranAmountSum) {
		this.tranAmountSum = tranAmountSum;
	}

	public Long getRefundAmountSum() {
		return refundAmountSum;
	}

	public void setRefundAmountSum(Long refundAmountSum) {
		this.refundAmountSum = refundAmountSum;
	}

	public Long getRefundAmount() {
		return refundAmount;
	}

	public void setRefundAmount(Long refundAmount) {
		this.refundAmount = refundAmount;
	}

	public Long getTranFeeSum() {
		return tranFeeSum;
	}

	public void setTranFeeSum(Long tranFeeSum) {
		this.tranFeeSum = tranFeeSum;
	}

	public Long getTranFee() {
		return tranFee;
	}

	public void setTranFee(Long tranFee) {
		this.tranFee = tranFee;
	}

	public String getMerchantExtenalNo() {
		return merchantExtenalNo;
	}

	public void setMerchantExtenalNo(String merchantExtenalNo) {
		this.merchantExtenalNo = merchantExtenalNo;
	}

	public String getMerchantId() {
		return merchantId;
	}

	public void setMerchantId(String merchantId) {
		this.merchantId = merchantId;
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

	public String getMerchantMemberId() {
		return merchantMemberId;
	}

	public void setMerchantMemberId(String merchantMemberId) {
		this.merchantMemberId = merchantMemberId;
	}
	
	public String[] getMerchantMemberIds() {
		return merchantMemberIds;
	}

	public void setMerchantMemberIds(String[] merchantMemberIds) {
		this.merchantMemberIds = merchantMemberIds;
	}

	public String getMerchantName() {
		return merchantName;
	}

	public void setMerchantName(String merchantName) {
		this.merchantName = merchantName;
	}

	public String getPayMemberId() {
		return payMemberId;
	}

	public void setPayMemberId(String payMemberId) {
		this.payMemberId = payMemberId;
	}

	public String getPayMemberName() {
		return payMemberName;
	}

	public void setPayMemberName(String payMemberName) {
		this.payMemberName = payMemberName;
	}

	public String getPayMemberMobile() {
		return payMemberMobile;
	}

	public void setPayMemberMobile(String payMemberMobile) {
		this.payMemberMobile = payMemberMobile;
	}

	public Long getTranAmount() {
		return tranAmount;
	}

	public void setTranAmount(Long tranAmount) {
		this.tranAmount = tranAmount;
	}
	
	public String getExpiredTime() {
		return expiredTime;
	}

	public void setExpiredTime(String expiredTime) {
		this.expiredTime = expiredTime;
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

	public String getIsFreePwd() {
		return isFreePwd;
	}

	public void setIsFreePwd(String isFreePwd) {
		this.isFreePwd = isFreePwd;
	}

	public String getResultNoticeUrl() {
		return resultNoticeUrl;
	}

	public void setResultNoticeUrl(String resultNoticeUrl) {
		this.resultNoticeUrl = resultNoticeUrl;
	}

	public String getResultPageUrl() {
		return resultPageUrl;
	}

	public void setResultPageUrl(String resultPageUrl) {
		this.resultPageUrl = resultPageUrl;
	}

	public String getSceneCode() {
		return sceneCode;
	}

	public void setSceneCode(String sceneCode) {
		this.sceneCode = sceneCode;
	}

	public String getPayType() {
		return payType;
	}

	public void setPayType(String payType) {
		this.payType = payType;
	}

	public String getPayChannelId() {
		return payChannelId;
	}

	public void setPayChannelId(String payChannelId) {
		this.payChannelId = payChannelId;
	}

	public String getPayLaneNo() {
		return payLaneNo;
	}

	public void setPayLaneNo(String payLaneNo) {
		this.payLaneNo = payLaneNo;
	}

	public String getPayCerNo() {
		return payCerNo;
	}

	public void setPayCerNo(String payCerNo) {
		this.payCerNo = payCerNo;
	}

	public String getErrorMsg() {
		return errorMsg;
	}

	public void setErrorMsg(String errorMsg) {
		this.errorMsg = errorMsg;
	}

	public String getAppId() {
		return appId;
	}

	public void setAppId(String appId) {
		this.appId = appId;
	}

	public String getRemark() {
		return remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}

	public String getCreateUser() {
		return createUser;
	}

	public void setCreateUser(String createUser) {
		this.createUser = createUser;
	}

	public String getUpdateUser() {
		return updateUser;
	}

	public void setUpdateUser(String updateUser) {
		this.updateUser = updateUser;
	}

	public String getCreateTime() {
		return createTime;
	}

	public void setCreateTime(String createTime) {
		this.createTime = createTime;
	}

	public String getCreateEndTime() {
		return createEndTime;
	}

	public void setCreateEndTime(String createEndTime) {
		this.createEndTime = createEndTime;
	}

	public String getCreateStartTime() {
		return createStartTime;
	}

	public void setCreateStartTime(String createStartTime) {
		this.createStartTime = createStartTime;
	}

	public String getUpdateTime() {
		return updateTime;
	}

	public void setUpdateTime(String updateTime) {
		this.updateTime = updateTime;
	}
	
	public String getOrderSuccStartTime() {
		return orderSuccStartTime;
	}

	public void setOrderSuccStartTime(String orderSuccStartTime) {
		this.orderSuccStartTime = orderSuccStartTime;
	}

	public String getOrderSuccEndTime() {
		return orderSuccEndTime;
	}

	public void setOrderSuccEndTime(String orderSuccEndTime) {
		this.orderSuccEndTime = orderSuccEndTime;
	}

	public String getIsByPage() {
		return isByPage;
	}

	public void setIsByPage(String isByPage) {
		this.isByPage = isByPage;
	}
	
	public String[] getBusTypes() {
		return busTypes;
	}

	public void setBusTypes(String[] busTypes) {
		this.busTypes = busTypes;
	}

	public List<TranCorePayOrderBean> getTranCorePayOrderBeanList() {
		return tranCorePayOrderBeanList;
	}

	public void setTranCorePayOrderBeanList(List<TranCorePayOrderBean> tranCorePayOrderBeanList) {
		this.tranCorePayOrderBeanList = tranCorePayOrderBeanList;
	}

}
