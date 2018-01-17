package com.jst.prodution.merchant.model;

/**
 * 打款记录model
 * @author Administrator
 *
 */
public class MerchantPayRecord implements java.io.Serializable{

	private static final long serialVersionUID = 1L;
	
	private String logId;				//ID
	private String listId;				//清单ID
	private String state;				//状态：1打款成功 2打款失败 3通道超时
	private String mark;				//备注
	private String creator;				//创建者
	private String createTime;			//创建时间
	
	public String getLogId() {
		return logId;
	}
	public void setLogId(String logId) {
		this.logId = logId;
	}
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
	public String getCreator() {
		return creator;
	}
	public void setCreator(String creator) {
		this.creator = creator;
	}
	public String getCreateTime() {
		return createTime;
	}
	public void setCreateTime(String createTime) {
		this.createTime = createTime;
	}

}
