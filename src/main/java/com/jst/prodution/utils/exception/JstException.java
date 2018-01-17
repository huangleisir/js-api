package com.jst.prodution.utils.exception;

import com.jst.prodution.base.bean.BaseBean;

/**
 * jst异常类
 * 默认应用异常
 * @author 
 *
 */
public class JstException extends RuntimeException  {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private String messageCode;
	private String resType = BaseBean.RES_TYPE_APP_ERR;		//响应状态 00正常 01 应用异常 02系统异常 03客户端显示异常
	private String messageContent;
	private Throwable cause;
	public JstException(String messageId,String resType,String messageContent, Throwable cause){
		super(messageContent, cause);
		this.messageCode = messageId;
		this.messageContent = messageContent;
		this.resType = resType;
		this.cause = cause;
	}
	
	public JstException(String messageId,String resType,String messageContent){
		super(messageContent);
		this.messageCode = messageId;
		this.messageContent = messageContent;
		this.resType = resType;
	}
	
	/**
	 * 默认应用异常
	 * @param messageId
	 * @param messageContent
	 */
	public JstException(String messageId,String messageContent, Throwable cause){
		super(messageContent, cause);
		this.messageCode = messageId;
		this.messageContent = messageContent;
		this.resType = BaseBean.RES_TYPE_APP_ERR;
		this.cause = cause;
	}
	
	/**
	 * 默认应用异常
	 * @param messageId
	 * @param messageContent
	 */
	public JstException(String messageId,String messageContent){
		super(messageContent);
		this.messageCode = messageId;
		this.messageContent = messageContent;
	}
	
	public String getMessageCode() {
		return messageCode;
	}

	public void setMessageCode(String messageCode) {
		this.messageCode = messageCode;
	}

	public Throwable getCause() {
		return cause;
	}

	public void setCause(Throwable cause) {
		this.cause = cause;
	}

	public String getMessageContent() {
		return messageContent;
	}
	public void setMessageContent(String messageContent) {
		this.messageContent = messageContent;
	}
	public String getResType() {
		return resType;
	}
	public void setResType(String resType) {
		this.resType = resType;
	}
}
