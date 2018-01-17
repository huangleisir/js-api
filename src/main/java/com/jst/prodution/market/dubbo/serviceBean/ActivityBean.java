/*
* Copyright (c) 2015-2018 SHENZHEN JST SCIENCE AND TECHNOLOGY DEVELOP CO., LTD. All rights reserved.
*
* 注意：本内容仅限于深圳市捷顺金科研发有限公司内部传阅，禁止外泄以及用于其他的商业目的 
*/

package com.jst.prodution.market.dubbo.serviceBean;

import java.util.Date;
import java.util.List;

import com.jst.prodution.base.bean.BaseBean;

/**
 * 
 * @Package: com.jst.market.mgr.bean
 * @ClassName: MarketActivity
 * @Description: 营销活动bean
 *
 * @author: hewen
 * @date: 2017年6月22日 下午6:49:48
 * @version V1.0
 * 
 * 
 */
public class ActivityBean extends BaseBean {
	private static final long serialVersionUID = 1L;
	private String id; // 活动id
	private String ruleId; // 规则id
	private String activityName; // 营销活动名称
	private String startTimes;// 营销活动起始时间
	private String endTimes;// 营销活动终止时间
	private Date endTimesDate;// 营销活动终止时间
	private String businessType;// 营销活动业务类型（1.充值.2消费...）
	private int userMaxJoinTime; // 用户参与次数限制
	private int userDayMaxJoinTime;// 用户每日参与次数限制
	private String designatedPayChannel;// 1.捷易付（余额）2.捷易付（银行卡）3.捷易付（捷顺通卡）4.微信
										// 5.支付宝 6待拓展
	private String floatBarSwitch; // 浮条开关'
	private String floatBarText;// 浮条文案
	private String floatUrl; // 浮条链接
	private String marketActivityStatus;// (0未开始，1进行中，2已暂停，3已过期)
	private String merchantNo; // 活动成本承担商户号
	private Long marketBudget; // 营销总预算'
	private Long threshold; // 预算阈值'
	private String contact; // 告警联系电话
	private String createdBy; // 创建人
	private String createDate; // 创建时间
	private String updatedBy; // 更新人
	private String updateDate; // 更新时间
	private String auditedBy; // 审核人'
	private String auditDate; // 审核时间
	private int isDeleted; // 0:不删除 1:删除 默认为0'
	private String distriType; // 1:页面领用 2: 注册送 。（充值优惠关联页展示：直接投放）
	private String appId ;
	private List<ActivityBean> activityList;
	
	public Date getEndTimesDate() {
		return endTimesDate;
	}
	public void setEndTimesDate(Date endTimesDate) {
		this.endTimesDate = endTimesDate;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getRuleId() {
		return ruleId;
	}
	public void setRuleId(String ruleId) {
		this.ruleId = ruleId;
	}
	public String getActivityName() {
		return activityName;
	}
	public void setActivityName(String activityName) {
		this.activityName = activityName;
	}
	public String getStartTimes() {
		return startTimes;
	}
	public void setStartTimes(String startTimes) {
		this.startTimes = startTimes;
	}
	public String getEndTimes() {
		return endTimes;
	}
	public void setEndTimes(String endTimes) {
		this.endTimes = endTimes;
	}
	public String getBusinessType() {
		return businessType;
	}
	public void setBusinessType(String businessType) {
		this.businessType = businessType;
	}
	public int getUserMaxJoinTime() {
		return userMaxJoinTime;
	}
	public void setUserMaxJoinTime(int userMaxJoinTime) {
		this.userMaxJoinTime = userMaxJoinTime;
	}
	public int getUserDayMaxJoinTime() {
		return userDayMaxJoinTime;
	}
	public void setUserDayMaxJoinTime(int userDayMaxJoinTime) {
		this.userDayMaxJoinTime = userDayMaxJoinTime;
	}
	public String getDesignatedPayChannel() {
		return designatedPayChannel;
	}
	public void setDesignatedPayChannel(String designatedPayChannel) {
		this.designatedPayChannel = designatedPayChannel;
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
	public String getMarketActivityStatus() {
		return marketActivityStatus;
	}
	public void setMarketActivityStatus(String marketActivityStatus) {
		this.marketActivityStatus = marketActivityStatus;
	}
	public String getMerchantNo() {
		return merchantNo;
	}
	public void setMerchantNo(String merchantNo) {
		this.merchantNo = merchantNo;
	}
	public Long getMarketBudget() {
		return marketBudget;
	}
	public void setMarketBudget(Long marketBudget) {
		this.marketBudget = marketBudget;
	}
	public Long getThreshold() {
		return threshold;
	}
	public void setThreshold(Long threshold) {
		this.threshold = threshold;
	}
	public String getContact() {
		return contact;
	}
	public void setContact(String contact) {
		this.contact = contact;
	}
	public String getCreatedBy() {
		return createdBy;
	}
	public void setCreatedBy(String createdBy) {
		this.createdBy = createdBy;
	}
	public String getCreateDate() {
		return createDate;
	}
	public void setCreateDate(String createDate) {
		this.createDate = createDate;
	}
	public String getUpdatedBy() {
		return updatedBy;
	}
	public void setUpdatedBy(String updatedBy) {
		this.updatedBy = updatedBy;
	}
	public String getUpdateDate() {
		return updateDate;
	}
	public void setUpdateDate(String updateDate) {
		this.updateDate = updateDate;
	}
	public String getAuditedBy() {
		return auditedBy;
	}
	public void setAuditedBy(String auditedBy) {
		this.auditedBy = auditedBy;
	}
	public String getAuditDate() {
		return auditDate;
	}
	public void setAuditDate(String auditDate) {
		this.auditDate = auditDate;
	}
	public int getIsDeleted() {
		return isDeleted;
	}
	public void setIsDeleted(int isDeleted) {
		this.isDeleted = isDeleted;
	}
	public String getDistriType() {
		return distriType;
	}
	public void setDistriType(String distriType) {
		this.distriType = distriType;
	}
	public List<ActivityBean> getActivityList() {
		return activityList;
	}
	public void setActivityList(List<ActivityBean> activityList) {
		this.activityList = activityList;
	}
	public String getAppId() {
		return appId;
	}
	public void setAppId(String appId) {
		this.appId = appId;
	}
}
