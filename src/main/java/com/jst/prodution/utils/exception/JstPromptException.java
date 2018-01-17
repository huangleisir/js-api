package com.jst.prodution.utils.exception;

import com.jst.prodution.base.bean.BaseBean;

/**
 *@description:jst异常类,用于提示性异常
 *@author  widon
 *@date: 2017年6月16日 上午10:15:41
 *@since: JDK 1.8
 *@version:V1.0.0
 */
public class JstPromptException extends RuntimeException  {
    
	private static final long serialVersionUID = 1L;

	private String messageCode;
	private String resType = BaseBean.RES_TYPE_PROMPT_ERR;		//响应状态 00正常 01 应用异常 02系统异常 03客户端提示异常
	private String messageContent;
	private Throwable cause;

	
	/**
	 * 默认提示性异常
	 * @param messageId
	 * @param messageContent
	 */
	public JstPromptException(String messageCode,String messageContent, Throwable cause){
		super(messageContent, cause);
		this.messageCode = messageCode;
		this.messageContent = messageContent;
		this.cause = cause;
	}
	
	/**
	 * 默认提示性异常
	 * @param messageId
	 * @param messageContent
	 */
	public JstPromptException(String messageCode,String messageContent){
		super(messageContent);
		this.messageCode = messageCode;
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
