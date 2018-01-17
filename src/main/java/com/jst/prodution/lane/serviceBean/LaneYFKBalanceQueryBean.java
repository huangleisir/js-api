package com.jst.prodution.lane.serviceBean;

import com.jst.prodution.base.bean.BaseBean;
/**
 * 
* @ClassName: LaneFrontCardRechargeBean 
* @Description: TODO(对外暴露预付卡余额查询bean) 
* @author 曾传保
* @date 2017年11月7日 上午10:49:13 
*
 */
public class LaneYFKBalanceQueryBean extends BaseBean{

	private static final long serialVersionUID = 1L;
	/**入参*/
	private String cardNo;//卡号
	
	/**出参*/
	private long balance;//余额
	
	public String getCardNo() {
		return cardNo;
	}

	public void setCardNo(String cardNo) {
		this.cardNo = cardNo;
	}

	public long getBalance() {
		return balance;
	}

	public void setBalance(long balance) {
		this.balance = balance;
	}

}
