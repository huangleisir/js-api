package com.jst.prodution.upay.alipay.serviceBean;

import com.jst.prodution.upay.serviceBean.UpayChargeBean;

/**
 *@description:
 *@author  widon
 *@date: 2017年4月1日 下午3:18:05
 *@since: JDK 1.8
 *@version:V1.0.0
 */
public class AliChargeBean extends UpayChargeBean {
    
    private static final long serialVersionUID = -1751722383857707995L;
    /**
     * 禁用渠道
     */
    private String disablePayChannels; 	//禁用渠道，用户不可用指定渠道支付 ,当有多个渠道时用“,”分隔
    /**
     * 支付场景
     */
    private String scene;				//支付场景
    /**
     * 支付成功回调地址
     */
    private String returnUrl;           //支付成功回调地址
	public String getDisablePayChannels() {
		return disablePayChannels;
	}
	public void setDisablePayChannels(String disablePayChannels) {
		this.disablePayChannels = disablePayChannels;
	}
	public String getScene() {
		return scene;
	}
	public void setScene(String scene) {
		this.scene = scene;
	}
    public String getReturnUrl() {
        return returnUrl;
    }
    public void setReturnUrl(String returnUrl) {
        this.returnUrl = returnUrl;
    }
}
