package com.jst.prodution.market.dubbo.serviceBean;

import java.util.Date;

import com.jst.prodution.base.bean.BaseBean;


public class CouponUseCallbackBean extends BaseBean{

    private static final long serialVersionUID = 1L;

    /**  会员ID */
    private String userId; // 

    /** appid */
    private String appId; 
    
    /**  活动id，同请求 */
    private String activityId; // String Y 

    /**  活动参与流水,领取成功时有返回  */
    private String activityJoinNo; 

    /**  卷id，卷码,优惠卷id */
    private String couponId;
     
    /** 优惠卷使用结果   1.使用成功   0.使用失败 */
    private String useResult;
    
    private String execResult;
    
    /**
     * 订单号
     */
    private String orderNo;
    
    

    public String getOrderNo() {
		return orderNo;
	}

	public void setOrderNo(String orderNo) {
		this.orderNo = orderNo;
	}

	public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getAppId() {
        return appId;
    }

    public void setAppId(String appId) {
        this.appId = appId;
    }

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

    public String getCouponId() {
        return couponId;
    }

    public void setCouponId(String couponId) {
        this.couponId = couponId;
    }

    public String getUseResult() {
        return useResult;
    }

    public void setUseResult(String useResult) {
        this.useResult = useResult;
    }

    public String getExecResult() {
        return execResult;
    }

    public void setExecResult(String execResult) {
        this.execResult = execResult;
    }

	@Override
	public String toString() {
		return "CouponUseCallbackBean [userId=" + userId + ", appId=" + appId + ", activityId=" + activityId
				+ ", activityJoinNo=" + activityJoinNo + ", couponId=" + couponId + ", useResult=" + useResult
				+ ", execResult=" + execResult + ", orderNo=" + orderNo + "]";
	}
    

}
