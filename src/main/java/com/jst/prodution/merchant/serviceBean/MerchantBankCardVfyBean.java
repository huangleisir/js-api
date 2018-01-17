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
 * @ClassName: MerchantBankCardVfyBean 
 * @Description: TODO
 *
 * @author: Administrator 
 * @date: 2017年2月21日 下午5:06:13 
 * @version V1.0 
 

 */
public class MerchantBankCardVfyBean extends BaseBean {

    /**
     * 
     */
    private static final long serialVersionUID = 1L;
    
    private String userId;              //商户ID
    private String bankName;            //银行名称
    private String bankCode;            //银行编号
    private String receiveCardNo;       //收款人银行卡号
    private String receiveName;         //收款人姓名
    
    private String payListState;                       //清单ID
    private String listId;                       //清单ID
    private String verifyFlag;                 //鉴权状态0-未鉴权,1-已鉴权
    private int payErrorNum;                    //回款认证错误次数
    private String timeOutState;                //清单超时状态 0 --正常  1--超时
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
     * @return the receiveCardNo
     */
    public String getReceiveCardNo() {
        return receiveCardNo;
    }
    /**
     * @param receiveCardNo the receiveCardNo to set
     */
    public void setReceiveCardNo(String receiveCardNo) {
        this.receiveCardNo = receiveCardNo;
    }
    /**
     * @return the receiveName
     */
    public String getReceiveName() {
        return receiveName;
    }
    /**
     * @param receiveName the receiveName to set
     */
    public void setReceiveName(String receiveName) {
        this.receiveName = receiveName;
    }
    /**
     * @return the payErrorNum
     */
    public int getPayErrorNum() {
        return payErrorNum;
    }
    /**
     * @param payErrorNum the payErrorNum to set
     */
    public void setPayErrorNum(int payErrorNum) {
        this.payErrorNum = payErrorNum;
    }
    /**
     * @return the timeOutState
     */
    public String getTimeOutState() {
        return timeOutState;
    }
    /**
     * @param timeOutState the timeOutState to set
     */
    public void setTimeOutState(String timeOutState) {
        this.timeOutState = timeOutState;
    }
    /**
     * @return the verifyFlag
     */
    public String getVerifyFlag() {
        return verifyFlag;
    }
    /**
     * @param verifyFlag the verifyFlag to set
     */
    public void setVerifyFlag(String verifyFlag) {
        this.verifyFlag = verifyFlag;
    }
    /**
     * @return the listId
     */
    public String getListId() {
        return listId;
    }
    /**
     * @param listId the listId to set
     */
    public void setListId(String listId) {
        this.listId = listId;
    }
    /**
     * @return the payListState
     */
    public String getPayListState() {
        return payListState;
    }
    /**
     * @param payListState the payListState to set
     */
    public void setPayListState(String payListState) {
        this.payListState = payListState;
    }
}
