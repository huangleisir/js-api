package com.jst.prodution.upay.serviceBean;

import java.util.Date;
import java.util.List;

import com.jst.prodution.base.bean.BaseBean;
import com.jst.prodution.upay.model.RefundModel;
/**
 * 
 * @Package: com.jst.prodution.upay.serviceBean
 * @ClassName: UpayRefundBean.java
 * @Description: 微信、支付宝退款bean
 *
 * @author: wanghuai
 * @date: 2017年10月16日 下午4:40:36 
 * @version: V1.0
 *
 */
public class UpayRefundBean extends BaseBean {

	private static final long serialVersionUID = 1L;
	/**
	 * 磐石应用ID
	 */
	private String jstAppId;				//磐石应用ID
	/**
	 * 磐石商户号
	 */
	private String jstMchId;				//磐石商户号
	/**
	 * 磐石(支付核心)退款流水号
	 */
	private String refundNo;				//磐石(支付核心)退款流水号
	/**
	 * 磐石(支付核心)支付流水号
	 */
	private String payNo;					//磐石(支付核心)支付流水号
	/**
	 * 商户退款单号
	 */
	private String refundId;				//商户退款单号
	/**
	 * 商户订单号
	 */
	private String orderId;					//商户订单号
	/**
	 * 交易系统退款流水号
	 */
	private String busRefundNo;				//交易系统退款流水号
	/**
	 * 交易系统支付流水号
	 */
	private String busNo;					//交易系统支付流水号
	/**
	 * 渠道支付流水号(第三方支付渠道)
	 */
	private String externTransactionId;		//渠道支付流水号(第三方支付渠道)
	/**
	 * 渠道退款流水号(第三方支付渠道)
	 */
	private String externRefundId;			//渠道退款流水号(第三方支付渠道)
	/**
	 * 订单总金额
	 */
	private int totalAmount;				//订单总金额
	/**
	 * 退款金额
	 */
	private int refundAmount;				//退款金额
	/**
	 * 退款状态
	 */
	private String status;						//退款状态
	/**
	 * 支付渠道
	 */
	private String payChannelId;			//支付渠道
	/**
	 * 支付方式
	 */
	private String payType;					//支付方式
	/**
	 * 退款描述
	 */
	private String description;				//退款描述
	/**
	 * 创建时间
	 */
	private Date createTime;				//创建时间
	/**
	 * 成功时间
	 */
	private Date successTime;				//成功时间
	/**
	 * 更新时间
	 */
	private Date updateTime;				//更新时间
	/**
	 * 退款列表
	 */
	private List<RefundModel> refundModelList;//退款列表
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
	public String getRefundNo() {
		return refundNo;
	}
	public void setRefundNo(String refundNo) {
		this.refundNo = refundNo;
	}
	public String getPayNo() {
		return payNo;
	}
	public void setPayNo(String payNo) {
		this.payNo = payNo;
	}
	public String getRefundId() {
		return refundId;
	}
	public void setRefundId(String refundId) {
		this.refundId = refundId;
	}
	public String getOrderId() {
		return orderId;
	}
	public void setOrderId(String orderId) {
		this.orderId = orderId;
	}
	public String getBusRefundNo() {
		return busRefundNo;
	}
	public void setBusRefundNo(String busRefundNo) {
		this.busRefundNo = busRefundNo;
	}
	public String getBusNo() {
		return busNo;
	}
	public void setBusNo(String busNo) {
		this.busNo = busNo;
	}
	public String getExternTransactionId() {
		return externTransactionId;
	}
	public void setExternTransactionId(String externTransactionId) {
		this.externTransactionId = externTransactionId;
	}
	public String getExternRefundId() {
		return externRefundId;
	}
	public void setExternRefundId(String externRefundId) {
		this.externRefundId = externRefundId;
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
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
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
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public Date getCreateTime() {
		return createTime;
	}
	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}
	public Date getSuccessTime() {
		return successTime;
	}
	public void setSuccessTime(Date successTime) {
		this.successTime = successTime;
	}
	public Date getUpdateTime() {
		return updateTime;
	}
	public void setUpdateTime(Date updateTime) {
		this.updateTime = updateTime;
	}
	public List<RefundModel> getRefundModelList() {
		return refundModelList;
	}
	public void setRefundModelList(List<RefundModel> refundModelList) {
		this.refundModelList = refundModelList;
	}
}
