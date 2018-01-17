package com.jst.prodution.merchant.serviceBean;

import com.jst.prodution.base.bean.BaseBean;

/**
 * 商户审核时修改商户状态
 * @author 吴安辉
 *
 */
public class BindMerchantStateBean extends BaseBean {

	private static final long serialVersionUID = 1L;

	private String userId;			//商户ID
	
	private String state;			//状态

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}
	
}
