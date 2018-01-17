package com.jst.prodution.tran.serviceBean;

import java.util.ArrayList;

import com.jst.prodution.base.bean.BaseBean;

public class TranCorePayOrderConfirmBean extends BaseBean{
	/**
	 * 
	 */
	private static final long serialVersionUID = 7432878064006910594L;
	//外部订单号
	private String busNo;
	//登陆手机号
	private String userMobile;
	
	//支付流水号
	private String payNo;
	
	//订单类型1-支付，2-退款，3-代扣 ，4-扫码支付，5-主动还款
	private String busType;
//	//是否要发送短信
//	private String isNeedSm;  //"Y" ,"N"
//	//是否已经发送短信
//	private String hasSendSM; //"Y" ,"N"

	//支付方式列表（多条）
	private ArrayList<TranCorePayOrderConfirmDetailBean> payWayList ;
	
	private String termFlag;//线下终端标识,pos扫码有,固定二维码没有
	
	
	
//	public String getIsNeedSm() {
//		return isNeedSm;
//	}
//	public void setIsNeedSm(String isNeedSm) {
//		this.isNeedSm = isNeedSm;
//	}
//	public String getHasSendSM() {
//		return hasSendSM;
//	}
//	public void setHasSendSM(String hasSendSM) {
//		this.hasSendSM = hasSendSM;
//	}
	public String getBusNo() {
		return busNo;
	}
	public void setBusNo(String busNo) {
		this.busNo = busNo;
	}
	public ArrayList<TranCorePayOrderConfirmDetailBean> getPayWayList() {
		return payWayList;
	}
	public void setPayWayList(ArrayList<TranCorePayOrderConfirmDetailBean> payWayList) {
		this.payWayList = payWayList;
	}
	public String getUserMobile() {
		return userMobile;
	}
	public void setUserMobile(String userMobile) {
		this.userMobile = userMobile;
	}
	public String getPayNo() {
		return payNo;
	}
	public void setPayNo(String payNo) {
		this.payNo = payNo;
	}
	public String getTermFlag() {
		return termFlag;
	}
	public void setTermFlag(String termFlag) {
		this.termFlag = termFlag;
	}
    public String getBusType() {
        return busType;
    }
    public void setBusType(String busType) {
        this.busType = busType;
    }
	
}
