package com.jst.prodution.upay.wechat.serviceBean;

import com.jst.prodution.base.bean.BaseBean;
import com.jst.prodution.upay.model.UpayResponseChargeModel;

public class CIBResponseBean extends BaseBean{
	private static final long serialVersionUID = 1L;
	/**
	 * 兴业返回的通知参数
	 */
	public String responseStr;
	/**
	 * 业务处理成功失败标识
	 */
	public boolean flag ;	
	/**
	 * 支付渠道
	 */
	public String payChannelId;	
	/**
	 * 支付方式
	 */
	public String payType;
	public UpayResponseChargeModel upayResponseChargeModel;
	public String getResponseStr() {
		return responseStr;
	}
	public void setResponseStr(String responseStr) {
		this.responseStr = responseStr;
	}
	public boolean isFlag() {
		return flag;
	}
	public void setFlag(boolean flag) {
		this.flag = flag;
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
	public UpayResponseChargeModel getUpayResponseChargeModel() {
		return upayResponseChargeModel;
	}
	public void setUpayResponseChargeModel(UpayResponseChargeModel upayResponseChargeModel) {
		this.upayResponseChargeModel = upayResponseChargeModel;
	}
	
}
