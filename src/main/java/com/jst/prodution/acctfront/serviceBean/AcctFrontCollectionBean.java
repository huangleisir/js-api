/**
 * author:汤广海
 * 2016年10月10日
 * 下午6:10:14
 */
package com.jst.prodution.acctfront.serviceBean;

import com.jst.prodution.base.bean.BaseBean;

/**
 * @author Administrator
 *
 */
public class AcctFrontCollectionBean extends BaseBean {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private String busNo; // 交易订单流水号
	private String busTranType;// 业务类型   代扣： 07 ，微信扫码支付：20 ，微信公众号支付：21
	private String sourceFrom; // 业务来源
	private String userId; // 客户标识
//	private String acctId; // 账户标识（快钱待清算账户）
//	private String acctName; // 账户名称
//	private String acctType; // 账户类型
	private String merchantMemberId;//商户用户标识  必输
	private String channelNo;// 渠道流水号
	private String channelCode;// 渠道编码(微信支付-WeChat,支付宝支付-Alipay,快钱-KQ,预付卡-YFK,余额-BAL,CLOUD-云平台)
	private String channelName; // 渠道名称
	private Long tranAmount;// 交易金额
	private Integer busTransDate;// 交易日期
	private String orderStatus;// 订单状态(0-成功，1-待处理，2-处理中，3-失败)
	private String writeoffFlag;// 被冲销标志(Y-已冲销，N-未冲销)
	private String remark; // 备注
	private String operUser; // 操作人
	private String payNo; // 支付订单流水号
	private String bankcardNo;//银行卡号
	private String limtAmtFlag;//限额标识(限额标识0-限额，1-不限额)
	private Integer cutDate;//日切

	private String oppUserId;// 对方客户标识,客户ID(会员号) 
	private String oppAcctId;// 对方账户标识,会员账户系统中所对应的账号
	private String oppAcctName;// 对方账户名称,账户真实姓名 
	private String oppAcctType;// 对方账户类型(01-基本户)
	
	public String getBusNo() {
		return busNo;
	}

	public void setBusNo(String busNo) {
		this.busNo = busNo == null ? null : busNo.trim();
	}

	public String getMerchantMemberId() {
		return merchantMemberId;
	}

	public void setMerchantMemberId(String merchantMemberId) {
		this.merchantMemberId = merchantMemberId;
	}

	public String getBusTranType() {
		return busTranType;
	}

	public void setBusTranType(String busTranType) {
		this.busTranType = busTranType == null ? null : busTranType.trim();
	}

	public String getSourceFrom() {
		return sourceFrom;
	}

	public void setSourceFrom(String sourceFrom) {
		this.sourceFrom = sourceFrom == null ? null : sourceFrom.trim();
	}

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId == null ? null : userId.trim();
	}

	public String getChannelNo() {
		return channelNo;
	}

	public void setChannelNo(String channelNo) {
		this.channelNo = channelNo == null ? null : channelNo.trim();
	}

	public String getChannelCode() {
		return channelCode;
	}

	public void setChannelCode(String channelCode) {
		this.channelCode = channelCode == null ? null : channelCode.trim();
	}

	public String getChannelName() {
		return channelName;
	}

	public void setChannelName(String channelName) {
		this.channelName = channelName == null ? null : channelName.trim();
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
		this.remark = remark == null ? null : remark.trim();
	}

	public String getOperUser() {
		return operUser;
	}

	public void setOperUser(String operUser) {
		this.operUser = operUser == null ? null : operUser.trim();
	}

	public String getPayNo() {
		return payNo;
	}

	public void setPayNo(String payNo) {
		this.payNo = payNo == null ? null : payNo.trim();
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
		this.orderStatus = orderStatus == null ? null : orderStatus.trim();
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
		this.writeoffFlag = writeoffFlag == null ? null : writeoffFlag.trim();
	}

	public String getBankcardNo() {
		return bankcardNo;
	}

	public void setBankcardNo(String bankcardNo) {
		this.bankcardNo = bankcardNo;
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
}
