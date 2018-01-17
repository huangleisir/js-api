/*
* Copyright (c) 2015-2018 SHENZHEN GUIYI SCIENCE AND TECHNOLOGY DEVELOP CO., LTD. All rights reserved.
*
* 注意：本内容仅限于深圳市捷顺金科研发有限公司内部传阅，禁止外泄以及用于其他的商业目的 
*/
package com.jst.prodution.park.serviceBean;

import com.jst.prodution.base.bean.BaseBean;

public class PreparePayment extends BaseBean {
	
	/**
     * 
     */
    private static final long serialVersionUID = 1L;

    private String parkpayssn ;

    public String getParkpayssn() {
        return parkpayssn;
    }

    public void setParkpayssn(String parkpayssn) {
        this.parkpayssn = parkpayssn;
    }
	
}
