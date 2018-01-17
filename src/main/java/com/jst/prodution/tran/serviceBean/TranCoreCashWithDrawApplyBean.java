package com.jst.prodution.tran.serviceBean;

import com.jst.prodution.base.bean.BaseBean;

public class TranCoreCashWithDrawApplyBean extends BaseBean {
	private static final long serialVersionUID = 1L;

	private String userId;			//用户标识  					必输
	private String bankCardNo;		//银行账号  	提现使用的银行卡号	必输
	private String bankCardSuf;      //卡号后四位                                                       必输
	private Long amount;			//提现金额  	提现金额			必输
	private String operUser;		//操作人	  					可输
	private String remark;			//备注	  					可输
    private String sourceFrom;		//业务来源	          				    
	private String busNo;			//订单号	  	交易产生的订单号		输出

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

	public String getOperUser() {
		return operUser;
	}

	public void setOperUser(String operUser) {
		this.operUser = operUser;
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
	/**
	 * @return the bankCardSuf
	 */
	public String getBankCardSuf() {
		return bankCardSuf;
	}

	/**
	 * @param bankCardSuf the bankCardSuf to set
	 */
	public void setBankCardSuf(String bankCardSuf) {
		this.bankCardSuf = bankCardSuf;
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
		this.sourceFrom = sourceFrom;
	}	
}
