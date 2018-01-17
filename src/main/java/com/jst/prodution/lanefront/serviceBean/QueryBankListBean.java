package com.jst.prodution.lanefront.serviceBean;

import java.util.List;

import com.jst.prodution.base.bean.BaseBean;
import com.jst.prodution.lanefront.listbean.BankCardListBean;

/**
 * 银行卡列表bean
 * @author Administrator
 *
 */
public class QueryBankListBean extends BaseBean {
	private static final long serialVersionUID = 1L;
	
	private String cardType;						//银行卡类型:01借记卡 02贷记卡
	private String dbFlag;							//平台支持标记：0支持  1不支持
	private List<BankCardListBean> bankCardList;	//银行卡列表

	public String getCardType() {
		return cardType;
	}

	public void setCardType(String cardType) {
		this.cardType = cardType;
	}

	public String getDbFlag() {
		return dbFlag;
	}

	public void setDbFlag(String dbFlag) {
		this.dbFlag = dbFlag;
	}

	public List<BankCardListBean> getBankCardList() {
		return bankCardList;
	}

	public void setBankCardList(List<BankCardListBean> bankCardList) {
		this.bankCardList = bankCardList;
	}
	
}
