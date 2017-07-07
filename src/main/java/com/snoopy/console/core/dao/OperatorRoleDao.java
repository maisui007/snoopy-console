package com.snoopy.console.core.dao;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;

/**
 * Created by V on 2017/6/27.
 * 操作员与部门角色
 */
public interface OperatorRoleDao {
    String QUERY_FILEDS = "ID id,OPER_ID operId,ROLE_ID roleId,CREATED_TS createdTs,LAST_UPD_TS lastUpdTs,LAST_UPD_TRANCODE lastUpdTranCode";

    /***
     * 添加操作员与部门角色之间的关系
     * @return
     */
    @Insert({
            "INSERT INTO",
            "OPERATOR_ROLE",
            "(ID,OPER_ID,ROLE_ID,LAST_UPD_TRANCODE)",
            "VALUES",
            "(#{id,jdbcType=VARCHAR},#{operId,jdbcType=VARCHAR},#{lastUpdTranCode,jdbcType=VARCHAR})"
    })
    int save();

    @Delete({
            "DELETE",
            "FROM",
            "OPERATOR_ROLE",
            "WHERE",
            "ID = #{id,jdbcType=VARCHAR}"
    })
    int delete(@Param("id") String id);

    /**
     * 删除操作员对应的所有角色角色
     * @param operId
     * @return
     */
    @Delete({
            "DELETE",
            "FROM",
            "OPERATOR_ROLE",
            "WHERE",
            "OPER_ID = #{operId,jdbcType=VARCHAR}"
    })
    int deleteRolesByOperId(@Param("operId") String operId);

}
