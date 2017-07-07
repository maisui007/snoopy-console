package com.snoopy.console.core.service;

import com.snoopy.console.core.model.Operator;
import com.snoopy.console.core.model.OperatorRole;
import com.snoopy.console.core.model.Resource;
import com.snoopy.console.core.exception.SnoopyException;
import com.snoopy.console.web.vo.OperatorVo;

import java.util.List;
import java.util.Map;

/**
 * Created by V on 2017/6/23.
 * 操作员服务接口
 *用户类别：
 * 1.root【0.添加资源1.添加部门3.为部门分配资源4.添加管理员5.重置管理员密码6.基本功能】
 * 2.管理者【0.添加部门角色1.添加操作员2.重置操作员密码6.基本功能】
 * 3.操作者【0.基本功能1.操作资源】
 *基本功能：
 * 1.基本信息
 * 2.修改密码
 */
public interface OperatorService {

    /**
     * 保存操作员、部门管理员
     * @param oper 操作员
     * @param roleIds 角色id
     */
    void save(Operator oper, List<String> roleIds) throws SnoopyException;

    /**
     * 获取操作员信息
     * @param operId
     * @return
     */
    Operator get(String operId);

    /**
     * 获取操作员列表
     * @param params
     * @param pageIndex
     * @param pageSize
     * @return
     */
    List<OperatorVo> getOperList(Map<String, String> params, int pageIndex, int pageSize);

    OperatorVo getOperDtl(String operId, String operType);

    /**
     * 获取操作员列表记录数
     * @param params
     * @return
     */
    int getOperCount(Map<String, String> params);

    /**
     * 获取操作员所拥有的权限资源
     * @param operId
     * @return
     */
    List<Resource> getResourceListByOperId(String operId) ;

    /**
     * 获取操作员已分配的部门角色ID列表
     * @param operId
     * @return
     */
    List<OperatorRole> getRoleListByOperId(String operId) ;

    /**
     * 校验对应operId的密码
     * @param operId
     * @param pwd
     * @return
     */
    boolean checkOperatorPwd(String operId, String pwd);

}
