/**
 * author:汤广海
 * 2017年08月14日
 * 下午5:44:58
 */
package com.jst.prodution.lane.serviceBean;

import com.jst.prodution.base.bean.BaseBean;

/**
 * @author Administrator
 *
 */
public class IndBankQPQueryBean extends BaseBean {

	private static final long serialVersionUID = 1L;
	private String timestamp;//时间戳yyyyMMddHHmmss
	private String appid;//商户AppID
	private String service;//服务名称
	private String ver;//版本号
	private String signType;//签名算法
	private String orderNo;//订单编号
	private String orderDate;//订单提交时间(yyyyMMdd)
	private String mac;//消息校验码
	
	private String orderAmount;//订单金额(单位元,精确到两位小数)
	private String orderTime;//订单生成时间
	private String payTime;//代收时间yyyyMMddHHmmss
	private String transStatus;//交易状态(0-待发起,1-成功,2-失败,3-支付中,4-已撤销,5-已退款)
	private String sno;//收付直通车支付网关流水号
	private String extErrMsg;//上游错误信息,当交易失败的时候有值
	private String errcode;//错误码
	private String errmsg;//错误信息
	public String getTimestamp() {
		return timestamp;
	}
	public void setTimestamp(String timestamp) {
		this.timestamp = timestamp;
	}
	public String getAppid() {
		return appid;
	}
	public void setAppid(String appid) {
		this.appid = appid;
	}
	public String getService() {
		return service;
	}
	public void setService(String service) {
		this.service = service;
	}
	public String getVer() {
		return ver;
	}
	public void setVer(String ver) {
		this.ver = ver;
	}
	public String getSignType() {
		return signType;
	}
	public void setSignType(String signType) {
		this.signType = signType;
	}
	public String getOrderNo() {
		return orderNo;
	}
	public void setOrderNo(String orderNo) {
		this.orderNo = orderNo;
	}
	public String getOrderDate() {
		return orderDate;
	}
	public void setOrderDate(String orderDate) {
		this.orderDate = orderDate;
	}
	public String getMac() {
		return mac;
	}
	public void setMac(String mac) {
		this.mac = mac;
	}
	public String getOrderAmount() {
		return orderAmount;
	}
	public void setOrderAmount(String orderAmount) {
		this.orderAmount = orderAmount;
	}
	public String getOrderTime() {
		return orderTime;
	}
	public void setOrderTime(String orderTime) {
		this.orderTime = orderTime;
	}
	public String getPayTime() {
		return payTime;
	}
	public void setPayTime(String payTime) {
		this.payTime = payTime;
	}
	public String getTransStatus() {
		return transStatus;
	}
	public void setTransStatus(String transStatus) {
		this.transStatus = transStatus;
	}
	public String getSno() {
		return sno;
	}
	public void setSno(String sno) {
		this.sno = sno;
	}
	public String getExtErrMsg() {
		return extErrMsg;
	}
	public void setExtErrMsg(String extErrMsg) {
		this.extErrMsg = extErrMsg;
	}
	public String getErrcode() {
		return errcode;
	}
	public void setErrcode(String errcode) {
		this.errcode = errcode;
	}
	public String getErrmsg() {
		return errmsg;
	}
	public void setErrmsg(String errmsg) {
		this.errmsg = errmsg;
	}
	
}
