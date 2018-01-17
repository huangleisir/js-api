package com.jst.prodution.acctfront.serviceBean;

import com.jst.prodution.base.bean.BaseBean;

public class AcctFrontCashWithdrawBean extends BaseBean {
	private static final long serialVersionUID = 1L;
	//交易订单流水号	必输	交易核心生成的交易订单流水号
	private String busNo;
	//业务类型	必输	业务类型（交易订单订单类型）
	private String busTranType;
	//业务来源	必输	业务来源（1-APP，2-OMS）
	private String sourceFrom	;
	//客户标识	必输	客户ID(会员号)
	private String userId;
	//账户标识	必输	会员账户系统中所对应的账号
	private String acctId;	
	//账户名称	必输	账户真实姓名
	private String acctName;
	//账户类型	必输	01-基本户
	private String acctType;
	// 渠道流水号
	private String channelNo;
	//渠道编码	可输
	private String channelCode;		
	//渠道名称	可输
	private String channelName;		
	//交易金额	必输	单位为人民币分
	private Long tranAmount;	
	//交易日期	必输	
	private Integer busTransDate;
	//备注	可输
	private String remark;
	//操作人	可输	
	private String operUser	;
	
	//支付流水号
	private String payNo;
	//日切
	private Integer cutDate;
	//备付金账户
	private String provisionsAcct;
	/**
	 * @return the payNo
	 */
	public String getPayNo() {
		return payNo;
	}
	/**
	 * @param payNo the payNo to set
	 */
	public void setPayNo(String payNo) {
		this.payNo = payNo == null ? null : payNo.trim();
	}
	/**
	 * @return the busNo
	 */
	public String getBusNo() {
		return busNo;
	}
	/**
	 * @param busNo the busNo to set
	 */
	public void setBusNo(String busNo) {
		this.busNo = busNo == null ? null : busNo.trim();
	}
	/**
	 * @return the busTranType
	 */
	public String getBusTranType() {
		return busTranType;
	}
	/**
	 * @param busTranType the busTranType to set
	 */
	public void setBusTranType(String busTranType) {
		this.busTranType = busTranType == null ? null : busTranType.trim();
	}
	/**
	 * @return the sourceFrom
	 */
	public String getSourceFrom() {
		return sourceFrom;
	}
	/**
	 * @param sourceFrom the sourceFrom to set
	 */
	public void setSourceFrom(String sourceFrom) {
		this.sourceFrom = sourceFrom == null ? null : sourceFrom.trim();
	}
	/**
	 * @return the userId
	 */
	public String getUserId() {
		return userId;
	}
	/**
	 * @param userId the userId to set
	 */
	public void setUserId(String userId) {
		this.userId = userId == null ? null : userId.trim();
	}
	/**
	 * @return the acctId
	 */
	public String getAcctId() {
		return acctId;
	}
	/**
	 * @param acctId the acctId to set
	 */
	public void setAcctId(String acctId) {
		this.acctId = acctId == null ? null : acctId.trim();
	}
	/**
	 * @return the acctName
	 */
	public String getAcctName() {
		return acctName;
	}
	/**
	 * @param acctName the acctName to set
	 */
	public void setAcctName(String acctName) {
		this.acctName = acctName == null ? null : acctName.trim();
	}
	/**
	 * @return the acctType
	 */
	public String getAcctType() {
		return acctType;
	}
	/**
	 * @param acctType the acctType to set
	 */
	public void setAcctType(String acctType) {
		this.acctType = acctType == null ? null : acctType.trim();
	}
	public String getChannelNo() {
		return channelNo;
	}
	public void setChannelNo(String channelNo) {
		this.channelNo = channelNo == null ? null : channelNo.trim();
	}
	/**
	 * @return the channelCode
	 */
	public String getChannelCode() {
		return channelCode;
	}
	/**
	 * @param channelCode the channelCode to set
	 */
	public void setChannelCode(String channelCode) {
		this.channelCode = channelCode == null ? null : channelCode.trim();
	}
	/**
	 * @return the channelName
	 */
	public String getChannelName() {
		return channelName;
	}
	/**
	 * @param channelName the channelName to set
	 */
	public void setChannelName(String channelName) {
		this.channelName = channelName == null ? null : channelName.trim();
	}
	/**
	 * @return the tranAmount
	 */
	public Long getTranAmount() {
		return tranAmount;
	}
	/**
	 * @param tranAmount the tranAmount to set
	 */
	public void setTranAmount(Long tranAmount) {
		this.tranAmount = tranAmount;
	}
	/**
	 * @return the busTransDate
	 */
	public Integer getBusTransDate() {
		return busTransDate;
	}
	/**
	 * @param busTransDate the busTransDate to set
	 */
	public void setBusTransDate(Integer busTransDate) {
		this.busTransDate = busTransDate;
	}
	/**
	 * @return the remark
	 */
	public String getRemark() {
		return remark;
	}
	/**
	 * @param remark the remark to set
	 */
	public void setRemark(String remark) {
		this.remark = remark == null ? null : remark.trim();
	}
	/**
	 * @return the operUser
	 */
	public String getOperUser() {
		return operUser;
	}
	/**
	 * @param operUser the operUser to set
	 */
	public void setOperUser(String operUser) {
		this.operUser = operUser == null ? null : operUser.trim();
	}
	public Integer getCutDate() {
		return cutDate;
	}
	public void setCutDate(Integer cutDate) {
		this.cutDate = cutDate;
	}
	public String getProvisionsAcct() {
		return provisionsAcct;
	}
	public void setProvisionsAcct(String provisionsAcct) {
		this.provisionsAcct = provisionsAcct;
	}
	
}
