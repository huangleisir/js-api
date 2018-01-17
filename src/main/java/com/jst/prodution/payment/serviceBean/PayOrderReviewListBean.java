package com.jst.prodution.payment.serviceBean;

import java.util.List;

import com.jst.prodution.base.bean.BaseBean;
import com.jst.prodution.payment.model.PayReviewDetail;

/**
 * 查询付款订单审核记录bean
 * @author Administrator
 *
 */
public class PayOrderReviewListBean extends BaseBean {

	private static final long serialVersionUID = 1L;

	private String payOrderId;
	private List<PayReviewDetail> reviewList;
	
	public String getPayOrderId() {
		return payOrderId;
	}
	public void setPayOrderId(String payOrderId) {
		this.payOrderId = payOrderId;
	}
	public List<PayReviewDetail> getReviewList() {
		return reviewList;
	}
	public void setReviewList(List<PayReviewDetail> reviewList) {
		this.reviewList = reviewList;
	}
	
}
