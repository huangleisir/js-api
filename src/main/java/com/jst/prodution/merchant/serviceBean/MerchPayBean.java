package com.jst.prodution.merchant.serviceBean;

import com.jst.prodution.base.bean.BaseBean;

/**
 * 商户打款操作bean
 * @author 吴安辉
 *
 */
public class MerchPayBean extends BaseBean {
	
	private static final long serialVersionUID = 1L;

	private String listId;			//清单ID
	private String state;			//操作：0确认打款  1拒绝
	private String mark;			//描述
	
	public String getListId() {
		return listId;
	}
	public void setListId(String listId) {
		this.listId = listId;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getMark() {
		return mark;
	}
	public void setMark(String mark) {
		this.mark = mark;
	}
	
}
