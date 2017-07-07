package com.snoopy.console.core.dao;

import com.snoopy.console.core.model.Department;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import java.util.Date;
import java.util.List;

/**
 * Created by V on 2017/6/27.
 */
public interface DepartmentDao {
    String QUERY_FIELDS = "DEPARTMENT_ID departmentId,DEPARTMENT_NAME departmentName,REMARK remark,CREATED_TS createdTs,LAST_UPD_TS lastUpdTs,LAST_UPD_TRANCODE lastUpdTranCode ";

    @Insert({
            "INSERT INTO",
            "DEPARTMENT",
            "(DEPARTMENT_ID,DEPARTMENT_NAME,REMARK,LAST_UPD_TRANCODE)",
            "VALUES",
            "(#{departmentId,jdbcType=VARCHAR},#{departmentName,jdbcType=VARCHAR},#{remark,jdbcType=VARCHAR},#{lastUpdTranCode,jdbcType=VARCHAR})"
    })
    int save(Department department);

    /***
     * 更新部门名称，备注，更新交易号
     * @param department
     * @return
     */
    @Update({
            "UPDATE",
            "DEPARTMENT",
            "SET",
            "DEPARTMENT_NAME=#{departmentName,jdbcType=VARCHAR}",
            ",",
            "REMARK=#{remark,jdbcType=VARCHAR}",
            ",",
            "LAST_UPD_TRANCODE=#{lastUpdTranCode,jdbcType=VARCHAR}",
            "WHERE ",
            "DEPARTMENT_ID=#{departmentId,jdbcType=VARCHAR}"
    })
    int update(Department department);

    /***
     * 根据部门主键查询
     * @param departmentId
     * @return
     */
    @Select({
            "SELECT",
            QUERY_FIELDS,
            "FROM",
            "DEPARTMENT",
            "WHERE",
            "DEPARTMENT_ID = #{departmentId,jdbcType=VARCHAR}"
    })
    Department getDepartmentById(@Param("departmentId") String departmentId);

    /***
     * 根据部门名称查询
     * @param departmentName
     * @return
     */
    @Select({
            "SELECT",
            QUERY_FIELDS,
            "FROM",
            "DEPARTMENT",
            "WHERE",
            "DEPARTMENT_NAME = #{departmentName,jdbcType=VARCHAR}"
    })
    List<Department> getDepartmentByName(@Param("departmentName") String departmentName);

    /***
     * 分页查询
     * @param department
     * @param limit
     * @param pageSize
     * @param beginTs
     * @param endTs
     * @return
     */
    @Select({
            "<script>",
            "SELECT",
            QUERY_FIELDS,
            "FROM",
            "DEPARTMENT",
            "WHERE",
            "1=1",
            "<if test = \"department.departmentId !=null and department.departmentId !=''\">",
            "</if>",
            "<if test = \"department.departmentName !=null and department.departmentName !='' \">",
            "AND DEPARTMENT_NAME=#{department.departmentName,jdbcType=VARCHAR}",
            "</if>",
            "<if test = \"department.remark !=null and department.remark !=''\">",
            "AND REMARK=#{remark,jdbcType=VARCHAR}",
            "</if>",
//            "<if test = \"createdTs !=null and createdTs !=''\">",
//            "</if>",
            "<choose>",
            "<when test = \"beginTs !=null and endTs !=null\">",
            "AND LAST_UPD_TS &gt;=#{beginTs,jdbcType=TIMESTAMP} AND LAST_UPD_TS &lt;=#{endTs,jdbcType=TIMESTAMP} ",
            "</when>",
            "<otherwise>",
            "<if test=\"beginTs !=null and endTs ==null\">",
            "AND LAST_UPD_TS &gt;=#{beginTs,jdbcType=TIMESTAMP} ",
            "</if>",
            "<if test=\"beginTs ==null and endTs !=null\">",
            " AND LAST_UPD_TS &lt;=#{endTs,jdbcType=TIMESTAMP} ",
            "</if>",
            "</otherwise>",
            "</choose>",
            "<if test = \"department.lastUpdTranCode !=null and department.lastUpdTranCode !=''\">",
            "AND LAST_UPD_TRANCODE = #{lastUpdTranCode,jdbcType=VARCHAR}",
            "</if>",
            "ORDER BY LAST_UPD_TS DESC",
            "LIMIT #{limit,jdbcType=NUMERIC},#{pageSize,jdbcType=NUMERIC}",
            "</script>"
    })
    List<Department> getDepartmentByPage(@Param("department") Department department, @Param("limit") int limit, @Param("pageSize") int pageSize, @Param("beginTs") Date beginTs, @Param("endTs") Date endTs);

    /***
     * 分页查询数据统计
     * @param department
     * @param beginTs
     * @param endTs
     * @return
     */
    @Select({
            "<script>",
            "SELECT",
            QUERY_FIELDS,
            "FROM",
            "DEPARTMENT",
            "WHERE",
            "1=1",
            "<if test = \"department.departmentId !=null and department.departmentId !=''\">",
            "</if>",
            "<if test = \"department.departmentName !=null and department.departmentName !='' \">",
            "AND DEPARTMENT_NAME=#{department.departmentName,jdbcType=VARCHAR}",
            "</if>",
            "<if test = \"department.remark !=null and department.remark !=''\">",
            "AND REMARK=#{remark,jdbcType=VARCHAR}",
            "</if>",
//            "<if test = \"createdTs !=null and createdTs !=''\">",
//            "</if>",
            "<choose>",
            "<when test = \"beginTs !=null and endTs !=null\">",
            "AND LAST_UPD_TS &gt;=#{beginTs,jdbcType=TIMESTAMP} AND LAST_UPD_TS &lt;=#{endTs,jdbcType=TIMESTAMP} ",
            "</when>",
            "<otherwise>",
            "<if test=\"beginTs !=null and endTs ==null\">",
            "AND LAST_UPD_TS &gt;=#{beginTs,jdbcType=TIMESTAMP} ",
            "</if>",
            "<if test=\"beginTs ==null and endTs !=null\">",
            " AND LAST_UPD_TS &lt;=#{endTs,jdbcType=TIMESTAMP} ",
            "</if>",
            "</otherwise>",
            "</choose>",
            "<if test = \"department.lastUpdTranCode !=null and department.lastUpdTranCode !=''\">",
            "AND LAST_UPD_TRANCODE = #{lastUpdTranCode,jdbcType=VARCHAR}",
            "</if>",
            "ORDER BY LAST_UPD_TS DESC",
            "</script>"
    })
    List<Department> getDepartmentCountByPage(@Param("department") Department department, @Param("beginTs") Date beginTs, @Param("endTs") Date endTs);



}
