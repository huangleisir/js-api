/**
 * author:汤广海
 * 2017年08月14日
 * 下午5:44:58
 */
package com.jst.prodution.lane.serviceBean;

import java.util.Date;

import com.jst.prodution.base.bean.BaseBean;

/**
 * @author Administrator
 *
 */
public class IndBankQuickPayBean extends BaseBean {

	private static final long serialVersionUID = 1L;
	private String quickpayId;
	private String timestamp;//时间戳yyyyMMddHHmmss
	private String appid;//商户AppID
	private String service;//服务名称
	private String ver;//版本号
	private String sign_type;//签名算法
	private String sub_mrch;//二级商户号
	private String orderNo;//订单编号
	private String orderTime;//商户的订单生成时间yyyyMMddHHmmss
	private Long orderAmount;//订单金额(单位元,精确到两位小数)
	private String cur;//币种,目前只支持CNY
	private String orderTitle;//订单主题
	private String orderDesc;//订单描述
	private String orderIp;//下单IP地址
	private String bankNo;//银行代码
	private String acctType;//银行账户类型:0-储蓄卡,1-信用卡(目前只支持0)
	private String cardNo;//银行卡号
	private String userName;//姓名
	private String certType;//证件类型:0-身份证(目前仅支持0)
	private String certNo;//证件号码
	private String cardPhone;//银行预留手机号码(信用卡认证必填)
	private String expireDate;//信用卡有效期()
	private String cvn;//信用卡背面三位安全码
	private String mac;//消息校验码
	
	private String payTime;//订单完成时间yyyyMMddHHmmss
	private String transStatus;//交易状态(0-待发起,1-成功,2-失败,3-支付中,4-已撤销,5-已退款)
	private String sno;//收付直通车支付网关流水号
	private String extErrMsg;//扩展错误信息
	private String errcode;//错误码
	private String errmsg;//错误信息
	
	public String getQuickpayId() {
		return quickpayId;
	}
	public void setQuickpayId(String quickpayId) {
		this.quickpayId = quickpayId;
	}
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
	public String getSign_type() {
		return sign_type;
	}
	public void setSign_type(String sign_type) {
		this.sign_type = sign_type;
	}
	public String getSub_mrch() {
		return sub_mrch;
	}
	public void setSub_mrch(String sub_mrch) {
		this.sub_mrch = sub_mrch;
	}
	public String getOrderNo() {
		return orderNo;
	}
	public void setOrderNo(String orderNo) {
		this.orderNo = orderNo;
	}
	public String getOrderTime() {
		return orderTime;
	}
	public void setOrderTime(String orderTime) {
		this.orderTime = orderTime;
	}
	public Long getOrderAmount() {
		return orderAmount;
	}
	public void setOrderAmount(Long orderAmount) {
		this.orderAmount = orderAmount;
	}
	public String getCur() {
		return cur;
	}
	public void setCur(String cur) {
		this.cur = cur;
	}
	public String getOrderTitle() {
		return orderTitle;
	}
	public void setOrderTitle(String orderTitle) {
		this.orderTitle = orderTitle;
	}
	public String getOrderDesc() {
		return orderDesc;
	}
	public void setOrderDesc(String orderDesc) {
		this.orderDesc = orderDesc;
	}
	public String getOrderIp() {
		return orderIp;
	}
	public void setOrderIp(String orderIp) {
		this.orderIp = orderIp;
	}
	public String getBankNo() {
		return bankNo;
	}
	public void setBankNo(String bankNo) {
		this.bankNo = bankNo;
	}
	public String getAcctType() {
		return acctType;
	}
	public void setAcctType(String acctType) {
		this.acctType = acctType;
	}
	public String getCardNo() {
		return cardNo;
	}
	public void setCardNo(String cardNo) {
		this.cardNo = cardNo;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
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
	public String getCardPhone() {
		return cardPhone;
	}
	public void setCardPhone(String cardPhone) {
		this.cardPhone = cardPhone;
	}
	public String getExpireDate() {
		return expireDate;
	}
	public void setExpireDate(String expireDate) {
		this.expireDate = expireDate;
	}
	public String getCvn() {
		return cvn;
	}
	public void setCvn(String cvn) {
		this.cvn = cvn;
	}
	public String getMac() {
		return mac;
	}
	public void setMac(String mac) {
		this.mac = mac;
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
