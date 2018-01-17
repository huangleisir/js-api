package com.jst.prodution.tran.serviceBean;

import java.util.List;

import com.jst.prodution.base.bean.BaseBean;

public class TranCoreCollectionOrderQueryListBean extends BaseBean {
	
	private static final long serialVersionUID = 7432878064006910594L;

    private String busNo;    //交易流水号

    private String state;    //状态,如查询多个状态，以英文逗号","隔开

    private String busType;//交易类型 1，小贷代扣

    private Long refundAmount; //已退款金额 

    private String linkPayNo; //关联代扣订单号

    private String refundType;//1，退款至余额2,原路返回 

    private Long tranFee;  //手续费

    private String terminalType;//终端类型（M：移动用户，P：PC用户）

    private String deviceType;//设备类型 1安卓，2ios

    private String source;//系统来源1-APP  2-OMS

    private Integer tranDate;  //交易日期

    private String tranTime;  //交易时间

    private String merchantId;//商户号

    private String merchantMemberId;//商户会员号

    private String merchantName;//商户名称

    private String payMemberId;//支付用户ID

    private String payMemberName; //支付用户名

    private String payMemberMobile; //支付用户手机号

    private String merchantExtenalNo;//外部订单号（检索商户订单唯一性）

    private Long tranAmount;  //交易金额

    private String orderName; //订单名称

    private String orderDes;  //订单描述

    private String resultNoticeUrl;//异步通知URL

    private String resultPageUrl; //支付结果跳转URL

    private String sceneCode; //支付场景码

    private String collectionSource;//代扣来源：1-银行卡  2-账户

    private String payType; //微信支付模式：APP、JSAPI、NATIVE   支付宝支付模式：APP、WAP、NATIVE 捷易付支付模式：H5

    private String payChannelId; //支付渠道号 WeChat:微信，Alipay：支付宝，JYF：捷易付

    private String name; //银行卡用户真实姓名 扣款方式为1-银行卡时必输

    private String idCard;//身份证

    private String bankName;//银行名称

    private String bankCard;//银行卡号

    private String channelId;//通道流水号

    private String matchStatus;//对账状态  “00”：未对账 “01”：对账中 “02”：平账 “03”：不平账 “04”：无需对账
   
    private String callType; //订单调账方式1-补单，2-销单,0-正常

    private Integer cutDate; //日切

    private String settlementState; //结算状态0-未结算，1-已结算

    private String settlementNo; //结算流水号

    private Integer settlementDate; //结算日期

    private String remark; //备注
    
    private String resultMsg; //订单处理结果描述

    private String createUser;//创建人（系统默认“99”，其它为运营人员ID号）

    private String updateUser; //最后更新人

    private String createTime; //新增时间

    private String updateTime; //最后更新时间
    
	private String[] states;//0-成功，1-待处理，2-处理中，3-失败,4,已退款5,已过期
	
	private String[] busTypes;//0-成功，1-待处理，2-处理中，3-失败,4,已退款5,已过期

	private Long refundAmountSum;
	
	private Long tranFeeSum;
	
	private Long tranAmountSum;
	
	
    private List<TranCoreCollectionOrderQueryListBean> tranCollectionOrderList; //最后更新时间

    
    public String getBusNo() {
        return busNo;
    }

    public void setBusNo(String busNo) {
        this.busNo = busNo == null ? null : busNo.trim();
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state == null ? null : state.trim();
    }
    
    public String getBusType() {
		return busType;
	}

	public void setBusType(String busType) {
		this.busType = busType;
	}

	public Long getRefundAmount() {
        return refundAmount;
    }

    public void setRefundAmount(Long refundAmount) {
        this.refundAmount = refundAmount;
    }

    public String getLinkPayNo() {
        return linkPayNo;
    }

    public void setLinkPayNo(String linkPayNo) {
        this.linkPayNo = linkPayNo == null ? null : linkPayNo.trim();
    }

    public String getRefundType() {
        return refundType;
    }

    public void setRefundType(String refundType) {
        this.refundType = refundType == null ? null : refundType.trim();
    }

    public String getTerminalType() {
        return terminalType;
    }

    public void setTerminalType(String terminalType) {
        this.terminalType = terminalType == null ? null : terminalType.trim();
    }

    public String getDeviceType() {
        return deviceType;
    }

    public void setDeviceType(String deviceType) {
        this.deviceType = deviceType == null ? null : deviceType.trim();
    }

    public String getSource() {
        return source;
    }

    public void setSource(String source) {
        this.source = source == null ? null : source.trim();
    }

    public Integer getTranDate() {
        return tranDate;
    }

    public void setTranDate(Integer tranDate) {
        this.tranDate = tranDate;
    }

    public String getMerchantId() {
        return merchantId;
    }

    public void setMerchantId(String merchantId) {
        this.merchantId = merchantId == null ? null : merchantId.trim();
    }

    public String getMerchantMemberId() {
        return merchantMemberId;
    }

    public void setMerchantMemberId(String merchantMemberId) {
        this.merchantMemberId = merchantMemberId == null ? null : merchantMemberId.trim();
    }

    public String getMerchantName() {
        return merchantName;
    }

    public void setMerchantName(String merchantName) {
        this.merchantName = merchantName == null ? null : merchantName.trim();
    }

    public String getPayMemberId() {
        return payMemberId;
    }

    public void setPayMemberId(String payMemberId) {
        this.payMemberId = payMemberId == null ? null : payMemberId.trim();
    }

    public String getPayMemberName() {
        return payMemberName;
    }

    public void setPayMemberName(String payMemberName) {
        this.payMemberName = payMemberName == null ? null : payMemberName.trim();
    }

    public String getPayMemberMobile() {
        return payMemberMobile;
    }

    public void setPayMemberMobile(String payMemberMobile) {
        this.payMemberMobile = payMemberMobile == null ? null : payMemberMobile.trim();
    }

    public String getMerchantExtenalNo() {
        return merchantExtenalNo;
    }

    public void setMerchantExtenalNo(String merchantExtenalNo) {
        this.merchantExtenalNo = merchantExtenalNo == null ? null : merchantExtenalNo.trim();
    }

    public Long getTranFee() {
		return tranFee;
	}

	public void setTranFee(Long tranFee) {
		this.tranFee = tranFee;
	}

	public Long getTranAmount() {
		return tranAmount;
	}

	public void setTranAmount(Long tranAmount) {
		this.tranAmount = tranAmount;
	}

	public String getOrderName() {
        return orderName;
    }

    public void setOrderName(String orderName) {
        this.orderName = orderName == null ? null : orderName.trim();
    }

    public String getOrderDes() {
        return orderDes;
    }

    public void setOrderDes(String orderDes) {
        this.orderDes = orderDes == null ? null : orderDes.trim();
    }

    public String getResultNoticeUrl() {
        return resultNoticeUrl;
    }

    public void setResultNoticeUrl(String resultNoticeUrl) {
        this.resultNoticeUrl = resultNoticeUrl == null ? null : resultNoticeUrl.trim();
    }

    public String getResultPageUrl() {
        return resultPageUrl;
    }

    public void setResultPageUrl(String resultPageUrl) {
        this.resultPageUrl = resultPageUrl == null ? null : resultPageUrl.trim();
    }

    public String getSceneCode() {
        return sceneCode;
    }

    public void setSceneCode(String sceneCode) {
        this.sceneCode = sceneCode == null ? null : sceneCode.trim();
    }

    public String getCollectionSource() {
        return collectionSource;
    }

    public void setCollectionSource(String collectionSource) {
        this.collectionSource = collectionSource == null ? null : collectionSource.trim();
    }

    public String getPayType() {
        return payType;
    }

    public void setPayType(String payType) {
        this.payType = payType == null ? null : payType.trim();
    }

    public String getPayChannelId() {
        return payChannelId;
    }

    public void setPayChannelId(String payChannelId) {
        this.payChannelId = payChannelId == null ? null : payChannelId.trim();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public String getIdCard() {
        return idCard;
    }

    public void setIdCard(String idCard) {
        this.idCard = idCard == null ? null : idCard.trim();
    }

    public String getBankName() {
        return bankName;
    }

    public void setBankName(String bankName) {
        this.bankName = bankName == null ? null : bankName.trim();
    }

    public String getBankCard() {
        return bankCard;
    }

    public void setBankCard(String bankCard) {
        this.bankCard = bankCard == null ? null : bankCard.trim();
    }

    public String getChannelId() {
        return channelId;
    }

    public void setChannelId(String channelId) {
        this.channelId = channelId == null ? null : channelId.trim();
    }

    public String getMatchStatus() {
        return matchStatus;
    }

    public void setMatchStatus(String matchStatus) {
        this.matchStatus = matchStatus == null ? null : matchStatus.trim();
    }

    public String getCallType() {
        return callType;
    }

    public void setCallType(String callType) {
        this.callType = callType == null ? null : callType.trim();
    }

    public Integer getCutDate() {
        return cutDate;
    }

    public void setCutDate(Integer cutDate) {
        this.cutDate = cutDate;
    }

    public String getSettlementState() {
        return settlementState;
    }

    public void setSettlementState(String settlementState) {
        this.settlementState = settlementState == null ? null : settlementState.trim();
    }

    public String getSettlementNo() {
        return settlementNo;
    }

    public void setSettlementNo(String settlementNo) {
        this.settlementNo = settlementNo == null ? null : settlementNo.trim();
    }

    public Integer getSettlementDate() {
        return settlementDate;
    }

    public void setSettlementDate(Integer settlementDate) {
        this.settlementDate = settlementDate;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }

    
    public String getResultMsg() {
		return resultMsg;
	}

	public void setResultMsg(String resultMsg) {
		this.resultMsg = resultMsg;
	}

	public String getCreateUser() {
        return createUser;
    }

    public void setCreateUser(String createUser) {
        this.createUser = createUser == null ? null : createUser.trim();
    }

    public String getUpdateUser() {
        return updateUser;
    }

    public void setUpdateUser(String updateUser) {
        this.updateUser = updateUser == null ? null : updateUser.trim();
    }

	public String getTranTime() {
		return tranTime;
	}

	public void setTranTime(String tranTime) {
		this.tranTime = tranTime;
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

	public List<TranCoreCollectionOrderQueryListBean> getTranCollectionOrderList() {
		return tranCollectionOrderList;
	}

	public void setTranCollectionOrderList(List<TranCoreCollectionOrderQueryListBean> tranCollectionOrderList) {
		this.tranCollectionOrderList = tranCollectionOrderList;
	}

	public String[] getStates() {
		return states;
	}

	public void setStates(String[] states) {
		this.states = states;
	}

	public String[] getBusTypes() {
		return busTypes;
	}

	public void setBusTypes(String[] busTypes) {
		this.busTypes = busTypes;
	}

	public Long getRefundAmountSum() {
		return refundAmountSum;
	}

	public void setRefundAmountSum(Long refundAmountSum) {
		this.refundAmountSum = refundAmountSum;
	}

	public Long getTranFeeSum() {
		return tranFeeSum;
	}

	public void setTranFeeSum(Long tranFeeSum) {
		this.tranFeeSum = tranFeeSum;
	}

	public Long getTranAmountSum() {
		return tranAmountSum;
	}

	public void setTranAmountSum(Long tranAmountSum) {
		this.tranAmountSum = tranAmountSum;
	}
	
}
