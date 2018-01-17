package com.jst.prodution.market.dubbo.serviceBean;

import com.jst.prodution.base.bean.BaseBean;

/**
 * 
 * 
 * @Package: com.jst.prodution.market.dubbo.serviceBean
 * @ClassName: CouponUseBean
 * @Description: 优惠卷核销bean
 *
 * @author: lixin
 * @date: 2017年8月25日 上午10:43:40
 * @version V1.0
 */
public class CouponUseBean extends BaseBean {

    private static final long serialVersionUID = 1L;

    private String userId; // 会员ID

    private String appId; // appid

    private String activityId; // String Y 活动id，同请求

    // 出参
    private String activityJoinNo; // String C 活动参与流水,领取成功时有返回

    // 卷id，卷码
    private String couponId; // 优惠卷id
    
    /**
     * 订单金额
     */
    private long orderAmt ; //		String	Y	订单金额,分
    /**
     * 支付金额
     */
	private long payAmt ;      //		String	Y	实际支付金额,分
	/**
	 * 优惠金额
	 */
	private long discountAmt ; //		String	Y	优惠金额,分
	
	/**
	 * 订单编号
	 */
	private String orderNo;
	
	/**
	 * 领取用户手机号
	 */
	private String mobile;
	
	/**
	 * 渠道号
	 */
	
	private String regChannel;
	/**
	 * 商户营销账户号
	 */
	private String merchantNo;
	
	/**
	 * 订单失效时间 (format:yyyyMMddHHmmss) 在此时间之后查询，一定能返回成功或失败的状态
	 */
	private String orderExpireTime;

    /** 出参 执行结果  1.执行成功  0：执行失败 */
    private String execResult;
    /**
     * 单品标识id：双方约定
     */
    private String singleMarkId; 
   

    public String getSingleMarkId() {
		return singleMarkId;
	}

	public void setSingleMarkId(String singleMarkId) {
		this.singleMarkId = singleMarkId;
	}

	public String getOrderExpireTime() {
		return orderExpireTime;
	}

	public void setOrderExpireTime(String orderExpireTime) {
		this.orderExpireTime = orderExpireTime;
	}

	public String getOrderNo() {
		return orderNo;
	}

	public void setOrderNo(String orderNo) {
		this.orderNo = orderNo;
	}

	public String getMobile() {
		return mobile;
	}

	public void setMobile(String mobile) {
		this.mobile = mobile;
	}

	public String getRegChannel() {
		return regChannel;
	}

	public void setRegChannel(String regChannel) {
		this.regChannel = regChannel;
	}
	
	public String getMerchantNo() {
		return merchantNo;
	}

	public void setMerchantNo(String merchantNo) {
		this.merchantNo = merchantNo;
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

    public String getExecResult() {
        return execResult;
    }

    public void setExecResult(String execResult) {
        this.execResult = execResult;
    }

	public long getOrderAmt() {
		return orderAmt;
	}

	public void setOrderAmt(long orderAmt) {
		this.orderAmt = orderAmt;
	}

	public long getPayAmt() {
		return payAmt;
	}

	public void setPayAmt(long payAmt) {
		this.payAmt = payAmt;
	}

	public long getDiscountAmt() {
		return discountAmt;
	}

	public void setDiscountAmt(long discountAmt) {
		this.discountAmt = discountAmt;
	}

	@Override
	public String toString() {
		return "CouponUseBean [userId=" + userId + ", appId=" + appId + ", activityId=" + activityId
				+ ", activityJoinNo=" + activityJoinNo + ", couponId=" + couponId + ", orderAmt=" + orderAmt
				+ ", payAmt=" + payAmt + ", discountAmt=" + discountAmt + ", orderNo=" + orderNo + ", mobile=" + mobile
				+ ", regChannel=" + regChannel + ", merchantNo=" + merchantNo + ", execResult=" + execResult + "]";
	}
    
    

}
