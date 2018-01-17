package com.jst.prodution.base.bean;

public class QueryBean <T> implements java.io.Serializable {
	private static final long serialVersionUID = 1L;
	private String pageCount;
	private String numCount;
	private T data;
	public String getPageCount() {
		return pageCount;
	}
	public void setPageCount(String pageCount) {
		this.pageCount = pageCount;
	}
	public String getNumCount() {
		return numCount;
	}
	public void setNumCount(String numCount) {
		this.numCount = numCount;
	}
	public T getData() {
		return data;
	}
	public void setData(T data) {
		this.data = data;
	}
	

}
