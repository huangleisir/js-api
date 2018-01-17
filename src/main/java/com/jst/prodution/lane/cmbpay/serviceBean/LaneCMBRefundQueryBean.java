package com.jst.prodution.lane.cmbpay.serviceBean;

import com.jst.prodution.base.bean.BaseBean;
/**
 * 
* @ClassName: LaneCMBRefundQueryBean 
* @Description: TODO(对外暴露一网通退款订单查询Bean) 
* @author zcb
* @date 2018年1月16日 上午10:49:34 
*
 */
public class LaneCMBRefundQueryBean extends BaseBean{

	private static final long serialVersionUID = 1L;
	
	/*入参*/
	private String orderNo;//原支付订单流水号
	private String refundNo;//退款流水号
	
	/*出参*/
	private String branchNo;//商户分行号，4位数字
	private String merchantNo;//商户号，6位数字
	private String date;//商户订单日期，格式：yyyyMMdd
	private String bankSerialNo;//银行退款流水号
	private String merchantSerialNo;//商户上送流水号
	private String orderStatus;//210：已直接退款  240：已授权退款
	private String currency;//币种,固定为："10"
	private String amount;//退款金额,格式：xxxx.xx
	private String fee;//费用金额,格式：xxxx.xx
	private String acceptDate;//银行受理日期：格式：yyyyMMdd
	private String acceptTime;//银行受理时间,格式：HHmmss
	private String bankTime;//银行处理时间,格式：HHmmss
	private String desc;//退款描述
	private String settleAmount;//实际退款金额,格式：xxxx.xx
	private String discountAmount;//退回优惠金额,格式：xxxx.xx
	
	public String getOrderNo() {
		return orderNo;
	}
	public void setOrderNo(String orderNo) {
		this.orderNo = orderNo;
	}
	public String getRefundNo() {
		return refundNo;
	}
	public void setRefundNo(String refundNo) {
		this.refundNo = refundNo;
	}
	public String getBranchNo() {
		return branchNo;
	}
	public void setBranchNo(String branchNo) {
		this.branchNo = branchNo;
	}
	public String getMerchantNo() {
		return merchantNo;
	}
	public void setMerchantNo(String merchantNo) {
		this.merchantNo = merchantNo;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	public String getBankSerialNo() {
		return bankSerialNo;
	}
	public void setBankSerialNo(String bankSerialNo) {
		this.bankSerialNo = bankSerialNo;
	}
	public String getMerchantSerialNo() {
		return merchantSerialNo;
	}
	public void setMerchantSerialNo(String merchantSerialNo) {
		this.merchantSerialNo = merchantSerialNo;
	}
	public String getOrderStatus() {
		return orderStatus;
	}
	public void setOrderStatus(String orderStatus) {
		this.orderStatus = orderStatus;
	}
	public String getCurrency() {
		return currency;
	}
	public void setCurrency(String currency) {
		this.currency = currency;
	}
	public String getAmount() {
		return amount;
	}
	public void setAmount(String amount) {
		this.amount = amount;
	}
	public String getFee() {
		return fee;
	}
	public void setFee(String fee) {
		this.fee = fee;
	}
	public String getAcceptDate() {
		return acceptDate;
	}
	public void setAcceptDate(String acceptDate) {
		this.acceptDate = acceptDate;
	}
	public String getAcceptTime() {
		return acceptTime;
	}
	public void setAcceptTime(String acceptTime) {
		this.acceptTime = acceptTime;
	}
	public String getBankTime() {
		return bankTime;
	}
	public void setBankTime(String bankTime) {
		this.bankTime = bankTime;
	}
	public String getDesc() {
		return desc;
	}
	public void setDesc(String desc) {
		this.desc = desc;
	}
	public String getSettleAmount() {
		return settleAmount;
	}
	public void setSettleAmount(String settleAmount) {
		this.settleAmount = settleAmount;
	}
	public String getDiscountAmount() {
		return discountAmount;
	}
	public void setDiscountAmount(String discountAmount) {
		this.discountAmount = discountAmount;
	}
}
