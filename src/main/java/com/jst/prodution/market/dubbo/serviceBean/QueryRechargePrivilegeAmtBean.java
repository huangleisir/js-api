package com.jst.prodution.market.dubbo.serviceBean;

import com.jst.prodution.base.bean.BaseBean;


public class QueryRechargePrivilegeAmtBean extends BaseBean{

	private static final long serialVersionUID = 1L;
	private String userId;		//会员ID
	private String appId;		// appid
	private String activityId	; //String	Y	活动id，同请求
	private long rechargeAmt ; //	String	Y	充值金额，同请求,分
	private int isUse = 0 ;    //是否使用,0默认不使用,1使用,设置为使用后,用户参与活动次数加1
	private int expireMinute = 30 ;    //释放时间,单位分钟,没收到回调前默认30分钟后用户参与活动失败   ,当且仅当isUse=1是生效
	 private String payChannelId;// 支付渠道(微信支付-WeChat,支付宝支付-Alipay,捷易付-JYF) 
	
	//出参
	
	private String activityJoinNo	; //String	C	活动参与流水,isUse=1时有返回
	private long transferAmt ; //		String	Y	到账金额,分
	private long payAmt ;      //		String	Y	支付金额,分
	private long discountAmt ; //		String	Y	折扣金额,分
	
	private String favourForm;		//	String	Y	充值优惠形式1.满减2.满送
	
	private String calculateMode;		//	String  优惠计算方式1.赠送指定金额2.赠送指定比例
	
	private String calculateVal ;     //	String  优惠计算折扣值,分  calculateMode=2时,0.001代表千分之一
	
	private String merchantNo  ;   //活动成本承担商户号

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

	public long getRechargeAmt() {
		return rechargeAmt;
	}

	public void setRechargeAmt(long rechargeAmt) {
		this.rechargeAmt = rechargeAmt;
	}

	public int getIsUse() {
		return isUse;
	}

	public void setIsUse(int isUse) {
		this.isUse = isUse;
	}

	public int getExpireMinute() {
		return expireMinute;
	}

	public void setExpireMinute(int expireMinute) {
		this.expireMinute = expireMinute;
	}


	public String getActivityJoinNo() {
        return activityJoinNo;
    }

    public void setActivityJoinNo(String activityJoinNo) {
        this.activityJoinNo = activityJoinNo;
    }

    public long getTransferAmt() {
		return transferAmt;
	}

	public void setTransferAmt(long transferAmt) {
		this.transferAmt = transferAmt;
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

	public String getFavourForm() {
		return favourForm;
	}

	public void setFavourForm(String favourForm) {
		this.favourForm = favourForm;
	}

	public String getCalculateMode() {
		return calculateMode;
	}

	public void setCalculateMode(String calculateMode) {
		this.calculateMode = calculateMode;
	}

	public String getCalculateVal() {
		return calculateVal;
	}

	public void setCalculateVal(String calculateVal) {
		this.calculateVal = calculateVal;
	}

	public String getMerchantNo() {
		return merchantNo;
	}

	public void setMerchantNo(String merchantNo) {
		this.merchantNo = merchantNo;
	}

	public String getPayChannelId() {
		return payChannelId;
	}

	public void setPayChannelId(String payChannelId) {
		this.payChannelId = payChannelId;
	}
	
	
}
