package com.jst.prodution.upay.model;
/**
 * 
 * @Package: com.jst.prodution.upay.model
 * @ClassName: RefundStatusQuery.java
 * @Description: 退款状态查询model
 *
 * @author: wanghuai
 * @date: 2017年10月16日 下午8:15:50 
 * @version: V1.0
 *
 */
public class RefundStatusQuery {
	/**
	 * 订单状态
	 */
	private String status;
	/**
	 * 磐石支付流水号
	 */
	private String payNo;
	/**
	 * 支付渠道支付流水号
	 */
	private String externTransactionId;
	/**
	 * 磐石退款流水号
	 */
	private String refundNo;
	/**
	 * 支付渠道退款流水号
	 */
	private String externRefundId;
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public String getPayNo() {
		return payNo;
	}
	public void setPayNo(String payNo) {
		this.payNo = payNo;
	}
	public String getExternTransactionId() {
		return externTransactionId;
	}
	public void setExternTransactionId(String externTransactionId) {
		this.externTransactionId = externTransactionId;
	}
	public String getRefundNo() {
		return refundNo;
	}
	public void setRefundNo(String refundNo) {
		this.refundNo = refundNo;
	}
	public String getExternRefundId() {
		return externRefundId;
	}
	public void setExternRefundId(String externRefundId) {
		this.externRefundId = externRefundId;
	}
}
