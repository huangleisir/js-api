/*
* Copyright (c) 2015-2018 SHENZHEN GUIYI SCIENCE AND TECHNOLOGY DEVELOP CO., LTD. All rights reserved.
*
* 注意：本内容仅限于深圳市捷顺金科研发有限公司内部传阅，禁止外泄以及用于其他的商业目的 
*/
package com.jst.prodution.payment.serviceBean;

import com.jst.prodution.base.bean.BaseBean;

public class AutoWithholdBean  extends BaseBean {
    private static final long serialVersionUID = 1L;

    private String  ordid ;
    private String  needpayamt ;
    private String  parkid ;
    private String  sendtime ;
    private String  parkpayssn ;//停车支付流水号
    private String  trd_parkpayssn ;//平台方支付流水号
    
    private String  userid ;//用户ID
    private String  mobile ;//手机号
    
    private String mchid ; //商户号,99代表不需二级商户号
    
    public String getMobile() {
		return mobile;
	}
	public void setMobile(String mobile) {
		this.mobile = mobile;
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
    public String getParkid() {
        return parkid;
    }
    public void setParkid(String parkid) {
        this.parkid = parkid;
    }
    public String getSendtime() {
        return sendtime;
    }
    public void setSendtime(String sendtime) {
        this.sendtime = sendtime;
    }
    public String getParkpayssn() {
        return parkpayssn;
    }
    public void setParkpayssn(String parkpayssn) {
        this.parkpayssn = parkpayssn;
    }
    public String getTrd_parkpayssn() {
        return trd_parkpayssn;
    }
    public void setTrd_parkpayssn(String trd_parkpayssn) {
        this.trd_parkpayssn = trd_parkpayssn;
    }

    public String getUserid() {
        return userid;
    }
    public void setUserid(String userid) {
        this.userid = userid;
    }
	public String getMchid() {
		return mchid;
	}
	public void setMchid(String mchid) {
		this.mchid = mchid;
	}
    
    
}