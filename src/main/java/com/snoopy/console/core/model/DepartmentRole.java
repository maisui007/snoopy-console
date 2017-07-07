package com.snoopy.console.core.model;

import java.io.Serializable;
import java.util.Date;

/**
 * Created by V on 2017/6/23.
 * 部门拥有的角色
 */

public class DepartmentRole implements Serializable {


    private String roleId;


    private String roleName;


    private String departmentId;

    private String remark;


    private Date createdTs;


    private Date lastUpdTs;



    private Date lastUpdTranCode;

    public String getRoleId() {
        return roleId;
    }

    public void setRoleId(String roleId) {
        this.roleId = roleId;
    }

    public String getRoleName() {
        return roleName;
    }

    public void setRoleName(String roleName) {
        this.roleName = roleName;
    }

    public String getDepartmentId() {
        return departmentId;
    }

    public void setDepartmentId(String departmentId) {
        this.departmentId = departmentId;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public Date getCreatedTs() {
        return createdTs;
    }

    public void setCreatedTs(Date createdTs) {
        this.createdTs = createdTs;
    }

    public Date getLastUpdTs() {
        return lastUpdTs;
    }

    public void setLastUpdTs(Date lastUpdTs) {
        this.lastUpdTs = lastUpdTs;
    }

    public Date getLastUpdTranCode() {
        return lastUpdTranCode;
    }

    public void setLastUpdTranCode(Date lastUpdTranCode) {
        this.lastUpdTranCode = lastUpdTranCode;
    }
}
