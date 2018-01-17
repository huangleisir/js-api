package com.jst.prodution.park.serviceBean;

import java.util.Date;
import java.util.List;

import com.jst.prodution.base.bean.BaseBean;

public class ParkOrderInfoBean extends BaseBean{

	/**
	 * 
	 */
	private static final long serialVersionUID = 5887148504955707251L;
	
	private int id ;
	
	private String userId ;
	
	private String orderId ;
	
	private String subject ;
	
	private String description ;
	
	private String senceType ;
	
	private Date createTime ;
	
	private String amt ;
	
	private String payChannel ;
	
	private int payStatus ;
	
	private Date payTime ;
	
	private String parkpayssn ;
	
	private String trdParkpayssn ;
	
	private String payOrderNo ;
	
	private String credential ;
	
	private String payreqtype ;
	
	private int noticed ;
	
	private String merchantId ;
	
	private String outvalidtime ;
	
	private List<ParkOrderInfoBean> infoList;

	
	public String getOutvalidtime() {
		return outvalidtime;
	}

	public void setOutvalidtime(String outvalidtime) {
		this.outvalidtime = outvalidtime;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getOrderId() {
		return orderId;
	}

	public void setOrderId(String orderId) {
		this.orderId = orderId;
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

	public String getSenceType() {
		return senceType;
	}

	public void setSenceType(String senceType) {
		this.senceType = senceType;
	}

	public Date getCreateTime() {
		return createTime;
	}

	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}

	public String getAmt() {
		return amt;
	}

	public void setAmt(String amt) {
		this.amt = amt;
	}

	public String getPayChannel() {
		return payChannel;
	}

	public void setPayChannel(String payChannel) {
		this.payChannel = payChannel;
	}

	public int getPayStatus() {
		return payStatus;
	}

	public void setPayStatus(int payStatus) {
		this.payStatus = payStatus;
	}

	public Date getPayTime() {
		return payTime;
	}

	public void setPayTime(Date payTime) {
		this.payTime = payTime;
	}

	public String getParkpayssn() {
		return parkpayssn;
	}

	public void setParkpayssn(String parkpayssn) {
		this.parkpayssn = parkpayssn;
	}

	public String getTrdParkpayssn() {
		return trdParkpayssn;
	}

	public void setTrdParkpayssn(String trdParkpayssn) {
		this.trdParkpayssn = trdParkpayssn;
	}

	public String getPayOrderNo() {
		return payOrderNo;
	}

	public void setPayOrderNo(String payOrderNo) {
		this.payOrderNo = payOrderNo;
	}

	public String getCredential() {
		return credential;
	}

	public void setCredential(String credential) {
		this.credential = credential;
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

	public String getMerchantId() {
		return merchantId;
	}

	public void setMerchantId(String merchantId) {
		this.merchantId = merchantId;
	}

	public List<ParkOrderInfoBean> getInfoList() {
		return infoList;
	}

	public void setInfoList(List<ParkOrderInfoBean> infoList) {
		this.infoList = infoList;
	}
}
