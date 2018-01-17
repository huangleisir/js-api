package com.jst.prodution.member.dubbo.service;

import java.util.List;

import com.jst.prodution.base.bean.BaseBean;
import com.jst.prodution.market.dubbo.model.InviteRedPacketRecord;
import com.jst.prodution.market.dubbo.serviceBean.ActivityBean;

/**
 * 邀请好用注册场景，插入邀请记录
 * @author huanglei
 */
public interface InviteRegisterDuService {
	/**
	 * 插入邀请送红包记录
	 * @param inviteRedPacketRecord
	 * @return
	 */
	BaseBean insertInviteRecord(InviteRedPacketRecord  inviteRedPacketRecord);
	/**
	 * 查询邀请送红包排行榜
	 * @param inviteRedPacketRecord
	 * @return
	 */
	List<InviteRedPacketRecord> selectRankList(InviteRedPacketRecord  inviteRedPacketRecord);
	/**
	 * 查询用户的排行
	 * @param inviteRedPacketRecord
	 * @return
	 */
	InviteRedPacketRecord selectRank(InviteRedPacketRecord  inviteRedPacketRecord);
	/**
	 * 查询邀请方人数
	 * @param inviteRedPacketRecord
	 * @return
	 */
	InviteRedPacketRecord selectInviterCount();
	
	/**
	 * 查询邀请记录列表
	 * @param inviteRedPacketRecord
	 * @return
	 */

	List<InviteRedPacketRecord> select(InviteRedPacketRecord  inviteRedPacketRecord);
	
	ActivityBean queryInviteActivity(ActivityBean activityBean);

}
