package com.jst.prodution.payment.model;

import java.util.Date;

/**
 * 付款中心审核记录
 * @author Administrator
 *
 */
public class PayReviewDetail implements java.io.Serializable{

	private static final long serialVersionUID = 1L;
	private String logId;				//记录ID
	private String payOrderId;			//付款订单ID
	private String reviewNode;			//审核节点：01一审 02二审
	private String creator;				//创建者（审核人）
	private String passFlag;			//是否通过:Y是 N否
	private String changeMsg;			//变更信息
	private String mark;				//备注
	private Date createTime;			//创建时间
	private String createTimeStr;		//创建时间（字符串类型）
	
	public String getLogId() {
		return logId;
	}
	public void setLogId(String logId) {
		this.logId = logId;
	}
	public String getPayOrderId() {
		return payOrderId;
	}
	public void setPayOrderId(String payOrderId) {
		this.payOrderId = payOrderId;
	}
	public String getReviewNode() {
		return reviewNode;
	}
	public void setReviewNode(String reviewNode) {
		this.reviewNode = reviewNode;
	}
	public String getCreator() {
		return creator;
	}
	public void setCreator(String creator) {
		this.creator = creator;
	}
	public String getPassFlag() {
		return passFlag;
	}
	public void setPassFlag(String passFlag) {
		this.passFlag = passFlag;
	}
	public String getChangeMsg() {
		return changeMsg;
	}
	public void setChangeMsg(String changeMsg) {
		this.changeMsg = changeMsg;
	}
	public String getMark() {
		return mark;
	}
	public void setMark(String mark) {
		this.mark = mark;
	}
	public Date getCreateTime() {
		return createTime;
	}
	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}
	public String getCreateTimeStr() {
		return createTimeStr;
	}
	public void setCreateTimeStr(String createTimeStr) {
		this.createTimeStr = createTimeStr;
	}

}
