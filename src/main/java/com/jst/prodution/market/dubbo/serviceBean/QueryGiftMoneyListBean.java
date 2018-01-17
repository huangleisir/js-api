package com.jst.prodution.market.dubbo.serviceBean;

import java.util.Date;
import java.util.List;

import com.jst.prodution.base.bean.BaseBean;

/**
 * 
* @ClassName: GiftMoneyQueryListBean 
* @Description: TODO(对外暴露开门利是查询) 
* @author zcb 
* @date 2018年1月8日 上午11:53:56 
*
 */
public class QueryGiftMoneyListBean extends BaseBean{

	private static final long serialVersionUID = 1L;
	
	private int id;//主键ID
	
	private String name;//员工姓名
	
	private String employeeId;//员工ID
	
	private String payOrderId;  //利是发放订单号
	
	private String mobile;//手机号码
	
	private Long payAmount;//发放金额
	
	private String userId;//会员号
	
	private String state;//状态(0-发放成功，1-待发放，2-发放失败)
	
	private String remark;//备注
	
	private Date successTime;//发放成功时间
	
	private Date updateTime;//更新时间
	
	private Long succeedTotal;//成功总数
	
	private Long stayoutTotal;//待发放总数
	
	private Long defeatedTotal;//失败总数
	
	private Long notSureTotal;//不确定总数
	
	private Long countTotal;//总数
	
	private List<QueryGiftMoneyListBean> giftMoneyList;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmployeeId() {
		return employeeId;
	}

	public void setEmployeeId(String employeeId) {
		this.employeeId = employeeId;
	}

	public String getMobile() {
		return mobile;
	}

	public void setMobile(String mobile) {
		this.mobile = mobile;
	}

	public Long getPayAmount() {
		return payAmount;
	}

	public void setPayAmount(Long payAmount) {
		this.payAmount = payAmount;
	}

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getRemark() {
		return remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}

	public Date getSuccessTime() {
		return successTime;
	}

	public void setSuccessTime(Date successTime) {
		this.successTime = successTime;
	}

	public Date getUpdateTime() {
		return updateTime;
	}

	public void setUpdateTime(Date updateTime) {
		this.updateTime = updateTime;
	}
	
	public Long getSucceedTotal() {
		return succeedTotal;
	}

	public void setSucceedTotal(Long succeedTotal) {
		this.succeedTotal = succeedTotal;
	}

	public Long getStayoutTotal() {
		return stayoutTotal;
	}

	public void setStayoutTotal(Long stayoutTotal) {
		this.stayoutTotal = stayoutTotal;
	}

	public Long getDefeatedTotal() {
		return defeatedTotal;
	}

	public void setDefeatedTotal(Long defeatedTotal) {
		this.defeatedTotal = defeatedTotal;
	}
	
	public Long getNotSureTotal() {
		return notSureTotal;
	}

	public void setNotSureTotal(Long notSureTotal) {
		this.notSureTotal = notSureTotal;
	}

	public Long getCountTotal() {
		return countTotal;
	}

	public void setCountTotal(Long countTotal) {
		this.countTotal = countTotal;
	}

	public List<QueryGiftMoneyListBean> getGiftMoneyList() {
		return giftMoneyList;
	}

	public void setGiftMoneyList(List<QueryGiftMoneyListBean> giftMoneyList) {
		this.giftMoneyList = giftMoneyList;
	}

    public String getPayOrderId() {
        return payOrderId;
    }

    public void setPayOrderId(String payOrderId) {
        this.payOrderId = payOrderId;
    }

	
	
}
