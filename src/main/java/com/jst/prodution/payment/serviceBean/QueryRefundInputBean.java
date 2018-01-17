/*
* Copyright (c) 2015-2018 SHENZHEN GUIYI SCIENCE AND TECHNOLOGY DEVELOP CO., LTD. All rights reserved.
*
* 注意：本内容仅限于深圳市捷顺金科研发有限公司内部传阅，禁止外泄以及用于其他的商业目的 
*/
package com.jst.prodution.payment.serviceBean;

import com.jst.prodution.base.bean.BaseBean;

public class QueryRefundInputBean  extends BaseBean {
    private static final long serialVersionUID = 1L;

    private String  preordid ;//原始订单ID
    private String  refundssn ;//退款流水号
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
    
    
}
