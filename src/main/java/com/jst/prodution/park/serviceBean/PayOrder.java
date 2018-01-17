/*
* Copyright (c) 2015-2018 SHENZHEN JST SCIENCE AND TECHNOLOGY DEVELOP CO., LTD. All rights reserved.
*
* 注意：本内容仅限于深圳市捷顺金科研发有限公司内部传阅，禁止外泄以及用于其他的商业目的 
*/
package com.jst.prodution.park.serviceBean;

import java.util.Date;

public class PayOrder {
	
	private int id ;
	
	private String user_id ;
	
	private String order_id ;
	
	private String subject ;
	
	private String description ;
	
	private String sence_type ;
	
	private Date create_time ;
	
	private String amt ;
	
	private String pay_channel ;
	
	private int pay_status ;
	
	private Date pay_time ;
	
	private String parkpayssn ;
	
	private String trd_parkpayssn ;
	
	private String pay_order_no ;
	
	private String credential ;
	
	private String callback_param ;
	
	private String payreqtype ;
	
	private int noticed ;
	
	private int version ;
	
	private String merchant_id ;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getUser_id() {
		return user_id;
	}

	public void setUser_id(String user_id) {
		this.user_id = user_id;
	}

	public String getOrder_id() {
		return order_id;
	}

	public void setOrder_id(String order_id) {
		this.order_id = order_id;
	}

	public String getSence_type() {
		return sence_type;
	}

	public void setSence_type(String sence_type) {
		this.sence_type = sence_type;
	}

	public Date getCreate_time() {
		return create_time;
	}

	public void setCreate_time(Date create_time) {
		this.create_time = create_time;
	}

	public String getAmt() {
		return amt;
	}

	public void setAmt(String amt) {
		this.amt = amt;
	}

	public String getPay_channel() {
		return pay_channel;
	}

	public void setPay_channel(String pay_channel) {
		this.pay_channel = pay_channel;
	}

	public int getPay_status() {
		return pay_status;
	}

	public void setPay_status(int pay_status) {
		this.pay_status = pay_status;
	}

	public Date getPay_time() {
		return pay_time;
	}

	public void setPay_time(Date pay_time) {
		this.pay_time = pay_time;
	}

	public String getParkpayssn() {
		return parkpayssn;
	}

	public void setParkpayssn(String parkpayssn) {
		this.parkpayssn = parkpayssn;
	}

	public String getPay_order_no() {
		return pay_order_no;
	}

	public void setPay_order_no(String pay_order_no) {
		this.pay_order_no = pay_order_no;
	}

	public String getCredential() {
		return credential;
	}

	public void setCredential(String credential) {
		this.credential = credential;
	}

	public String getCallback_param() {
		return callback_param;
	}

	public void setCallback_param(String callback_param) {
		this.callback_param = callback_param;
	}

	public String getSubject() {
		return subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getPayreqtype() {
		return payreqtype;
	}

	public void setPayreqtype(String payreqtype) {
		this.payreqtype = payreqtype;
	}

	public int getNoticed() {
		return noticed;
	}

	public void setNoticed(int noticed) {
		this.noticed = noticed;
	}

	public String getTrd_parkpayssn() {
		return trd_parkpayssn;
	}

	public void setTrd_parkpayssn(String trd_parkpayssn) {
		this.trd_parkpayssn = trd_parkpayssn;
	}

	public int getVersion() {
		return version;
	}

	public void setVersion(int version) {
		this.version = version;
	}

	public String getMerchant_id() {
		return merchant_id;
	}

	public void setMerchant_id(String merchant_id) {
		this.merchant_id = merchant_id;
	}

	
}
