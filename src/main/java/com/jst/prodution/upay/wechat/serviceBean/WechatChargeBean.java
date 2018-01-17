package com.jst.prodution.upay.wechat.serviceBean;

import com.jst.prodution.upay.serviceBean.UpayChargeBean;

/**
 * 
 * @Package: com.jst.prodution.upay.wechat.serviceBean
 * @ClassName: WechatChargeBean.java
 * @Description: 微信获取支付凭证bean
 *
 * @author: wanghuai
 * @date: 2017年10月16日 下午2:15:09 
 * @version: V1.0
 *
 */
public class WechatChargeBean extends UpayChargeBean {

	private static final long serialVersionUID = 1L;
	/**
	 * 用户openid(微信)
	 */
	private String openId;			//用户openid
	/**
	 * no_credit--指定不能使用信用卡支付(微信)
	 */
	private String limitPay;  		//no_credit--指定不能使用信用卡支付
	
	public String getOpenId() {
		return openId;
	}
	public void setOpenId(String openId) {
		this.openId = openId;
	}
	public String getLimitPay() {
		return limitPay;
	}
	public void setLimitPay(String limitPay) {
		this.limitPay = limitPay;
	}
	
}
