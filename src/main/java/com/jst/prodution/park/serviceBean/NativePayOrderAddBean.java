/*
* Copyright (c) 2015-2018 SHENZHEN GUIYI SCIENCE AND TECHNOLOGY DEVELOP CO., LTD. All rights reserved.
*
* 注意：本内容仅限于深圳市捷顺金科研发有限公司内部传阅，禁止外泄以及用于其他的商业目的 
*/
package com.jst.prodution.park.serviceBean;

import com.jst.prodution.base.bean.BaseBean;

public class NativePayOrderAddBean extends BaseBean {
    /**
     * 扫码支付下单接口bean
     */
    private static final long serialVersionUID = 1L;

    private String orderId ;//订单号  必输
    
    private String merchantId ;// 商户号  必输
    
    private String trdParkpayssn ;  // 支付请求流水  必输
    
    private String amt ;    //金额  必输
    
    private  String payChannel ; // WeChat	微信支付  JYF	捷易付  Alipay	支付宝支付

    private String subject ;//标题 必输
    
    private String description ;//详情  必输
    
    //输出
    private String codeUrl	; //    Y	二维码字符串——用来给个人扫码使用
    
    private String prePayId	; //    	Y	预支付id
    
    private String createTime	; //    	Y	20170522190539
    
    private String expireTime	; //    	Y	20170522191539

	public String getOrderId() {
		return orderId;
	}

	public void setOrderId(String orderId) {
		this.orderId = orderId;
	}

	public String getMerchantId() {
		return merchantId;
	}

	public void setMerchantId(String merchantId) {
		this.merchantId = merchantId;
	}

	public String getTrdParkpayssn() {
		return trdParkpayssn;
	}

	public void setTrdParkpayssn(String trdParkpayssn) {
		this.trdParkpayssn = trdParkpayssn;
	}

	public String getAmt() {
		return amt;
	}

	public void setAmt(String amt) {
		this.amt = amt;
	}

	public String getSubject() {
		return subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getCodeUrl() {
		return codeUrl;
	}

	public void setCodeUrl(String codeUrl) {
		this.codeUrl = codeUrl;
	}

	public String getPrePayId() {
		return prePayId;
	}

	public void setPrePayId(String prePayId) {
		this.prePayId = prePayId;
	}

	public String getCreateTime() {
		return createTime;
	}

	public void setCreateTime(String createTime) {
		this.createTime = createTime;
	}

	public String getExpireTime() {
		return expireTime;
	}

	public void setExpireTime(String expireTime) {
		this.expireTime = expireTime;
	}

	public String getPayChannel() {
		return payChannel;
	}

	public void setPayChannel(String payChannel) {
		this.payChannel = payChannel;
	}

    
    


}
