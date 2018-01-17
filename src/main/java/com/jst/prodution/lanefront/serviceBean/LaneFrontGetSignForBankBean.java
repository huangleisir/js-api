package com.jst.prodution.lanefront.serviceBean;

import com.jst.prodution.base.bean.BaseBean;

public class LaneFrontGetSignForBankBean extends BaseBean {
	private static final long serialVersionUID = 1L;

	private String authenflowNo; //系统流水号

    private String userId;  //用户标识

    private String channelCode;//通道编码(001-快钱，002-银联，003-一网通)

    private String state;   //0-成功，1-失败，2-处理中
    
    private String externalRefNumber;// 外部跟踪编号
    
    private String startTime;
    
    private String endTime;
	
    public String getAuthenflowNo() {
        return authenflowNo;
    }

    public void setAuthenflowNo(String authenflowNo) {
        this.authenflowNo = authenflowNo == null ? null : authenflowNo.trim();
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId == null ? null : userId.trim();
    }


    public String getChannelCode() {
        return channelCode;
    }

    public void setChannelCode(String channelCode) {
        this.channelCode = channelCode == null ? null : channelCode.trim();
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state == null ? null : state.trim();
    }

	public String getExternalRefNumber() {
		return externalRefNumber;
	}

	public void setExternalRefNumber(String externalRefNumber) {
		this.externalRefNumber = externalRefNumber;
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

}
