package com.jst.prodution.lanefront.serviceBean;

import java.util.List;


import com.jst.prodution.base.bean.BaseBean;

public class LaneFrontInComeListBean extends BaseBean {
	private static final long serialVersionUID = 1L;
//    private String lanefrontInno;
//
    private String laneNo;
//
//    private String channelNo;
//
//    private String channelCode;
//
    private String channelName;

    private String busNo;

//    private Integer busTransDate;
//
//    private String busTranType;
//
//    private String sourceFrom;
//
//    private Integer tranamout;
//
//    private Integer tranfee;

    private String userId;

    private String userName;
    
    private Integer tranamoutSum;

    private Integer tranfeeSum;
//
//    private String mobile;
//
//    private String bankAcctno;
//
//    private String bankAcctnoSuffix;
//
//    private String bankNo;
//
//    private String bankName;
//
//    private String bankSimpleName;
//
//    private String bankBranchname;
//
//    private String bankBranchcode;
//
//    private String bankProvince;
//
//    private String bankCity;
//
//    private String creditCardCvv2;
//
//    private String creditCardYear;
//
//    private String creditCardMonth;
//
//    private String cardType;
//
//    private String cardNo;
//
    private String orderStatus;
//
//    private String remark;
//
//    private String createUser;
//
//    private String updateUser;
//
//    private String createTime;
//
//    private String updateTime;
//    
	private List<LaneFrontInComeInfoBean> laneFrontInComeInfoList;

	public String getLaneNo() {
		return laneNo;
	}

	public void setLaneNo(String laneNo) {
		this.laneNo = laneNo;
	}

	public String getBusNo() {
		return busNo;
	}

	public void setBusNo(String busNo) {
		this.busNo = busNo;
	}

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getChannelName() {
		return channelName;
	}

	public void setChannelName(String channelName) {
		this.channelName = channelName;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public Integer getTranamoutSum() {
		return tranamoutSum;
	}

	public void setTranamoutSum(Integer tranamoutSum) {
		this.tranamoutSum = tranamoutSum;
	}

	public Integer getTranfeeSum() {
		return tranfeeSum;
	}

	public void setTranfeeSum(Integer tranfeeSum) {
		this.tranfeeSum = tranfeeSum;
	}

	public String getOrderStatus() {
		return orderStatus;
	}

	public void setOrderStatus(String orderStatus) {
		this.orderStatus = orderStatus;
	}

	public List<LaneFrontInComeInfoBean> getLaneFrontInComeInfoList() {
		return laneFrontInComeInfoList;
	}

	public void setLaneFrontInComeInfoList(List<LaneFrontInComeInfoBean> laneFrontInComeInfoList) {
		this.laneFrontInComeInfoList = laneFrontInComeInfoList;
	}

}
