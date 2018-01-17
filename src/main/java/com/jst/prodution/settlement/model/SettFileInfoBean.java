package com.jst.prodution.settlement.model;

import java.io.Serializable;
/**
 * 
* @ClassName: SettFileInfoBean 
* @Description: TODO(二清对账文件信息Model) 
* @author 曾传保
* @date 2017年9月21日 下午1:53:29 
*
 */
public class SettFileInfoBean implements Serializable{
	
	private static final long serialVersionUID = 1L;
	
	private String id;
	private String fileName;
	private String userName;
	private String channelType;
	private String lineCnt;
	private String tranDate;
	private String createDate;
	private String createTime;
	private String updateTime;
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getFileName() {
		return fileName;
	}
	public void setFileName(String fileName) {
		this.fileName = fileName;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getChannelType() {
		return channelType;
	}
	public void setChannelType(String channelType) {
		this.channelType = channelType;
	}
	public String getLineCnt() {
		return lineCnt;
	}
	public void setLineCnt(String lineCnt) {
		this.lineCnt = lineCnt;
	}
	public String getTranDate() {
		return tranDate;
	}
	public void setTranDate(String tranDate) {
		this.tranDate = tranDate;
	}
	public String getCreateDate() {
		return createDate;
	}
	public void setCreateDate(String createDate) {
		this.createDate = createDate;
	}
	public String getCreateTime() {
		return createTime;
	}
	public void setCreateTime(String createTime) {
		this.createTime = createTime;
	}
	public String getUpdateTime() {
		return updateTime;
	}
	public void setUpdateTime(String updateTime) {
		this.updateTime = updateTime;
	}
}
