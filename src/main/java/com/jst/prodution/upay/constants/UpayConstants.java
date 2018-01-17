package com.jst.prodution.upay.constants;

public class UpayConstants {
	
	//支付渠道
	/** 统一支付平台-支付渠道-微信支付 */
	public static final String PAY_CHANNEL_ID_WECHAT  	= "WeChat";		//微信
	/** 统一支付平台-支付渠道-捷易付 */	
	public static final String PAY_CHANNEL_ID_JYF 		= "JYF";		//捷易付
	/** 统一支付平台-支付渠道-支付宝支付 */
	public static final String PAY_CHANNEL_ID_ALIPAY 	= "Alipay";		//支付宝
		
	//支付方式
	/** 支付方式-APP支付 */
	public static final String PAY_TYPE_APP 	= "APP";		//微信、支付宝APP支付
	/** 支付方式-扫码支付 */
	public static final String PAY_TYPE_NATIVE 	= "NATIVE";		//微信、支付宝原生扫码支付
	/** 支付方式-微信H5支付 */
	public static final String PAY_TYPE_JSAPI 	= "JSAPI";		//微信H5支付
	/** 支付方式-支付宝网页支付 */
	public static final String PAY_TYPE_WAP 	= "WAP";		//支付宝网页支付
	/** 支付方式-捷易付H5支付 */
	public static final String PAY_TYPE_H5 		= "H5";			//捷易付H5支付
	/** 支付方式-兴业H5支付 */
	public static final String PAY_TYPE_CIBH5	= "CIBH5";		//兴业H5	
	/** 支付方式-条码支付 */
	public static final String PAY_TYPE_BARCODE = "BARCODE";	//条码支付
	
	
	//OCD订单状态
	/**支付状态-支付成功*/
	public static final String PAYMENT_SUCCESS 	= "0";				//支付成功
	/**支付状态-未支付*/
	public static final String PAYMENT_UNPAY 	= "1";				//未支付
	/**支付状态-支付处理中*/
	public static final String PAYMENT_PENDING 	= "2";				//支付处理中
	/**支付状态-支付失败*/
	public static final String PAYMENT_FAIL 	= "3";				//支付失败
	/**支付状态-订单关闭*/
	public static final String PAYMENT_CLOSED 	= "4";				//订单关闭
	/**支付状态-未知*/
	public static final String PAYMENT_UNKNOW	= "5";				//未知  (弃用 add by wanghuai 20171019)
	/**交易结束，不可退款(支付宝)*/
	public static final String PAYMENT_FINISH   = "6";              //交易结束，不可退款(支付宝)
	/**转入退款*/
	public static final String PAYMENT_REFUND	= "7";				//转入退款(微信)
	/**已撤销(刷卡支付)*/
	public static final String PAYMENT_REVOKED	= "8";				//已撤销(刷卡支付)
	
	/**
	 * 支付宝交易状态：
	 * WAIT_BUYER_PAY（交易创建，等待买家付款）、
	 * TRADE_CLOSED（未付款交易超时关闭，或支付完成后全额退款）、
	 * TRADE_SUCCESS（交易支付成功）、
	 * TRADE_FINISHED（交易结束，不可退款）
	 */
	public static class AliPaymentStatus{
	    /**支付状态-交易创建，等待买家付款*/
	    public static final String WAIT_BUYER_PAY  = "WAIT_BUYER_PAY";    // 1       
	    /**支付状态-未付款交易超时关闭，或支付完成后全额退款*/
	    public static final String TRADE_CLOSED    = "TRADE_CLOSED";        // 4     
	    /**支付状态-交易支付成功*/
	    public static final String TRADE_SUCCESS  = "TRADE_SUCCESS";        // 0     
	    /**支付状态-交易结束，不可退款*/
	    public static final String TRADE_FINISHED    = "TRADE_FINISHED";     //       
	}
	
	/**
	 * 
	 * @Package: com.jst.prodution.upay.constants
	 * @ClassName: UpayConstants.java
	 * @Description: 
	 *
	 * @author: wanghuai
	 * @date: 2017年10月20日 下午5:14:19 
	 * @version: V1.0
	 *
	 */
	public static class WeChatPaymentStatus{
	    /**支付状态-交易创建，等待买家付款*/
	    public static final String WAIT_BUYER_PAY  = "WAIT_BUYER_PAY";    // 1       
	    /**支付状态-未付款交易超时关闭，或支付完成后全额退款*/
	    public static final String TRADE_CLOSED    = "TRADE_CLOSED";        // 4     
	    /**支付状态-交易支付成功*/
	    public static final String TRADE_SUCCESS  = "TRADE_SUCCESS";        // 0     
	    /**支付状态-交易结束，不可退款*/
	    public static final String TRADE_FINISHED    = "TRADE_FINISHED";     //       
	}
}
