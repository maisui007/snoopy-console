package com.snoopy.console.core.dao;

import com.snoopy.console.core.model.RoleResource;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Update;

/**
 * Created by V on 2017/6/27.
 */
public interface RoleResourceDao {
    String QUERY_FILEDS = "ID id,ROLE_ID roleId,RESOURCE_ID resourceId,CREATED_TS createdTs,LAST_UPD_TS lastUpdTs,LAST_UPD_TRANCODE lastUpdTranCode";


    /***
     * 添加角色资源
     * @param roleResource
     * @return
     */
    @Insert({
            "INSERT INTO",
            "ROLE_RESOURCE",
            "(ID ,ROLE_ID ,RESOURCE_ID ,LAST_UPD_TRANCODE)",
            "VALUES",
            "( #{id,jdbcType=VARCHAR},#{roleId,jdbcType=VARCHAR}, #{resourceId,jdbcType=VARCHAR}, #{lastUpdTranCode,jdbcType=VARCHAR})"

    })
    int save(RoleResource roleResource);

    /**
     * 更新角色资源
     * @param roleResource
     * @return
     */
    @Update({

    })
    int update(RoleResource roleResource);

    /***
     * 删除角色资源
     * @param roleResource
     * @return
     */
    @Delete({
        "DELETE FROM",
            "ROLE_RESOURCE",
            "WHERE",
            "ID=#{id,jdbcType=VARCHAR}"
    })
    int delete(RoleResource roleResource);

    @Delete({
            "DELETE FROM",
            "ROLE_RESOURCE",
            "WHERE",
            "ROLE_ID=#{roleId,jdbcType=VARCHAR}"
    })
    int deleteByRoleId(RoleResource roleResource);














}
