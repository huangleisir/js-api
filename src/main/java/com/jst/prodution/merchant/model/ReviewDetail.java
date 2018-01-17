package com.jst.prodution.merchant.model;

/**
 * 审核记录信息表
 * @author 吴安辉
 *
 */
public class ReviewDetail implements java.io.Serializable{

	private static final long serialVersionUID = 1L;
	private String logId;				//记录ID
	private String userId;				//商户ID
	private String reviewer;			//审核人
	private String state;				//审核结果：1审核通过 2驳回 3 不通过
	private String offer;				//审核意见
	private String createTime;			//审核时间
	
	public String getLogId() {
		return logId;
	}
	public void setLogId(String logId) {
		this.logId = logId;
	}
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public String getReviewer() {
		return reviewer;
	}
	public void setReviewer(String reviewer) {
		this.reviewer = reviewer;
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
	public String getCreateTime() {
		return createTime;
	}
	public void setCreateTime(String createTime) {
		this.createTime = createTime;
	}

}
