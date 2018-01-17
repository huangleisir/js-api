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

package com.jst.prodution.settlement.model;

/** 
 * 
 * @Package: com.jst.prodution.settlement.model  
 * @ClassName: TranCoreBackAmtInfoModel 
 * @Description: TODO
 *
 * @author: Administrator 
 * @date: 2017年6月22日 上午10:11:15 
 * @version V1.0 
 

 */
public class TranCoreBackAmtInfoModel implements java.io.Serializable{

    /**
     * 
     */
    private static final long serialVersionUID = 1L;

    private String settAmountType;//结算金额类型(0--结算金额，1--收费金额，2--分润金额)
    
    private Long tranAmount;//交易金额

    private String settStatus;//结算状态（0,--待结算，1--结算成功，2--结算中，3--结算失败）
    
    private Long settAmount;//结算金额(退款金额)

    private String outMchNo;//退款商户号

    private String outMchmemId;//退款商户userId

    private String outMchName;//退款商户名称

    private String inMchNo;//退款资金来源商户号(退款资金由此商户退)

    private String inMchmemId;//退款资金来源商户userId(退款资金由此商户退)

    private String inMchName;//退款资金来源商户名称(退款资金由此商户退)

    private String upMchNo;//退款商户上级商户号

    private String upMchmemId;//退款商户上级userId

    private String upMchName;//退款商户上级商户名称

    public String getSettAmountType() {
        return settAmountType;
    }

    public void setSettAmountType(String settAmountType) {
        this.settAmountType = settAmountType;
    }

    public Long getTranAmount() {
        return tranAmount;
    }

    public void setTranAmount(Long tranAmount) {
        this.tranAmount = tranAmount;
    }

    public Long getSettAmount() {
        return settAmount;
    }

    public void setSettAmount(Long settAmount) {
        this.settAmount = settAmount;
    }

    public String getOutMchNo() {
        return outMchNo;
    }

    public void setOutMchNo(String outMchNo) {
        this.outMchNo = outMchNo;
    }

    public String getOutMchmemId() {
        return outMchmemId;
    }

    public void setOutMchmemId(String outMchmemId) {
        this.outMchmemId = outMchmemId;
    }

    public String getOutMchName() {
        return outMchName;
    }

    public void setOutMchName(String outMchName) {
        this.outMchName = outMchName;
    }

    public String getInMchNo() {
        return inMchNo;
    }

    public void setInMchNo(String inMchNo) {
        this.inMchNo = inMchNo;
    }

    public String getInMchmemId() {
        return inMchmemId;
    }

    public void setInMchmemId(String inMchmemId) {
        this.inMchmemId = inMchmemId;
    }

    public String getInMchName() {
        return inMchName;
    }

    public void setInMchName(String inMchName) {
        this.inMchName = inMchName;
    }

    public String getUpMchNo() {
        return upMchNo;
    }

    public void setUpMchNo(String upMchNo) {
        this.upMchNo = upMchNo;
    }

    public String getUpMchmemId() {
        return upMchmemId;
    }

    public void setUpMchmemId(String upMchmemId) {
        this.upMchmemId = upMchmemId;
    }

    public String getUpMchName() {
        return upMchName;
    }

    public void setUpMchName(String upMchName) {
        this.upMchName = upMchName;
    }

    public String getSettStatus() {
        return settStatus;
    }

    public void setSettStatus(String settStatus) {
        this.settStatus = settStatus;
    }

}
