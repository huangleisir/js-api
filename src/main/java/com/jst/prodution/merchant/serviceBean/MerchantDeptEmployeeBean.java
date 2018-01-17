package com.jst.prodution.merchant.serviceBean;

import java.util.Date;
import java.util.List;

import com.jst.prodution.base.bean.BaseBean;
import com.jst.prodution.merchant.model.MerchantDeptEmployee;

public class MerchantDeptEmployeeBean extends BaseBean{
    /**
	 * 
	 */
	private static final long serialVersionUID = -4525823259106861621L;

	private String employeeId;

    private String employeeNo;

    private String employeeName;

    private String merchantId;

    private String deptId;

    private String password;

    private String phone;

    private String remark;
    
    private String creator;

    private Date createTime;

    private String updater;
    
    private Date updateTime;

    private String state;
    
    private List<MerchantDeptEmployeeBean> merchantDeptEmployeeBeanList;
    
    private MerchantDeptEmployee employee;
    
    private String deptName;

    public String getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(String employeeId) {
        this.employeeId = employeeId == null ? null : employeeId.trim();
    }

    public String getEmployeeNo() {
        return employeeNo;
    }

    public void setEmployeeNo(String employeeNo) {
        this.employeeNo = employeeNo == null ? null : employeeNo.trim();
    }

    public String getEmployeeName() {
        return employeeName;
    }

    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName == null ? null : employeeName.trim();
    }

    public String getMerchantId() {
        return merchantId;
    }

    public void setMerchantId(String merchantId) {
        this.merchantId = merchantId == null ? null : merchantId.trim();
    }

    public String getDeptId() {
        return deptId;
    }

    public void setDeptId(String deptId) {
        this.deptId = deptId == null ? null : deptId.trim();
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password == null ? null : password.trim();
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone == null ? null : phone.trim();
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getCreator() {
		return creator;
	}

	public void setCreator(String creator) {
		this.creator = creator;
	}

	public String getUpdater() {
		return updater;
	}

	public void setUpdater(String updater) {
		this.updater = updater;
	}

	public List<MerchantDeptEmployeeBean> getMerchantDeptEmployeeBeanList() {
		return merchantDeptEmployeeBeanList;
	}

	public void setMerchantDeptEmployeeBeanList(
			List<MerchantDeptEmployeeBean> merchantDeptEmployeeBeanList) {
		this.merchantDeptEmployeeBeanList = merchantDeptEmployeeBeanList;
	}

	public MerchantDeptEmployee getEmployee() {
		return employee;
	}

	public void setEmployee(MerchantDeptEmployee employee) {
		this.employee = employee;
	}

	public String getDeptName() {
		return deptName;
	}

	public void setDeptName(String deptName) {
		this.deptName = deptName;
	}
}