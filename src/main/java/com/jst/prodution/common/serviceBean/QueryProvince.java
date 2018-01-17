package com.jst.prodution.common.serviceBean;

import java.util.List;

import com.jst.prodution.base.bean.BaseBean;


public class QueryProvince extends BaseBean{

	private static final long serialVersionUID = 1L;
	
	private List<ProvinceModel> proList;

	public List<ProvinceModel> getProList() {
		return proList;
	}

	public void setProList(List<ProvinceModel> pros) {
		this.proList = pros;
	}
}
