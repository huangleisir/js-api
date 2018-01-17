package com.jst.prodution.market.dubbo.serviceBean;

import com.jst.prodution.base.bean.BaseBean;


public class ActivityJoinCallbackBean extends BaseBean{

	private static final long serialVersionUID = 1L;
	
	private String activityId	; //String	Y	活动id，
	
	private String activityJoinNo ; //String	Y 活动参与流水,
	
	private int status = 0 ;    //活动参与状态,0参与失败,1参与成功
	
	private Integer versionNo ;     //更新版本号

	public String getActivityId() {
		return activityId;
	}

	public void setActivityId(String activityId) {
		this.activityId = activityId;
	}

	public String getActivityJoinNo() {
		return activityJoinNo;
	}

	public void setActivityJoinNo(String activityJoinNo) {
		this.activityJoinNo = activityJoinNo;
	}

	public int getStatus() {
		return status;
	}

	public void setStatus(int status) {
		this.status = status;
	}

	public Integer getVersionNo() {
		return versionNo;
	}

	public void setVersionNo(Integer versionNo) {
		this.versionNo = versionNo;
	}

	@Override
	public String toString() {
		return "ActivityJoinCallbackBean [activityId=" + activityId + ", activityJoinNo=" + activityJoinNo + ", status="
				+ status + ", versionNo=" + versionNo + "]";
	}

	

}
