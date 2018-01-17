package com.jst.prodution.base.bean;

import java.util.Map;

import com.jst.prodution.util.BeanUtils;

public class BaseBean implements java.io.Serializable {

	private static final long serialVersionUID = 1L;
    
	/*
	 * 响应状态 00正常 01 应用异常 02系统异常03客户端提示性异常
	 */
	/** 响应状态-00正常*/
	public static final String RES_TYPE_NORMAL 		= "00";
	/** 响应状态-01 应用异常*/
	public static final String RES_TYPE_APP_ERR 	= "01";
	/** 响应状态-02系统异常*/
	public static final String RES_TYPE_SYS_ERR     = "02";
	/** 响应状态-03客户端提示性异常*/
	public static final String RES_TYPE_PROMPT_ERR    = "03";
	
	public static final String RES_TYPE_CASDSKFR_ERR 	= "01";
	public static final String RES_TYPE_CASDSKFR_SUCCESS= "00";
	
	public static final String RES_CODE_SUCCESS 	= "0000";
	public static final String RES_CODE_FAIL 		= "-1111";
	public static final String MSGCONTENT_SUCCESS 	= "成功";
	/** 系统异常-统一提示语*/
	public static final String SYS_ERR_MSG     = "这是系统异常-统一提示语";

	public static final int DEFAULT_PAGE_NUM = 1;
	public static final int DEFAULT_PAGE_SIZE = 10;

	private Integer currentPage = 1; // 默认当前页为第1页
	private int pageSize = 10; // 默认每页显示10条记录
	private String startTime; // 起始时间
	private String endTime; // 截止时间
    private String tStartTime; // 交易起始时间
    private String tEndTime; // 交易截止时间
	private String resCode; // 响应码
	private String resType; // 响应状态 00正常 01 应用异常 02系统异常 03客户端显示异常
	private String msgContent; // 提示信息
	private String errorMsg;
	private Integer pageCount = 0; // 返回总页数
	private Integer numCount = 0; // 返回总记录数
	private BaseLoginBean baseLoginBean;		   //OMS登录人信息	
	
	private String deviceFinger;	//设备指纹
	private String clientIp;		//客户端ip
	
	private String appVersion;// 版本号 
	
	
	
	/**
     * @return the tStartTime
     */
    public String gettStartTime() {
        return tStartTime;
    }

    /**
     * @param tStartTime the tStartTime to set
     */
    public void settStartTime(String tStartTime) {
        this.tStartTime = tStartTime;
    }

    /**
     * @return the tEndTime
     */
    public String gettEndTime() {
        return tEndTime;
    }

    /**
     * @param tEndTime the tEndTime to set
     */
    public void settEndTime(String tEndTime) {
        this.tEndTime = tEndTime;
    }

    /**
	 * 设置错误信息
	 * 
	 * @param resCode
	 * @param resType
	 *            响应状态，BaseBean.RES_TYPE_xxx
	 * @param msgContent
	 */
	public void setRes(String resCode, String resType, String msgContent) {
		this.resCode = resCode;
		this.resType = resType;
		this.msgContent = msgContent;
	}
	
	public void setRes(String resCode, String resType, String msgContent, String errorMsg) {
		this.resCode = resCode;
		this.resType = resType;
		this.msgContent = msgContent;
		this.errorMsg = errorMsg; 
	}

	public String getErrorMsg() {
		return errorMsg;
	}

	public void setErrorMsg(String errorMsg) {
		this.errorMsg = errorMsg;
	}

	public Integer getCurrentPage() {
		return currentPage;
	}

	public void setCurrentPage(Integer currentPage) {
		this.currentPage = currentPage;
	}

	public String getStartTime() {
		return startTime;
	}

	public void setStartTime(String startTime) {
		this.startTime = startTime;
	}

	public String getEndTime() {
		return endTime;
	}

	public void setEndTime(String endTime) {
		this.endTime = endTime;
	}

	public String getResCode() {
		return resCode;
	}

	public void setResCode(String resCode) {
		this.resCode = resCode;
	}

	public String getResType() {
		return resType;
	}

	public void setResType(String resType) {
		this.resType = resType;
	}

	public String getMsgContent() {
		return msgContent;
	}

	public void setMsgContent(String msgContent) {
		this.msgContent = msgContent;
	}

	public int getPageSize() {
		return pageSize;
	}

	public void setPageSize(int pageSize) {
		this.pageSize = pageSize;
	}

	public Integer getPageCount() {
		return pageCount;
	}

	public void setPageCount(Integer pageCount) {
		this.pageCount = pageCount;
	}

	public Integer getNumCount() {
		return numCount;
	}

	public void setNumCount(Integer numCount) {
		this.numCount = numCount;
	}
	
	public BaseLoginBean getBaseLoginBean() {
		return baseLoginBean;
	}

	public void setBaseLoginBean(BaseLoginBean baseLoginBean) {
		this.baseLoginBean = baseLoginBean;
	}

	public String getDeviceFinger() {
		return deviceFinger;
	}

	public void setDeviceFinger(String deviceFinger) {
		this.deviceFinger = deviceFinger;
	}

	public String getClientIp() {
		return clientIp;
	}

	public void setClientIp(String clientIp) {
		this.clientIp = clientIp;
	}
   
	
	public String getAppVersion() {
		return appVersion;
	}

	public void setAppVersion(String appVersion) {
		this.appVersion = appVersion;
	}

	public Map<String, Object> toMap() throws Exception {
		return BeanUtils.converToMap(this);
	}

	public boolean isSecc() {
		return null == resType || RES_TYPE_NORMAL.equals(resType);
	}
}
