package com.jst.prodution.push.serviceBean;

import java.util.List;
import java.util.Map;

import com.jst.prodution.base.bean.BaseBean;

/**
 * 
 * 
 * @Package: com.jst.prodution.push.serviceBean  
 * @ClassName: NotificationlBean 
 * @Description: 通知推送的bean，直接显示到通知栏（非透传消息）
 *
 * @author: Administrator 
 * @date: 2017年2月10日 上午10:53:08 
 * @version V1.0
 */
public class NotificationBean extends BaseBean {

	private static final long serialVersionUID = 1L;
	
	private String msgid ;          //
	private String appid;			//
	private String appkey;			//
	private List<String> userIds ;         //会员号列表
	private String msgCode ;
	private String msgData ;
	private String title;			//标题
	private String mark;		    //摘要
	private int actionType;		//动作，1：打开app，2：打开url,3:透传消息（1、2通知栏会有通知，3是客户端自行处理）
	private String content;			//消息内容 
	private String url;				//url
	private String msgExpires;		//消息过期时间，单位为秒，默认86400（一天）
	private boolean online = false ;        // 是否只推送在线消息，默认推送离线
	private int outExpires = 86400;		//离线消息过期时间，单位为秒，默认86400（一天）
	public String getMsgid() {
		return msgid;
	}
	public void setMsgid(String msgid) {
		this.msgid = msgid;
	}
	public String getAppid() {
		return appid;
	}
	public void setAppid(String appid) {
		this.appid = appid;
	}
	public String getAppkey() {
		return appkey;
	}
	public void setAppkey(String appkey) {
		this.appkey = appkey;
	}

	public List<String> getUserIds() {
		return userIds;
	}
	public void setUserIds(List<String> userIds) {
		this.userIds = userIds;
	}
	
	public String getMsgCode() {
		return msgCode;
	}
	public void setMsgCode(String msgCode) {
		this.msgCode = msgCode;
	}
	public String getMsgData() {
		return msgData;
	}
	public void setMsgData(String msgData) {
		this.msgData = msgData;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getMark() {
		return mark;
	}
	public void setMark(String mark) {
		this.mark = mark;
	}
	public int getActionType() {
		return actionType;
	}
	public void setActionType(int actionType) {
		this.actionType = actionType;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public String getUrl() {
		return url;
	}
	public void setUrl(String url) {
		this.url = url;
	}
	public String getMsgExpires() {
		return msgExpires;
	}
	public void setMsgExpires(String msgExpires) {
		this.msgExpires = msgExpires;
	}
	public boolean isOnline() {
		return online;
	}
	public void setOnline(boolean online) {
		this.online = online;
	}
	public int getOutExpires() {
		return outExpires;
	}
	public void setOutExpires(int outExpires) {
		this.outExpires = outExpires;
	}
	@Override
	public String toString() {
		return "NotificationBean [msgid=" + msgid + ", appid=" + appid + ", appkey=" + appkey + ", userIds=" + userIds
				+ ", msgCode=" + msgCode + ", msgData=" + msgData + ", title=" + title + ", mark=" + mark
				+ ", actionType=" + actionType + ", content=" + content + ", url=" + url + ", msgExpires=" + msgExpires
				+ ", online=" + online + ", outExpires=" + outExpires + "]";
	}
	

	
}
