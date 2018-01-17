package com.jst.prodution.lanefront.serviceBean;

import com.jst.prodution.base.bean.BaseBean;
import com.jst.prodution.lanefront.listbean.BankCardbinlistBean;



/**
 * 卡BIN查询
 * @author 
 *
 */
public class BankCardbinBean extends BaseBean {
	

	private static final long serialVersionUID = 1L;
	private String bankBin;  
	private BankCardbinlistBean bankCardbinlistBean;
	public String getBankBin() {
		return bankBin;
	}
	public void setBankBin(String bankBin) {
		this.bankBin = bankBin;
	}
	public BankCardbinlistBean getBankCardbinlistBean() {
		return bankCardbinlistBean;
	}
	public void setBankCardbinlistBean(BankCardbinlistBean bankCardbinlistBean) {
		this.bankCardbinlistBean = bankCardbinlistBean;
	}     


	
}
