/*
* Copyright (c) 2015-2018 SHENZHEN GUIYI SCIENCE AND TECHNOLOGY DEVELOP CO., LTD. All rights reserved.
*
* 注意：本内容仅限于深圳市捷顺金科研发有限公司内部传阅，禁止外泄以及用于其他的商业目的 
*/
package com.jst.prodution.push.serviceBean;

import com.jst.prodution.base.bean.BaseBean;

public class PushBean extends BaseBean {

	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private String appid;			//

    private String userid ;
	
	private String clientId ;  //多个以逗号分开

	private String messageType ;
	
	private String title ;
	
	private String mark ;

	private String message ;

	private String url ;
	
	private Object msgData ;

	public String getAppid() {
		return appid;
	}

	public void setAppid(String appid) {
		this.appid = appid;
	}

	public String getUserid() {
		return userid;
	}

	public void setUserid(String userid) {
		this.userid = userid;
	}

	public String getClientId() {
		return clientId;
	}

	public void setClientId(String clientId) {
		this.clientId = clientId;
	}

	public String getMessageType() {
		return messageType;
	}

	public void setMessageType(String messageType) {
		this.messageType = messageType;
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

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public Object getMsgData() {
		return msgData;
	}

	public void setMsgData(Object msgData) {
		this.msgData = msgData;
	}
	


}
