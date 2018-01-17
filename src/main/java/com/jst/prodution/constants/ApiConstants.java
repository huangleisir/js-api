package com.jst.prodution.constants;

/**
 * 系统通用的常量类
 * @author jfLi
 *
 */
public final class ApiConstants {
	
	/*各系统名称*/
	public static final String JST_APP = "jst-app";
	public static final String JST_OMS = "jst-oms";
    public static final String JST_GATEWAY = "jst-gateway";
    public static final String JST_PARK = "jst-park";
    public static final String JST_PARK_APP = "jst-park-app";
	public static final String JST_FINANCE_API = "jst-finance-api";
	public static final String JST_FINANCE_TRAN = "jst-finance-tran";
	public static final String JST_FINANCE_LANE = "jst-finance-lane";
	public static final String JST_FINANCE_MEMBER = "jst-finance-member";
	public static final String JST_FINANCE_ACCOUNT = "jst-finance-account";
	public static final String JST_FINANCE_FRONTACCT = "jst-finance-frontAcct";
	public static final String JST_FINANCE_LANEFRONT = "jst-finance-lanefront";
	public static final String JST_FINANCE_CASHDESK = "jst-finance-cashdesk";
	public static final String JST_FINANCE_CASHDESKFRONT = "jst-finace-cashdeskfront";
	public static final String JST_FINANCE_MERCHANT ="jst_finance_merchant";
	public static final String JST_FINANCE_WECHAT = "jst_finance_wechat";
	public static final String JST_FINANCE_ALIPAY = "jst_finance_alipay";
	public static final String JST_FINANCE_UPAYFRONT ="jst_finance_upayfront";
	public static final String JST_FINANCE_MERCHANTFRONT ="jst_finance_merchantFront";
	public static final String JST_FINANCE_JOBENGINE ="jst_finance_jobengine";
	public static final String JST_FINANCE_SETTLEMENT ="jst_finance_settlement";
	public static final String JST_FINANCE_BANK ="jst_finance_bank";
	public static final String JST_BASE = "jst_base";
	public static final String JST_MARKET = "jst_market";
	public static final String JST_PAYMENT = "jst_payment";
	//银联-无跳转支付
	public static final String UNIONPAY_NO_JUMP_PAY="unionpay_no_jump_pay";
	//银联-代收
	public static final String UNIONPAY_DAISHOU="unionpay_daishou";
	/*Redis Key值(命名规则:系统名称+功能名称)*/
	public static final String REDIS_KEY_ACCT_ACCTLEVELINFO_0 = JST_FINANCE_ACCOUNT + "acctLevelInfo_0";//临时账户等级限额信息
	public static final String REDIS_KEY_ACCT_ACCTLEVELINFO_1 = JST_FINANCE_ACCOUNT + "acctLevelInfo_1";//一类账户等级限额信息
	public static final String REDIS_KEY_ACCT_ACCTLEVELINFO_2 = JST_FINANCE_ACCOUNT + "acctLevelInfo_2";//二类账户等级限额信息
	public static final String REDIS_KEY_ACCT_ACCTLEVELINFO_3 = JST_FINANCE_ACCOUNT + "acctLevelInfo_3";//三类账户等级限额信息
	public static final String REDIS_KEY_TRAN_TMS_CASHWITHDRAWVFCD = "JST_FINANCE_TRAN" + "_TMS_CASHWITHDRAW_VERIFYMSGCODE";//交易系统提现风控验短
	public static final String REDIS_KEY_TRAN_TMS_REFUNDVFCD = "JST_FINANCE_TRAN" + "_TMS_REFUND_VERIFYMSGCODE";//交易系统退款风控验短
	public static final String REDIS_KEY_TRAN_TMS_PAYVFCD = "JST_FINANCE_TRAN" + "_TMS_PAY_VERIFYMSGCODE";//交易系统支付风控验短

	/*通道编号*/
	public static final String CHANNELCODE_QM = "001";//快钱通道
	public static final String CHANNELCODE_QM_ONEKEY = "00101";//快钱一键支付
	public static final String CHANNELCODE_QM_QPAY= "00102";//快钱快捷支付
	public static final String CHANNELCODE_UP = "002";//银联通道
	
	/*账户类型(01-基本户,02-待结算账户,03-备付金账户,04-待清算账户, 05-代扣长款户,06-代付长款户,07-代扣短款户,08-代付短款户,09-贷款收款户,10-贷款付款户)*/
	public static final String ACCT_TYPE_BEAS = "01";
	public static final String ACCT_TYPE_JSH = "02";
	public static final String ACCT_TYPE_BFJ = "03";
	public static final String ACCT_TYPE_DQS = "04";
	public static final String ACCT_TYPE_DKCK = "05";
	public static final String ACCT_TYPE_DFCK = "06";
	public static final String ACCT_TYPE_DKDK = "07";
	public static final String ACCT_TYPE_DFDK = "08";
	public static final String ACCT_TYPE_DKSK = "09";
	public static final String ACCT_TYPE_DKFK = "10";
	
	/*账户状态(1-正常,2-冻结)*/
	public static final String ACCTSTATUS_NORMAL = "1";
	public static final String ACCTSTATUS_FROZEN = "2";
	
	/*快钱通道成功响应码*/
	public static final String CHANNELQM_SUCC_RSP_CODE = "00";
	
	/*订单状态:0-成功，1-待处理,2-处理中,3-失败*/
	public static final String ORDER_STATE_SUCCESS = "0";
	public static final String ORDER_STATE_WAITDOING = "1";
	public static final String ORDER_STATE_DOING = "2";
	public static final String ORDER_STATE_FAIL = "3";
	
	/*审批状态:0-通过,1-不通过,2-待审核*/
	public static final String APPROVE_PASS = "0";
	public static final String APPROVE_FAIL = "1";
	public static final String APPROVE_WAITDOING = "2";
	
	/*编码格式*/
	public static final String ENCODE = "utf-8";
	
	/*默认页码、每页记录数*/
	public static final int PAGENUM = 1;
	public static final int PAGESIZE = 10;
	private ApiConstants(){
		
	}
	
	/**
	 * 服务异常捕获错误码
	 * 	要求所有服务都唯一
	 * 	属性命名规则【SYS_RES_CODE_系统名称_服务标识名】
	 * 	值命名规则【系统名称三位数字】
	 * @author jfLi
	 *
	 */
	public static final class SysResCode{
		private SysResCode(){
			
		}
		public static final String SYS_RES_CODE_TEST_RECHARGE = "TEST001";
		
		//账户start
		public static final String SYS_RES_CODE_ACCT_OPEN = "ACCT001";
		public static final String SYS_RES_CODE_ACCT_DEPOSIT = "ACCT002";
		public static final String SYS_RES_CODE_ACCT_WITHDRAW = "ACCT003";
		public static final String SYS_RES_CODE_ACCT_QUER_YBYID = "ACCT004";
		public static final String SYS_RES_CODE_ACCT_QUERY_LIST = "ACCT005";
		public static final String SYS_RES_CODE_ACCT_TRAN_QUERY_LIST = "ACCT006";
		public static final String SYS_RES_CODE_ACCT_FROZEN_QUERY_LIST = "ACCT007";
		public static final String SYS_RES_CODE_ACCT_UPDATE = "ACCT008";
		public static final String SYS_RES_CODE_ACCT_FROZEN = "ACCT009";
		public static final String SYS_RES_CODE_ACCT_UNFROZEN = "ACCT010";
		//账户end
		
		//会计Start
		public static final String SYS_RES_CODE_ACNT_ACCOUNTING = "ACNT001";
		public static final String SYS_RES_CODE_ACNT_QUERY_MERG = "ACNT002";
		
		//会计end
		
		
		//账户前置start
		public static final String SYS_RES_CODE_ACCTFRONT_CASH_WITHDRAW = "ACCTFRONT001";
		public static final String SYS_RES_CODE_ACCTFRONT_TRANSFER_WITHDRAW = "ACCTFRONT002";
		public static final String SYS_RES_CODE_ACCTFRONT_RECHARGE = "ACCTFRONT003";
		//账户前置end

		//交易核心start
		public static final String SYS_RES_CODE_TRAN_RECHARGE = "TRAN001";
		public static final String SYS_RES_CODE_TRAN_CASH_WITH_DRAW_APPLY = "TRAN002";
		public static final String SYS_RES_CODE_TRAN_CASH_WITH_APPROVE = "TRAN003";
		public static final String SYS_RES_CODE_TRAN_PAY_ORDER_REGIST = "TRAN006";
		public static final String SYS_RES_CODE_TRAN_PAY_ORDER_QUERYDETAIL = "TRAN007";
		public static final String SYS_RES_CODE_TRAN_SETTLEMENT_ORDER = "TRAN008";
		public static final String SYS_RES_CODE_TRAN_SETTLEMENT_JOB = "TRAN009";
		public static final String SYS_RES_CODE_TRAN_PAY_ORDER = "TRAN010";
		public static final String SYS_RES_CODE_TRAN_FEE_ORDER = "TRAN0011";
		public static final String SYS_RES_CODE_TRAN_JOB_SEVICE = "TRAN0012";
		public static final String SYS_RES_CODE_TRAN_LOAN_SEVICE = "TRAN0013";
		public static final String SYS_RES_CODE_TRAN_RECHARGE_ORDER_UPDATE = "TRAN014";
		public static final String SYS_RES_CODE_TRAN_SUPPLEMENT_ORDER_QUERY = "TRAN015";
		public static final String SYS_RES_CODE_TRAN_INCORRECT_SUPPLEMENT_ORDER_QUERY = "TRAN016";
		public static final String SYS_RES_CODE_TRAN_ALL_ORDER_QUERY = "TRAN017";
		
		//交易核心end
		//结算系统start
		public static final String SYS_RES_CODE_SETT_QUERY_SEVICE = "SETT0001";
		public static final String SYS_RES_CODE_SETT_RECON_SEVICE = "SETT0002";
		public static final String SYS_RES_CODE_ADD_INS_INFO ="SETT0003";
		//结算系统end
		
		
		// 通道前置start
		public static final String SYS_RES_CODE_LANEFRONT_BINDCARD_ONE  = "LANEFRONT000001";
		public static final String SYS_RES_CODE_LANEFRONT_BINDCARD_TWO  = "LANEFRONT000002";
		public static final String SYS_RES_CODE_LANEFRONT_CHANNEL_LIMIT_AMT_QUERY_LIST  = "LANEFRONT000003";
		public static final String SYS_RES_CODE_LANEFRONT_CHANNEL_ROUTER_QUERY  = "LANEFRONT000004";
		public static final String SYS_RES_CODE_LANEFRONT_INCOME_QUERY  = "LANEFRONT000005";
		public static final String SYS_RES_CODE_LANEFRONT_INCOME  = "LANEFRONT000006";
		public static final String SYS_RES_CODE_LANEFRONT_OUTCOME = "LANEFRONT000007";
		public static final String SYS_RES_CODE_LANEFRONT_QUERY_BINDCARD  = "LANEFRONT000008";
		public static final String SYS_RES_CODE_LANEFRONT_ROUTER_CHANNEL_CHILD  = "LANEFRONT000009";
		public static final String SYS_RES_CODE_LANEFRONT_ROUTER_CHANNEL  = "LANEFRONT000010";
		public static final String SYS_RES_CODE_LANEFRONT_SEND_VERIFY_CODE  = "LANEFRONT000011";
		public static final String SYS_RES_CODE_LANEFRONT_BANK_LIST_CODE  = "LANEFRONT000012";  		//查询银行卡列表
		public static final String SYS_RES_CODE_LANEFRONT_BANK_CODE  = "LANEFRONT000013";          //查询银行卡列表
		// 通道前置end
		
		// 通道前置start
		public static final String SYS_RES_CODE_LANE  = "LANE0101";
		// 通道前置end
				
		// 会员系统start
		public static final String SYS_RES_CODE_CHECK_PAY_PASSWORD = "MB001";		//校验支付密码
		public static final String SYS_RES_CODE_FIRST_AUTHEN = "MB002";			//一次鉴权
		public static final String SYS_RES_CODE_FORBIDDEN_MEMBER = "MB003";		//会员禁用解禁鉴权
		public static final String SYS_RES_CODE_GETSINGLE_ACCT = "MB004";			//获取会员的账户信息
		public static final String SYS_RES_CODE_USER_LOGIN = "MB005";				//会员登录
		public static final String SYS_RES_CODE_USER_REGISTER = "MB006";			//会员注册
		public static final String SYS_RES_CODE_RESET_PASSWORD = "MB007";			//重置密码，设置支付密码
		public static final String SYS_RES_CODE_SECOND_AUTHEN = "MB008";			//二次鉴权
		public static final String SYS_RES_CODE_SINGLE_MEMBER = "MB009";			//会员个人信息查询
		public static final String SYS_RES_CODE_MEMBER_LIST = "MB010";				//会员列表查询
		public static final String SYS_RES_CODE_UNBIND_CARD = "MB011";				//会员解绑卡
		public static final String SYS_RES_CODE_UPDATE_LOGIN_PASSWORD = "MB012";	//修改登录密码
		public static final String SYS_RES_CODE_BIND_CARD_LIST = "MB013";			//绑卡列表
		public static final String SYS_RES_CODE_SEND_MESSAGE_CODE = "MB014";		//生成短信验证码
		public static final String SYS_RES_CODE_DEL_REGISTER_USER = "MB015";		//删除注册用户
		public static final String SYS_RES_CODE_RESET_MERCHANT_PWD = "MB016";		//重置商户密码
		public static final String SYS_RES_CODE_USER_ASSET_INFO = "MB017";			//查询用户资产
		public static final String SYS_RES_CODE_USER_OPEN_ACCT_INFO = "MB018";	//开通会员账户
		public static final String SYS_RES_CODE_USER_BIND_CARD_INFO = "MB019";	//会员绑卡
		public static final String SYS_RES_CODE_DELETE_USER_BIND_CARD = "MB020";	//删除会员绑卡信息
		public static final String SYS_RES_CODE_QUERY_USER_ACCT = "MB021";			//查询会员账户列表
		public static final String SYS_RES_CODE_QUERY_USER_BANK = "MB022";			//查询会员绑卡列表
		public static final String SYS_RES_CODE_QUERY_USER_LOGIN_LOG = "MB023";     //查询会员登录日志列表
		public static final String SYS_RES_CODE_QUERY_JST_CARD = "MB024";     //查询会员绑定捷顺通卡  
		public static final String SYS_RES_USER_AGREEMENT_INFO = "MB025";     //会员代扣签约\解约
		public static final String SYS_RES_USER_AGREEMENT_LIST = "MB026";     //签约列表查询 
		public static final String SYS_RES_SIGN_STATUS = "MB027";     //签约状态查询 
		public static final String SYS_RES_CODE_QUERY_USER_AGREEMENT = "MB028";	//查询代扣协议列表
		public static final String SYS_RES_CODE_RELIEVE_AGREEMENT = "MB029";	//会员代扣解约
		public static final String SYS_RES_CODE_QUERY_LOANSCARD = "MB030";  	//会员贷款卡查询
		public static final String SYS_RES_CODE_CHANGE_LOANSCARD = "MB031";		//变更贷款卡
		public static final String SYS_RES_CODE_CREATE_ACCESS = "MB032";		//获取access H5url
		public static final String SYS_RES_CODE_REGSITER_BIND_USER = "MB033";            //注册绑定
		public static final String SYS_RES_CODE_BIND_USER = "MB034";            //绑定
		public static final String SYS_RES_CODE_QUERY_BIND_USER = "MB035";            //查询用户绑定微信
		public static final String SYS_RES_CODE_MODIFY_MEM = "MB036";             // 修改会员信息
		public static final String SYS_RES_CODE_QUERY_MEMBER_BANKCARDINFO = "MB037";  // 查询会员绑卡信息
		// 会员系统end
		
		// 商户系统start
		public static final String SYS_RES_CODE_MERCHANT_APPLY = "MR0001";				//商户申请
		public static final String SYS_RES_CODE_BIND_MERCHANT_STATE = "MR0002";		//修改商户状态为审核中
		public static final String SYS_RES_CODE_MERCHANT_REVIEW = "MR0003";			//商户审核
		public static final String SYS_RES_CODE_MERCHANT_UPDATE = "MR0004";			//商户修改
		public static final String SYS_RES_CODE_MERCHANT_LIST = "MR0005";				//商户列表
		public static final String SYS_RES_CODE_REVIEW_DETAIL_LIST = "MR0006";		//商户审核记录列表
		public static final String SYS_RES_CODE_QUERY_SINGLE_MERCHANT = "MR0007";		//查询单个商户
		public static final String SYS_RES_CODE_CHECK_EMAIL_EXIST = "MR0008";			//检查邮箱是否被占用
		public static final String SYS_RES_CODE_MERCH_AUTHEN_INFO = "MR0009";			//商户认证
		public static final String SYS_RES_CODE_CHANGE_AUTHEN_BANK = "MR0010";		//修改商户认证银行卡
		public static final String SYS_RES_CODE_QUERY_AUTHEN_ERROR_NUM = "MR0011";	//查询银行卡回款认证错误次数
		public static final String SYS_RES_CODE_AUTHEN_AMOUNT_CODE = "MR0012";		//商户回款认证
		public static final String SYS_RES_CODE_QUERY_AUTHEN_INFO = "MR0013";			//商户登录时获取其认证状态
		public static final String SYS_RES_CODE_MERCH_PAY_APPLY = "MR0014";			//商户重新打款认证申请
		public static final String SYS_RES_CODE_MERCH_PAY_BILL = "MR0015";				//生成打款清单
		public static final String SYS_RES_CODE_MERCH_PAY_SERVICE = "MR0016";			//商户打款、拒绝打款操作
		public static final String SYS_RES_CODE_QUERY_PAY_LIST = "MR0017";				//查询商户打款清单列表
		public static final String SYS_RES_CODE_MERCH_REFUND_APPLY = "MR0018";		//商户回款认证
		public static final String SYS_RES_CODE_CHECK_BANKCARD_EXISTS = "MR0019";
		public static final String SYS_RES_CODE_CHECK_BANKCARD_ADD = "MR0020";
		public static final String SYS_RES_CODE_CHECK_BANKCARD_MOD = "MR0021";
		public static final String SYS_RES_CODE_CHECK_BANKCARD_DEL = "MR0022";
		public static final String SYS_RES_CODE_CHECK_BANKCARD_LST = "MR0023";
		public static final String SYS_RES_CODE_MERCHANT_JOB_SERVICE = "MR0024";
		public static final String SYS_RES_CODE_MERCHANT_SHTBASE_SERVICE = "MR0025";
		public static final String SYS_RES_CODE_MERCHANT_APPLY_STEP1 = "MR0026";
        public static final String SYS_RES_CODE_MERCHANT_APPLY_STEP2 = "MR0027";
        public static final String SYS_RES_CODE_MERCHANT_APPLY_STEP3 = "MR0028";
        public static final String SYS_RES_CODE_MERCHANT_APPLY_STEP4 = "MR0029";
        public static final String SYS_RES_CODE_MERCHANT_VERFY_CARD = "MR0030";
        public static final String SYS_RES_CODE_MERCHANT_PAYRIGHT = "MR0031";
        public static final String SYS_RES_CODE_MERCHANT_SENDEMAIL = "MR0032";
        public static final String SYS_RES_CODE_MERCHANT_VERFYEMAIL = "MR0033";
        public static final String SYS_RES_CODE_MERCHANT_SEND_VERFYEMAIL = "MR0034";
        public static final String SYS_RES_CODE_MERCHANT_QUERY_MERCHANT = "MR0035";
        public static final String SYS_RES_CODE_MERCHANT_PAY_CONF = "MR0036";
        public static final String SYS_RES_CODE_ADD_SETT_INFO = "MR0037";
        public static final String SYS_RES_CODE_QUERY_SETT_INFO = "MR0038";
        public static final String SYS_RES_CODE_UPDATE_SETT_INFO = "MR0039";
        public static final String SYS_RES_CODE_WITHDRAW_CASH_LOG = "MR0040";    //查询商户提现日志
        // 商户系统end
		
		//收银台start
		public static final String SYS_RES_CODE_CASHDESK_PAYCARD_LIST = "CAHSDESK001"; //支付卡列表
		public static final String SYS_RES_CODE_CASHDESK_PROCONF_LIST = "CAHSDESK002"; //产品列表
		public static final String SYS_RES_CODE_CASHDESK_SIGNB_LIST = "CAHSDESK003"; //商户列表
		public static final String SYS_RES_CODE_CASHDESK_PAYSCENE_LIST = "CAHSDESK004"; //支付码列表

//		public static final String SYS_RES_CODE_TRAN_CASH_WITH_DRAW_APPLY = "TRAN002";
//		public static final String SYS_RES_CODE_TRAN_CASH_WITH_APPROVE = "TRAN003";
		//收银台end
		

        //网关接口start
        public static final String SYS_RES_CODE_GATEWAY_QUERYPID = "GATEWAY001";
        //网关接口end
        
        //OCD star
        public static final String SYS_RES_CODE_WECHAT_SENDINGOEDER = "OCD0001";		//微信统一下单接口
        public static final String SYS_RES_CODE_WECHAT_PAYNOTIFY	= "OCD0002";		//微信支付通知
        public static final String SYS_RES_CODE_ALIPAY_PAY   = "OCD0003";               //支付宝发起支付
        public static final String SYS_RES_CODE_ALIPAY_PAY_NOTIFY   = "OCD0004";        //支付宝支付通知
        
        //OCD end

        //Park接口start
        public static final String SYS_RES_CODE_PARK = "PARK001";
        public static final String SYS_RES_CODE_PARK_SENDVERIFY = "PARKVERIFY001";
        //Park接口end
        
        

        //Base接口start
        public static final String SYS_RES_CODE_BASE = "BASE001";
        
        public static final String SYS_RES_CODE_PAY_CHANNEL = "BASE002";
        
        //Base接口end
        
        //付款中心start
        public static final String SYS_RES_CODE_PAYMENT_MANUAL = "PAYMENT0001";			//转人工付款
        public static final String SYS_RES_CODE_PAYMENT_FAIL_CONIREM = "PAYMENT0002";		//失败确认
        public static final String SYS_RES_CODE_PAYMENT_FAIL_QUERY = "PAYMENT0003";		//失败订单查询
        public static final String SYS_RES_CODE_PAYMENT_FIRST_REVIEW = "PAYMENT0004";		//一审操作
        public static final String SYS_RES_CODE_PAYMENT_OFFLINE_PAY = "PAYMENT0005";		//线下打款
        public static final String SYS_RES_CODE_PAYMENT_REPAY = "PAYMENT0006";				//重新付款
        public static final String SYS_RES_CODE_PAYMENT_PAY_ACCOUNT = "PAYMENT0007";		//付款账号查询
        public static final String SYS_RES_CODE_PAYMENT_APPLY = "PAYMENT0008";				//提现落单
        public static final String SYS_RES_CODE_PAYMENT_CALLBACK = "PAYMENT0009";			//风控解挂回调
        public static final String SYS_RES_CODE_PAYMENT_PAY_CALLBACK = "PAYMENT0010";		//银企付款回调
        public static final String SYS_RES_CODE_PAYMENT_ORDER_QUERY = "PAYMENT0011";		//付款订单查询
        public static final String SYS_RES_CODE_PAYMENT_REVIEW_LIST = "PAYMENT0012";		//审核记录查询
        public static final String SYS_RES_CODE_PAYMENT_ORDER_DETAIL = "PAYMENT0013";		//订单明细
        public static final String SYS_RES_CODE_PAYMENT_SECOND_REVIEW = "PAYMENT0014";	//二审操作
        //付款中心end
        
        //appfront app前置start
        public static final String SYS_RES_CODE_APPFRONT_JST_CARD_CHECK_FAIL = "APPFRONT0001";   //校验捷顺通卡会员绑定关系失败
        //appfront app前置end
        
	}
	
	/*
	 * 数据库异常提示
	 */
	public static final String ERROR_TIP_DATABASE_INSERT = "数据库插入异常";
	public static final String ERROR_TIP_DATABASE_UPDATE = "数据库更新异常";
	public static final String ERROR_TIP_DATABASE_DELETE = "数据库删除异常";
	public static final String ERROR_TIP_DATABASE_SELECT = "数据库查询异常";

	// 系统异常提示
	public static final String ERROR_TIP_SYSTEM = "系统异常，请稍后重试。";
	
	/*
	 * IdWorker异常提示
	 */
	public static final String ERROR_TIP_IDWORKER = "生成序列号失败";
	
	public static final String SYSTEM_OPER_USER = "99";// 系统默认操作人编号
	
	
	/*
	 * 业务类型（交易订单订单类型）
	 * 业务类型（00-线上充值，01-线上提现 ，02-支付 03-线下充值 04-线下提现 05-结算 06-退款 07-代扣 08-代扣清算，
	 * 09-代扣长款挂账、10-代扣短款挂账、11-代扣短款冲销、12-代扣长款冲销、13-代付长款挂账、
	 * 14-代付短款挂账、15-代付长款冲销、16-代付短款冲销、17-出款、18-收款,19-代付
	 * 
	 */
	public static final String BUS_TRAN_TYPE_RECHARGE = "00";//线上充值
	public static final String BUS_TRAN_TYPE_CASEWITHDRAW = "01";//线上提现
	public static final String BUS_TRAN_TYPE_CASEPAY = "02";//支付
	public static final String BUS_TRAN_TYPE_OFFLINERECHARGE = "03";//线下充值
	public static final String BUS_TRAN_TYPE_OFFLINECASEWITHDRAW = "04";//线下提现	
	public static final String BUS_TRAN_TYPE_SETTLEMENT = "05";//结算
	public static final String BUS_TRAN_TYPE_REFUND = "06";//退款
	public static final String BUS_TRAN_TYPE_DK = "07";//代扣
	public static final String BUS_TRAN_TYPE_COLLECTION = "18";//收款
	public static final String BUS_TRAN_TYPE_TOPAY = "08";//出款
	public static final String BUS_TRAN_TYPE_DF = "19";//代付
	public static final String BUS_TRAN_TYPE_TZ = "20";//调账

	public static final String BUS_TRAN_TYPE_QRPAY = "20";//微信扫码支付
	public static final String BUS_TRAN_TYPE_WX_PUBLIC = "21";//微信公众号支付

	// 交易订单类型
	public static final String TRAN_ORDER_TYPE_RECHARGE		= "1";// 充值
	public static final String TRAN_ORDER_TYPE_WITHDRAW		= "2";// 提现
	public static final String TRAN_ORDER_TYPE_TRANSAFER	= "3";// 转账
	public static final String TRAN_ORDER_TYPE_REFUND	    = "4";// 退款
	public static final String TRAN_ORDER_TYPE_GRANTLOAN	= "5";// 放款
	public static final String TRAN_ORDER_TYPE_COLLECTION	= "6";// 代扣
	public static final String TRAN_ORDER_TYPE_ADJUSTMENT	= "7";// 调账

	
	//业务来源
	public static final String SOURCE_FROM_APP = "1";//APP
	public static final String SOURCE_FROM_OMS = "2";//OMS
	public static final String SOURCE_FROM_BUS = "3";//B门户
	
	// 被冲销标志 (Y已冲销 N无冲销)
	public static final String WRITEOFF_FLAG_Y = "T";// 已冲销
	public static final String WRITEOFF_FLAG_N = "N";// 未冲销

	public static final String PERSENT = "%";
	/*特殊字符*/
	public static final String[] ILLEGALITYSTR = {"!", "$", "%", "^", "^", "&", "*", "_"};
	/*好用APP扫响应码、响应消息*/
	public static final String APP_SCANQRCODE_SUCCESS = "00";//成功
	public static final String APP_SCANQRCODE_ERROR = "16020";//扫码错误
	public static final String APP_SCANQRCODE_EXPIRE = "16021";//二维码订单已过期
	public static final String APP_SCANQRCODE_BUSTYPE = "1";//扫码支付业务类型(1-扫码支付)
	
	/*中粮广场接口码值、响应消息*/
	public static final String ZL_SUCCESS_CODE = "200";//成功
	public static final String ZL_FAIL_ILLEGALITY_CODE = "160101";//参数不合法
	public static final String ZL_FAIL_AUTH_CODE = "16006";//会员鉴权失败
	public static final String ZL_FAIL_MERCHANT_CODE = "16007";//查询商户信息失败
	public static final String ZL_FAIL_MERCHANTAUTH_CODE = "16008";//商户未鉴权
	public static final String ZL_FAIL_MERCHANTWRONG_CODE = "16009";//商户号不正确
	public static final String ZL_FAIL_QRCODESTRWRONG_CODE = "16010";//二维码不正确
	public static final String ZL_FAIL_KEYWRONG_CODE = "16011";//二维码不正确
	public static final String ZL_SUCCESS_MSG = "成功";
	public static final String ZL_QR_PREFIX = "JSFT[POSQR]";//中粮POS二维码前缀
	
	/**银联*/
	public static final String UNION_PREFIX = "UNION";//银联
	/**汽车超人*/
	public static final String QCCR_PREFIX = "QCCR";	//汽车超人
	/**金科标准收银台订单前缀*/
	public static final String JST_CASHIER_PREFIX = "JST_CASHIER_H5";	//金科标准收银台
	
	/**扫码支付*/
	public static final String QR_PAY_MERCHANT       = "QR[MERCHANT]";         //扫码支付商户名前缀
}
