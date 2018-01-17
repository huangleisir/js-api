/*
* Copyright (c) 2015-2018 SHENZHEN GUIYI SCIENCE AND TECHNOLOGY DEVELOP CO., LTD. All rights reserved.
*
* 注意：本内容仅限于深圳市捷顺金科研发有限公司内部传阅，禁止外泄以及用于其他的商业目的 
*/
package com.jst.prodution.park.serviceBean;

import java.io.Serializable;

public class TimeoutRefundInfo implements Serializable{

	private int seqamt ;
	
	private int timefordtl ;
	
	private String paytime ;
    
    private String transtype ;
    
    private String seqstatus ;//流水状态    00-无需支付；01-待支付； 02-已支付；03-支付失败无需支付； 11-待退费；12-已退费；13退费失败；
	
	private String payreqssn ;
	
	private String starttime ;
	
	private String endtime ;

	public int getSeqamt() {
		return seqamt;
	}

	public void setSeqamt(int seqamt) {
		this.seqamt = seqamt;
	}

	public int getTimefordtl() {
		return timefordtl;
	}

	public void setTimefordtl(int timefordtl) {
		this.timefordtl = timefordtl;
	}

	public String getPaytime() {
		return paytime;
	}

	public void setPaytime(String paytime) {
		this.paytime = paytime;
	}

	public String getTranstype() {
		return transtype;
	}

	public void setTranstype(String transtype) {
		this.transtype = transtype;
	}

	public String getPayreqssn() {
		return payreqssn;
	}

	public void setPayreqssn(String payreqssn) {
		this.payreqssn = payreqssn;
	}

	public String getStarttime() {
		return starttime;
	}

	public void setStarttime(String starttime) {
		this.starttime = starttime;
	}

	public String getEndtime() {
		return endtime;
	}

	public void setEndtime(String endtime) {
		this.endtime = endtime;
	}

    public String getSeqstatus() {
        return seqstatus;
    }

    public void setSeqstatus(String seqstatus) {
        this.seqstatus = seqstatus;
    }

}
