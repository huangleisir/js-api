package com.jst.prodution.paycore.serviceBean;

import java.util.List;

import com.jst.prodution.base.bean.BaseBean;

/**
 * 
* @ClassName: PayCoreRefundOrderQueryListBean 
* @Description: TODO(退款订单查询Bean) 
* @author 曾传保
* @date 2017年12月6日 上午9:40:01 
*
 */
public class PayCoreRefundOrderQueryListBean extends BaseBean{
	private static final long serialVersionUID = 1L;
	
	private String refundNo;			//支付核心退款流水号
	private String payNo;				//支付核心支付流水号
	private String busRefundNo;			//磐石退款流水号
	private String busNo;				//磐石支付交易流水号
	private Long totalAmount;			//原支付订单总金额
	private Long refundAmount;			//退款金额
	private String mchOrderId;			//商户原始订单号
	private String mchRefundId;			//商户原始退款订单号
	private String jstAppId;			//OCD分配的appid	
	private String jstMchId;			//OCD分配的mchid
	private String userId;				//会员号
	private String userName;			//会员名称
	private String externRefundNo;		//外部退款流水号
	private String externTranNo;		//原支付微信，支付宝，预付卡，块钱流水号
	private String orderState;			//退款状态(0-成功，1-处理中，2-失败)
	private String refundFrom;			//退款发起源：0-B门户，1-商户后台(APP),2-OMS,3-自动退款
	private String payChannelId;		//支付方法（比如wx，为微信）
	private String payType;				//支付类型（APP, JSAPI，NATIVE）
	private String storableCardNo;		//银行卡前6后4位
	private String authorizationCode;	//块钱授权码
	private String transTime;			//交易时间
	private String description;			//退款描述
	private String remark;				//备注
	private String createTime;			//创建时间
	private String createUser;			//创建人
	private String updateTime;			//更新时间
	private String updateUser;			//修改人
	private String queryFlag;			//是否支持分页查询(00-支持，01-不支持)
	private List<PayCoreRefundOrderQueryListBean> payCoreRefundOrderList;
	public String getRefundNo() {
		return refundNo;
	}
	public void setRefundNo(String refundNo) {
		this.refundNo = refundNo;
	}
	public String getPayNo() {
		return payNo;
	}
	public void setPayNo(String payNo) {
		this.payNo = payNo;
	}
	public String getBusRefundNo() {
		return busRefundNo;
	}
	public void setBusRefundNo(String busRefundNo) {
		this.busRefundNo = busRefundNo;
	}
	public String getBusNo() {
		return busNo;
	}
	public void setBusNo(String busNo) {
		this.busNo = busNo;
	}
	public Long getTotalAmount() {
		return totalAmount;
	}
	public void setTotalAmount(Long totalAmount) {
		this.totalAmount = totalAmount;
	}
	public Long getRefundAmount() {
		return refundAmount;
	}
	public void setRefundAmount(Long refundAmount) {
		this.refundAmount = refundAmount;
	}
	public String getMchOrderId() {
		return mchOrderId;
	}
	public void setMchOrderId(String mchOrderId) {
		this.mchOrderId = mchOrderId;
	}
	public String getMchRefundId() {
		return mchRefundId;
	}
	public void setMchRefundId(String mchRefundId) {
		this.mchRefundId = mchRefundId;
	}
	public String getJstAppId() {
		return jstAppId;
	}
	public void setJstAppId(String jstAppId) {
		this.jstAppId = jstAppId;
	}
	public String getJstMchId() {
		return jstMchId;
	}
	public void setJstMchId(String jstMchId) {
		this.jstMchId = jstMchId;
	}
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getExternRefundNo() {
		return externRefundNo;
	}
	public void setExternRefundNo(String externRefundNo) {
		this.externRefundNo = externRefundNo;
	}
	public String getExternTranNo() {
		return externTranNo;
	}
	public void setExternTranNo(String externTranNo) {
		this.externTranNo = externTranNo;
	}
	public String getOrderState() {
		return orderState;
	}
	public void setOrderState(String orderState) {
		this.orderState = orderState;
	}
	public String getRefundFrom() {
		return refundFrom;
	}
	public void setRefundFrom(String refundFrom) {
		this.refundFrom = refundFrom;
	}
	public String getPayChannelId() {
		return payChannelId;
	}
	public void setPayChannelId(String payChannelId) {
		this.payChannelId = payChannelId;
	}
	public String getPayType() {
		return payType;
	}
	public void setPayType(String payType) {
		this.payType = payType;
	}
	public String getStorableCardNo() {
		return storableCardNo;
	}
	public void setStorableCardNo(String storableCardNo) {
		this.storableCardNo = storableCardNo;
	}
	public String getAuthorizationCode() {
		return authorizationCode;
	}
	public void setAuthorizationCode(String authorizationCode) {
		this.authorizationCode = authorizationCode;
	}
	
	public String getTransTime() {
		return transTime;
	}
	public void setTransTime(String transTime) {
		this.transTime = transTime;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getRemark() {
		return remark;
	}
	public void setRemark(String remark) {
		this.remark = remark;
	}
	public String getCreateTime() {
		return createTime;
	}
	public void setCreateTime(String createTime) {
		this.createTime = createTime;
	}
	public String getCreateUser() {
		return createUser;
	}
	public void setCreateUser(String createUser) {
		this.createUser = createUser;
	}
	public String getUpdateTime() {
		return updateTime;
	}
	public void setUpdateTime(String updateTime) {
		this.updateTime = updateTime;
	}
	public String getUpdateUser() {
		return updateUser;
	}
	public void setUpdateUser(String updateUser) {
		this.updateUser = updateUser;
	}
	public String getQueryFlag() {
		return queryFlag;
	}
	public void setQueryFlag(String queryFlag) {
		this.queryFlag = queryFlag;
	}
	public List<PayCoreRefundOrderQueryListBean> getPayCoreRefundOrderList() {
		return payCoreRefundOrderList;
	}
	public void setPayCoreRefundOrderList(List<PayCoreRefundOrderQueryListBean> payCoreRefundOrderList) {
		this.payCoreRefundOrderList = payCoreRefundOrderList;
	}
}
