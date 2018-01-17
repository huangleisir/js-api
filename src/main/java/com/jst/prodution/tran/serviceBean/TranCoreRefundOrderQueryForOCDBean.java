package com.jst.prodution.tran.serviceBean;

import java.util.Date;
import java.util.List;

import com.jst.prodution.base.bean.BaseBean;

public class TranCoreRefundOrderQueryForOCDBean extends BaseBean {

	private static final long serialVersionUID = 1L;

    private String busNo; //交易流水号

    private String state;//退款状态(00：退款成功，01退款中，02退款失败)

    private String linkPayNo;//关联支付交易流水号   

    private Date applyTime; //退款申请时间

    private String refundType;//1，退款至余额2，退款至银行卡 

    private String merchantExtenalNo;//原始支付订单外部订单号（检索商户订单唯一性）

    private String refundExtenalNo;//退款外部订单号（检索商户订单唯一性）
    
    private Long tranAmount;//支付金额

    private String orderName;//订单名称

    private String orderDes;//订单描述

    private String payType;//微信支付模式：APP、JSAPI、NATIVE  支付宝支付模式：APP、WAP、NATIVE   捷易付支付模式：H5

    private Integer tranDate;//交易日期

    private String remark;//备注

    private String frozenIds;//冻结流水

    private String refundErrorMsg;//退款错误信息

    private String sourceFrom;//退款来源

    private String refundChannelCode; //退款渠道编码 WeChat:微信，Alipay：支付宝，YFK：捷顺通卡，KQ：快钱（银行卡） ，BAL：余额，JYF：捷易付
    
    private String channelNo;   //渠道流水号

    private String merchantId;//退款商户号

    private String merchantMemberId; //退款商户会员标识

    private String merchantName; //退款商户名称

    private String createUser;//创建人

    private String updateUser; //更新人
    
    private TranCorePayOrderQueryDetailBean tranCorePayOrderQueryDetailBean; //原支付订单信息
    
    private Date createTime;//创建时间

    private Date updateTime;//最后更新时间
    
	private String isByPage;// 是否分页 Y , N

    private List<TranCoreRefundOrderQueryForOCDBean> tranCoreRefundOrderBeanList;

	public String getBusNo() {
		return busNo;
	}

	public void setBusNo(String busNo) {
		this.busNo = busNo;
	}

	public String getLinkPayNo() {
		return linkPayNo;
	}

	public void setLinkPayNo(String linkPayNo) {
		this.linkPayNo = linkPayNo;
	}

	public String getMerchantExtenalNo() {
		return merchantExtenalNo;
	}

	public void setMerchantExtenalNo(String merchantExtenalNo) {
		this.merchantExtenalNo = merchantExtenalNo;
	}

	public String getRefundExtenalNo() {
		return refundExtenalNo;
	}

	public void setRefundExtenalNo(String refundExtenalNo) {
		this.refundExtenalNo = refundExtenalNo;
	}

	public String getIsByPage() {
		return isByPage;
	}

	public void setIsByPage(String isByPage) {
		this.isByPage = isByPage;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public Date getApplyTime() {
		return applyTime;
	}

	public void setApplyTime(Date applyTime) {
		this.applyTime = applyTime;
	}

	public String getRefundType() {
		return refundType;
	}

	public void setRefundType(String refundType) {
		this.refundType = refundType;
	}

	public Long getTranAmount() {
		return tranAmount;
	}

	public void setTranAmount(Long tranAmount) {
		this.tranAmount = tranAmount;
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

	public String getPayType() {
		return payType;
	}

	public void setPayType(String payType) {
		this.payType = payType;
	}

	public Integer getTranDate() {
		return tranDate;
	}

	public void setTranDate(Integer tranDate) {
		this.tranDate = tranDate;
	}

	public String getRemark() {
		return remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}

	public String getFrozenIds() {
		return frozenIds;
	}

	public void setFrozenIds(String frozenIds) {
		this.frozenIds = frozenIds;
	}

	public String getRefundErrorMsg() {
		return refundErrorMsg;
	}

	public void setRefundErrorMsg(String refundErrorMsg) {
		this.refundErrorMsg = refundErrorMsg;
	}

	public String getSourceFrom() {
		return sourceFrom;
	}

	public void setSourceFrom(String sourceFrom) {
		this.sourceFrom = sourceFrom;
	}

	public String getRefundChannelCode() {
		return refundChannelCode;
	}

	public void setRefundChannelCode(String refundChannelCode) {
		this.refundChannelCode = refundChannelCode;
	}

	public String getChannelNo() {
		return channelNo;
	}

	public void setChannelNo(String channelNo) {
		this.channelNo = channelNo;
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

	public String getMerchantName() {
		return merchantName;
	}

	public void setMerchantName(String merchantName) {
		this.merchantName = merchantName;
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

	public TranCorePayOrderQueryDetailBean getTranCorePayOrderQueryDetailBean() {
		return tranCorePayOrderQueryDetailBean;
	}

	public void setTranCorePayOrderQueryDetailBean(TranCorePayOrderQueryDetailBean tranCorePayOrderQueryDetailBean) {
		this.tranCorePayOrderQueryDetailBean = tranCorePayOrderQueryDetailBean;
	}

	public Date getCreateTime() {
		return createTime;
	}

	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}

	public Date getUpdateTime() {
		return updateTime;
	}

	public void setUpdateTime(Date updateTime) {
		this.updateTime = updateTime;
	}

	public List<TranCoreRefundOrderQueryForOCDBean> getTranCoreRefundOrderBeanList() {
		return tranCoreRefundOrderBeanList;
	}

	public void setTranCoreRefundOrderBeanList(List<TranCoreRefundOrderQueryForOCDBean> tranCoreRefundOrderBeanList) {
		this.tranCoreRefundOrderBeanList = tranCoreRefundOrderBeanList;
	}

    
}
