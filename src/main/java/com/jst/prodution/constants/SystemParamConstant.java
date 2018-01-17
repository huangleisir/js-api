package com.jst.prodution.constants;

/** 
 * @ClassName: SystemParamConstant 
 * @Description: 常量定义
 * @author public <> 
 * @date 2014-10-16 下午2:02:51 
 *  
 */
public class SystemParamConstant {
	
	public static final String NULL_PARAMS = "MB00001";				//参数Bean为空
	public static final String EMPTY_USER_ID = "MB00002";			//会员ID为空
	public static final String EMPTY_BANK_CARD_CODE = "MB00003";	//银行卡号为空
	public static final String EMPTY_BANK_TYPE = "MB00004";			//银行卡类型为空
	public static final String EMPTY_CERT_TYPE = "MB00005";			//证件类型为空
	public static final String EMPTY_CERT_CODE = "MB00006";			//证件号码为空
	public static final String EMPTY_TELPHONE = "MB00007";			//手机号为空
	public static final String EMPTY_EXPIREDATE = "MB00008";		//有效期为空
	public static final String EMPTY_SAFETY_CODE = "MB00009";		//安全码为空
	public static final String EMPTY_FORBIDDEN_FLAG = "MB00010";	//会员禁用标识为空
	public static final String EMPTY_ACCOUNT_TYPE = "MB00011";		//账户类型为空
	public static final String EMPTY_USER_CODE = "MB00012";			//账号（邮箱）为空
	public static final String EMPTY_USER_PASSWORD = "MB00013";		//密码为空
	public static final String EMPTY_USER_TYPE = "MB00014";			//用户类型为空
	public static final String EMPTY_OPER_TYPE = "MB00015";			//操作类型为空
	public static final String EMPTY_NEW_PASSWORD = "MB00016";		//新密码为空
	public static final String EMPTY_VERIFY_CODE = "MB00017";		//验证码为空
	public static final String EMPTY_AUTHEN_NO = "MB00018";			//鉴权流水为空
	public static final String EMPTY_MERCHANT_CODE = "MB00019";		//商户号为空
	public static final String EMPTY_ASSET_FLAG = "MB00020";		//查询资产标志为空
	public static final String EMPTY_USER_NAME = "MB00021";			//会员名称为空
	public static final String EMPTY_BANK_CODE = "MB00022";			//银行卡号为空
	public static final String EMPTY_PAY_PASSWORD = "MB00023";		//支付密码为空
	public static final String NO_REGISTER_MOBILE = "MB00024";     //改手机不能注册
	
	public static final String NO_PAY_PASSWORD = "MB100001";			//未设置支付密码
	public static final String LOCK_PASSWORD = "MB300001";				//锁定密码
	public static final String ERROR_PASSWORD = "MB300002";				//密码错误提示
	public static final String FULL_BIND_CARDS = "MB300003";				//绑卡达到上限
	public static final String HAS_BIND_CARDS = "MB300004";					//银行卡已经绑定
	public static final String NO_ACCOUNT_CODE = "MB300005";				//没有可用的账户
	public static final String NO_REGISTER_CODE = "MB300006";				//没有注册的账户
	public static final String FORBIDDEN_USER = "MB300007";					//用户被禁用
	public static final String HAS_REGISTER_MOBILE = "MB300008";			//手机号被注册
	public static final String HAS_MERCHANT_INFO = "MB300009";				//商户被注册
	public static final String NO_MEMBER_INFO = "MB300010";					//会员不存在
	public static final String NO_BANK_CARD_INFO = "MB300011";				//未找到该银行卡
	public static final String ERROR_UPDATE_PASSWORD = "MB300012";			//修改密码失败
	public static final String SAME_PASSWORD = "MB300013";					//新旧密码相同
	public static final String NO_FIND_CARD_INFO = "MB300014";				//无法识别的卡号，请先绑卡
	public static final String UPDATE_ERROR_ACCOUNT = "MB300015";			//更新会员账户失败
	public static final String ERROR_RESET_PASSWORD = "MB300016";			//重置密码失败
	public static final String EEEOR_USER_TYPE = "MB300017";				//会员类型错误
	public static final String ERROR_ASSET_FLAG = "MB300018";				//查询资产标志有误
	
	public static final String LOGIN_PASSWORD = "1";			//登录密码
	public static final String PAY_PASSWORD = "2";			//支付密码
	public static final String HAND_PASSWORD = "3";			//手势密码
	public static final String DEBIT_CARD = "01";			//借记卡
	public static final String CREDIT_CARD = "02";			//贷记卡
	
	public static final String ACCT_TYPE_ONE = "01";			//余额账户
	public static final String ACCT_TYPE_TWO = "02";			//待结算账户
	
	public static final String PAY_TYPE_ONE = "01";			//余额/待结算
	public static final String PAY_TYPE_TWO = "02";			//借记卡
	public static final String PAY_TYPE_THREE = "03";		//贷记卡
	public static final String PAY_TYPE_FOUR = "04";			//捷顺通卡
	
	public static final String ACCT_TIME_OUT = "MB40003";		//账户超时
	public static final String CHANNEL_TIME_OUT = "MB40004";		//通道超时
	
	/**
	 * 数据库操作
	 */
	public static final String MB_INSERT_ERROR_CODE = "MB50001";			//插入失败异常码
	public static final String MB_UPDATE_ERROR_CODE = "MB50002";			//更新失败异常码
	public static final String MB_DELETE_ERROR_CODE = "MB50003";			//删除失败异常码
	public static final String MB_SELECT_ERROR_CODE = "MB50004";			//查询失败异常码
	
	/**
	 * 字符串3DES加密key 主要用于 银行卡号、身份证号密码
	 */
	public static final String DES_STR_KEY="0123456789ABCDEF";
	public static final Long SYS_BUSS_NO_ID = 99L;

	public static final String TIMEOUT = "60";				//短信超时时间

	public static final String USER_TYPE_ONE = "C";		//用户类型-个体用户
	public static final String USER_TYPE_MERCHANT = "B";		//用户类型-商户用户
	public static final String USER_TYPE_ONE_TEXT = "个人";		//用户类型-个体用户
	public static final String USER_TYPE_MERCHANT_TEXT = "商户";		//用户类型-商户用户
	
	public static final String USER_STATUS_NORMAL = "1";		//用户状态-、正常

	public static final String USER_STATUS_FORBIDEN = "2";		//用户状态- 、禁用 

	public static final String USER_STATUS_FROZEN = "3";		//用户状态-、冻结

	public static final String USER_STATUS_CANCEL = "4";		//用户状态-、注销

	public static final String USER_STATUS_NORMAL_TEXT = "正常";	

	public static final String USER_STATUS_FORBIDEN_TEXT = "禁用";

	public static final String USER_STATUS_FROZEN_TEXT = "冻结";

	public static final String USER_STATUS_CANCEL_TEXT = "注销";
	
	public static final String QUERY_FLAG = "1";		//查询标识

	public static final String USER_SING_OPEN_TEXT = "0";	//签约表状态 开启

	public static final String USER_SING_FORBIDEN_TEXT = "1";	//签约表状态   失败

	public static final String USER_SING_OPER_DELETE = "delete";	//签约表操作类型：删除

	public static final String USER_SING_OPER_ADD = "add";	//签约表状态   添加
	
	public static final String USER_SING_OPER_UPDATE = "update";	//签约表状态 更新

	public static final String USER_SING_FORBIDEN_SELECT = "select";	//签约表状态   查询 （按照userID查询）
	
	//public static final String USER_MSG_TIMEOUT = "60";		//短信有效验证时间（s）

	public static final String USER_PIC_FILEPATH = "c://fileloadway";		//用户图像存放路径

	public static final String USER_RISK_TOLERANCE_JUNIOR = "1";			//风险承受能力-初级

	public static final String USER_CERTIFICATION_NO = "0";				//用户认证方式-未认证

	public static final String USER_CERTIFICATION_QUICK = "1";			//用户认证方式-快捷认证

	public static final String USER_VERIFICATION_LEVEL_NO = "N";		//用户认证等级-未认证

	public static final String USER_VERIFICATION_LEVEL_WEAK = "W";		//用户认证等级-弱实名
	
	public static final String USER_VERIFICATION_LEVEL_MIDDLE = "M";	//用户认证等级-中实名

	public static final String USER_VERIFICATION_LEVEL_SUPER="S";	//用户认证等级-强实名

	public static final String USER_LEVEL_COMMON = "0";		//用户等级-普通用户
	
	public static final String USER_LEVEL_ONE = "1";			//用户等级-一类用户
	public static final String USER_LEVEL_TWO = "2";			//用户等级-二类用户
	public static final String USER_LEVEL_THREE = "3";		//用户等级-三类用户
	public static final String USER_LEVEL_ONE_TEXT = "普通用户";		//用户等级-一类用户
	public static final String USER_LEVEL_TWO_TEXT = "星级用户";		//用户等级-二类用户
	public static final String USER_LEVEL_THREE_TEXT = "VIP用户";		//用户等级-三类用户
	/**
	 * 认证方式
	 */
	public static final String USER_CERT_ZEO_TEXT = "未认证";	
	public static final String USER_CERT_ONE_TEXT = "快捷认证";	
	public static final String USER_CERT_TWO_TEXT = "打款认证";	
	public static final String USER_CERT_THREE_TEXT = "关联认证";
	public static final String USER_CERT_FOUR_TEXT = "其他认证";
	/**
	 * 验证邮箱格式el
	 */
	public static final String CHECKEMAIL="^([a-z0-9A-Z]+[-|\\.]?)+[a-z0-9A-Z]@([a-z0-9A-Z]+(-[a-z0-9A-Z]+)?\\.)+[a-zA-Z]{2,}$";
	
	/**
	 * 验证手机格式el
	 */
	public static final String CHECKPHONE="^[0-9]{8,13}$";


}
