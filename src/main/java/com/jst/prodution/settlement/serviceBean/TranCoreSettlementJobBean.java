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

package com.jst.prodution.settlement.serviceBean;

import com.jst.prodution.base.bean.BaseBean;

/** 
 * 
 * @Package: com.jst.prodution.tran.serviceBean  
 * @ClassName: TranCoreSettlementJobBean 
 * @Description: TODO
 *
 * @author: chenlong 
 * @date: 2016年12月15日 下午3:55:58 
 * @version V1.0 
 

 */
public class TranCoreSettlementJobBean extends BaseBean {
    
    /**
     * 
     */
    private static final long serialVersionUID = 1L;
    private Integer settlementDate;
    
    
    public Integer getSettlementDate() {
        return settlementDate;
    }

    public void setSettlementDate(Integer settlementDate) {
        this.settlementDate = settlementDate;
    }
}
