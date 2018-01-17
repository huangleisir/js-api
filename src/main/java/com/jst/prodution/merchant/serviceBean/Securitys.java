package com.jst.prodution.merchant.serviceBean;

import java.util.List;

import com.jst.prodution.base.bean.BaseBean;

public class Securitys extends BaseBean{

	private static final long serialVersionUID = 1L;
	private List<SecurityBean> securitys;
	public List<SecurityBean> getSecuritys() {
		return securitys;
	}
	public void setSecuritys(List<SecurityBean> securitys) {
		this.securitys = securitys;
	}
	
}
