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

package com.jst.prodution.accountant.serviceBean;

import java.util.Date;

import com.jst.prodution.base.bean.BaseBean;

/** 
 * 
 * @Package: com.jst.prodution.accountant.serviceBean  
 * @ClassName: AcntBalanceMergBean 
 * @Description: TODO
 *
 * @author: Administrator 
 * @date: 2017年4月5日 下午4:59:54 
 * @version V1.0 
 

 */
public class AcntBalanceMergBean extends BaseBean {

    /**
     * 
     */
    private static final long serialVersionUID = 1L;
    private Integer acntDate;

    private String acntCode;
    
    private Integer acntSeq;

    private String acct;

    private Long acctBlance;

    private Long acntBlance;

    private String mergStatus;
    

  

    /**
     * @return the acntDate
     */
    public Integer getAcntDate() {
        return acntDate;
    }

    /**
     * @param acntDate the acntDate to set
     */
    public void setAcntDate(Integer acntDate) {
        this.acntDate = acntDate;
    }

    /**
     * @return the acntCode
     */
    public String getAcntCode() {
        return acntCode;
    }

    /**
     * @param acntCode the acntCode to set
     */
    public void setAcntCode(String acntCode) {
        this.acntCode = acntCode;
    }

    /**
     * @return the acntSeq
     */
    public Integer getAcntSeq() {
        return acntSeq;
    }

    /**
     * @param acntSeq the acntSeq to set
     */
    public void setAcntSeq(Integer acntSeq) {
        this.acntSeq = acntSeq;
    }

    /**
     * @return the acct
     */
    public String getAcct() {
        return acct;
    }

    /**
     * @param acct the acct to set
     */
    public void setAcct(String acct) {
        this.acct = acct;
    }

    /**
     * @return the acctBlance
     */
    public Long getAcctBlance() {
        return acctBlance;
    }

    /**
     * @param acctBlance the acctBlance to set
     */
    public void setAcctBlance(Long acctBlance) {
        this.acctBlance = acctBlance;
    }

    /**
     * @return the acntBlance
     */
    public Long getAcntBlance() {
        return acntBlance;
    }

    /**
     * @param acntBlance the acntBlance to set
     */
    public void setAcntBlance(Long acntBlance) {
        this.acntBlance = acntBlance;
    }

    /**
     * @return the mergStatus
     */
    public String getMergStatus() {
        return mergStatus;
    }

    /**
     * @param mergStatus the mergStatus to set
     */
    public void setMergStatus(String mergStatus) {
        this.mergStatus = mergStatus;
    }
}
