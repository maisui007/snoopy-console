package com.snoopy.console.web.vo;

/**
 * Created by V on 2017/6/30.
 * 用户登录请求VO
 */
public class LoginVo {
    private String userName;//用户名
    private String passWord;//密码
    private String mobileNo;//手机号
    private String smsCode;//验证码

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassWord() {
        return passWord;
    }

    public void setPassWord(String passWord) {
        this.passWord = passWord;
    }

    public String getMobileNo() {
        return mobileNo;
    }

    public void setMobileNo(String mobileNo) {
        this.mobileNo = mobileNo;
    }

    public String getSmsCode() {
        return smsCode;
    }

    public void setSmsCode(String smsCode) {
        this.smsCode = smsCode;
    }
}
