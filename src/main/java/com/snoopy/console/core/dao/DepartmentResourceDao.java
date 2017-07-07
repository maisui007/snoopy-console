package com.snoopy.console.core.dao;

import com.snoopy.console.core.model.DepartmentResource;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * Created by V on 2017/6/27.
 */
public interface DepartmentResourceDao {
    String QUERY_FILEDS = "ID id,DEPARTMENT_ID departmentId,RESOURCE_ID resourceId,CREATED_TS createdTs,LAST_UPD_TS lastUpdTs,LAST_UPD_TRANCODE lastUpdTranCode ";

    /***
     * 插入部门资源对应关系
     * @param departmentResource
     * @return
     */
    @Insert({

            "INSERT INTO",
            "DEPARTMENT_RESOURCE",
            "(ID,DEPARTMENT_ID,RESOURCE_ID,LAST_UPD_TRANCODE)",
            "VALUES",
            "(#{departmentResource.id,jdbcType=VARCHAR},#{departmentResource.departmentId,jdbcType=VARCHAR},#{departmentResource.resourceId,jdbcType=VARCHAR},#{departmentResource.lastUpdTranCode,jdbcType=VARCHAR})"
    })
    int save(@Param("departmentResource") DepartmentResource departmentResource);

    /***
     * 删除部门对应的所有资源
     * @param departmentId
     * @return
     */
    @Delete({
            "DELETE FROM DEPARTMENT_RESOURCE",
            "WHERE",
            "DEPARTMENT_ID=#{departmentId,jdbcType=VARCHAR}"
    })
    int deleteDepartmentResources(@Param("departmentId") String departmentId);


    /***
     * 查询部门对应的所有的部门资源关系
     * @param departmentId
     * @return
     */
    List<DepartmentResource> getDepartmentResourceByDepatmentId(@Param("departmentId") String departmentId);
    @Insert({

            "<script>",
//            "<foreach collection='departmentResourceList' item='departmentResource' index='index' open='' separator=';' close=''>",
            "INSERT INTO",
            "DEPARTMENT_RESOURCE",
            "(ID,DEPARTMENT_ID,RESOURCE_ID,LAST_UPD_TRANCODE)",
            "VALUES",
            "<foreach collection='departmentResourceList' item='departmentResource'  open='(' separator = '),(' close=')'>",
//            "(#{departmentResource.id,jdbcType=VARCHAR},#{departmentResource.departmentId,jdbcType=VARCHAR},#{departmentResource.resourceId,jdbcType=VARCHAR},#{departmentResource.lastUpdTranCode,jdbcType=VARCHAR})",
            "#{departmentResource.id,jdbcType=VARCHAR},#{departmentResource.departmentId,jdbcType=VARCHAR},#{departmentResource.resourceId,jdbcType=VARCHAR},#{departmentResource.lastUpdTranCode,jdbcType=VARCHAR}",
            "</foreach>",
            "</script>"
    })
    int saveAll(@Param("departmentResourceList") List<DepartmentResource> departmentResourceList);
}
