package com.jst.prodution.merchant.serviceBean;

import com.jst.prodution.base.bean.BaseBean;

/**
 * 商户要求重新打款认证申请bean
 * @author Administrator
 *
 */
public class PayApplyBean extends BaseBean {
	
	private static final long serialVersionUID = 1L;
	
	private String userId;			//商户ID
	
	private String listId;			//清单ID

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getListId() {
		return listId;
	}

	public void setListId(String listId) {
		this.listId = listId;
	}

}
