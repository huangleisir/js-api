package com.jst.prodution.merchant.serviceBean;

import com.jst.prodution.base.bean.BaseBean;

public class CheckEmailServiceBean extends BaseBean {

	private static final long serialVersionUID = 1L;
	
	private String email;		//邮箱

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

}
