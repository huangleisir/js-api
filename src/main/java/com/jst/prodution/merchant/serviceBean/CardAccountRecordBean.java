package com.jst.prodution.merchant.serviceBean;

public class CardAccountRecordBean implements java.io.Serializable{
    /**
     * 
     */
    private static final long serialVersionUID = 1L;
    private String logId ;// 记录id号
	private int order;//序号
	private String jstMerchantId;//卡系统商户号
	private String jstMerchantIdName;//卡系统商户名称
	private String tranDate;//交易时间
	private String tranNum;//交易笔数
	private String tranAmount;//交易金额
	private String tranFee;//交易手续费
	private String settAmount;//结算金额
	private String txnChannel;//支付渠道
	
	public String getLogId() {
        return logId;
    }
    public void setLogId(String logId) {
        this.logId = logId;
    }
    public int getOrder() {
		return order;
	}
	public void setOrder(int order) {
		this.order = order;
	}
	public String getJstMerchantId() {
		return jstMerchantId;
	}
	public void setJstMerchantId(String jstMerchantId) {
		this.jstMerchantId = jstMerchantId;
	}
	public String getJstMerchantIdName() {
		return jstMerchantIdName;
	}
	public void setJstMerchantIdName(String jstMerchantIdName) {
		this.jstMerchantIdName = jstMerchantIdName;
	}
	public String getTranDate() {
		return tranDate;
	}
	public void setTranDate(String tranDate) {
		this.tranDate = tranDate;
	}
	public String getTranNum() {
		return tranNum;
	}
	public void setTranNum(String tranNum) {
		this.tranNum = tranNum;
	}
	public String getTranAmount() {
		return tranAmount;
	}
	public void setTranAmount(String tranAmount) {
		this.tranAmount = tranAmount;
	}
	public String getTranFee() {
		return tranFee;
	}
	public void setTranFee(String tranFee) {
		this.tranFee = tranFee;
	}
	public String getSettAmount() {
		return settAmount;
	}
	public void setSettAmount(String settAmount) {
		this.settAmount = settAmount;
	}
    public String getTxnChannel() {
        return txnChannel;
    }
    public void setTxnChannel(String txnChannel) {
        this.txnChannel = txnChannel;
    }
    @Override
    public String toString() {
        return "CardAccountRecordBean [logId=" + logId + ", order=" + order + ", jstMerchantId=" + jstMerchantId
                + ", jstMerchantIdName=" + jstMerchantIdName + ", tranDate=" + tranDate + ", tranNum=" + tranNum
                + ", tranAmount=" + tranAmount + ", tranFee=" + tranFee + ", settAmount=" + settAmount + "]";
    }
}
