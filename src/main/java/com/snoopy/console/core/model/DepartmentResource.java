package com.snoopy.console.core.model;

import java.io.Serializable;
import java.util.Date;

/**
 * Created by V on 2017/6/23.
 * 部门拥有的资源
 */

public class DepartmentResource implements Serializable {


    private String id;

    private String departmentId;

    private String resourceId;

    private Date createdTs;

    private Date lastUpdTs;

    private String lastUpdTranCode;


    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getDepartmentId() {
        return departmentId;
    }

    public void setDepartmentId(String departmentId) {
        this.departmentId = departmentId;
    }

    public String getResourceId() {
        return resourceId;
    }

    public void setResourceId(String resourceId) {
        this.resourceId = resourceId;
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
