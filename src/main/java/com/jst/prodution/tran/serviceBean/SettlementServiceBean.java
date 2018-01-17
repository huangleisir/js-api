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

package com.jst.prodution.tran.serviceBean;

import java.util.List;

import com.jst.prodution.base.bean.BaseBean;

/** 
 * 
 * @Package: com.jst.prodution.tran.serviceBean  
 * @ClassName: SettlementServiceBean 
 * @Description: TODO
 *
 * @author: Administrator 
 * @date: 2017年4月12日 上午9:48:58 
 * @version V1.0 
 

 */
public class SettlementServiceBean extends BaseBean {

    /**
     * 
     */
    private static final long serialVersionUID = 1L;
    
    private Integer settlementDate;//结算时间
    private Integer isSynch;//是否同步  0--同步，1--异步
    
    private List<TranBalanceSettBookBean> lstTranBalanceSettBook;

   

   

    /**
     * @return the settlementDate
     */
    public Integer getSettlementDate() {
        return settlementDate;
    }

    /**
     * @param settlementDate the settlementDate to set
     */
    public void setSettlementDate(Integer settlementDate) {
        this.settlementDate = settlementDate;
    }

    /**
     * @return the lstTranBalanceSettBook
     */
    public List<TranBalanceSettBookBean> getLstTranBalanceSettBook() {
        return lstTranBalanceSettBook;
    }

    /**
     * @param lstTranBalanceSettBook the lstTranBalanceSettBook to set
     */
    public void setLstTranBalanceSettBook(List<TranBalanceSettBookBean> lstTranBalanceSettBook) {
        this.lstTranBalanceSettBook = lstTranBalanceSettBook;
    }

    /**
     * @return the isSynch
     */
    public Integer getIsSynch() {
        return isSynch;
    }

    /**
     * @param isSynch the isSynch to set
     */
    public void setIsSynch(Integer isSynch) {
        this.isSynch = isSynch;
    }

    
}
