package com.snoopy.console.web.service;


import com.snoopy.console.web.vo.LoginVo;
import com.snoopy.console.web.vo.OperatorLoginVo;

/**
 * Created by V on 2017/6/30.
 * 用户登录服务
 */
public interface LoginService {
    OperatorLoginVo login(LoginVo loginVo);
}
