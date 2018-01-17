/**
 * author:汤广海
 * 2016年10月10日
 * 下午6:10:14
 */
package com.jst.prodution.acctfront.serviceBean;

import java.util.List;

import com.jst.prodution.base.bean.BaseBean;

/**
 * @author Administrator
 *
 */
public class AcctFrontRechargeQueryListBean extends BaseBean {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private String busNo; // 交易订单流水号
	private String busTranType;// 业务类型
	private String sourceFrom; // 业务来源
	private String userId; // 客户标识
	private String acctId; // 账户标识
	private String acctName; // 账户名称
	private String acctType; // 账户类型
	private String channelCode;// 渠道编码
	private String channelName; // 渠道名称
	private Long tranAmount;// 交易金额
	private Integer busTransDate;// 交易日期
	private String orderStatus;// 订单状态(0-成功，1-待处理，2-处理中，3-失败)
	private String writeoffFlag;// 被冲销标志(Y-已冲销，N-未冲销)
	private String remark; // 备注
	private String operUser; // 操作人
	private String payNo; // 支付订单流水号
	private List<AcctFrontRechargeBean> acctFrontRechargeBeanList;

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

	public String getChannelCode() {
		return channelCode;
	}

	public void setChannelCode(String channelCode) {
		this.channelCode = channelCode == null || "".equals(channelCode.trim()) ? null : channelCode.trim();
	}

	public String getChannelName() {
		return channelName;
	}

	public void setChannelName(String channelName) {
		this.channelName = channelName == null || "".equals(channelName.trim()) ? null : channelName.trim();
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

	public String getRemark() {
		return remark;
	}

	public void setRemark(String remark) {
		this.remark = remark == null || "".equals(remark.trim()) ? null : remark.trim();
	}

	public String getOperUser() {
		return operUser;
	}

	public void setOperUser(String operUser) {
		this.operUser = operUser == null || "".equals(operUser.trim()) ? null : operUser.trim();
	}

	public String getPayNo() {
		return payNo;
	}

	public void setPayNo(String payNo) {
		this.payNo = payNo == null || "".equals(payNo.trim()) ? null : payNo.trim();
	}

	/**
	 * @return the orderStatus
	 */
	public String getOrderStatus() {
		return orderStatus;
	}

	/**
	 * @param orderStatus
	 *            the orderStatus to set
	 */
	public void setOrderStatus(String orderStatus) {
		this.orderStatus = orderStatus == null || "".equals(orderStatus.trim()) ? null : orderStatus.trim();
	}

	/**
	 * @return the writeoffFlag
	 */
	public String getWriteoffFlag() {
		return writeoffFlag;
	}

	/**
	 * @param writeoffFlag
	 *            the writeoffFlag to set
	 */
	public void setWriteoffFlag(String writeoffFlag) {
		this.writeoffFlag = writeoffFlag == null || "".equals(writeoffFlag.trim()) ? null : writeoffFlag.trim();
	}

	/**
	 * @return the acctFrontRechargeBeanList
	 */
	public List<AcctFrontRechargeBean> getAcctFrontRechargeBeanList() {
		return acctFrontRechargeBeanList;
	}

	/**
	 * @param acctFrontRechargeBeanList the acctFrontRechargeBeanList to set
	 */
	public void setAcctFrontRechargeBeanList(List<AcctFrontRechargeBean> acctFrontRechargeBeanList) {
		this.acctFrontRechargeBeanList = acctFrontRechargeBeanList;
	}
}