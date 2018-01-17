package com.jst.prodution.tran.serviceBean;

import java.util.Date;

import com.jst.prodution.base.bean.BaseBean;

public class TranCoreGrantALoanCallbackBean extends BaseBean {
	private static final long serialVersionUID = 1L;

	private String busNo;			//订单号	  	提现订单流水号			必输
	private String payNo;			//打款所产生的交易流水号			必输
	private String bankPayNo;	//银行处理流水号     //可输
	private Date tranTime;			//交易时间                                                              	可输
	private String payResult;		//打款结果：Y打款成功 N打款失败
	private String operUser;		//打款人      可输
	private String withDrawType;	//打款类型：01-个人提现 02-商户提现 03-理财回款 04-信贷放款 05-人工出款  06-收入出款 07-其他出款     必输
	private String payCoreRemark;	//付款失败原因   可输
	private String bankName;	//银行名称   必输
	private String bankCardNo;	//银行卡号   必输
	private String bankCode;	//银行编码   必输
	
	public String getPayNo() {
		return payNo;
	}
	public void setPayNo(String payNo) {
		this.payNo = payNo;
	}
	public String getBankPayNo() {
		return bankPayNo;
	}
	public void setBankPayNo(String bankPayNo) {
		this.bankPayNo = bankPayNo;
	}
	public String getOperUser() {
		return operUser;
	}
	public void setOperUser(String operUser) {
		this.operUser = operUser;
	}
	public String getBusNo() {
		return busNo;
	}
	public void setBusNo(String busNo) {
		this.busNo = busNo;
	}
	public Date getTranTime() {
		return tranTime;
	}
	public void setTranTime(Date tranTime) {
		this.tranTime = tranTime;
	}
	public String getPayResult() {
		return payResult;
	}
	public void setPayResult(String payResult) {
		this.payResult = payResult;
	}
	public String getWithDrawType() {
		return withDrawType;
	}
	public void setWithDrawType(String withDrawType) {
		this.withDrawType = withDrawType;
	}
	public String getPayCoreRemark() {
		return payCoreRemark;
	}
	public void setPayCoreRemark(String payCoreRemark) {
		this.payCoreRemark = payCoreRemark;
	}
	public String getBankName() {
		return bankName;
	}
	public void setBankName(String bankName) {
		this.bankName = bankName;
	}
	public String getBankCardNo() {
		return bankCardNo;
	}
	public void setBankCardNo(String bankCardNo) {
		this.bankCardNo = bankCardNo;
	}
	public String getBankCode() {
		return bankCode;
	}
	public void setBankCode(String bankCode) {
		this.bankCode = bankCode;
	}
	
}
