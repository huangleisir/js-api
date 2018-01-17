package com.jst.prodution.market.dubbo.serviceBean;

import com.jst.prodution.base.bean.BaseBean;

public class QueryRedPacketBean extends BaseBean {
  /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
private String redPacketActStatus = "0";

public String getRedPacketActStatus() {
	return redPacketActStatus;
}

public void setRedPacketActStatus(String redPacketActStatus) {
	this.redPacketActStatus = redPacketActStatus;
}
  
}
