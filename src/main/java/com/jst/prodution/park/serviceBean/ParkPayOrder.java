/*
* Copyright (c) 2015-2018 SHENZHEN GUIYI SCIENCE AND TECHNOLOGY DEVELOP CO., LTD. All rights reserved.
*
* 注意：本内容仅限于深圳市捷顺金科研发有限公司内部传阅，禁止外泄以及用于其他的商业目的 
*/
package com.jst.prodution.park.serviceBean;

import java.io.Serializable;

public class ParkPayOrder implements Serializable {
    /**
     * 
     */
    private static final long serialVersionUID = 1L;

    private String payreqssn;// 支付请求流水

    private String transtype;//交易业务类型   01-正常缴费；02-超时补交；03-退费；04-代扣 

    private String seqamt;//金额

    private String timefordtl;//时长  单位：秒，该笔费用支撑的时长，01-正常缴费、02-超时补交为停车时长、04-代扣；03-退费为费用对应退费的时长

    private String seqstatus;//流水状态 00-无需支付；01-待支付； 02-已支付；03-支付失败无需支付； 11-待退费；12-已退费；13退费失败；

    private String payseq;//支付流水号   02-已支付必填

    private String paytime;//支付时间   02-已支付必填

    private String settleseq;//结算流水

    private String settlestatus;//结算状态

    private String settletime;//结算时间

    private String settleamt;//结算金额

    public String getPayreqssn() {
        return payreqssn;
    }

    public void setPayreqssn(String payreqssn) {
        this.payreqssn = payreqssn;
    }

    public String getTranstype() {
        return transtype;
    }

    public void setTranstype(String transtype) {
        this.transtype = transtype;
    }

    public String getSeqamt() {
        return seqamt;
    }

    public void setSeqamt(String seqamt) {
        this.seqamt = seqamt;
    }

    public String getTimefordtl() {
        return timefordtl;
    }

    public void setTimefordtl(String timefordtl) {
        this.timefordtl = timefordtl;
    }

    public String getSeqstatus() {
        return seqstatus;
    }

    public void setSeqstatus(String seqstatus) {
        this.seqstatus = seqstatus;
    }

    public String getPayseq() {
        return payseq;
    }

    public void setPayseq(String payseq) {
        this.payseq = payseq;
    }

    public String getPaytime() {
        return paytime;
    }

    public void setPaytime(String paytime) {
        this.paytime = paytime;
    }

    public String getSettleseq() {
        return settleseq;
    }

    public void setSettleseq(String settleseq) {
        this.settleseq = settleseq;
    }

    public String getSettlestatus() {
        return settlestatus;
    }

    public void setSettlestatus(String settlestatus) {
        this.settlestatus = settlestatus;
    }

    public String getSettletime() {
        return settletime;
    }

    public void setSettletime(String settletime) {
        this.settletime = settletime;
    }

    public String getSettleamt() {
        return settleamt;
    }

    public void setSettleamt(String settleamt) {
        this.settleamt = settleamt;
    }
    
    
}
