package com.jst.prodution.constants;

public class UnionpayRespCode {
	/**
	 * 发生未知异常,需查看后台日志
	 */
	public static final String UNKNOW_EXCEPTION = "UNIONPAY111";
	/**
	 * 成功
	 */
	public static final String SUCCESS = "UNIONPAY000";
	/**
	 * 传入的bean对象为空
	 */
	public static final String BEAN_OBJ_IS_NULL = "UNIONPAY001";
	/**
	 * 订单交易时间为空
	 */
	public static final String ORDER_TRADE_TIME_IS_BLANK = "UNIONPAY002";
	/**
	 * 订单号为空
	 */
	public static final String ORDER_ID_IS_BLANK = "UNIONPAY003";
	/**
	 * 姓名为空
	 */
	public static final String FULL_NAME_IS_BLANK = "UNIONPAY004";
	/**
	 * 响应结果为空
	 */
	public static final String RESP_RESULT_IS_BLANK = "UNIONPAY005";
	/**
	 * 银联返回码不为零
	 */
	public static final String RETURN_CODE_IS_NOT_ZERO = "UNIONPAY006";
	/**
	 * 订单处理中或交易状态未明，需稍后发起交易状态查询交易
	 */
	public static final String TRADE_STATUS_UNKONW = "UNIONPAY007";
	/**
	 * 订单交易失败
	 */
	public static final String ORDER_TRADE_FAIL = "UNIONPAY008";
	/**
	 * 消费查询失败
	 */
	public static final String CONSUME_QUERY_FAIL = "UNIONPAY009";
	/**
	 * 消费回调程序执行成功
	 */
	public static final String CONSUME_SUCCESS = "UNIONPAY010";
	/**
	 * 消费回调程序执行失败
	 */
	public static final String CONSUME_FAIL = "UNIONPAY011";
	/**
	 * 通知参数是空的
	 */
	public static final String NOTICE_PARAM_IS_NULL = "UNIONPAY011";
	/**
	 * 验证签名失败
	 */
	public static final String VALIDATE_SIGN_FAIL = "UNIONPAY012";
	/**
	 * 消费金额是零
	 */
	public static final String CONSUME_MONEY_IS_ZERO = "UNIONPAY013";
	/**
	 * token无效
	 */
	public static final String TOKEN_INVALID = "UNIONPAY014";
	/**
	 * 订单不存在
	 */
	public static final String ORDER_NO_EXISTS = "UNIONPAY015";

}
