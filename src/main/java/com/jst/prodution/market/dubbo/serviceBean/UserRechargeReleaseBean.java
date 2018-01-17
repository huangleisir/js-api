package com.jst.prodution.market.dubbo.serviceBean;



import com.jst.prodution.base.bean.BaseBean;

/**
 * 用户充值放弃支付
 * @author 
 *
 */
public class UserRechargeReleaseBean extends BaseBean{

	private static final long serialVersionUID = 1L;
	private String userId;			//会员ID
	private String activityId ;		//	String	Y	0代表当前无活动信息
	
	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getActivityId() {
		return activityId;
	}

	public void setActivityId(String activityId) {
		this.activityId = activityId;
	}

	
	
	
	
}
