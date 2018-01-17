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

import java.util.List;

import com.jst.prodution.base.bean.BaseBean;
import com.jst.prodution.merchant.model.MerchantPayConf;
import com.jst.prodution.merchant.model.MerchantPayProduct;

/** 
 * 
 * @Package: com.jst.prodution.merchant.serviceBean  
 * @ClassName: AddMerchantPayProductBean 
 * @Description: TODO
 *
 * @author: Administrator 
 * @date: 2017年3月10日 下午5:54:30 
 * @version V1.0 
 

 */
public class AddMerchantPayProductBean extends BaseBean {

    /**
     * 
     */
    private static final long serialVersionUID = 1L;
    private String merchantId;
    private String userId;
    private List<MerchantPayProduct> merchantPayProduct;
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
    /**
     * @return the userId
     */
    public String getUserId() {
        return userId;
    }
    /**
     * @param userId the userId to set
     */
    public void setUserId(String userId) {
        this.userId = userId;
    }
    /**
     * @return the merchantPayProduct
     */
    public List<MerchantPayProduct> getMerchantPayProduct() {
        return merchantPayProduct;
    }
    /**
     * @param merchantPayProduct the merchantPayProduct to set
     */
    public void setMerchantPayProduct(List<MerchantPayProduct> merchantPayProduct) {
        this.merchantPayProduct = merchantPayProduct;
    }
}
