package com.snoopy.console.core.model;

import java.io.Serializable;
import java.util.Date;

/**
 * Created by V on 2017/6/23.
 * 操作员
 */
public class Operator implements Serializable {

    private String operId;

    private String departmentId;


    private String operType;


    private String operPwd;


    private String operName;


    private String operEmail;

    private String phoneNo;


    private String operStatus;


    private String position;


    private String lastValidityDay;


    private String remark;


    private Date createdTs;


    private Date lastUpdTs;



    private String lastUpdTranCode;


    private int pwdErrNum;


    private Date pwdLastUpdateTime;

    public String getOperId() {
        return operId;
    }

    public void setOperId(String operId) {
        this.operId = operId;
    }

    public String getDepartmentId() {
        return departmentId;
    }

    public void setDepartmentId(String departmentId) {
        this.departmentId = departmentId;
    }

    public String getOperType() {
        return operType;
    }

    public void setOperType(String operType) {
        this.operType = operType;
    }

    public String getOperPwd() {
        return operPwd;
    }

    public void setOperPwd(String operPwd) {
        this.operPwd = operPwd;
    }

    public String getOperName() {
        return operName;
    }

    public void setOperName(String operName) {
        this.operName = operName;
    }

    public String getOperEmail() {
        return operEmail;
    }

    public void setOperEmail(String operEmail) {
        this.operEmail = operEmail;
    }

    public String getPhoneNo() {
        return phoneNo;
    }

    public void setPhoneNo(String phoneNo) {
        this.phoneNo = phoneNo;
    }

    public String getOperStatus() {
        return operStatus;
    }

    public void setOperStatus(String operStatus) {
        this.operStatus = operStatus;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public String getLastValidityDay() {
        return lastValidityDay;
    }

    public void setLastValidityDay(String lastValidityDay) {
        this.lastValidityDay = lastValidityDay;
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

    public int getPwdErrNum() {
        return pwdErrNum;
    }

    public void setPwdErrNum(int pwdErrNum) {
        this.pwdErrNum = pwdErrNum;
    }

    public Date getPwdLastUpdateTime() {
        return pwdLastUpdateTime;
    }

    public void setPwdLastUpdateTime(Date pwdLastUpdateTime) {
        this.pwdLastUpdateTime = pwdLastUpdateTime;
    }
}
