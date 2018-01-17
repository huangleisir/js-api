package com.jst.prodution.trade.model;

/**
 * 订单调用通道请求基类
 * @author 吴安辉
 *
 */
public class ChannelOrder {

	private String tradeNo;				//订单流水号
	private Long amountChannel;		//发往渠道的金额
	private String bankAcctNo;			//银行卡号（加密）
	private String bankAcctNoSuffix;	//银行卡号后4位
	private String paymentType;			//代扣代付类型 1-代扣，2-代付
	private String businessType;		//订单类型 1-充值 2-提现
	private String status;				//状态 1未支付 2支付中 3支付失败 4支付成功 5超时
	private String channelCode;			//通道编码
	private String channelNo;			//渠道流水号
	private String frontChannelNo;		//通道前置流水号
	private String frontChannelCode;	//通道前置返回码
	private String frontChannelMsg;		//通道前置返回消息
	private String acctCheckState;		//对账状态 00未对账 01对账中 02平账 03 不平账 04无需对账
	private String acctCheckDate;		//对账清算日期
	private String creator;				//创建者
	private String createTime;			//创建时间
	private String updator;				//修改者
	private String updateTime;			//修改时间
	private String note;				//描述
	
	public String getTradeNo() {
		return tradeNo;
	}
	public void setTradeNo(String tradeNo) {
		this.tradeNo = tradeNo;
	}
	public Long getAmountChannel() {
		return amountChannel;
	}
	public void setAmountChannel(Long amountChannel) {
		this.amountChannel = amountChannel;
	}
	public String getBankAcctNo() {
		return bankAcctNo;
	}
	public void setBankAcctNo(String bankAcctNo) {
		this.bankAcctNo = bankAcctNo;
	}
	public String getBankAcctNoSuffix() {
		return bankAcctNoSuffix;
	}
	public void setBankAcctNoSuffix(String bankAcctNoSuffix) {
		this.bankAcctNoSuffix = bankAcctNoSuffix;
	}
	public String getPaymentType() {
		return paymentType;
	}
	public void setPaymentType(String paymentType) {
		this.paymentType = paymentType;
	}
	public String getBusinessType() {
		return businessType;
	}
	public void setBusinessType(String businessType) {
		this.businessType = businessType;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public String getChannelCode() {
		return channelCode;
	}
	public void setChannelCode(String channelCode) {
		this.channelCode = channelCode;
	}
	public String getChannelNo() {
		return channelNo;
	}
	public void setChannelNo(String channelNo) {
		this.channelNo = channelNo;
	}
	public String getFrontChannelNo() {
		return frontChannelNo;
	}
	public void setFrontChannelNo(String frontChannelNo) {
		this.frontChannelNo = frontChannelNo;
	}
	public String getFrontChannelCode() {
		return frontChannelCode;
	}
	public void setFrontChannelCode(String frontChannelCode) {
		this.frontChannelCode = frontChannelCode;
	}
	public String getFrontChannelMsg() {
		return frontChannelMsg;
	}
	public void setFrontChannelMsg(String frontChannelMsg) {
		this.frontChannelMsg = frontChannelMsg;
	}
	public String getAcctCheckState() {
		return acctCheckState;
	}
	public void setAcctCheckState(String acctCheckState) {
		this.acctCheckState = acctCheckState;
	}
	public String getAcctCheckDate() {
		return acctCheckDate;
	}
	public void setAcctCheckDate(String acctCheckDate) {
		this.acctCheckDate = acctCheckDate;
	}
	public String getCreator() {
		return creator;
	}
	public void setCreator(String creator) {
		this.creator = creator;
	}
	public String getCreateTime() {
		return createTime;
	}
	public void setCreateTime(String createTime) {
		this.createTime = createTime;
	}
	public String getUpdator() {
		return updator;
	}
	public void setUpdator(String updator) {
		this.updator = updator;
	}
	public String getUpdateTime() {
		return updateTime;
	}
	public void setUpdateTime(String updateTime) {
		this.updateTime = updateTime;
	}
	public String getNote() {
		return note;
	}
	public void setNote(String note) {
		this.note = note;
	}
	
}
