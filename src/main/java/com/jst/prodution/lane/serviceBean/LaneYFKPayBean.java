package com.jst.prodution.lane.serviceBean;

import com.jst.prodution.base.bean.BaseBean;
/**
 * 
* @ClassName: LaneFrontCardRechargeBean 
* @Description: TODO(对外暴露预付卡消费bean) 
* @author 曾传保
* @date 2017年11月8日 上午10:49:13 
*
 */
public class LaneYFKPayBean extends BaseBean{

	private static final long serialVersionUID = 1L;
	
	private String payNo;//支付流水号
	private String cerNo;//银行卡号
	private long totalFee;//实际支付金额
	private String merchantId;//预付卡商户号
	private String termId;//线上终端号
	private String termFlag;//线下终端标识,pos扫码有,固定二维码没有
	private String transTime;//交易完成时间
	
	public String getPayNo() {
        return payNo;
    }
    public void setPayNo(String payNo) {
        this.payNo = payNo;
    }
    public String getCerNo() {
		return cerNo;
	}
	public void setCerNo(String cerNo) {
		this.cerNo = cerNo;
	}
	public long getTotalFee() {
		return totalFee;
	}
	public void setTotalFee(long totalFee) {
		this.totalFee = totalFee;
	}
	public String getMerchantId() {
		return merchantId;
	}
	public void setMerchantId(String merchantId) {
		this.merchantId = merchantId;
	}
	public String getTermId() {
		return termId;
	}
	public void setTermId(String termId) {
		this.termId = termId;
	}
	public String getTermFlag() {
		return termFlag;
	}
	public void setTermFlag(String termFlag) {
		this.termFlag = termFlag;
	}
	public String getTransTime() {
		return transTime;
	}
	public void setTransTime(String transTime) {
		this.transTime = transTime;
	}
}
