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
import com.jst.prodution.merchant.model.MerchantViewLog;

/** 
 * 
 * @Package: com.jst.prodution.merchant.serviceBean  
 * @ClassName: QueryReviewLogBean 
 * @Description: TODO
 *
 * @author: Administrator 
 * @date: 2017年7月11日 下午6:28:39 
 * @version V1.0 
 

 */
public class QueryReviewLogBean extends BaseBean {

    /**
     * 
     */
    private static final long serialVersionUID = 1L;
    private String logId;//记录ID

    private String userId;//会员ID
    
    private String type; //审核类型,1--银行卡审核，2--结算审核

    private String bankCardNo;//银行卡号
    
    private List<MerchantViewLog> lstMerchantViewLog;

    public String getLogId() {
        return logId;
    }

    public void setLogId(String logId) {
        this.logId = logId;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getBankCardNo() {
        return bankCardNo;
    }

    public void setBankCardNo(String bankCardNo) {
        this.bankCardNo = bankCardNo;
    }

    public List<MerchantViewLog> getLstMerchantViewLog() {
        return lstMerchantViewLog;
    }

    public void setLstMerchantViewLog(List<MerchantViewLog> lstMerchantViewLog) {
        this.lstMerchantViewLog = lstMerchantViewLog;
    }

}
