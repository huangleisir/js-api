package com.jst.prodution.jsyun.serviceBean;

import java.util.List;

import com.jst.prodution.base.bean.BaseBean;

public class OrderListBean extends BaseBean{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String ordstatus ;
	private String userid ;
	
	private String ordid ;
	private String needpayamt ;
	private String payfee ;
	private String parkid ;
	private String parkname ;
	private String carno ;
	private String ifneedpay ;
	private String intime ;
	private String outtime ;
	private String outvalidtime ;
	
	List<String> statusList ;
	List<OrderListBean> list ;

	public String getOrdstatus() {
		return ordstatus;
	}

	public void setOrdstatus(String ordstatus) {
		this.ordstatus = ordstatus;
	}

	public String getOrdid() {
		return ordid;
	}

	public void setOrdid(String ordid) {
		this.ordid = ordid;
	}

	public String getNeedpayamt() {
		return needpayamt;
	}

	public void setNeedpayamt(String needpayamt) {
		this.needpayamt = needpayamt;
	}

	public String getPayfee() {
		return payfee;
	}

	public void setPayfee(String payfee) {
		this.payfee = payfee;
	}

	public String getParkid() {
		return parkid;
	}

	public void setParkid(String parkid) {
		this.parkid = parkid;
	}

	public String getParkname() {
		return parkname;
	}

	public void setParkname(String parkname) {
		this.parkname = parkname;
	}

	public String getCarno() {
		return carno;
	}

	public void setCarno(String carno) {
		this.carno = carno;
	}

	public String getIfneedpay() {
		return ifneedpay;
	}

	public void setIfneedpay(String ifneedpay) {
		this.ifneedpay = ifneedpay;
	}

	public String getIntime() {
		return intime;
	}

	public void setIntime(String intime) {
		this.intime = intime;
	}

	public String getOuttime() {
		return outtime;
	}

	public void setOuttime(String outtime) {
		this.outtime = outtime;
	}

	public String getOutvalidtime() {
		return outvalidtime;
	}

	public void setOutvalidtime(String outvalidtime) {
		this.outvalidtime = outvalidtime;
	}

	public List<OrderListBean> getList() {
		return list;
	}

	public void setList(List<OrderListBean> list) {
		this.list = list;
	}

	public String getUserid() {
		return userid;
	}

	public void setUserid(String userid) {
		this.userid = userid;
	}

	public List<String> getStatusList() {
		return statusList;
	}

	public void setStatusList(List<String> statusList) {
		this.statusList = statusList;
	}
	

}