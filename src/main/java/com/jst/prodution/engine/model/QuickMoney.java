package com.jst.prodution.engine.model;

import java.sql.Timestamp;
import java.util.Date;

import com.jst.prodution.base.bean.BaseBean;

public class QuickMoney extends BaseBean {
	private static final long serialVersionUID = 1L;
	//原交易号
	private String laneNo;
	//商户名称
	private String merchantName;
	//商户编号
	private String merchantNo;
	//商户号
	private String merchantId;
	//交易号
	private String tranNo;
	//商家订单号
	private String merOrderNo;
	//交易日期
	private String tranDate;
	//交易时间
	private Date tranTime;
	//交易类型
	private String tranType;
	//交易金额
	private Integer tranMoney;
	//交易状态
	private String tranState;
	//卡类型
	private String cardType;
	//手续费（单位：分）
	private Integer tranFee;
	//结算日期
	private String settleDate;
	//对账日期（取表头数据）
	private String billDate;
	//对账状态
	private String billState;
	//表日期
	private String tableDate;
	//是否需要调整（0需要 1不需要）
	private String isAccount;
	//勾兑日期
	private String blendingDate;
	//创建时间
	private Timestamp createTime;
	//创建人
	private String creator;
	//更新时间
	private Timestamp updateTime;
	
	
	public String getLaneNo() {
		return laneNo;
	}
	public void setLaneNo(String laneNo) {
		this.laneNo = laneNo;
	}
	public String getMerchantName() {
		return merchantName;
	}
	public void setMerchantName(String merchantName) {
		this.merchantName = merchantName;
	}
	public String getMerchantNo() {
		return merchantNo;
	}
	public void setMerchantNo(String merchantNo) {
		this.merchantNo = merchantNo;
	}
	public String getMerchantId() {
		return merchantId;
	}
	public void setMerchantId(String merchantId) {
		this.merchantId = merchantId;
	}
	public String getTranNo() {
		return tranNo;
	}
	public void setTranNo(String tranNo) {
		this.tranNo = tranNo;
	}
	public String getMerOrderNo() {
		return merOrderNo;
	}
	public void setMerOrderNo(String merOrderNo) {
		this.merOrderNo = merOrderNo;
	}
	public String getTranDate() {
		return tranDate;
	}
	public void setTranDate(String tranDate) {
		this.tranDate = tranDate;
	}
	public Date getTranTime() {
		return tranTime;
	}
	public void setTranTime(Date tranTime) {
		this.tranTime = tranTime;
	}
	public String getTranType() {
		return tranType;
	}
	public void setTranType(String tranType) {
		this.tranType = tranType;
	}
	public Integer getTranMoney() {
		return tranMoney;
	}
	public void setTranMoney(Integer tranMoney) {
		this.tranMoney = tranMoney;
	}
	public String getTranState() {
		return tranState;
	}
	public void setTranState(String tranState) {
		this.tranState = tranState;
	}
	public String getCardType() {
		return cardType;
	}
	public void setCardType(String cardType) {
		this.cardType = cardType;
	}
	public Integer getTranFee() {
		return tranFee;
	}
	public void setTranFee(Integer tranFee) {
		this.tranFee = tranFee;
	}
	public String getSettleDate() {
		return settleDate;
	}
	public void setSettleDate(String settleDate) {
		this.settleDate = settleDate;
	}
	public String getBillDate() {
		return billDate;
	}
	public void setBillDate(String billDate) {
		this.billDate = billDate;
	}
	public String getTableDate() {
		return tableDate;
	}
	public void setTableDate(String tableDate) {
		this.tableDate = tableDate;
	}
	public String getBillState() {
		return billState;
	}
	public void setBillState(String billState) {
		this.billState = billState;
	}
	public String getIsAccount() {
		return isAccount;
	}
	public void setIsAccount(String isAccount) {
		this.isAccount = isAccount;
	}
	public String getBlendingDate() {
		return blendingDate;
	}
	public void setBlendingDate(String blendingDate) {
		this.blendingDate = blendingDate;
	}
	public Timestamp getCreateTime() {
		return createTime;
	}
	public void setCreateTime(Timestamp createTime) {
		this.createTime = createTime;
	}
	public String getCreator() {
		return creator;
	}
	public void setCreator(String creator) {
		this.creator = creator;
	}
	public Timestamp getUpdateTime() {
		return updateTime;
	}
	public void setUpdateTime(Timestamp updateTime) {
		this.updateTime = updateTime;
	}
}
