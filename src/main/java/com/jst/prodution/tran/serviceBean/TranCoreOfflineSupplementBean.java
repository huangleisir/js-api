package com.jst.prodution.tran.serviceBean;

import java.util.Date;

import com.jst.prodution.base.bean.BaseBean;
/**
 * 线下补登记订单
 */
public class TranCoreOfflineSupplementBean extends BaseBean {
	
	private static final long serialVersionUID = 1L;
	/**
	 * OMS上发起补录交易时,若有多个流水号用‘|’分开
	 */
	private String busNo;
	/**
	 * 磐石记账商户号
	 */
	private String merchantNo;
	/**
	 * 支付机构代码
	 */
	private String payPartCode;
	/**
	 * 受理方流水号
	 */
	private String transSsn;
	/**
	 * 商户代码
	 */
	private String mchntCode;
	/**
	 * 交易日期
	 */
	private Integer transDate;
	/**
	 * 交易时间
	 */
	private String transTime;
	/**
	 * 交易类型
	 */
	private String transType;
	/**
	 * 交易名称
	 */
	private String transName;
	/**
	 * 受理方订单号
	 */
	private String acqOrderNo;
	/**
	 * 支付方订单号
	 */
	private String payOrderNo;
	/**
	 * 订单创建时间
	 */
	private String orderCreateTime;
	/**
	 * 商品名称
	 */
	private String productName;
	/**
	 * 交易金额(分)
	 */
	private Long transAmt;
	/**
	 * 折扣金额
	 */
	private Long discAmt;
	/**
	 * 总金额
	 */
	private Long totalAmt;
	/**
	 * 交易货币
	 */
	private String transCurrCd;
	/**
	 * 交易状态
	 */
	private String transSt;
	/**
	 * 退款状态
	 */
	private String refundSt;
	/**
	 * 受理方退款订单号
	 */
	private String acqRefundNo;
	/**
	 * 支付方退款订单号
	 */
	private String payRefundNo;
	/**
	 * 创建人（系统默认“99”，其它为运营人员ID号）
	 */
	private String createUser;
	/**
	 * 最后更新人
	 */
	private String updateUser;
	/**
	 * 创建时间
	 */
	private Date createTime;
	/**
	 * 更新时间
	 */
	private Date updateTime;

	public String getBusNo() {
		return busNo;
	}

	public void setBusNo(String busNo) {
		this.busNo = busNo;
	}

	public String getMerchantNo() {
		return merchantNo;
	}

	public void setMerchantNo(String merchantNo) {
		this.merchantNo = merchantNo;
	}

	public String getPayPartCode() {
		return payPartCode;
	}

	public void setPayPartCode(String payPartCode) {
		this.payPartCode = payPartCode;
	}

	public String getTransSsn() {
		return transSsn;
	}

	public void setTransSsn(String transSsn) {
		this.transSsn = transSsn;
	}

	public String getMchntCode() {
		return mchntCode;
	}

	public void setMchntCode(String mchntCode) {
		this.mchntCode = mchntCode;
	}

	public Integer getTransDate() {
		return transDate;
	}

	public void setTransDate(Integer transDate) {
		this.transDate = transDate;
	}

	public String getTransTime() {
		return transTime;
	}

	public void setTransTime(String transTime) {
		this.transTime = transTime;
	}

	public String getTransType() {
		return transType;
	}

	public void setTransType(String transType) {
		this.transType = transType;
	}

	public String getTransName() {
		return transName;
	}

	public void setTransName(String transName) {
		this.transName = transName;
	}

	public String getAcqOrderNo() {
		return acqOrderNo;
	}

	public void setAcqOrderNo(String acqOrderNo) {
		this.acqOrderNo = acqOrderNo;
	}

	public String getPayOrderNo() {
		return payOrderNo;
	}

	public void setPayOrderNo(String payOrderNo) {
		this.payOrderNo = payOrderNo;
	}

	public String getOrderCreateTime() {
		return orderCreateTime;
	}

	public void setOrderCreateTime(String orderCreateTime) {
		this.orderCreateTime = orderCreateTime;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public Long getTransAmt() {
		return transAmt;
	}

	public void setTransAmt(Long transAmt) {
		this.transAmt = transAmt;
	}

	public Long getDiscAmt() {
		return discAmt;
	}

	public void setDiscAmt(Long discAmt) {
		this.discAmt = discAmt;
	}

	public Long getTotalAmt() {
		return totalAmt;
	}

	public void setTotalAmt(Long totalAmt) {
		this.totalAmt = totalAmt;
	}

	public String getTransCurrCd() {
		return transCurrCd;
	}

	public void setTransCurrCd(String transCurrCd) {
		this.transCurrCd = transCurrCd;
	}

	public String getTransSt() {
		return transSt;
	}

	public void setTransSt(String transSt) {
		this.transSt = transSt;
	}

	public String getRefundSt() {
		return refundSt;
	}

	public void setRefundSt(String refundSt) {
		this.refundSt = refundSt;
	}

	public String getAcqRefundNo() {
		return acqRefundNo;
	}

	public void setAcqRefundNo(String acqRefundNo) {
		this.acqRefundNo = acqRefundNo;
	}

	public String getPayRefundNo() {
		return payRefundNo;
	}

	public void setPayRefundNo(String payRefundNo) {
		this.payRefundNo = payRefundNo;
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

}
