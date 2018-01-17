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

package com.jst.prodution.lanefront.listbean;

import com.jst.prodution.base.bean.BaseBean;

/** 
 * 
 * @Package: com.jst.prodution.lanefront.listbean  
 * @ClassName: BankCardNamBean 
 * @Description: TODO
 *
 * @author: Administrator 
 * @date: 2017年2月14日 下午5:42:05 
 * @version V1.0 
 

 */
public class BankCardNamBean extends BaseBean {
    private static final long serialVersionUID = 1L;
    private String bankInsNo;  
    private String bankName;    
    private String bankCode; 
    private String bankCardType;     
    private String cardName;  
    private String platformFlag;
    /**
     * @return the bankInsNo
     */
    public String getBankInsNo() {
        return bankInsNo;
    }
    /**
     * @param bankInsNo the bankInsNo to set
     */
    public void setBankInsNo(String bankInsNo) {
        this.bankInsNo = bankInsNo;
    }
    /**
     * @return the bankName
     */
    public String getBankName() {
        return bankName;
    }
    /**
     * @param bankName the bankName to set
     */
    public void setBankName(String bankName) {
        this.bankName = bankName;
    }
    /**
     * @return the bankCode
     */
    public String getBankCode() {
        return bankCode;
    }
    /**
     * @param bankCode the bankCode to set
     */
    public void setBankCode(String bankCode) {
        this.bankCode = bankCode;
    }
    /**
     * @return the bankCardType
     */
    public String getBankCardType() {
        return bankCardType;
    }
    /**
     * @param bankCardType the bankCardType to set
     */
    public void setBankCardType(String bankCardType) {
        this.bankCardType = bankCardType;
    }
    /**
     * @return the cardName
     */
    public String getCardName() {
        return cardName;
    }
    /**
     * @param cardName the cardName to set
     */
    public void setCardName(String cardName) {
        this.cardName = cardName;
    }
    /**
     * @return the platformFlag
     */
    public String getPlatformFlag() {
        return platformFlag;
    }
    /**
     * @param platformFlag the platformFlag to set
     */
    public void setPlatformFlag(String platformFlag) {
        this.platformFlag = platformFlag;
    }
}
