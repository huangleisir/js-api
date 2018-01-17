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

import java.util.List;

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
public class ReconcServiceBean extends BaseBean {

    /**
     * 
     */
    private static final long serialVersionUID = 1L;

    private String jobDate;
    private String otTable_date;
    private String tranTable;
    private String ojTable_date;
    private int payInstCode;
    private String[] tables;
    private String prevDate;
    private   String payInsCd;
    


    /**
     * @return the payInsCd
     */
    public String getPayInsCd() {
        return payInsCd;
    }

    /**
     * @param payInsCd the payInsCd to set
     */
    public void setPayInsCd(String payInsCd) {
        this.payInsCd = payInsCd;
    }

    public String getTranTable() {
        return tranTable;
    }

    public void setTranTable(String tranTable) {
        this.tranTable = tranTable;
    }

    public String getJobDate() {
        return jobDate;
    }

    public void setJobDate(String jobDate) {
        this.jobDate = jobDate;
    }

    public String getOtTable_date() {
        return otTable_date;
    }

    public void setOtTable_date(String otTable_date) {
        this.otTable_date = otTable_date;
    }

    public String getOjTable_date() {
        return ojTable_date;
    }

    public void setOjTable_date(String ojTable_date) {
        this.ojTable_date = ojTable_date;
    }

    public int getPayInstCode() {
        return payInstCode;
    }

    public void setPayInstCode(int payInstCode) {
        this.payInstCode = payInstCode;
    }

    public String[] getTables() {
        return tables;
    }

    public void setTables(String[] tables) {
        this.tables = tables;
    }

    public void setPrevDate(String prevDate) {
        this.prevDate = prevDate;
    }

    public String getPrevDate() {
        return prevDate;
    }
}
