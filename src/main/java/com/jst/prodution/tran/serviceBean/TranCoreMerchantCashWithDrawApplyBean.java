package com.jst.prodution.tran.serviceBean;

import java.util.Date;

import com.jst.prodution.base.bean.BaseBean;

public class TranCoreMerchantCashWithDrawApplyBean extends BaseBean {
	private static final long serialVersionUID = 1L;
	/**
	 * 输入
	 */
	private String userId;				//用户标识  					必输
	private String userType;			//用户类型						必输
	private String payPwd;				//支付密码  					必输
	private String userName;			//用户名称  			                        必输
	private Long amount;				//提现金额  					必输
	private String bankCardNo;			//银行账号  	提现使用的银行卡号	必输
	private String openBankName;				//银行分行机构	  		必输
	private String bankCardCode;		//开户银行编号                                            必输 
	private String operUser;			//操作人					  可输
    private String sourceFrom;			//业务来源1-APP，2-OMS      必输
	private Date applyTime;			//发起时间  					  可输
	private String isFreePwd;			//是否支持免密（密文）0:是 1：否 	  必输
	private String remark;				//备注	  				  可输
	private String bankName;				//银行名称	  			  必输
	private String receiveName;				//收款人姓名	  		  必输
	private String paymentType;		//出款类型：(//付款类型：01个人提现 02商户提现 03理财回款 04信贷放款 05人工出款 06 收入出款  07打款验证 08-营销放款 09-其他出款) 必输

	
	/**
	 * 输出
	 */
	private String busNo;			//订单号	  	交易产生的提现订单号		输出
	private String status;			//提现订单状态		输出
    private Date createTime;       	//订单创建时间 		输出

	

	public String getOpenBankName() {
		return openBankName;
	}

	public void setOpenBankName(String openBankName) {
		this.openBankName = openBankName;
	}

	public String getBankCardCode() {
		return bankCardCode;
	}

	public void setBankCardCode(String bankCardCode) {
		this.bankCardCode = bankCardCode;
	}

	public String getBankName() {
		return bankName;
	}

	public void setBankName(String bankName) {
		this.bankName = bankName;
	}

	public String getOperUser() {
		return operUser;
	}

	public void setOperUser(String operUser) {
		this.operUser = operUser;
	}

	public String getPaymentType() {
		return paymentType;
	}

	public void setPaymentType(String paymentType) {
		this.paymentType = paymentType;
	}

	public String getPayPwd() {
		return payPwd;
	}

	public void setPayPwd(String payPwd) {
		this.payPwd = payPwd;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getUserType() {
		return userType;
	}

	public void setUserType(String userType) {
		this.userType = userType;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public Date getCreateTime() {
		return createTime;
	}

	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}

	public String getIsFreePwd() {
		return isFreePwd;
	}

	public void setIsFreePwd(String isFreePwd) {
		this.isFreePwd = isFreePwd;
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

	public String getBankCardNo() {
		return bankCardNo;
	}

	public void setBankCardNo(String bankCardNo) {
		this.bankCardNo = bankCardNo;
	}

	public Long getAmount() {
		return amount;
	}

	public void setAmount(Long amount) {
		this.amount = amount;
	}


	public String getRemark() {
		return remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}

	public String getBusNo() {
		return busNo;
	}

	public void setBusNo(String busNo) {
		this.busNo = busNo;
	}

	public Date getApplyTime() {
		return applyTime;
	}

	public void setApplyTime(Date applyTime) {
		this.applyTime = applyTime;
	}

	public String getReceiveName() {
		return receiveName;
	}

	public void setReceiveName(String receiveName) {
		this.receiveName = receiveName;
	}
	
}
