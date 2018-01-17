package com.jst.prodution.acctfront.serviceBean;

import java.util.Date;
import java.util.List;

import com.jst.prodution.base.bean.BaseBean;

/**
 * @desc 提现支付订单流水查询Bean
 * @author junfu_yuan
 * @date 2016年10月10日
 */
public class AcctFrontCashWithdrawQueryListBean extends BaseBean {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	//------------------------------ 接口输入参数 begin ------------------------------
	private String busNo;// 交易流水号（交易系统流水号）
	private String busTranType;//业务类型（交易订单订单类型00-充值，01-提现）
	private String sourceFrom;//业务来源（1-APP，2-OMS）
	private String userId;//客户标识
	private String acctId;//账户标识
	private String acctName;//账户名
	private String acctType;//账户类型(01-基本户)
	private String channelCode;//提现渠道编码
	private String channelName;//提现渠道名称
	private Integer startBusTransDate;// 起始交易日期
	private Integer endBusTransDate;// 结束交易日期
	private String operUser;//操作人
	//------------------------------ 接口输入参数 end ------------------------------
	
	private String payNo;// 支付订单流水号
    private Long tranAmount;// 交易金额
    private Integer busTransDate;// 交易日期
    private String orderStatus;// 订单状态(0-成功，1-待处理，2-处理中，3-失败)
    private String writeoffFlag;// 被冲销标志（Y-已冲销，N-未冲销）
    private String linkPayNo;// 关联支付订单流水号
    private String createUser;// （系统默认“99”，其它为运营人员ID号）
    private String updateUser;// （系统默认“99”，其它为运营人员ID号）
	private String remark;// 备注
	private Date createTime;// 创建时间
	private Date updateTime;// 最后更新时间
	
	private List<AcctFrontCashWithdrawQueryListBean> list;
	
	public List<AcctFrontCashWithdrawQueryListBean> getList() {
		return list;
	}
	public void setList(List<AcctFrontCashWithdrawQueryListBean> list) {
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
	public Integer getStartBusTransDate() {
		return startBusTransDate;
	}
	public void setStartBusTransDate(Integer startBusTransDate) {
		this.startBusTransDate = startBusTransDate;
	}
	public Integer getEndBusTransDate() {
		return endBusTransDate;
	}
	public void setEndBusTransDate(Integer endBusTransDate) {
		this.endBusTransDate = endBusTransDate;
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
	public String getRemark() {
		return remark;
	}
	public void setRemark(String remark) {
		this.remark = remark == null || "".equals(remark.trim()) ? null : remark.trim();
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
