package com.jst.prodution.payment.serviceBean;

import java.util.List;

import com.jst.prodution.base.bean.BaseBean;

/**
 * 查询支持银行列表及账号bean
 * @author Administrator
 *
 */
public class PayAccountQueryBean extends BaseBean {

	private static final long serialVersionUID = 1L;
	
	private String payType;						//付款类型
	private List<PayBankInfo> bankList;			//银行列表
	
	public String getPayType() {
		return payType;
	}
	public void setPayType(String payType) {
		this.payType = payType;
	}
	public List<PayBankInfo> getBankList() {
		return bankList;
	}
	public void setBankList(List<PayBankInfo> bankList) {
		this.bankList = bankList;
	}

}
