package com.jst.prodution.upay.constants;

public class ResultCodeConstants {
	/** 微信返回码前缀*/
	public static final String WX_CODE_PREFIX		= "OCDW_";			//微信返回码前缀
	/** 支付宝返回码前缀*/
	public static final String ALI_CODE_PREFIX		= "OCDA_";			//微信返回码前缀
	
	/**
	 * 微信官网返回的错误码
	 */
	public static class WXResultCode{
		public static final String ORDERNOTEXIST 			= "ORDERNOTEXIST"; 			//此交易订单号不存在
		public static final String REFUNDNOTEXIST			= "REFUNDNOTEXIST";			//退款订单查询失败
		public static final String BIZERR_NEED_RETRY		= "BIZERR_NEED_RETRY";		//退款业务流程错误，需要商户触发重试来解决
		public static final String TRADE_OVERDUE 			= "TRADE_OVERDUE";			//订单已经超过退款期限
		public static final String ERROR					= "ERROR";					//业务错误
		public static final String USER_ACCOUNT_ABNORMAL 	= "USER_ACCOUNT_ABNORMAL";	//退款请求失败
		public static final String INVALID_REQ_TOO_MUCH 	= "INVALID_REQ_TOO_MUCH";	//无效请求过多
		public static final String NOTENOUGH 				= "NOTENOUGH";				//余额不足
		public static final String INVALID_TRANSACTIONID 	= "INVALID_TRANSACTIONID";	//无效transaction_id
		public static final String PARAM_ERROR 				= "PARAM_ERROR";			//参数错误
		public static final String APPID_NOT_EXIST 			= "APPID_NOT_EXIST";		//APPID不存在
		public static final String MCHID_NOT_EXIST 			= "MCHID_NOT_EXIST";		//MCHID不存在
		public static final String REQUIRE_POST_METHOD 		= "REQUIRE_POST_METHOD";	//请使用post方法
		public static final String SIGNERROR 				= "SIGNERROR";				//签名错误
		public static final String XML_FORMAT_ERROR 		= "XML_FORMAT_ERROR";		//XML格式错误
		public static final String FREQUENCY_LIMITED 		= "FREQUENCY_LIMITED";		//频率限制
		public static final String USERPAYING				= "USERPAYING";				//用户支付中，需要输入密码
	}
	
	/**
	 * 支付宝官网返回的错误码
	 */
	public static class AliResultCode{
		public static final String TRADE_NOT_EXIST 		= "ACQ.TRADE_NOT_EXIST";	//订单不存在
		public static final String INVALID_SIGNATURE	= "isv.invalid-signature";  //无效签名
		
	}
	
	//系统配置、初始化、调用异常
	/** 初始化微信支付参数失败*/
	public static final String INIT_WECHAT_PAY_CONFIG_ERR		= "OCD10001";  	//初始化微信支付参数失败
	/** 获取微信支付凭证失败*/
	public static final String GET_WECHAT_CHARGE_ERR			= "OCD10002";  	//获取微信支付凭证失败
	/** 微信支付未知异常*/
	public static final String WECHAT_PAY_UNKNOW_ERR			= "OCD10003";  	//微信支付未知异常
	/** 订单不存在*/
	public static final String ORDER_NOT_EXIT					= "OCD10004";	//订单不存在
	/** 退款单不存在*/
	public static final String REFUND_NOT_EXIST					= "OCD10005";	//退款单不存在
	/** 初始化微信退款参数失败*/
	public static final String INIT_WECHAT_REFUND_CONFIG_ERR	= "OCD10006";	//初始化微信退款参数失败
	/** 微信退款未知异常*/
	public static final String WECHAT_REFUND_UNKNOW_ERR			= "OCD10008";	//微信退款未知异常
	/** 查询失败，没有查询到退款记录*/
	public static final String GET_REFUND_RECORD_ERR			= "OCD10010";	//查询失败，没有查询到退款记录
	/** 您没有支付权限或支付账户信息未配置*/
	public static final String INIT_PAYMENT_CONFIG_ERR			= "OCD10011";	//您没有支付权限或支付账户信息未配置
	/** 申请微信退款失败*/
	public static final String APPLY_FOR_WECHAR_REFUND_ERR		= "OCD10012";	//申请微信退款失败
	/** 查询支付账户信息异常*/
	public static final String GET_PAYMENT_CONFIG_ERR			= "OCD10013";	//查询支付账户信息异常
	/** 查询openId失败*/
	public static final String GET_OPENID_ERR					= "OCD10014";	//查询openId失败
	/** 插入openId失败*/
	public static final String INSERT_OPENID_ERR				= "OCD10015";	//插入openId失败
	/** 更新微信退款记录失败*/
	public static final String UPDATE_WECHAT_REFUND_RECORD_ERR	= "OCD10016";	//更新微信退款记录失败
	/** 查询失败，没有查询到渠道支付帐号*/
	public static final String NULL_PAYMENT_ACCOUNT_RECORD		= "OCD10017";	//查询失败，没有查询到渠道支付帐号
	/** 解析兴业通知参数错误*/
	public static final String MARSHAL_CIB_XML_ERR				= "OCD10018";	//解析兴业通知参数错误
	
	
	
	
	
	//业务参数异常
	/** 微信通道参数错误*/
	public static final String PARAMS_ERR 				= "10001";				//微信通道参数错误
	/** payChannelId支付渠道不能为空*/
	public static final String NULL_PAY_CHANNEL_ID 		= "OCD20001";			//payChannelId支付渠道不能为空
	/** payType支付方式不能为空*/
	public static final String NULL_PAY_TYPE 			= "OCD20002";			//payType支付方式不能为空
	/** orderId商户订单号不能为空*/
	public static final String NULL_ORDER_ID 			= "OCD20003";			//orderId商户订单号不能为空
	/** subject商品名称描述不能空*/
	public static final String NULL_SUBJECT 			= "OCD20004";			//subject商品名称描述不能空
	/** totalAmount订单金额不能空*/
	public static final String NULL_TOTAL_AMOUNT 		= "OCD20005";			//totalAmount订单金额不能空
	/** openId不能为空*/
	public static final String NULL_OPEN_ID				= "OCD20006";       	//openId不能为空
	/** orderId商户订单号重复*/
	public static final String DUPLICATE_ORDER_ID		= "OCD20007";			//orderId商户订单号重复
	/** busNo支付流水号不能为空*/
	public static final String NULL_BUS_NO				= "OCD20008";			//busNo支付流水号不能为空
	/** busRefundNo退款流水号不能为空*/
	public static final String NULL_BUS_REFUND_NO		= "OCD20009";			//busRefundNo退款流水号不能为空
	/** refundAmount退款金额不能为空*/
	public static final String NULL_REFUND_AMOUNT		= "OCD20010";			//refundAmount退款金额不能为空
	/** busNo支付流水号重复*/
	public static final String DUPLICATE_BUS_NO			= "OCD20011";			//busNo支付流水号重复
	/** 商户输入总额与订单金额不一致*/
	public static final String INPUT_TOTAL_AMOUNT_NOT_EQUALS_ORDER_AMOUNT	= "OCD20011";	//商户输入总额与订单金额不一致
	/** busNo支付流水号或者busRefundNo退款流水号不能为空必填一个*/
//		public static final String NULL_BUS_NO_OR_BUS_REFUND_NO  				= "OCD20012";	//busNo支付流水号或者busRefundNo退款流水号不能为空必填一个
	
	/** jstAppName不能为空*/
	public static final String NULL_JST_APP_NAME		= "OCD20013";			//jstAppName金科App名称不能为空	
	/** jstAppId不能为空*/
	public static final String NULL_JST_APP_ID			= "OCD20014";			//jstAppId金科AppId不能为空	
	/** jstMchId不能为空*/
	public static final String NULL_JST_MCH_ID			= "OCD20015";			//jstMchId金科商户号不能为空	
	/** jstKey不能为空*/
	public static final String NULL_JST_KEY				= "OCD20016";			//jstKey金科商户密钥不能为空
	
	/** appId不能为空*/
	public static final String NULL_APP_ID				= "OCD20017";			//appId渠道AppId不能为空	
	/** mchId不能为空*/
	public static final String NULL_MCH_ID				= "OCD20018";			//mchId渠道商户号不能为空	
	/** key不能为空*/
	public static final String NULL_KEY					= "OCD20019";			//key渠道商户密钥不能为空
	/** appSecret不能为空*/
	public static final String NULL_APP_SECRET			= "OCD20020";			//appSecret渠道AppSecret不能为空
	/** notifyUrl不能为空*/
	public static final String NULL_NOTIFY_URL			= "OCD20021";			//notifyUrl后台通知地址不能为空
	/** certPath不能为空*/
	public static final String NULL_CERT_PATH			= "OCD20022";			//certPath渠道证书路径不能为空
	/** appRemarks不能为空*/
	public static final String NULL_APP_REMARKS			= "OCD20023";			//appRemarks不能为空
	/** payNo支付流水号不能为空*/
	public static final String NULL_PAY_NO				= "OCD20024";			//payNo支付流水号不能为空
	/** responseXml微信通知报文不能为空*/
	public static final String NULL_RESPONSE_XML		= "OCD20025";			//responseXml微信通知报文不能为空
	/** refundNo退款流水号不能为空*/
	public static final String NULL_REFUND_NO			= "OCD20026";			//refundNo退款流水号不能为空
	/** aliResponseParamMap支付宝通知报文不能为空*/
	public static final String NULL_RESPONSE_PARAM		= "OCD20027";			//aliResponseParamMap支付宝通知报文不能为空
	/** 被扫authCode授权码不能为空*/
	public static final String NULL_AUTHCODE            = "OCD20028";           //被扫authCode授权码不能为空
	/** 被扫scene场景码不能为空*/
    public static final String NULL_SCENE            = "OCD20029";           //被扫scene场景码不能为空
	
	//支付宝相关
	/** 初始化支付宝支付参数失败*/
    public static final String INIT_ALI_PAY_CONFIG_ERR          	= "OCD30001";   //初始化支付宝支付SDK核心参数失败
    /** 支付宝查询时出现异常*/
    public static final String ALI_PAY_QUERY_ERR                	= "OCD30002";   //支付宝查询时出现异常
    /** 申请支付宝退款失败*/
    public static final String APPLY_FOR_ALIPAY_REFUND_ERR      	= "OCD30003";   //申请支付宝退款失败
    /** 支付宝退款记录查询失败*/
    public static final String ALIPAY_REFUND_QUERY_ERR      		= "OCD30005";    //支付宝退款记录查询失败
    /** 支付宝生成支付单信息出现异常*/
    public static final String GET_ALIPAY_PYA_ORDER_INFO_ERR     	= "OCD30007";   //支付宝生成支付单信息出现异常
    /** 更新支付宝退款单状态出现异常*/
    public static final String UPDATE_ALIPAY_REFUND_ORDER_ERR     	= "OCD30008";   //更新支付宝退款单状态出现异常
    /** 签名异常*/
    public static final String ALI_SING_ERR     					= "OCD30009";   //签名异常
	
		
}
