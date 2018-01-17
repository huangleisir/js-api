package com.jst.prodution.upay.constants;

public class RefundConstants {
	
	/** 退款状态-退款成功*/
	public static final String REFUND_SUCCESS			= "0";
	/** 退款状态-退款中*/
	public static final String REFUND_PENDING			= "1";
	/** 退款状态-退款失败*/
	public static final String REFUND_FAIL				= "2";
	/** 退款状态-退款关闭*/
	public static final String REFUND_CLOSE				= "3";
	/** 退款状态-退款异常*/
	public static final String REFUND_CHANGE			= "4";
	/** 退款状态-退款未确定*/
	public static final String REFUND_NOTSURE			= "5";
	
	
	
	// 微信返回退款状态
	/** 微信返回退款状态-退款成功*/
	public static final String WECHAT_REFUND_SUCCESS			= "SUCCESS"; 		//退款成功
	/** 微信返回退款状态-退款关闭*/
	public static final String WECHAT_REFUND_REFUNDCLOSE		= "REFUNDCLOSE";	//退款关闭
	/** 微信返回退款状态-未确定，需要商户用原退款单号重新发起退款申请。*/
	public static final String WECHAT_REFUND_NOTSURE			= "NOTSURE";		//未确定，需要商户用原退款单号重新发起退款申请。
	/** 微信返回退款状态-退款处理中*/
	public static final String WECHAT_REFUND_PROCESSING			= "PROCESSING";		//退款处理中
	/** 微信返回退款状态-退款异常*/
	public static final String WECHAT_REFUND_CHANGE				= "CHANGE";			//退款异常
	
	
	//兴业微信H5返回退款状态
	/** 兴业微信H5返回退款状态-退款成功*/
	public static final String CIB_REFUND_SUCCESS 				="SUCCESS"; 	//退款成功
	/** 兴业微信H5返回退款状态-退款失败*/
	public static final String CIB_REFUND_FAIL 					="FAIL";		//退款失败
	/** 兴业微信H5返回退款状态-退款处理中*/
	public static final String CIB_REFUND_PROCESSING 			="PROCESSING";	//退款处理中
	/** 兴业微信H5返回退款状态-未确定， 需要商户 需要商户原退款单号重新发起*/
	public static final String CIB_REFUND_NOTSURE 				="NOTSURE";		//未确定， 需要商户 需要商户原退款单号重新发起
	/** 兴业微信H5返回退款状态-转入代发，退款到银行发现用户的卡作废或者冻结了，导致原路退款银行卡失败，资金回流到商户的现金帐号，需要商户人工干预，通过线下或者威富转账*/
	public static final String CIB_REFUND_CHANGE 				="CHANGE";		//转入代发，退款到银行发现用户的卡作废或者冻结了，导致原路退款银行卡失败，资金回流到商户的现金帐号，需要商户人工干预，通过线下或者威富转账
	
}
