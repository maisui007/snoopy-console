package com.snoopy.console.web.controller;

import com.alibaba.fastjson.JSONObject;
import com.snoopy.console.web.vo.LoginVo;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * Created by V on 2017/6/30.
 * 用户登录
 */
@RequestMapping("/snoopy")
@RestController
public class LoginController {

    private Logger logger = LoggerFactory.getLogger(getClass());
    @RequestMapping("/login")
    public Object login(@RequestBody JSONObject json){
        logger.info("snoopyConsole|登录|start");
        logger.info("snoopyConsole|登录|end");
        JSONObject jsonObject = new JSONObject();
        // 返回的结果集
        List<JSONObject> fileItems = new ArrayList<>();

        JSONObject fileItem = new JSONObject();
        fileItem.put("name", "123");
        fileItems.add(fileItem);
        jsonObject.put("result",fileItems );
        return jsonObject;
    }

}
