package com.jst.prodution.upay.model;
/**
 * 
 * @Package: com.jst.prodution.upay.model
 * @ClassName: PaymentStatusQuery.java
 * @Description: 订单状态查询model
 *
 * @author: wanghuai
 * @date: 2017年10月16日 下午2:51:23 
 * @version: V1.0
 *
 */
public class PaymentStatusQuery {
	/**
	 * 订单状态
	 */
	private String status;
	/**
	 * 订单号
	 */
	private String payNo;
	/**
	 * 支付渠道流水号
	 */
	private String externTransactionId;
	/**
	 * 支付完成时间
	 */
	private String timeEnd;
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
    public String getTimeEnd() {
        return timeEnd;
    }
    public void setTimeEnd(String timeEnd) {
        this.timeEnd = timeEnd;
    }
	
}
