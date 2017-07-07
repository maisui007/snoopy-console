package com.snoopy.console.web.vo;


import com.snoopy.console.core.model.DepartmentRole;

/**
 * Created by V on 2017/6/27.
 */
public class DepartmentRoleVo extends DepartmentRole {
    /**
     * 序号
     */
    private int colNo;

    /**
     * 部门名称
     */
    private String departmentName;

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


}
