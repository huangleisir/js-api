package com.jst.prodution.cashdesk.serviceBean;

import java.util.List;

import com.jst.prodution.base.bean.BaseBean;
import com.jst.prodution.cashdesk.listBean.CashDeskSignBBean;

public class CashDeskPayCardListSignBEditBean extends BaseBean {
	private static final long serialVersionUID = 1L;
    private String merchantId;//商户号

	private List<CashDeskSignBBean> cashDeskSignBBeanList;

	public String getMerchantId() {
		return merchantId;
	}

	public void setMerchantId(String merchantId) {
		this.merchantId = merchantId;
	}

	public List<CashDeskSignBBean> getCashDeskSignBBeanList() {
		return cashDeskSignBBeanList;
	}

	public void setCashDeskSignBBeanList(List<CashDeskSignBBean> cashDeskSignBBeanList) {
		this.cashDeskSignBBeanList = cashDeskSignBBeanList;
	}
	
}