package com.jst.prodution.upay.wechat.serviceBean;


import com.jst.prodution.base.bean.BaseBean;
import com.jst.prodution.upay.model.UpayResponseChargeModel;

public class WechatResponseBean extends BaseBean{
	private static final long serialVersionUID = 1L;
	public String responseXML;		//微信返回的xml
	public boolean flag ;			//业务处理成功失败标识
	public String payChannelId;		//支付渠道
	public String payType;			//支付方式
	public UpayResponseChargeModel upayResponseChargeModel;
	public String getResponseXML() {
		return responseXML;
	}
	public void setResponseXML(String responseXML) {
		this.responseXML = responseXML;
	}
	public boolean isFlag() {
		return flag;
	}
	public void setFlag(boolean flag) {
		this.flag = flag;
	}
	public UpayResponseChargeModel getUpayResponseChargeModel() {
		return upayResponseChargeModel;
	}
	public void setUpayResponseChargeModel(UpayResponseChargeModel upayResponseChargeModel) {
		this.upayResponseChargeModel = upayResponseChargeModel;
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
	
	
	
}
