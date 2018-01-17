package com.jst.prodution.acctfront.serviceBean;

import com.jst.prodution.base.bean.BaseBean;

public class AcctFrontTransferBean extends BaseBean {
	private static final long serialVersionUID = 1L;

	private String busNo;// 交易核心生成的交易订单流水号 必输
	private String busTranType;// 业务类型（交易订单订单类型）（00-线上充值，01-线上提现 ，02-支付 03-线下充值 04-线下提现 05-结算 06-退款 07-代扣） 必输 
	private String sourceFrom;// 业务来源（1-APP，2-OMS） 必输
	private String userId;// 客户标识,客户ID(会员号) 必输
	private String acctId;// 账户标识会员账户系统中所对应的账号 必输
	private String acctName;// 账户名称,账户真实姓名 必输
	private String acctType;// 账户类型(01-基本户) 必输
	private Long tranAmount;// 交易金额(单位为人民币分) 必输
	private Integer busTransDate;// 交易日期(8位整形) 必输
	private String oppUserId;// 对方客户标识,客户ID(会员号) 必输
	private String oppAcctId;// 对方账户标识,会员账户系统中所对应的账号 必输
	private String oppAcctName;// 对方账户名称,账户真实姓名 必输
	private String oppAcctType;// 对方账户类型(01-基本户) 必输
	private String remark;// 备注 可输
	private String opUser;// 操作人 可输
	private String payNo;// 支付订单流水号
	private String limtAmtFlag;//限额标识(限额标识0-限额，1-不限额)
	private Integer cutDate;//日切
	
	public String getBusNo() {
		return busNo;
	}
	public void setBusNo(String busNo) {
		this.busNo = busNo;
	}
	public String getBusTranType() {
		return busTranType;
	}
	public void setBusTranType(String busTranType) {
		this.busTranType = busTranType;
	}
	public String getSourceFrom() {
		return sourceFrom;
	}
	public void setSourceFrom(String sourceFrom) {
		this.sourceFrom = sourceFrom;
	}
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public String getAcctId() {
		return acctId;
	}
	public void setAcctId(String acctId) {
		this.acctId = acctId;
	}
	public String getAcctName() {
		return acctName;
	}
	public void setAcctName(String acctName) {
		this.acctName = acctName;
	}
	public String getAcctType() {
		return acctType;
	}
	public void setAcctType(String acctType) {
		this.acctType = acctType;
	}
	public Long getTranAmount() {
		return tranAmount;
	}
	public void setTranAmount(Long tranAmount) {
		this.tranAmount = tranAmount;
	}
	public Integer getBusTransDate() {
		return busTransDate;
	}
	public void setBusTransDate(Integer busTransDate) {
		this.busTransDate = busTransDate;
	}
	public String getOppUserId() {
		return oppUserId;
	}
	public void setOppUserId(String oppUserId) {
		this.oppUserId = oppUserId;
	}
	public String getOppAcctId() {
		return oppAcctId;
	}
	public void setOppAcctId(String oppAcctId) {
		this.oppAcctId = oppAcctId;
	}
	public String getOppAcctName() {
		return oppAcctName;
	}
	public void setOppAcctName(String oppAcctName) {
		this.oppAcctName = oppAcctName;
	}
	public String getOppAcctType() {
		return oppAcctType;
	}
	public void setOppAcctType(String oppAcctType) {
		this.oppAcctType = oppAcctType;
	}
	public String getRemark() {
		return remark;
	}
	public void setRemark(String remark) {
		this.remark = remark;
	}
	public String getOpUser() {
		return opUser;
	}
	public void setOpUser(String opUser) {
		this.opUser = opUser;
	}
	public String getPayNo() {
		return payNo;
	}
	public void setPayNo(String payNo) {
		this.payNo = payNo;
	}
	public String getLimtAmtFlag() {
		return limtAmtFlag;
	}
	public void setLimtAmtFlag(String limtAmtFlag) {
		this.limtAmtFlag = limtAmtFlag;
	}
	public Integer getCutDate() {
		return cutDate;
	}
	public void setCutDate(Integer cutDate) {
		this.cutDate = cutDate;
	}

}
