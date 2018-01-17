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
 * @Package: com.jst.prodution.member.model  
 * @ClassName: SignContractBean 
 * @Description: 银联银行卡签约bean
 *
 * @date: 2017年11月9日 下午2:18:42 
 * @version V1.0 
 */
public class SignContractBean extends BaseBean{

	private static final long serialVersionUID = 1L;
	  /**
	  * '签约号'
	  */
	  private String  signNo;
	  
	  /**
	   * '用户id',
	   */
	  private String userId;
	  
	  /**
	   * '业务系统id',
	   */
	  private String thirdUserId;
	  
	  /**
	   * 来源类型 （JTC）
	   */
	  private String regChannel ;
	  
	  /**
	   * appId
	   */
	  private String appId ;
	 
	  /**
	   * '商户id',
	   */
	  private String merchantId;
	  
	  /**
	   * 产品id(TC)
	   */
	  private String  productId ;
	  
	  /**
	   * '1捷易付 2银行卡 ',
	   */
	  private String signType ;
	  /**
	   * '1 签约中，2 已签约，3 签约失败 ，4 已解约',
	   */
	  private  String status ;
	  /**
	   * '01 身份证'
	   */
	  private String certType;
	  /**
	   * 证件号码
	   */
	  private String certNo;
	  /**
	   * '银行卡号'
	   */
	  private String bankCardNo; 
	   /**
	    * '银联token',
	    */
	  private String token ;  
	  /**
	   * '手机号码',
	   */
	  private String mobile ;
	  
	  /**
	   * '姓名',
	   */
	  private String name;
	  
	  /**
	   * 创建时间
	   */
	  private String createTime ;
	  
	  /**
	   * 签约时间
	   */
	  private String signTime ;
	  
	  /**
	   * 解约时间 
	   */
	  private String relieveTime;
	  
	  /**
	   * 页面地址
	   */
	  private String pageUrl ;
	  
	  /**
	   * 异步通知地址
	   */
	  private String notifyUrl;
	  
	  /**
		 * 协议开始时间
		 */
		private String protocolStartDate ;
		
		/**
		 * 协议结束时间  
		 */
		private String  protocolEndDate  ;
		
		/**
		 * 预留手机号码
		 */
		private String bankPhoneNo ;

	public String getSignNo() {
		return signNo;
	}

	public void setSignNo(String signNo) {
		this.signNo = signNo;
	}

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getThirdUserId() {
		return thirdUserId;
	}

	public void setThirdUserId(String thirdUserId) {
		this.thirdUserId = thirdUserId;
	}

	public String getMerchantId() {
		return merchantId;
	}

	public void setMerchantId(String merchantId) {
		this.merchantId = merchantId;
	}

	public String getProductId() {
		return productId;
	}

	public void setProductId(String productId) {
		this.productId = productId;
	}

	public String getSignType() {
		return signType;
	}

	public void setSignType(String signType) {
		this.signType = signType;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getCertType() {
		return certType;
	}

	public void setCertType(String certType) {
		this.certType = certType;
	}

	public String getCertNo() {
		return certNo;
	}

	public void setCertNo(String certNo) {
		this.certNo = certNo;
	}

	public String getBankCardNo() {
		return bankCardNo;
	}

	public void setBankCardNo(String bankCardNo) {
		this.bankCardNo = bankCardNo;
	}

	public String getToken() {
		return token;
	}

	public void setToken(String token) {
		this.token = token;
	}

	public String getMobile() {
		return mobile;
	}

	public void setMobile(String mobile) {
		this.mobile = mobile;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCreateTime() {
		return createTime;
	}

	public void setCreateTime(String createTime) {
		this.createTime = createTime;
	}

	public String getSignTime() {
		return signTime;
	}

	public void setSignTime(String signTime) {
		this.signTime = signTime;
	}

	public String getRelieveTime() {
		return relieveTime;
	}

	public void setRelieveTime(String relieveTime) {
		this.relieveTime = relieveTime;
	}

	public String getRegChannel() {
		return regChannel;
	}

	public void setRegChannel(String regChannel) {
		this.regChannel = regChannel;
	}

	public String getAppId() {
		return appId;
	}

	public void setAppId(String appId) {
		this.appId = appId;
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

	public String getBankPhoneNo() {
		return bankPhoneNo;
	}

	public void setBankPhoneNo(String bankPhoneNo) {
		this.bankPhoneNo = bankPhoneNo;
	}
	
	
}
