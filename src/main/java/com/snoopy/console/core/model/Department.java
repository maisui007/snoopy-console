package com.snoopy.console.core.model;

import java.io.Serializable;
import java.util.Date;

/**
 * Created by V on 2017/6/23.
 * 部门
 */

public class Department implements Serializable {


    private String departmentId;


    private String departmentName;


    private String remark;


    private Date createdTs;


    private Date lastUpdTs;



    private String lastUpdTranCode;

    public String getDepartmentId() {
        return departmentId;
    }

    public void setDepartmentId(String departmentId) {
        this.departmentId = departmentId;
    }

    public String getDepartmentName() {
        return departmentName;
    }

    public void setDepartmentName(String departmentName) {
        this.departmentName = departmentName;
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

    public String getLastUpdTranCode() {
        return lastUpdTranCode;
    }

    public void setLastUpdTranCode(String lastUpdTranCode) {
        this.lastUpdTranCode = lastUpdTranCode;
    }
}
