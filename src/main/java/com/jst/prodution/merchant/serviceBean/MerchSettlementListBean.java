package com.jst.prodution.merchant.serviceBean;

import java.util.List;

import com.jst.prodution.base.bean.BaseBean;

public class MerchSettlementListBean extends BaseBean{

	private static final long serialVersionUID = 1L;

	List<MerchSettlementBean> merchList;

	public List<MerchSettlementBean> getMerchList() {
		return merchList;
	}

	public void setMerchList(List<MerchSettlementBean> merchList) {
		this.merchList = merchList;
	}
	
}
