package com.jst.prodution.lanefront.serviceBean;

import com.jst.prodution.base.bean.BaseBean;

/**
 * @desc 用户冻结
 * @author junfu_yuan
 * @date 2016年10月8日
 */
public class LaneFrontOutComeBean extends BaseBean {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	//------------------------------ 接口输入参数 begin ------------------------------
		//交易流水号	必输	业务系统流水号(交易核心为交易订单号)。
		private String  busNo;
		// 银行卡号	必输	
		private String  bankAcctNo;
		// 交易金额	必输	 	格式整数，单位为分
		private Long  tranAmount;
		// 业务类型	必输	订单交易类型
		private String  busTranType;
		// 交易日期	必输	 8位整型，例如：20150409
		private Integer  busTransDate;
		// 业务来源	必输	（1-APP，2-OMS）
		private String  sourceFrom;
		// 会员号	必输	
		private String  userId;
		// 会员名称	可输
		private String  userName;
		// 备注	可输	
		private String  remark;
		// 操作用户	可输	 后台操作人必输，默认99
		private String  operUser;
		//------------------------------ 接口输入参数 end ------------------------------

		//------------------------------ 接口输出参数 begin ------------------------------
		// 通道前置流水号(输出)
		private String  laneFrontNo;
		// 通道流水号(输出)
		private String  laneNo;
		// 渠道流水号(输出)
		private String  channelNo;
		// 渠道编码(输出)
		private String  channelCode;
		// 渠道名称(输出)
		private String  channelName;
		// 银行卡号后4位(输出)
		private String bankAcctNoSuffix;
		//------------------------------ 接口输出参数 end ------------------------------
		
		public String getBusNo() {
			return busNo;
		}
		public void setBusNo(String busNo) {
			this.busNo = busNo;
		}
		public String getBankAcctNo() {
			return bankAcctNo;
		}
		public void setBankAcctNo(String bankAcctNo) {
			this.bankAcctNo = bankAcctNo;
		}
		public Long getTranAmount() {
			return tranAmount;
		}
		public void setTranAmount(Long tranAmount) {
			this.tranAmount = tranAmount;
		}
		public String getBusTranType() {
			return busTranType;
		}
		public void setBusTranType(String busTranType) {
			this.busTranType = busTranType;
		}
		public Integer getBusTransDate() {
			return busTransDate;
		}
		public void setBusTransDate(Integer busTransDate) {
			this.busTransDate = busTransDate;
		}
		public String getSourceFrom() {
			return sourceFrom;
		}
		public void setSourceFrom(String sourceFrom) {
			this.sourceFrom = sourceFrom;
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
		public String getRemark() {
			return remark;
		}
		public void setRemark(String remark) {
			this.remark = remark;
		}
		public String getOperUser() {
			return operUser;
		}
		public void setOperUser(String operUser) {
			this.operUser = operUser;
		}
		public String getLaneFrontNo() {
			return laneFrontNo;
		}
		public void setLaneFrontNo(String laneFrontNo) {
			this.laneFrontNo = laneFrontNo;
		}
		public String getLaneNo() {
			return laneNo;
		}
		public void setLaneNo(String laneNo) {
			this.laneNo = laneNo;
		}
		public String getChannelNo() {
			return channelNo;
		}
		public void setChannelNo(String channelNo) {
			this.channelNo = channelNo;
		}
		public String getChannelCode() {
			return channelCode;
		}
		public void setChannelCode(String channelCode) {
			this.channelCode = channelCode;
		}
		public String getChannelName() {
			return channelName;
		}
		public void setChannelName(String channelName) {
			this.channelName = channelName;
		}
		public String getBankAcctNoSuffix() {
			return bankAcctNoSuffix;
		}
		public void setBankAcctNoSuffix(String bankAcctNoSuffix) {
			this.bankAcctNoSuffix = bankAcctNoSuffix;
		}

}
