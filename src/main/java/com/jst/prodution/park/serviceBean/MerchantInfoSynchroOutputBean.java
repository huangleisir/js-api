package com.jst.prodution.park.serviceBean;

import com.jst.prodution.base.bean.BaseBean;

public class MerchantInfoSynchroOutputBean extends BaseBean{
	
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String resultcode;         //0000：成功,0001：失败

	public String getResultcode() {
		return resultcode;
	}

	public void setResultcode(String resultcode) {
		this.resultcode = resultcode;
	}


}
