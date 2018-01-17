package com.jst.prodution.market.dubbo.model;

import java.util.Date;

import com.jst.prodution.base.bean.BaseBean;
/**
 * 红包发放领用记录
 * @author huanglei
 * 2017/08/03 09:56
 */
public class InviteRedPacketRecord implements java.io.Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String id;
	private String inviteUserId;
	private String inviteMobile;
	private Long inviteRedPacketAmount;
	private String invitedUserId;
	private String invitedMobile;
	private Long invitedRedPacketAmount;
	private Date updateTime;
	private String updateTimeStr;
	private String openId;
	private Integer currentPage = 1; // 默认当前页为第1页
	private int pageSize = 10; // 默认每页显示10条记录
	
	public Integer getCurrentPage() {
		return currentPage;
	}
	public void setCurrentPage(Integer currentPage) {
		this.currentPage = currentPage;
	}
	public int getPageSize() {
		return pageSize;
	}
	public void setPageSize(int pageSize) {
		this.pageSize = pageSize;
	}
	public String getUpdateTimeStr() {
		return updateTimeStr;
	}
	public void setUpdateTimeStr(String updateTimeStr) {
		this.updateTimeStr = updateTimeStr;
	}
	public String getOpenId() {
		return openId;
	}
	public void setOpenId(String openId) {
		this.openId = openId;
	}
	/**
	 * 该用户邀请好友总人数
	 */
	private Long total;
	/**
	 * 邀请排名
	 */
	private Long rank;
	
	
	public Long getTotal() {
		return total;
	}
	public void setTotal(Long total) {
		this.total = total;
	}
	public Long getRank() {
		return rank;
	}
	public void setRank(Long rank) {
		this.rank = rank;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getInviteUserId() {
		return inviteUserId;
	}
	public void setInviteUserId(String inviteUserId) {
		this.inviteUserId = inviteUserId;
	}
	public String getInviteMobile() {
		return inviteMobile;
	}
	public void setInviteMobile(String inviteMobile) {
		this.inviteMobile = inviteMobile;
	}
	public Long getInviteRedPacketAmount() {
		return inviteRedPacketAmount;
	}
	public void setInviteRedPacketAmount(Long inviteRedPacketAmount) {
		this.inviteRedPacketAmount = inviteRedPacketAmount;
	}
	public String getInvitedUserId() {
		return invitedUserId;
	}
	public void setInvitedUserId(String invitedUserId) {
		this.invitedUserId = invitedUserId;
	}
	public String getInvitedMobile() {
		return invitedMobile;
	}
	public void setInvitedMobile(String invitedMobile) {
		this.invitedMobile = invitedMobile;
	}
	public Long getInvitedRedPacketAmount() {
		return invitedRedPacketAmount;
	}
	public void setInvitedRedPacketAmount(Long invitedRedPacketAmount) {
		this.invitedRedPacketAmount = invitedRedPacketAmount;
	}
	public Date getUpdateTime() {
		return updateTime;
	}
	public void setUpdateTime(Date updateTime) {
		this.updateTime = updateTime;
	}
	
	

}
