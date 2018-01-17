package com.jst.prodution.common.serviceBean;

import java.util.List;

import com.jst.prodution.base.bean.BaseBean;
import com.jst.prodution.common.model.BanksModel;

public class BanksBean extends BaseBean{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private List<BanksModel> banksModel;
	public List<BanksModel> getBanksModel() {
		return banksModel;
	}
	public void setBanksModel(List<BanksModel> banksModel) {
		this.banksModel = banksModel;
	}
	
}
