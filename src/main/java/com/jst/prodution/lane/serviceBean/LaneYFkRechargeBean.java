package com.jst.prodution.lane.serviceBean;

import com.jst.prodution.base.bean.BaseBean;

/**
 * 
* @ClassName: LaneFrontCardRechargeBean 
* @Description: TODO(对外暴露预付卡充值bean) 
* @author 曾传保
* @date 2017年11月7日 上午10:49:13 
*
 */
public class LaneYFkRechargeBean extends BaseBean{

	private static final long serialVersionUID = 1L;
	
	private String orderNo;//订单号
	
	public String getOrderNo() {
		return orderNo;
	}

	public void setOrderNo(String orderNo) {
		this.orderNo = orderNo;
	}

}
