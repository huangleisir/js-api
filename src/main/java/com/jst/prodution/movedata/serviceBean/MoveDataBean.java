package com.jst.prodution.movedata.serviceBean;

import java.util.List;

import com.jst.prodution.base.bean.BaseBean;
import com.jst.prodution.movedata.model.UserInfoTb;

public class MoveDataBean extends BaseBean {
	
	@Override
	public String toString() {
		return "MoveDataBean [successList=" + successList + ", failList=" + failList + "]";
	}

	private List<UserInfoTb> successList;
	private List<UserInfoTb> failList;

	public List<UserInfoTb> getSuccessList() {
		return successList;
	}

	public void setSuccessList(List<UserInfoTb> successList) {
		this.successList = successList;
	}

	public List<UserInfoTb> getFailList() {
		return failList;
	}

	public void setFailList(List<UserInfoTb> failList) {
		this.failList = failList;
	}

}
