package com.snoopy.console.core.dao;

import com.snoopy.console.core.model.Resource;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import java.util.List;

/**
 * Created by V on 2017/6/27.
 */
public interface ResourceDao {
    String QUERY_FILEDS = "RESOURCE_ID resourceId,RESOURCE_NAME resourceName,PARENT_ID parentId,HAS_CHILD hasChild,SORT_NUM sortNum,RESOURCE_CODE resourceCode,RESOURCE_PATH path ,RESOURCE_URL resourceUrl,MENU_FLAG menuFlag,REMARK remark ,CREATED_TS createdTs,LAST_UPD_TS lastUpdTs,LAST_UPD_TRANCODE lastUpdTranCode";

    /***
     * @Description查询所有资源降序排列值越大越靠前
     * @return
     */
    @Select({
            "SELECT",
            "FROM",
            "RESOURCE",
            "ORDER BY",
            "SORT_NUM DESC"
    })
    List<Resource> getResourceList();

    /***
     * 根据部门主键获取部门对应的资源
     * @param departmentId
     * @return
     */
    @Select({
            "SELECT",
            "R.*",
            "FROM",
            "RESOURCE R,DEPARTMENT_RESOURCE D ",
            "WHERE",
            " R.RESOURCE_ID = D.RESOURCE_ID",
            " AND D.DEPARTMENT_ID=#{departmentId,jdbcType=VARCHAR} order by R.SORT_NUM DESC"
    })
    List<Resource> getResourceListByDepartmentId(@Param("departmentId") String departmentId);

    /***
     * 根据主键获取资源对象
     * @param resourceId
     * @return
     */
    @Select({
            "SELECT",
            QUERY_FILEDS,
            "FROM",
            "RESOURCE",
            "WHERE",
            "RESOURCE_ID = #{resourceId,jdbcType=VARCHAR}"
    })
    Resource getResourceById(@Param("resourceId") String resourceId);


    /***
     * 插入资源
     * @param resource
     */
    @Insert({
            "INSERT INTO RESOURCE",
//            "(RESOURCE_NAME,PARENT_ID,HAS_CHILD,SORT_NUM,RESOURCE_CODE,RESOURCE_PATH,RESOURCE_URL,MENU_FLAG,REMARK,CREATED_TS,LAST_UPD_TS,LAST_UPD_TRANCODE)",
            "(RESOURCE_ID,RESOURCE_NAME,PARENT_ID,HAS_CHILD,SORT_NUM,RESOURCE_CODE,RESOURCE_PATH,RESOURCE_URL,MENU_FLAG,REMARK,LAST_UPD_TRANCODE)",
            "VALUES",
            "(#{resourceId,jdbcType=VARCHAR},#{resourceName,jdbcType=VARCHAR},#{parentId,jdbcType=VARCHAR},#{hasChild,jdbcType=NUMERIC},#{sortNum,jdbcType=NUMERIC},#{resourceCode,jdbcType=VARCHAR},#{path,jdbcType=VARCHAR},#{resourceUrl,jdbcType=VARCHAR},#{menuFlag,jdbcType=NUMERIC},#{remark,jdbcType=VARCHAR},#{lastUpdTranCode,jdbcType=VARCHAR})"


    })
    void save(Resource resource);

    /***
     * 更新
     * @param resource
     * @return
     */
    @Update({
            "UPDATE",
            "RESOURCE",
            "SET",
            "RESOURCE_NAME =#{resourceName,jdbcType=VARCHAR}",
            ",",
            "RESOURCE_CODE = #{resourceCode,jdbcType=VARCHAR}",
            ",",
            "RESOURCE_URL = #{resourceUrl,jdbcType=VARCHAR}",
            ",",
            "HAS_CHILD = #{hasChild,jdbcType=NUMERIC}",
            ",",
            "MENU_FLAG = #{menuFlag,jdbcType=NUMERIC}",
            ",",
            "REMARK = #{remark,jdbcType=VARCHAR}"
    })
    int update(Resource resource);


}
