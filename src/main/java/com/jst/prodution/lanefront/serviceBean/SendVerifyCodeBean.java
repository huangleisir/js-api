package com.jst.prodution.lanefront.serviceBean;

import com.jst.prodution.base.bean.BaseBean;

/**
 * 发送短信验证码
 * 
 * @author Tomy
 *
 */
public class SendVerifyCodeBean extends BaseBean implements java.io.Serializable {

	private static final long serialVersionUID = 1L;
	private String busNo;//交易流水号
	private String externalRefNumber;//外部跟踪编号

	private String pan;//银行卡号

	private String authenflowNo;// 客户号
	private String channelCodeChild;//子通道编码
	private String amount;//金额
	
	public String getBusNo() {
		return busNo;
	}
	public void setBusNo(String busNo) {
		this.busNo = busNo;
	}
	public String getExternalRefNumber() {
		return externalRefNumber;
	}
	public void setExternalRefNumber(String externalRefNumber) {
		this.externalRefNumber = externalRefNumber;
	}

	public String getPan() {
		return pan;
	}
	public void setPan(String pan) {
		this.pan = pan;
	}
	public String getAuthenflowNo() {
		return authenflowNo;
	}
	public void setAuthenflowNo(String authenflowNo) {
		this.authenflowNo = authenflowNo;
	}
	public String getChannelCodeChild() {
		return channelCodeChild;
	}
	public void setChannelCodeChild(String channelCodeChild) {
		this.channelCodeChild = channelCodeChild;
	}
	public String getAmount() {
		return amount;
	}
	public void setAmount(String amount) {
		this.amount = amount;
	}
	
}
