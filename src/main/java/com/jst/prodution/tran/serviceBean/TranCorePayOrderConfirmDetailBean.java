package com.jst.prodution.tran.serviceBean;

import com.jst.prodution.base.bean.BaseBean;

public class TranCorePayOrderConfirmDetailBean extends BaseBean {
	private static final long serialVersionUID = 7432878064006910594L;
	//支付方式（01：余额，02：借记卡，03：贷记卡，04：预付卡）（目前不支持组合支付）
	private String payWay;
	
	//支付凭证号
	private String payCerNo;
	
	//支付凭证号备注
	private String payCerNoMark;
	
	//可用额度
	private Long amount;
	
	//支付金额
	private Long payAmount;
	
	//子通道
	private String subChannelCode;
	
	//短信验证码
	private String smsCode;
	//短信跟踪编码
	private String smsTraceCode;	
	

	public String getSubChannelCode() {
		return subChannelCode;
	}

	public void setSubChannelCode(String subChannelCode) {
		this.subChannelCode = subChannelCode;
	}

	//备注
	private String remark;

	public String getPayWay() {
		return payWay;
	}

	public void setPayWay(String payWay) {
		this.payWay = payWay;
	}

	public String getPayCerNo() {
		return payCerNo;
	}

	public void setPayCerNo(String payCerNo) {
		this.payCerNo = payCerNo;
	}

	public String getPayCerNoMark() {
		return payCerNoMark;
	}

	public void setPayCerNoMark(String payCerNoMark) {
		this.payCerNoMark = payCerNoMark;
	}

	public Long getAmount() {
		return amount;
	}

	public void setAmount(Long amount) {
		this.amount = amount;
	}

	public Long getPayAmount() {
		return payAmount;
	}

	public void setPayAmount(Long payAmount) {
		this.payAmount = payAmount;
	}

	public String getRemark() {
		return remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}
	
	public String getSmsCode() {
		return smsCode;
	}
	public void setSmsCode(String smsCode) {
		this.smsCode = smsCode;
	}	
	
	public String getSmsTraceCode() {
		return smsTraceCode;
	}
	public void setSmsTraceCode(String smsTraceCode) {
		this.smsTraceCode = smsTraceCode;
	}	
	

}
