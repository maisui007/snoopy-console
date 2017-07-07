package com.snoopy.console.web.vo;


import com.snoopy.console.core.model.Operator;

/**
 * Created by V on 2017/6/27.
 */
public class OperatorVo extends Operator {

    /**
     * 序号
     */
    private int colNo;

    /**
     * 部门名称
     */
    private String departmentName;

    /**
     * 状态名称
     */
    private String operStatusName;

    /**
     * 角色列表
     */
    private String roleNames;

    public int getColNo() {
        return colNo;
    }

    public void setColNo(int colNo) {
        this.colNo = colNo;
    }

    public String getDepartmentName() {
        return departmentName;
    }

    public void setDepartmentName(String departmentName) {
        this.departmentName = departmentName;
    }

    public String getOperStatusName() {
        return operStatusName;
    }

    public void setOperStatusName(String operStatusName) {
        this.operStatusName = operStatusName;
    }

    public String getRoleNames() {
        return roleNames;
    }

    public void setRoleNames(String roleNames) {
        this.roleNames = roleNames;
    }
}
