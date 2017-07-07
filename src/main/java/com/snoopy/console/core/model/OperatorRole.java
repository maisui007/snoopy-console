package com.snoopy.console.core.model;

import java.io.Serializable;
import java.util.Date;

/**
 * Created by V on 2017/6/23.
 * 操作员角色
 */
public class OperatorRole implements Serializable {


    private int id;


    private String operId;


    private String roleId;

    private Date createdTs;


    private Date lastUpdTs;


    private String lastUpdTranCode;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getOperId() {
        return operId;
    }

    public void setOperId(String operId) {
        this.operId = operId;
    }

    public String getRoleId() {
        return roleId;
    }

    public void setRoleId(String roleId) {
        this.roleId = roleId;
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
