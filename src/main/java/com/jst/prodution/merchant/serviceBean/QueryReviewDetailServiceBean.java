package com.jst.prodution.merchant.serviceBean;

import java.util.List;

import com.jst.prodution.base.bean.BaseBean;
import com.jst.prodution.merchant.model.ReviewDetail;

/**
 * 审核记录查询
 * @author 吴安辉
 *
 */
public class QueryReviewDetailServiceBean extends BaseBean {

	private static final long serialVersionUID = 1L;
	
	private String userId;			//商户ID
	private String state;			//状态：1审核通过 2驳回 3 不通过
	List<ReviewDetail> reviewList;	//审核记录结果
	
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
	public List<ReviewDetail> getReviewList() {
		return reviewList;
	}
	public void setReviewList(List<ReviewDetail> reviewList) {
		this.reviewList = reviewList;
	}
	
}
