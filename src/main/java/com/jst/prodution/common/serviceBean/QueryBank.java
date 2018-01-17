package com.jst.prodution.common.serviceBean;

import java.util.List;

import com.jst.prodution.base.bean.BaseBean;

/**
 * @author 彭则华
 * 银行名称模糊查询
 * */
public class QueryBank extends BaseBean{

	private static final long serialVersionUID = 1L;
	
	private List<BankModel> banks;

	public List<BankModel> getBanks() {
		return banks;
	}

	public void setBanks(List<BankModel> banks) {
		this.banks = banks;
	}
	
	
}
