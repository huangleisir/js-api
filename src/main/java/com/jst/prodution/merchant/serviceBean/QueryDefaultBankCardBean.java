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
import com.jst.prodution.merchant.model.MerchantBank;

/** 
 * 
 * @Package: com.jst.prodution.merchant.serviceBean  
 * @ClassName: QueryDefaultBankCardBean 
 * @Description: TODO
 *
 * @author: Administrator 
 * @date: 2017年7月10日 下午1:50:19 
 * @version V1.0 
 

 */
public class QueryDefaultBankCardBean extends BaseBean {

    /**
     * 
     */
    private static final long serialVersionUID = -3931205605820527157L;

    private String userId;
    private String merchantId;
    private String companyName;             //企业全称
    private MerchantBank merchantBank;

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }


    public MerchantBank getMerchantBank() {
        return merchantBank;
    }

    public void setMerchantBank(MerchantBank merchantBank) {
        this.merchantBank = merchantBank;
    }

    public String getMerchantId() {
        return merchantId;
    }

    public void setMerchantId(String merchantId) {
        this.merchantId = merchantId;
    }



    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }
}
