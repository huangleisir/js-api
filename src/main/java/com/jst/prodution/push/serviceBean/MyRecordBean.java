package com.jst.prodution.push.serviceBean;

import java.util.Date;
import java.util.List;

import com.jst.prodution.base.bean.BaseBean;

/**
 * 类名: MyRecord</br>
 * 作者: linyuanq
 * 描述: "我的"模块新消息提示记录 
 * 创建时间: 2017年4月5日下午2:13:41
 * 版权及版本: Copyright(C)2017 jst版权所有
 */
public class MyRecordBean extends BaseBean {
	
	private int id ;
	private String appid;			//
	private String appkey;			//
	private String userId ;
	
	private int unpaidParkRecordNum; //停车记录数（即未支付记录数）
	private int myMsgNum; // 我的消息记录数
	private Date createDatetime;
	private List<MyRecordBean> list ;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getAppid() {
		return appid;
	}
	public void setAppid(String appid) {
		this.appid = appid;
	}
	public String getAppkey() {
		return appkey;
	}
	public void setAppkey(String appkey) {
		this.appkey = appkey;
	}
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public int getUnpaidParkRecordNum() {
		return unpaidParkRecordNum;
	}
	public void setUnpaidParkRecordNum(int unpaidParkRecordNum) {
		this.unpaidParkRecordNum = unpaidParkRecordNum;
	}
	public int getMyMsgNum() {
		return myMsgNum;
	}
	public void setMyMsgNum(int myMsgNum) {
		this.myMsgNum = myMsgNum;
	}
	public Date getCreateDatetime() {
		return createDatetime;
	}
	public void setCreateDatetime(Date createDatetime) {
		this.createDatetime = createDatetime;
	}
	public List<MyRecordBean> getList() {
		return list;
	}
	public void setList(List<MyRecordBean> list) {
		this.list = list;
	}
	
}
