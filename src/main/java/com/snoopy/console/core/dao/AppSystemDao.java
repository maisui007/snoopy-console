package com.snoopy.console.core.dao;

import com.snoopy.console.core.model.AppSystem;
import org.apache.ibatis.annotations.*;

import java.util.List;

/**
 * Created by V on 2017/6/29.
 */
public interface AppSystemDao {
    String QUERY_FILEDS = "APP_ID appId,APP_CODE appCode,APP_NAME appName,CREATE_TS createTs,UPDATE_TS updateTs";


    /**
     * 插入业务系统
     * @param appSystem
     * @return
     */
    @Insert({
            "INSERT INTO",
            "APP_SYSTEM",
            "(APP_ID,APP_CODE,APP_NAME)",
            "VALUES",
            "(#{appId,jdbcType=VARCHAR},#{appCode,jdbcType=VARCHAR},#{appName,jdbcType=VARCHAR})"
    })
    int save(AppSystem appSystem);



    @Update({
            "UPDATE",
            "APP_SYSTEM",
            "SET APP_NAME=#{appName,jdbcType=VARCHAR}",
            "WHERE",
            "APP_ID=#{appId,jdbcType=VARCHAR}"
    })
    int update(AppSystem appSystem);

    @Delete({
            "DELETE",
            "FROM",
            "APP_SYSTEM",
            "WHERE",
            "APP_ID=#{appId,jdbcType=VARCHAR}"
    })
    int delete(AppSystem appSystem);

    /***
     * 查询业务系统,
     * 一个业务系统只有唯一的编号
     * @param appCode
     * @return
     */
    @Select({
            "SELECT",
            QUERY_FILEDS,
            "FROM",
            "APP_SYSTEM",
            "WHERE",
            "1=1",
            "AND APP_CODE = #{appCode,jdbcType=VARCHAR}"
    })
    List<AppSystem> getAppSystemBy(@Param("appCode") String appCode);
}
