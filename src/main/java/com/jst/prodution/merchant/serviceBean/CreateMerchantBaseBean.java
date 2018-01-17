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
import com.jst.prodution.merchant.model.MerchantBank;
import com.jst.prodution.merchant.model.MerchantBase;
import com.jst.prodution.merchant.model.MerchantImage;

/** 
 * 
 * @Package: com.jst.prodution.merchant.serviceBean  
 * @ClassName: CreateMerchantBaseBean 
 * @Description: TODO
 *
 * @author: Administrator 
 * @date: 2017年2月24日 上午11:32:38 
 * @version V1.0 
 

 */
public class CreateMerchantBaseBean extends BaseBean {
    
    /**
     * 
     */
    private static final long serialVersionUID = 1L;
    private String userId;                  //商户ID（B会员ID）
    private String merchantId;              //商户号

    private MerchantBase merchantBase;                  //商户基本信息
    
    private MerchantBank merchantBank;                  //商户开户银行
    
    private List<MerchantImage> merchantImageList;      //商户图片相关    

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
     * @return the merchantBase
     */
    public MerchantBase getMerchantBase() {
        return merchantBase;
    }

    /**
     * @param merchantBase the merchantBase to set
     */
    public void setMerchantBase(MerchantBase merchantBase) {
        this.merchantBase = merchantBase;
    }

    /**
     * @return the merchantBank
     */
    public MerchantBank getMerchantBank() {
        return merchantBank;
    }

    /**
     * @param merchantBank the merchantBank to set
     */
    public void setMerchantBank(MerchantBank merchantBank) {
        this.merchantBank = merchantBank;
    }

    /**
     * @return the merchantImageList
     */
    public List<MerchantImage> getMerchantImageList() {
        return merchantImageList;
    }

    /**
     * @param merchantImageList the merchantImageList to set
     */
    public void setMerchantImageList(List<MerchantImage> merchantImageList) {
        this.merchantImageList = merchantImageList;
    }

}
