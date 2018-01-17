package com.jst.prodution.upay.wechat.serviceBean;

import com.jst.prodution.base.bean.BaseBean;

/**
 * 获取微信支付账号
 * @Package: com.jst.prodution.upay.wechat.serviceBean
 * @ClassName: WechatAppIdBean.java
 *
 * @author: ningxuzhou
 * @date: 2018年1月16日 下午2:15:09 
 * @version: V1.0
 *
 */
public class WechatAppIdBean extends BaseBean {

    private static final long serialVersionUID = 1L;
    private String jstAppId;    //OCD 的 appid
    private String jstMchId;    //OCD 的商户号 
    private String appId;       //第三方渠道的appid（微信、支付宝、捷易付）
    private String mchId;       //第三方渠道的商户号（微信、支付宝、捷易付）
    private String key;         //第三方渠道的支付密钥（微信、支付宝、捷易付）
    private String payChannelId;//支付渠道  （微信、支付宝、捷易付）
    private String payType;     //支付方式
    private String appSecret;  //第三方渠道的appSecret（微信、支付宝、捷易付）
    public String getKey() {
        return key;
    }
    public void setKey(String key) {
        this.key = key;
    }
    public String getJstAppId() {
        return jstAppId;
    }
    public void setJstAppId(String jstAppId) {
        this.jstAppId = jstAppId;
    }
    public String getJstMchId() {
        return jstMchId;
    }
    public void setJstMchId(String jstMchId) {
        this.jstMchId = jstMchId;
    }
    public String getAppId() {
        return appId;
    }
    public void setAppId(String appId) {
        this.appId = appId;
    }
    public String getMchId() {
        return mchId;
    }
    public void setMchId(String mchId) {
        this.mchId = mchId;
    }
    public String getPayChannelId() {
        return payChannelId;
    }
    public void setPayChannelId(String payChannelId) {
        this.payChannelId = payChannelId;
    }
    public String getPayType() {
        return payType;
    }
    public void setPayType(String payType) {
        this.payType = payType;
    }
    public String getAppSecret() {
        return appSecret;
    }
    public void setAppSecret(String appSecret) {
        this.appSecret = appSecret;
    }

}
