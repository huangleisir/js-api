package com.jst.prodution.settlement.serviceBean;

import com.jst.prodution.base.bean.BaseBean;

import java.util.Date;

public class BankRtnRltBean extends BaseBean {


    /**
	 * 
	 */
    	private static final long serialVersionUID = 1L;


		private String payedFlag;//01--成功 02--失败

		private String payNo;//订单号	  	交易产生的提现订单号		输出

	public String getPayedFlag() {
		return payedFlag;
	}

	public void setPayedFlag(String payedFlag) {
		this.payedFlag = payedFlag;
	}

	public String getPayNo() {
		return payNo;
	}

	public void setPayNo(String payNo) {
		this.payNo = payNo;
	}

}
