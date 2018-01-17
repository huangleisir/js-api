/**
 * 
 */
package com.jst.prodution.market.dubbo.model;

/**
 * 投放类型枚举
 * @author huanglei
 *
 */
public enum DistriTypeEnum {
	DIRECT("1"),//直接投放（例如充值优惠）
	RECEIVE("2"),//领用，例如点击banner领用
	REGISTER("3"),//注册送
	PUBLICACCOUNTS("4"),//关注公众号送
	NOPWDPAY("5");//开通免密支付送
	
	String value ;

	private DistriTypeEnum(String value) {
		this.value = value;
	}
	
	public String getValue() {
        return value;
    }
	

}
