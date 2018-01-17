package com.jst.prodution.tobank.serviceBean;

import java.util.List;
import com.jst.prodution.base.bean.BaseBean;
import com.jst.prodution.payment.serviceBean.PayBankInfo;

/**
 * 账户余额查询
 * @author Administrator
 *
 */
public class AccBalanceSelBean extends BaseBean {
	private static final long serialVersionUID = 1L;

	private List<PayBankInfo> bankAccountList;		//银行账号列表，PayBankInfo银行名称及要查询的银行账号
	private List<AccBalanceBean> balanceList;		//账户余额列表
	
	private String balanceSum;						//余额汇总
	private String avaliBalanceSum;					//可用余额汇总
	private String accIntersetSum;					//账户利息汇总
	
	public List<PayBankInfo> getBankAccountList() {
		return bankAccountList;
	}
	public void setBankAccountList(List<PayBankInfo> bankAccountList) {
		this.bankAccountList = bankAccountList;
	}
	public List<AccBalanceBean> getBalanceList() {
		return balanceList;
	}
	public void setBalanceList(List<AccBalanceBean> balanceList) {
		this.balanceList = balanceList;
	}
	public String getBalanceSum() {
		return balanceSum;
	}
	public void setBalanceSum(String balanceSum) {
		this.balanceSum = balanceSum;
	}
	public String getAvaliBalanceSum() {
		return avaliBalanceSum;
	}
	public void setAvaliBalanceSum(String avaliBalanceSum) {
		this.avaliBalanceSum = avaliBalanceSum;
	}
	public String getAccIntersetSum() {
		return accIntersetSum;
	}
	public void setAccIntersetSum(String accIntersetSum) {
		this.accIntersetSum = accIntersetSum;
	}
}
