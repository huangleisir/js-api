/*
* Copyright (c) 2015-2018 SHENZHEN GUIYI SCIENCE AND TECHNOLOGY DEVELOP CO., LTD. All rights reserved.
*
* 注意：本内容仅限于深圳市捷顺金科研发有限公司内部传阅，禁止外泄以及用于其他的商业目的 
*/
package com.jst.prodution.payment.serviceBean;

import com.jst.prodution.base.bean.BaseBean;

public class ApplyForRefundInputBean  extends BaseBean {
    private static final long serialVersionUID = 1L;

    private String  busNo ;//统一支付平台返回的支付交易流水号
    private String  preordid ;//原始订单ID
    private String  refundssn ;//退款流水号
    private int refundamt;         //退款总金额，单位为分，只能为整数
    private String description;
    private int platform_type;
    private String parkpayssn ;
    
    private String trdParkpayssn ; //原外部支付流水号
    
    
    public String getBusNo() {
        return busNo;
    }
    public void setBusNo(String busNo) {
        this.busNo = busNo;
    }
    public String getPreordid() {
        return preordid;
    }
    public void setPreordid(String preordid) {
        this.preordid = preordid;
    }
    public String getRefundssn() {
        return refundssn;
    }
    public void setRefundssn(String refundssn) {
        this.refundssn = refundssn;
    }
    public int getRefundamt() {
        return refundamt;
    }

    public void setRefundamt(int refundamt) {
        this.refundamt = refundamt;
    }
    
    public String getDescription() {
        return description;
    }
    public void setDescription(String description) {
        this.description = description;
    }
    public int getPlatform_type() {
        return platform_type;
    }
    public void setPlatform_type(int platform_type) {
        this.platform_type = platform_type;
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
    
    
}
