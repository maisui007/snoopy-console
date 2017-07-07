package com.snoopy.console.web.vo;


import com.snoopy.console.core.model.Department;

/**
 * Created by V on 2017/6/27.
 */
public class DepartmentVo extends Department {
    /**
     * 序号
     */
    private int colNo;

    public int getColNo() {
        return colNo;
    }

    public void setColNo(int colNo) {
        this.colNo = colNo;
    }
}
