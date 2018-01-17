package com.jst.prodution.merchant.serviceBean;

import com.jst.prodution.base.bean.BaseBean;

/**
 * 查询回款认证错误次数
 * @author Administrator
 *
 */
public class AuthenErrorNumBean extends BaseBean {

	private static final long serialVersionUID = 1L;

	private String listId;					//清单ID
	private Integer errorNum;				//清单错误次数
	private Integer payErrorNum;			//默认错误总数
	
	public String getListId() {
		return listId;
	}
	public void setListId(String listId) {
		this.listId = listId;
	}
	public Integer getErrorNum() {
		return errorNum;
	}
	public void setErrorNum(Integer errorNum) {
		this.errorNum = errorNum;
	}
	public Integer getPayErrorNum() {
		return payErrorNum;
	}
	public void setPayErrorNum(Integer payErrorNum) {
		this.payErrorNum = payErrorNum;
	}
	
}
