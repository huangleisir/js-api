package com.jst.prodution.trade.serviceBean;

import com.jst.prodution.base.bean.BaseBean;

public class UserRechargeBean extends BaseBean {

	private static final long serialVersionUID = 1L;
	
	private String userFlag;			//用户标识 0个人 1商户
	private String userName;			//充值用户姓名
	private String userCode;			//充值用户账户
	private String bankNo;				//充值用户银行卡号
	private Long amount;				//充值金额
	private String systemCode;			//业务系统代号
	private String remark;				//描述
	private String orderNo;				//订单号
	private String bussOrderId;			//防重复标识，业务调用系统生成

	public String getUserFlag() {
		return userFlag;
	}
	public void setUserFlag(String userFlag) {
		this.userFlag = userFlag;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getUserCode() {
		return userCode;
	}
	public void setUserCode(String userCode) {
		this.userCode = userCode;
	}
	public String getBankNo() {
		return bankNo;
	}
	public void setBankNo(String bankNo) {
		this.bankNo = bankNo;
	}
	public Long getAmount() {
		return amount;
	}
	public void setAmount(Long amount) {
		this.amount = amount;
	}
	public String getSystemCode() {
		return systemCode;
	}
	public void setSystemCode(String systemCode) {
		this.systemCode = systemCode;
	}
	public String getRemark() {
		return remark;
	}
	public void setRemark(String remark) {
		this.remark = remark;
	}
	public String getOrderNo() {
		return orderNo;
	}
	public void setOrderNo(String orderNo) {
		this.orderNo = orderNo;
	}
	public String getBussOrderId() {
		return bussOrderId;
	}
	public void setBussOrderId(String bussOrderId) {
		this.bussOrderId = bussOrderId;
	}
	
}
