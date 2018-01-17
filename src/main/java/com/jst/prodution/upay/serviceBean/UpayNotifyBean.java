package com.jst.prodution.upay.serviceBean;


import java.util.Map;

import com.jst.prodution.base.bean.BaseBean;
/**
 * 
 * @Package: com.jst.prodution.upay.serviceBean
 * @ClassName: UpayNotifyBean.java
 * @Description: 微信、支付宝支付通知bean
 *
 * @author: wanghuai
 * @date: 2017年10月16日 下午3:41:29 
 * @version: V1.0
 *
 */
public class UpayNotifyBean extends BaseBean{
	private static final long serialVersionUID = 1L;
	/**
	 * 微信、兴业H5支付通知返回的xml(支付渠道为微信时必填)
	 */
	private String responseXML;							//微信支付通知返回的xml
	/**
     * 支付宝通知回的参数(支付渠道为支付宝时必填)
     */
    private Map<String,String> aliResponseParamMap;		//支付宝支付通知返回的map
	/**
	 * 支付流水号
	 */
    private String payNo;								//支付流水号
	/**
	 * 支付渠道流水号(微信、支付宝)
	 */
    private String externTransactionId;					//支付渠道流水号(微信、支付宝)
	/**
	 * 支付状态
	 */
    private String status;								//支付状态
	/**
	 * 返回信息
	 */
    private String msg;									//返回信息
    /**
     * 交易付款时间
     */
    private String paySuccessTime;                          //交易付款时间
	public String getResponseXML() {
		return responseXML;
	}
	public void setResponseXML(String responseXML) {
		this.responseXML = responseXML;
	}
	public Map<String, String> getAliResponseParamMap() {
		return aliResponseParamMap;
	}
	public void setAliResponseParamMap(Map<String, String> aliResponseParamMap) {
		this.aliResponseParamMap = aliResponseParamMap;
	}
	public String getPayNo() {
		return payNo;
	}
	public void setPayNo(String payNo) {
		this.payNo = payNo;
	}
	public String getExternTransactionId() {
		return externTransactionId;
	}
	public void setExternTransactionId(String externTransactionId) {
		this.externTransactionId = externTransactionId;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public String getMsg() {
		return msg;
	}
	public void setMsg(String msg) {
		this.msg = msg;
	}
    public String getPaySuccessTime() {
        return paySuccessTime;
    }
    public void setPaySuccessTime(String paySuccessTime) {
        this.paySuccessTime = paySuccessTime;
    }
}
