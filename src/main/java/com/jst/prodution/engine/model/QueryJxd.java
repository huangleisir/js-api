package com.jst.prodution.engine.model;

import java.util.List;

import com.jst.prodution.base.bean.BaseBean;

/**
 * 小贷对账结果信息查询Bean(模糊查询)
 * @author tomy
 *
 */
public class QueryJxd implements java.io.Serializable {

	private static final long serialVersionUID = 1L;
	
	private String startDate ;//开始交易日期
	private String endDate;//结束交易日期
	private String mchnNo;//商户号码
	private String tranOrderNo;//交易订单号
	private String payOrderNo;//支付订单号
	private String payDirection;//支付方向:代扣/代付
	private String tranAmt;//支付订单号
	private String tranTime;//交易时间
	private String tranDate;//交易日期
	
    /**
     * @return the startDate
     */
    public String getStartDate() {
        return startDate;
    }
    /**
     * @param startDate the startDate to set
     */
    public void setStartDate(String startDate) {
        this.startDate = startDate;
    }
    /**
     * @return the endDate
     */
    public String getEndDate() {
        return endDate;
    }
    /**
     * @param endDate the endDate to set
     */
    public void setEndDate(String endDate) {
        this.endDate = endDate;
    }
    /**
     * @return the mchnNo
     */
    public String getMchnNo() {
        return mchnNo;
    }
    /**
     * @param mchnNo the mchnNo to set
     */
    public void setMchnNo(String mchnNo) {
        this.mchnNo = mchnNo;
    }
    /**
     * @return the tranOrderNo
     */
    public String getTranOrderNo() {
        return tranOrderNo;
    }
    /**
     * @param tranOrderNo the tranOrderNo to set
     */
    public void setTranOrderNo(String tranOrderNo) {
        this.tranOrderNo = tranOrderNo;
    }
    /**
     * @return the payOrderNo
     */
    public String getPayOrderNo() {
        return payOrderNo;
    }
    /**
     * @param payOrderNo the payOrderNo to set
     */
    public void setPayOrderNo(String payOrderNo) {
        this.payOrderNo = payOrderNo;
    }
    /**
     * @return the payDirection
     */
    public String getPayDirection() {
        return payDirection;
    }
    /**
     * @param payDirection the payDirection to set
     */
    public void setPayDirection(String payDirection) {
        this.payDirection = payDirection;
    }
    /**
     * @return the tranAmt
     */
    public String getTranAmt() {
        return tranAmt;
    }
    /**
     * @param tranAmt the tranAmt to set
     */
    public void setTranAmt(String tranAmt) {
        this.tranAmt = tranAmt;
    }
    /**
     * @return the tranTime
     */
    public String getTranTime() {
        return tranTime;
    }
    /**
     * @param tranTime the tranTime to set
     */
    public void setTranTime(String tranTime) {
        this.tranTime = tranTime;
    }
    /**
     * @return the tranDate
     */
    public String getTranDate() {
        return tranDate;
    }
    /**
     * @param tranDate the tranDate to set
     */
    public void setTranDate(String tranDate) {
        this.tranDate = tranDate;
    }




}
