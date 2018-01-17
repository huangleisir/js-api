package com.jst.prodution.lane.serviceBean;

import com.jst.prodution.base.bean.BaseBean;
/**
 * 
* @ClassName: LaneFrontCardRechargeBean 
* @Description: TODO(对外暴露预付卡退款bean) 
* @author 曾传保
* @date 2017年11月7日 上午10:49:13 
*
 */
public class LaneYFKRefundBean extends BaseBean{
 
	private static final long serialVersionUID = 1L;
	
	//入参
	private String refundNo;		//支付核心退款流水号
	private String payNo;			//支付核心支付流水号
	private long refundAmount; 		//退款金额
	
	//出参
	private String yfkRefundNo;		//预付卡退款流水号

	public String getRefundNo() {
        return refundNo;
    }
    public void setRefundNo(String refundNo) {
        this.refundNo = refundNo;
    }
    public String getPayNo() {
        return payNo;
    }
    public void setPayNo(String payNo) {
        this.payNo = payNo;
    }
    public long getRefundAmount() {
		return refundAmount;
	}
	public void setRefundAmount(long refundAmount) {
		this.refundAmount = refundAmount;
	}
	public String getYfkRefundNo() {
		return yfkRefundNo;
	}
	public void setYfkRefundNo(String yfkRefundNo) {
		this.yfkRefundNo = yfkRefundNo;
	}
}
