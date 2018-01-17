package com.jst.prodution.lane.cmbpay.serviceBean;

import com.jst.prodution.base.bean.BaseBean;

/**
 * 
* @ClassName: LaneCMBPayQueryBean 
* @Description: TODO(对外暴露一网通支付订单查询Bean) 
* @author zcb 
* @date 2018年1月16日 下午1:58:55 
*
 */
public class LaneCMBPayQueryBean extends BaseBean{

	private static final long serialVersionUID = 1L;
	
	/*入参*/
	private String date;//订单时间
	private String orderNo;//订单流水号
	
	/*出参*/
	private String dateTime;//银行返回该数据的时间格式：yyyyMMddHHmmss
	private String branchNo;//商户分行号，4位数字
	private String merchantNo;//商户号，6位数字
	private String bankSerialNo;//银行的订单流水号
	private String currency;//交易币种,固定为："10"
	private String orderAmount;//订单金额,格式：xxxx.xx
	private String fee;//费用金额,格式：xxxx.xx
	private String bankDate;//银行受理日期,格式：yyyyMMdd
	private String bankTime;//银行受理时间,格式：HHmmss
	private String settleAmount;//结算金额,格式：xxxx.xx
	private String discountAmount;//优惠金额,格式：xxxx.xx无优惠时返回0.00
	private String orderStatus;//订单状态,0:已结帐1:已撤销2:部分结帐4:未结帐7:冻结交易-冻结金额已经全部结账8:冻结交易，冻结金额只结帐了一部分
	private String settleDate;//银行处理日期,格式：yyyyMMdd
	private String settleTime;//银行处理时间,格式：HHmmss
	private String cardType;//卡类型,02：一卡通；03：信用卡；08：他行储蓄卡 09：他行信用卡
	private String merchantPara;//商户自定义参数,商户在支付接口中传送的payNoticePara参数，超过100字节自动截断。
	
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	public String getOrderNo() {
		return orderNo;
	}
	public void setOrderNo(String orderNo) {
		this.orderNo = orderNo;
	}
	public String getDateTime() {
		return dateTime;
	}
	public void setDateTime(String dateTime) {
		this.dateTime = dateTime;
	}
	public String getBranchNo() {
		return branchNo;
	}
	public void setBranchNo(String branchNo) {
		this.branchNo = branchNo;
	}
	public String getMerchantNo() {
		return merchantNo;
	}
	public void setMerchantNo(String merchantNo) {
		this.merchantNo = merchantNo;
	}
	public String getBankSerialNo() {
		return bankSerialNo;
	}
	public void setBankSerialNo(String bankSerialNo) {
		this.bankSerialNo = bankSerialNo;
	}
	public String getCurrency() {
		return currency;
	}
	public void setCurrency(String currency) {
		this.currency = currency;
	}
	public String getOrderAmount() {
		return orderAmount;
	}
	public void setOrderAmount(String orderAmount) {
		this.orderAmount = orderAmount;
	}
	public String getFee() {
		return fee;
	}
	public void setFee(String fee) {
		this.fee = fee;
	}
	public String getBankDate() {
		return bankDate;
	}
	public void setBankDate(String bankDate) {
		this.bankDate = bankDate;
	}
	public String getBankTime() {
		return bankTime;
	}
	public void setBankTime(String bankTime) {
		this.bankTime = bankTime;
	}
	public String getSettleAmount() {
		return settleAmount;
	}
	public void setSettleAmount(String settleAmount) {
		this.settleAmount = settleAmount;
	}
	public String getDiscountAmount() {
		return discountAmount;
	}
	public void setDiscountAmount(String discountAmount) {
		this.discountAmount = discountAmount;
	}
	public String getOrderStatus() {
		return orderStatus;
	}
	public void setOrderStatus(String orderStatus) {
		this.orderStatus = orderStatus;
	}
	public String getSettleDate() {
		return settleDate;
	}
	public void setSettleDate(String settleDate) {
		this.settleDate = settleDate;
	}
	public String getSettleTime() {
		return settleTime;
	}
	public void setSettleTime(String settleTime) {
		this.settleTime = settleTime;
	}
	public String getCardType() {
		return cardType;
	}
	public void setCardType(String cardType) {
		this.cardType = cardType;
	}
	public String getMerchantPara() {
		return merchantPara;
	}
	public void setMerchantPara(String merchantPara) {
		this.merchantPara = merchantPara;
	}
}
