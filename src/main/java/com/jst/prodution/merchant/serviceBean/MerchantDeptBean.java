package com.jst.prodution.merchant.serviceBean;

import java.util.Date;
import java.util.List;

import com.jst.prodution.base.bean.BaseBean;
import com.jst.prodution.merchant.model.MerchantDept;
import com.jst.prodution.merchant.model.MerchantMenu;

public class MerchantDeptBean extends BaseBean{
 
	/**
	 * 
	 */

	private static final long serialVersionUID = 2879442518223806965L;

	private String deptId;

    private String deptName;

    private String merchantId;
    
    private String creator;

    private Date createTime;

    private String updater;
    
    private Date updateTime;

    private String isVerify;
    
    private List<MerchantDeptBean> merchantDeptListBean;
    
    private List<MerchantDept> merchantDeptList;
    
    private String checkedMenu;
    
    private List<MerchantMenu> merchantMenuList;	//商户权限管理树
    
    private String menuStr;

    public String getDeptId() {
        return deptId;
    }

    public void setDeptId(String deptId) {
        this.deptId = deptId == null ? null : deptId.trim();
    }

    public String getDeptName() {
        return deptName;
    }

    public void setDeptName(String deptName) {
        this.deptName = deptName == null ? null : deptName.trim();
    }

    public String getMerchantId() {
        return merchantId;
    }

    public void setMerchantId(String merchantId) {
        this.merchantId = merchantId == null ? null : merchantId.trim();
    }

    public String getCreator() {
		return creator;
	}

	public void setCreator(String creator) {
		this.creator = creator;
	}

	public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public String getUpdater() {
		return updater;
	}

	public void setUpdater(String updater) {
		this.updater = updater;
	}

	public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    public String getIsVerify() {
        return isVerify;
    }

    public void setIsVerify(String isVerify) {
        this.isVerify = isVerify == null ? null : isVerify.trim();
    }

	public List<MerchantDeptBean> getMerchantDeptListBean() {
		return merchantDeptListBean;
	}

	public void setMerchantDeptListBean(List<MerchantDeptBean> merchantDeptListBean) {
		this.merchantDeptListBean = merchantDeptListBean;
	}

	public String getCheckedMenu() {
		return checkedMenu;
	}

	public void setCheckedMenu(String checkedMenu) {
		this.checkedMenu = checkedMenu;
	}

	public List<MerchantMenu> getMerchantMenuList() {
		return merchantMenuList;
	}

	public void setMerchantMenuList(List<MerchantMenu> merchantMenuList) {
		this.merchantMenuList = merchantMenuList;
	}

	public List<MerchantDept> getMerchantDeptList() {
		return merchantDeptList;
	}

	public void setMerchantDeptList(List<MerchantDept> merchantDeptList) {
		this.merchantDeptList = merchantDeptList;
	}

	public String getMenuStr() {
		return menuStr;
	}

	public void setMenuStr(String menuStr) {
		this.menuStr = menuStr;
	}
}