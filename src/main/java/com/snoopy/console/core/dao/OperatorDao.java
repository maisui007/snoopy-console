package com.snoopy.console.core.dao;

import com.snoopy.console.core.model.Operator;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Update;

/**
 * Created by V on 2017/6/27.
 */
public interface OperatorDao {
    String QUERY_FILEDS = "OPER_ID operId,DEPARTMENT_ID departmentId,OPER_TYPE operType,OPER_PWD operPwd,OPER_NAME operName,OPER_EMAIL operEmail,PHONE_NO phoneNo,OPER_STATUS operStatus,OPER_POSITION position,LAST_VALIDITY_DAY lastValidityDay,REMARK remark,CREATED_TS createdTs,LAST_UPD_TS lastUpdTs,LAST_UPD_TRANCODE lastUpdTranCode,PWD_ERR_NUM pwdErrNum,PWD_LAST_UPDATE_TIME pwdLastUpdateTime";

    /***
     * 添加操作员
     * @param operator
     * @return
     */
    @Insert({
        "INSERT INTO",
            "OPERATOR",
            "(OPER_ID ,DEPARTMENT_ID ,OPER_TYPE ,OPER_PWD ,OPER_NAME ,OPER_EMAIL ,PHONE_NO ,OPER_STATUS ,OPER_POSITION ,LAST_VALIDITY_DAY ,REMARK ,LAST_UPD_TRANCODE ,PWD_ERR_NUM  )",
            "VALUES",
            "( #{operId,jdbcType=VARCHAR}, #{departmentId,jdbcType=VARCHAR}, #{operType,jdbcType=VARCHAR}, #{operPwd,jdbcType=VARCHAR}, #{operName,jdbcType=VARCHAR}, #{operEmail,jdbcType=VARCHAR}, #{phoneNo,jdbcType=VARCHAR}, #{operStatus,jdbcType=VARCHAR}, #{position,jdbcType=VARCHAR}, #{lastValidityDay,jdbcType=VARCHAR}, #{remark,jdbcType=VARCHAR},  #{lastUpdTranCode,jdbcType=VARCHAR}, #{pwdErrNum,jdbcType=NUMERIC})"
    })
    int save(Operator operator);


    /***
     * 修改操作员信息
     * @param operator
     * @return
     */
    @Update({
            "UPDATE",
            "OPERATOR",
            "SET",
            "OPER_TYPE=#{operType,jdbcType=VARCHAR}",
            ",",
            "OPER_PWD=#{operPwd,jdbcType=VARCHAR}",
            ",",
            "OPER_NAME=#{operName,jdbcType=VARCHAR}",
            ",",
            "OPER_EMAIL=#{operEmail,jdbcType=VARCHAR}",
            ",",
            "PHONE_NO=#{phoneNo,jdbcType=VARCHAR}",
            ",",
            "OPER_STATUS= #{operStatus,jdbcType=VARCHAR}",
            ",",
            "OPER_POSITION=#{position,jdbcType=VARCHAR}",
            ",",
            "LAST_VALIDITY_DAY=#{lastValidityDay,jdbcType=VARCHAR}",
            ",",
            "REMARK=#{remark,jdbcType=VARCHAR}",
            ",",
            "LAST_UPD_TRANCODE=#{lastUpdTranCode,jdbcType=VARCHAR}",
            ",",
            "PWD_ERR_NUM=#{pwdErrNum,jdbcType=NUMERIC}",
            "WHERE",
            "OPER_ID=#{operId,jdbcType=VARCHAR}"
    })
    int update(Operator operator);

    /***
     * 删除操作员
     * @param operator
     * @return
     */
    @Delete({
            "DELETE",
            "FROM",
            "OPERATOR",
            "WHERE",
            "OPER_ID=#{operId,jdbcType=VARCHAR}",
            "AND PHONE_NO=#{phoneNo,jdbcType=VARCHAR}"
    })
    int delete(Operator operator);

}
