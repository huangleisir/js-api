package com.jst.prodution.market.dubbo.serviceBean;

import java.util.List;

import com.jst.prodution.base.bean.BaseBean;

public class BannerBean extends BaseBean{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private String id; // 记录ID
	private String appId; // 记录ID
	private String activityId; //活动id
	private String bannerName; //banner名称
	private String bannerImgUrl; //banner图片地址
	private String bannerOrder; //banner图片排序
	private String bannerUrl; //活动领券···URL
	private String startTime; //活动开始时间
	private String endTime; //活动结束时间
	private String isLogin; //0 不用登陆；1必须登陆
	private String platformType; //平台类型
	private String jumpType; //跳转类型1内部2外部
	private String isRelateAct; //是否关联营销活动1关联 2不关联
	
	private List<BannerBean> bannerList;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
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

	public String getBannerName() {
		return bannerName;
	}

	public void setBannerName(String bannerName) {
		this.bannerName = bannerName;
	}

	public String getBannerImgUrl() {
		return bannerImgUrl;
	}

	public void setBannerImgUrl(String bannerImgUrl) {
		this.bannerImgUrl = bannerImgUrl;
	}

	public String getBannerOrder() {
		return bannerOrder;
	}

	public void setBannerOrder(String bannerOrder) {
		this.bannerOrder = bannerOrder;
	}

	public String getBannerUrl() {
		return bannerUrl;
	}

	public void setBannerUrl(String bannerUrl) {
		this.bannerUrl = bannerUrl;
	}

	public String getStartTime() {
		return startTime;
	}

	public void setStartTime(String startTime) {
		this.startTime = startTime;
	}

	public String getEndTime() {
		return endTime;
	}

	public void setEndTime(String endTime) {
		this.endTime = endTime;
	}

	public List<BannerBean> getBannerList() {
		return bannerList;
	}

	public void setBannerList(List<BannerBean> bannerList) {
		this.bannerList = bannerList;
	}

	public String getIsLogin() {
		return isLogin;
	}

	public void setIsLogin(String isLogin) {
		this.isLogin = isLogin;
	}

	public String getPlatformType() {
		return platformType;
	}

	public void setPlatformType(String platformType) {
		this.platformType = platformType;
	}

    public String getJumpType() {
        return jumpType;
    }

    public void setJumpType(String jumpType) {
        this.jumpType = jumpType;
    }

    public String getIsRelateAct() {
        return isRelateAct;
    }

    public void setIsRelateAct(String isRelateAct) {
        this.isRelateAct = isRelateAct;
    }
	
}
