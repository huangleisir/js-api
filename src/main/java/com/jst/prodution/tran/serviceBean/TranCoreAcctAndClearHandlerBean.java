package com.jst.prodution.tran.serviceBean;

import com.jst.prodution.base.bean.BaseBean;

public class TranCoreAcctAndClearHandlerBean extends BaseBean {
	private static final long serialVersionUID = 1L;

    private String busNo;  //交易流水

    private String merchantExtenalNo;
    
    private String state; //'0-成功，1-支付中，4,关闭';

	public String getBusNo() {
		return busNo;
	}

	public void setBusNo(String busNo) {
		this.busNo = busNo;
	}

	public String getMerchantExtenalNo() {
		return merchantExtenalNo;
	}

	public void setMerchantExtenalNo(String merchantExtenalNo) {
		this.merchantExtenalNo = merchantExtenalNo;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

    
}
