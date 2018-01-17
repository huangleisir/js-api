/**
 * author:汤广海
 * 2017年7月5日
 * 上午9:29:34
 */
package com.jst.prodution.acctfront.serviceBean;

import java.util.List;

import com.jst.prodution.base.bean.BaseBean;

/**
 * @author Administrator
 * 账户批量转账
 */
public class AcctFrontBatchTrafWithBean extends BaseBean {

	private static final long serialVersionUID = 1L;
	
	private String busNo;// 交易核心生成的交易订单流水号 必输
	private List<AcctFrontTransferBean> acctFrontTransferBeans;
	public String getBusNo() {
		return busNo;
	}
	public void setBusNo(String busNo) {
		this.busNo = busNo;
	}
	public List<AcctFrontTransferBean> getAcctFrontTransferBeans() {
		return acctFrontTransferBeans;
	}
	public void setAcctFrontTransferBeans(List<AcctFrontTransferBean> acctFrontTransferBeans) {
		this.acctFrontTransferBeans = acctFrontTransferBeans;
	}

}
