package com.snoopy.console.core.model;

import java.io.Serializable;

/**
 * Created by V on 2017/6/29.
 * 应用系统
 */
public class AppSystem implements Serializable{
    private String appId;
    private String appCode;//系统编号
    private String appName;//系统名称
    private String createTs;//创建时间
    private String updateTs;//更新时间

    public String getAppId() {
        return appId;
    }

    public void setAppId(String appId) {
        this.appId = appId;
    }

    public String getAppCode() {
        return appCode;
    }

    public void setAppCode(String appCode) {
        this.appCode = appCode;
    }

    public String getAppName() {
        return appName;
    }

    public void setAppName(String appName) {
        this.appName = appName;
    }

    public String getCreateTs() {
        return createTs;
    }

    public void setCreateTs(String createTs) {
        this.createTs = createTs;
    }

    public String getUpdateTs() {
        return updateTs;
    }

    public void setUpdateTs(String updateTs) {
        this.updateTs = updateTs;
    }
}
