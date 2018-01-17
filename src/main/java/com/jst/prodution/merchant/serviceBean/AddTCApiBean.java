/*
* Copyright (c) 2015-2018 SHENZHEN GUIYI SCIENCE AND TECHNOLOGY DEVELOP CO., LTD. All rights reserved.
*
* 注意：本内容仅限于深圳市捷顺金科研发有限公司内部传阅，禁止外泄以及用于其他的商业目的 
*/
/*
* Copyright (c) 2015-2018 SHENZHEN GUIYI SCIENCE AND TECHNOLOGY DEVELOP CO., LTD. All rights reserved.
*
* 注意：本内容仅限于深圳市捷顺金科研发有限公司内部传阅，禁止外泄以及用于其他的商业目的 
*/

package com.jst.prodution.merchant.serviceBean;

import com.jst.prodution.base.bean.BaseBean;

/** 
 * 
 * @Package: com.jst.prodution.merchant.serviceBean  
 * @ClassName: AddTCApiBean 
 * @Description: TODO
 *
 * @author: Administrator 
 * @date: 2017年5月4日 下午5:41:38 
 * @version V1.0 
 

 */
public class AddTCApiBean extends BaseBean {

    /**
     * 
     */
    private static final long serialVersionUID = 1L;
    private String  tccName;//停车场名称
    private String  tccNo;//停车场编号
    private String merchantId;//商户编号
    /**
     * @return the tccName
     */
    public String getTccName() {
        return tccName;
    }
    /**
     * @param tccName the tccName to set
     */
    public void setTccName(String tccName) {
        this.tccName = tccName;
    }
    /**
     * @return the tccNo
     */
    public String getTccNo() {
        return tccNo;
    }
    /**
     * @param tccNo the tccNo to set
     */
    public void setTccNo(String tccNo) {
        this.tccNo = tccNo;
    }
    /**
     * @return the merchantId
     */
    public String getMerchantId() {
        return merchantId;
    }
    /**
     * @param merchantId the merchantId to set
     */
    public void setMerchantId(String merchantId) {
        this.merchantId = merchantId;
    }
}
