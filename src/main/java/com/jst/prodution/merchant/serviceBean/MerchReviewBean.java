package com.jst.prodution.merchant.serviceBean;

import com.jst.prodution.base.bean.BaseBean;

/**
 * 商户审批
 * @author 吴安辉
 *
 */
public class MerchReviewBean extends BaseBean {

	private static final long serialVersionUID = 1L;
	private String userId;				//商户ID
	private String state;				//审核结果：1审核通过 2驳回 3 不通过 4 审核中 0 待审核
	private String offer;				//审核意见
	
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
	public String getOffer() {
		return offer;
	}
	public void setOffer(String offer) {
		this.offer = offer;
	}
	
}
