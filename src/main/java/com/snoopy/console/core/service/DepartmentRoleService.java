package com.snoopy.console.core.service;

import com.snoopy.console.core.model.DepartmentRole;
import com.snoopy.console.core.model.RoleResource;
import com.snoopy.console.core.exception.SnoopyException;
import com.snoopy.console.web.vo.DepartmentRoleVo;

import java.util.List;
import java.util.Map;

/**
 * Created by V on 2017/6/23.
 * 部门角色服务接口
 *
 */
public interface DepartmentRoleService {

    /**
     * 保存部门角色权限
     * 更新操作：先删除旧角色的权限，然后增加新的
     * @param departRole 部门角色对象
     * @param resourceIdList 部门权限叶子节点ID
     */
    void save(DepartmentRole departRole, List<String> resourceIdList) throws SnoopyException;

    /**
     * 获取部门角色列表
     * @param departmentId
     * @return
     */
    List<DepartmentRoleVo> getDepartmentRoleList(String departmentId);

    /**
     * 当资源池中删除该资源时，也将删除已分配的角色资源
     * @param departmentResourceId
     */
    void deleteResourceByResourceId(String departmentResourceId) throws SnoopyException;

    /**
     * 当角色变更时，删除旧角色对应的权限资源
     * @param roleId
     */
    void deleteResourceByRoleId(String roleId) throws SnoopyException;

    /**
     * 获取角色信息
     * @param roleId
     * @return
     */
    DepartmentRole getDepartmentRole(String roleId);

    /**
     * 获取角色资源
     * @param roleId
     * @return
     */
    List<RoleResource> getRoleResourceList(String roleId);


    /**
     * 获取部门角色列表
     * @return
     */
    List<DepartmentRoleVo> getDepartmentRoleList(Map<String, String> param, int pageIndex, int pageSize);

    /**
     * 获取部门角色数目
     * @param param
     * @return
     */
    int getDepartmentRoleCount(Map<String, String> param);
}
