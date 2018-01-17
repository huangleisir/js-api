package com.jst.prodution.acctfront.serviceBean;

import java.util.Date;
import java.util.List;

import com.jst.prodution.base.bean.BaseBean;

public class AcctFrontTransferQueryListBean extends BaseBean {
	private static final long serialVersionUID = 1L;
	
	/*-----------------------------------输入参数start--------------------------------------*/
	private String busNo;// 交易核心生成的交易订单流水号 
	private String busTranType;// 业务类型（交易订单订单类型）
	private String sourceFrom;// 业务来源（1-APP，2-OMS） 
	private String userId;// 客户标识,客户ID(会员号) 必输
	private String acctId;// 账户标识会员账户系统中所对应的账号 
	private String acctName;// 账户名称,账户真实姓名 
	private String acctType;// 账户类型(01-基本户) 
	private String oppUserId;// 对方客户标识,客户ID(会员号) 
	private String oppAcctId;// 对方账户标识,会员账户系统中所对应的账号 
	private String oppAcctName;// 对方账户名称,账户真实姓名 
	private String oppAcctType;// 对方账户类型(01-基本户) 
	private String remark;// 备注 可输
	private String opUser;// 操作人 可输(创建人/修改人)
	private String payNo;// 支付订单流水号
	private String orderStatus;//订单状态
	private String writeoffFlag;//冲销标识
	private Integer minBusTransDate;// 最小交易日期(包括该日期，8位整形) 
	private Integer maxBusTransDate;// 最大交易日期(包括该日期，8位整形) 
	private Long minTranAmount;// 最小交易金额(包括该金额，单位为人民币分)
	private Long maxTranAmount;// 最大交易金额(包括该金额,单位为人民币分)
	/*-----------------------------------输入参数end--------------------------------------*/
	
	private Integer busTransDate;// 交易日期(8位整形) 
	private Long tranAmount;// 交易金额(单位为人民币分) 
	private String linkPayNo;
	private String createUser;
	private String updateUser;
	private Date createTime;
	private Date updateTime;

	private List<AcctFrontTransferQueryListBean> list;

	public List<AcctFrontTransferQueryListBean> getList() {
		return list;
	}

	public void setList(List<AcctFrontTransferQueryListBean> list) {
		this.list = list;
	}

	public String getBusNo() {
		return busNo;
	}

	public void setBusNo(String busNo) {
		this.busNo = busNo == null || "".equals(busNo.trim()) ? null : busNo.trim();
	}

	public String getBusTranType() {
		return busTranType;
	}

	public void setBusTranType(String busTranType) {
		this.busTranType = busTranType == null || "".equals(busTranType.trim()) ? null : busTranType.trim();
	}

	public String getSourceFrom() {
		return sourceFrom;
	}

	public void setSourceFrom(String sourceFrom) {
		this.sourceFrom = sourceFrom == null || "".equals(sourceFrom.trim()) ? null : sourceFrom.trim();
	}

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId == null || "".equals(userId.trim()) ? null : userId.trim();
	}

	public String getAcctId() {
		return acctId;
	}

	public void setAcctId(String acctId) {
		this.acctId = acctId == null || "".equals(acctId.trim()) ? null : acctId.trim();
	}

	public String getAcctName() {
		return acctName;
	}

	public void setAcctName(String acctName) {
		this.acctName = acctName == null || "".equals(acctName.trim()) ? null : acctName.trim();
	}

	public String getAcctType() {
		return acctType;
	}

	public void setAcctType(String acctType) {
		this.acctType = acctType == null || "".equals(acctType.trim()) ? null : acctType.trim();
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
		this.oppUserId = oppUserId == null || "".equals(oppUserId.trim()) ? null : oppUserId.trim();
	}

	public String getOppAcctId() {
		return oppAcctId;
	}

	public void setOppAcctId(String oppAcctId) {
		this.oppAcctId = oppAcctId == null || "".equals(oppAcctId.trim()) ? null : oppAcctId.trim();
	}

	public String getOppAcctName() {
		return oppAcctName;
	}

	public void setOppAcctName(String oppAcctName) {
		this.oppAcctName = oppAcctName == null || "".equals(oppAcctName.trim()) ? null : oppAcctName.trim();
	}

	public String getOppAcctType() {
		return oppAcctType;
	}

	public void setOppAcctType(String oppAcctType) {
		this.oppAcctType = oppAcctType == null || "".equals(oppAcctType.trim()) ? null : oppAcctType.trim();
	}

	public String getRemark() {
		return remark;
	}

	public void setRemark(String remark) {
		this.remark = remark == null || "".equals(remark.trim()) ? null : remark.trim();
	}

	public String getOpUser() {
		return opUser;
	}

	public void setOpUser(String opUser) {
		this.opUser = opUser == null || "".equals(opUser.trim()) ? null : opUser.trim();
	}

	public String getPayNo() {
		return payNo;
	}

	public void setPayNo(String payNo) {
		this.payNo = payNo == null || "".equals(payNo.trim()) ? null : payNo.trim();
	}

	public String getOrderStatus() {
		return orderStatus;
	}

	public void setOrderStatus(String orderStatus) {
		this.orderStatus = orderStatus == null || "".equals(orderStatus.trim()) ? null : orderStatus.trim();
	}

	public String getWriteoffFlag() {
		return writeoffFlag;
	}

	public void setWriteoffFlag(String writeoffFlag) {
		this.writeoffFlag = writeoffFlag == null || "".equals(writeoffFlag.trim()) ? null : writeoffFlag.trim();
	}

	public String getLinkPayNo() {
		return linkPayNo;
	}

	public void setLinkPayNo(String linkPayNo) {
		this.linkPayNo = linkPayNo == null || "".equals(linkPayNo.trim()) ? null : linkPayNo.trim();
	}

	public String getCreateUser() {
		return createUser;
	}

	public void setCreateUser(String createUser) {
		this.createUser = createUser == null || "".equals(createUser.trim()) ? null : createUser.trim();
	}

	public String getUpdateUser() {
		return updateUser;
	}

	public void setUpdateUser(String updateUser) {
		this.updateUser = updateUser == null || "".equals(updateUser.trim()) ? null : updateUser.trim();
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

	public Integer getMinBusTransDate() {
		return minBusTransDate;
	}

	public void setMinBusTransDate(Integer minBusTransDate) {
		this.minBusTransDate = minBusTransDate;
	}

	public Integer getMaxBusTransDate() {
		return maxBusTransDate;
	}

	public void setMaxBusTransDate(Integer maxBusTransDate) {
		this.maxBusTransDate = maxBusTransDate;
	}

	public Long getMinTranAmount() {
		return minTranAmount;
	}

	public void setMinTranAmount(Long minTranAmount) {
		this.minTranAmount = minTranAmount;
	}

	public Long getMaxTranAmount() {
		return maxTranAmount;
	}

	public void setMaxTranAmount(Long maxTranAmount) {
		this.maxTranAmount = maxTranAmount;
	}
	
}
