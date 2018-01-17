/**
 * author:汤广海
 * 2016年10月8日
 * 下午5:25:36
 */
package com.jst.prodution.account.serviceBean;

import com.jst.prodution.base.bean.BaseBean;

/**
 * @author Administrator
 *
 */
public class AcctWithdrawBean extends BaseBean {

	private static final long serialVersionUID = 1L;
	//账户标识	必输	
	private String  acctId;
	//会员标识	必输	
	private String  userId;
	//会员姓名	可输	
	private String  userName;
	//业务来源	必输	（1-APP，2-OMS）
	private String  sourceFrom;
	//交易流水号	必输	业务系统流水号(交易核心为交易订单号)。
	private String  busNo;
	//支付流水号	必输	对账用（前置系统订单流水号）
	private String  payNo;
	//业务类型	必输	订单交易类型
	private String  busTranType;
	//操作类型	必输	操作类型(	1-正常，2-调账,3-冲正)
	private String  opertype;
	//交易日期	必输	8位整型，例如：20150409
	private Integer  busTransDate;
	//交易金额	必输	格式整数，单位为分
	private Long  tranAmount;
	//备注	必输	
	private String  remark;
	//对账客户标识	可输	
	private String  oppUserId;
	//对方账户号	可输	对方账户非会计内部账户（外部账户）必输
	private String  oppAcctid;
	//对方会员姓名	可输	
	private String  oppName;
	//操作用户	可输	
	private String  operUser;
	//账户交易流水号(输出)
	private String  tranId;	
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
	 * @return the userName
	 */
	public String getUserName() {
		return userName;
	}
	/**
	 * @param userName the userName to set
	 */
	public void setUserName(String userName) {
		this.userName = userName == null ? null : userName.trim();
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
	 * @return the operype
	 */
	public String getOpertype() {
		return opertype;
	}
	/**
	 * @param operype the operype to set
	 */
	public void setOpertype(String opertype) {
		this.opertype = opertype == null ? null : opertype.trim();
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
	 * @return the oppUserId
	 */
	public String getOppUserId() {
		return oppUserId;
	}
	/**
	 * @param oppUserId the oppUserId to set
	 */
	public void setOppUserId(String oppUserId) {
		this.oppUserId = oppUserId == null ? null : oppUserId.trim();
	}
	/**
	 * @return the oppAcctid
	 */
	public String getOppAcctid() {
		return oppAcctid;
	}
	/**
	 * @param oppAcctid the oppAcctid to set
	 */
	public void setOppAcctid(String oppAcctid) {
		this.oppAcctid = oppAcctid == null ? null : oppAcctid.trim();
	}
	/**
	 * @return the oppName
	 */
	public String getOppName() {
		return oppName;
	}
	/**
	 * @param oppName the oppName to set
	 */
	public void setOppName(String oppName) {
		this.oppName = oppName == null ? null : oppName.trim();
	}
	/**
	 * @return the opeUser
	 */
	public String getOperUser() {
		return operUser;
	}
	/**
	 * @param opeUser the operUser to set
	 */
	public void setOperUser(String operUser) {
		this.operUser = operUser == null ? null : operUser.trim();
	}

	/**
	 * @return the tranId
	 */
	public String getTranId() {
		return tranId;
	}
	/**
	 * @param tranId the tranId to set
	 */
	public void setTranId(String tranId) {
		this.tranId = tranId == null ? null : tranId.trim();
	}	
	/**
	 * @return the serialversionuid
	 */		
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
}
