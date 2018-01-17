package com.jst.prodution.upay.serviceBean;

import java.util.List;

import com.jst.prodution.base.bean.BaseBean;
import com.jst.prodution.upay.model.PaymentAccountModel;
/**
 * 
 * @Package: com.jst.prodution.upay.serviceBean
 * @ClassName: UpayPaymentAccountBean.java
 * @Description: OCD微信支付账户实体类
 *
 * @author: wanghuai
 * @date: 2017年7月25日 上午11:06:20 
 * @version: V1.0
 *
 */
public class UpayPaymentAccountBean extends BaseBean {
	private static final long serialVersionUID = 1L;
	private int id;
	private String app_name;
	private String app_id;
	private String app_secret;
	private String mch_id;
	private String key;
	private String pay_channel_id;
	private String pay_type;
	private String notify_url;
	private int status;
	private String cert_path;
	private String package_name;
	private List<PaymentAccountModel> resultList;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getApp_name() {
		return app_name;
	}
	public void setApp_name(String app_name) {
		this.app_name = app_name;
	}
	public String getApp_id() {
		return app_id;
	}
	public void setApp_id(String app_id) {
		this.app_id = app_id;
	}
	public String getApp_secret() {
		return app_secret;
	}
	public void setApp_secret(String app_secret) {
		this.app_secret = app_secret;
	}
	public String getMch_id() {
		return mch_id;
	}
	public void setMch_id(String mch_id) {
		this.mch_id = mch_id;
	}
	public String getKey() {
		return key;
	}
	public void setKey(String key) {
		this.key = key;
	}
	public String getPay_channel_id() {
		return pay_channel_id;
	}
	public void setPay_channel_id(String pay_channel_id) {
		this.pay_channel_id = pay_channel_id;
	}
	public String getPay_type() {
		return pay_type;
	}
	public void setPay_type(String pay_type) {
		this.pay_type = pay_type;
	}
	public String getNotify_url() {
		return notify_url;
	}
	public void setNotify_url(String notify_url) {
		this.notify_url = notify_url;
	}
	public int getStatus() {
		return status;
	}
	public void setStatus(int status) {
		this.status = status;
	}
	public String getCert_path() {
		return cert_path;
	}
	public void setCert_path(String cert_path) {
		this.cert_path = cert_path;
	}
	public String getPackage_name() {
		return package_name;
	}
	public void setPackage_name(String package_name) {
		this.package_name = package_name;
	}
	public List<PaymentAccountModel> getResultList() {
		return resultList;
	}
	public void setResultList(List<PaymentAccountModel> resultList) {
		this.resultList = resultList;
	}
}
