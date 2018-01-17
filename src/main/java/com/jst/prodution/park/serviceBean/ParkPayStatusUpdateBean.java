/*
* Copyright (c) 2015-2018 SHENZHEN GUIYI SCIENCE AND TECHNOLOGY DEVELOP CO., LTD. All rights reserved.
*
* 注意：本内容仅限于深圳市捷顺金科研发有限公司内部传阅，禁止外泄以及用于其他的商业目的 
*/
package com.jst.prodution.park.serviceBean;

import java.util.Date;
import com.jst.prodution.base.bean.BaseBean;

public class ParkPayStatusUpdateBean extends BaseBean{
	
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private int id ;
	
	private String amt ;
	
	private String payChannel ;
	
	private int payStatus ;
	
	private Date payTime ;
	
	private String parkpayssn ;
	
	private String payOrderNo ;
	
	private String outvalidtime ;
	
	private boolean notice ;    //是否发送通知到平台
	
	private boolean refund ; //true:走退款，false:不需要退款

	
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

	public String getPayOrderNo() {
		return payOrderNo;
	}

	public void setPayOrderNo(String payOrderNo) {
		this.payOrderNo = payOrderNo;
	}

	public boolean isNotice() {
		return notice;
	}

	public void setNotice(boolean notice) {
		this.notice = notice;
	}

    public boolean isRefund() {
        return refund;
    }

    public void setRefund(boolean refund) {
        this.refund = refund;
    }


}
