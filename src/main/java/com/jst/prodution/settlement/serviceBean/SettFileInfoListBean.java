package com.jst.prodution.settlement.serviceBean;

import java.util.List;

import com.jst.prodution.base.bean.BaseBean;
import com.jst.prodution.settlement.model.SettFileInfoBean;

/**
 * 
* @ClassName: SetFileInfoBean 
* @Description: TODO(二清文件信息bean) 
* @author 曾传保
* @date 2017年9月21日 上午11:01:51 
*
 */
public class SettFileInfoListBean extends BaseBean{
	
	private static final long serialVersionUID = 1L;

	private String channelType;//渠道类型
	
	private String queryType;//查询类型(1、查询列表   2、手工获取)
	
	private String tranDate;//交易日期
	
	private String userName;//用户名
	
	private List<SettFileInfoBean> fileInfoList;

	public String getChannelType() {
		return channelType;
	}

	public void setChannelType(String channelType) {
		this.channelType = channelType;
	}

	public String getQueryType() {
		return queryType;
	}

	public void setQueryType(String queryType) {
		this.queryType = queryType;
	}

	public String getTranDate() {
		return tranDate;
	}

	public void setTranDate(String tranDate) {
		this.tranDate = tranDate;
	}
	
	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public List<SettFileInfoBean> getFileInfoList() {
		return fileInfoList;
	}

	public void setFileInfoList(List<SettFileInfoBean> fileInfoList) {
		this.fileInfoList = fileInfoList;
	}
}
