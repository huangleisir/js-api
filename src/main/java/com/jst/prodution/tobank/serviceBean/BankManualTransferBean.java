package com.jst.prodution.tobank.serviceBean;

import com.jst.prodution.base.bean.BaseBean;

/**
 * 手工发起转账处理
 * @author Administrator
 *
 */
public class BankManualTransferBean extends BaseBean {
	
	private static final long serialVersionUID = 1L;
	private String payOrderNo;			//付款中心订单号
	private String resultCode;			//处理结果代码：00付款受理 01付款中 02已付款成功 03付款失败
	private String resultMsg;			//处理结果信息
	
	public String getPayOrderNo() {
		return payOrderNo;
	}
	public void setPayOrderNo(String payOrderNo) {
		this.payOrderNo = payOrderNo;
	}
	public String getResultCode() {
		return resultCode;
	}
	public void setResultCode(String resultCode) {
		this.resultCode = resultCode;
	}
	public String getResultMsg() {
		return resultMsg;
	}
	public void setResultMsg(String resultMsg) {
		this.resultMsg = resultMsg;
	}

}
