/*
* Copyright (c) 2015-2018 SHENZHEN JST SCIENCE AND TECHNOLOGY DEVELOP CO., LTD. All rights reserved.
*
* 注意：本内容仅限于深圳市捷顺金科研发有限公司内部传阅，禁止外泄以及用于其他的商业目的 
*/
package com.jst.prodution.member.serviceBean;

import com.jst.prodution.base.bean.BaseBean;
import com.jst.prodution.member.model.BankCardInfo;

/**
 * 
 * @Package: com.jst.prodution.member.serviceBean
 * @ClassName: BankCardInfoBean
 * @Description: 查询已绑定卡信息
 *
 * @author: 查询已绑定卡信息
 * @date: 2017年9月15日 上午11:29:27
 * @version V1.0
 * 
 * 
 */
public class BankCardInfoBean extends BaseBean {
	//用户编号
	private String userId;
	//卡号
	private String bankCardNo;
	//银行卡信息
	private BankCardInfo bankCardInfo;
	
	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getBankCardNo() {
		return bankCardNo;
	}

	public void setBankCardNo(String bankCardNo) {
		this.bankCardNo = bankCardNo;
	}

	public BankCardInfo getBankCardInfo() {
		return bankCardInfo;
	}

	public void setBankCardInfo(BankCardInfo bankCardInfo) {
		this.bankCardInfo = bankCardInfo;
	}
}
