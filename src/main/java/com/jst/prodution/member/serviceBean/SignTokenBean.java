/*
* Copyright (c) 2015-2018 SHENZHEN JST SCIENCE AND TECHNOLOGY DEVELOP CO., LTD. All rights reserved.
*
* 注意：本内容仅限于深圳市捷顺金科研发有限公司内部传阅，禁止外泄以及用于其他的商业目的 
*/
/*
* Copyright (c) 2016-2020 SHENZHEN JST SCIENCE AND TECHNOLOGY DEVELOP CO., LTD. All rights reserved.
*
* 注意：本内容仅限于深圳市捷顺金科研发有限公司内部传阅，禁止外泄以及用于其他的商业目的 
*/

package com.jst.prodution.member.serviceBean;

import com.jst.prodution.base.bean.BaseBean;

/** 
 * 
 * @Package: com.jst.prodution.member.serviceBean  
 * @ClassName: UpdateSignTokenBean 
 * @Description: 更新银联签约token bean
 *
 * @date: 2017年11月13日 上午9:55:06 
 * @version V1.0 
 */
public class SignTokenBean extends BaseBean{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * 签约号 
	 */
	private String signNo;
	
	/**
	 * appid
	 */
	private String appId;
	
	  /**
	   * '商户id',
	   */
	  private String merchantId;
	
	/**
	 * 银行账号 
	 */
	private String  bankCardNo;	
	/**
	 * token 
	 */
	private String token ;
	
	/**
	 * 1: 签约   2 解约   3 签约失败  4 未签约 
	 */
	private String status;
	
	/**
	 * 协议开始时间
	 */
	private String protocolStartDate ;
	
	/**
	 * 协议结束时间  
	 */
	private String  protocolEndDate  ;
	
	/**
	 * 页面url
	 */
	private String pageUrl;
	
	/**
	 * 异步通知url
	 */
	private String notifyUrl;
	
	/**
	 * userId
	 */
	private String userId;

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getSignNo() {
		return signNo;
	}

	public void setSignNo(String signNo) {
		this.signNo = signNo;
	}

	public String getToken() {
		return token;
	}

	public void setToken(String token) {
		this.token = token;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getProtocolStartDate() {
		return protocolStartDate;
	}

	public void setProtocolStartDate(String protocolStartDate) {
		this.protocolStartDate = protocolStartDate;
	}

	public String getProtocolEndDate() {
		return protocolEndDate;
	}

	public void setProtocolEndDate(String protocolEndDate) {
		this.protocolEndDate = protocolEndDate;
	}

	public String getPageUrl() {
		return pageUrl;
	}

	public void setPageUrl(String pageUrl) {
		this.pageUrl = pageUrl;
	}

	public String getNotifyUrl() {
		return notifyUrl;
	}

	public void setNotifyUrl(String notifyUrl) {
		this.notifyUrl = notifyUrl;
	}

	public String getBankCardNo() {
		return bankCardNo;
	}

	public void setBankCardNo(String bankCardNo) {
		this.bankCardNo = bankCardNo;
	}

	public String getAppId() {
		return appId;
	}

	public void setAppId(String appId) {
		this.appId = appId;
	}

	public String getMerchantId() {
		return merchantId;
	}

	public void setMerchantId(String merchantId) {
		this.merchantId = merchantId;
	}	
}
