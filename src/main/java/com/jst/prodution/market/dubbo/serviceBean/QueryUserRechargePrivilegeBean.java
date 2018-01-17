package com.jst.prodution.market.dubbo.serviceBean;

import java.util.List;

import com.jst.prodution.base.bean.BaseBean;
import com.jst.prodution.market.dubbo.model.RechargeItem;

/**
 * 会员注册
 * @author liang
 *
 */
public class QueryUserRechargePrivilegeBean extends BaseBean{

	private static final long serialVersionUID = 1L;
	private String userId;			//会员ID
	private String appId;		// appid
	private String appKey;		// appkey
	
	private String activityId = "0";		//	String	Y	0代表当前无活动信息
	private String favourForm;		//	String	Y	充值优惠形式1.满减2.满送
	private List<RechargeItem> rechargeItem;		//	List<RechargeItem>	Y	充值项列表
	private List<String> activityChannel;		//	List<String>	Y	空则为所有支付渠道，[“JYF”,”Weichat”]
	private String floatBarSwitch;		//	String	Y	浮条开关
	private String floatBarText	;		//		浮条文案
	private String floatUrl	;		//		浮条链接
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
	public String getAppKey() {
		return appKey;
	}
	public void setAppKey(String appKey) {
		this.appKey = appKey;
	}
	public String getActivityId() {
		return activityId;
	}
	public void setActivityId(String activityId) {
		this.activityId = activityId;
	}
	public String getFavourForm() {
		return favourForm;
	}
	public void setFavourForm(String favourForm) {
		this.favourForm = favourForm;
	}
	public List<RechargeItem> getRechargeItem() {
		return rechargeItem;
	}
	public void setRechargeItem(List<RechargeItem> rechargeItem) {
		this.rechargeItem = rechargeItem;
	}
	public List<String> getActivityChannel() {
		return activityChannel;
	}
	public void setActivityChannel(List<String> activityChannel) {
		this.activityChannel = activityChannel;
	}
	public String getFloatBarSwitch() {
		return floatBarSwitch;
	}
	public void setFloatBarSwitch(String floatBarSwitch) {
		this.floatBarSwitch = floatBarSwitch;
	}
	public String getFloatBarText() {
		return floatBarText;
	}
	public void setFloatBarText(String floatBarText) {
		this.floatBarText = floatBarText;
	}
	public String getFloatUrl() {
		return floatUrl;
	}
	public void setFloatUrl(String floatUrl) {
		this.floatUrl = floatUrl;
	}

	
	
	
}
