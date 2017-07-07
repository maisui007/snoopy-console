package com.snoopy.console.core.dao;

import com.snoopy.console.core.model.DepartmentRole;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import java.util.List;

/**
 * Created by V on 2017/6/27.
 */
public interface DepartmentRoleDao {
    String QUERY_FILEDS = "ROLE_ID roleId,ROLE_NAME roleName,DEPARTMENT_ID departmentId,REMARK remark,CREATED_TS createdTs,LAST_UPD_TS lastUpdTs,LAST_UPD_TRANCODE lastUpdTranCode";


    /***
     * 部门角色关系
     * @param departmentRole
     * @return
     */
    @Insert({
            "INSERT INTO ",
            "DEPARTMENT_ROLE",
            "(ROLE_ID,ROLE_NAME,DEPARTMENT_ID,REMARK,LAST_UPD_TRANCODE)",
            "VALUES",
            "(#{roleId,jdbcType=VARCHAR},#{roleName,jdbcType=VARCHAR},#{departmentId,jdbcType=VARCHAR},#{remark,jdbcType=VARCHAR},#{lastUpdTranCode,jdbcType=VARCHAR})"
    })
    int save(DepartmentRole departmentRole);

    /***
     * 更新角色名称及备注
     * @param departmentRole
     * @return
     */
    @Update({
            "UPDATE",
            "DEPARTMENT_ROLE",
            "SET",
            "REMARK=#{remark,jdbcType=VARCHAR}",
            ",",
            "ROLE_NAME=#{roleName,jdbcType=VARCHAR}",
            "WHERE",
            "ROLE_ID=#{roleId,jdbcType=VARCHAR}"
    })
    int update(DepartmentRole departmentRole);

    /***
     * 查询部门角色对应关系
     * @param departmentRole
     * @return
     */
    @Select({
            "<script>",
            "SELECT",
            QUERY_FILEDS,
            "FROM",
            "DEPARTMENT_ROLE",
            "WHERE",
            "<if test = \"roleId !=null and roleId !=''\">",
            "ROLE_ID =#{roleId,jdbcType=VARCHAR}",
            "</if>",

            "<if test = \"roleName !=null and roleName !=''\">",
            "ROLE_NAME=#{roleName,jdbcType=VARCHAR}",
            "</if>",

            "<if test = \"departmentId !=null and departmentId!=''\">",
            "DEPARTMENT_ID=#{departmentId,jdbcType=VARCHAR}",
            "</if>",

            "<if test = \"remark !=null and remark !=''\">",
            "REMARK LIKE '%'#{remark,jdbcType=VARCHAR}'%'",
            "</if>",
            "</script>"
    })
    List<DepartmentRole> getDepartmentRoleList(DepartmentRole departmentRole);
}
