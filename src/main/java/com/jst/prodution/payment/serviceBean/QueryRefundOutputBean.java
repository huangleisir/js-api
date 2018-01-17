/*
* Copyright (c) 2015-2018 SHENZHEN GUIYI SCIENCE AND TECHNOLOGY DEVELOP CO., LTD. All rights reserved.
*
* 注意：本内容仅限于深圳市捷顺金科研发有限公司内部传阅，禁止外泄以及用于其他的商业目的 
*/
package com.jst.prodution.payment.serviceBean;

import com.jst.prodution.base.bean.BaseBean;

public class QueryRefundOutputBean extends BaseBean {
    private static final long serialVersionUID = 1L;

    private int status; // 1-退款失败，2-退款中，3-退款成功

    private String successTime;// 成功退款时间

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public String getSuccessTime() {
        return successTime;
    }

    public void setSuccessTime(String successTime) {
        this.successTime = successTime;
    }

}
