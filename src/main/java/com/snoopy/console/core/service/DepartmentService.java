package com.snoopy.console.core.service;

import com.snoopy.console.core.model.Department;
import com.snoopy.console.core.model.Resource;
import com.snoopy.console.core.exception.SnoopyException;
import com.snoopy.console.web.vo.DepartmentVo;

import java.util.List;
import java.util.Map;

/**
 * Created by V on 2017/6/23.
 * 部门服务接口
 */
public interface DepartmentService {
    /**
     * 保存部门及权限资源
     *
     * 参见DepartmentRoleService.deleteRoleResource
     * @param department
     * @param resourceId
     * @throws SnoopyException
     */
    void save(Department department, List<String> resourceId) throws SnoopyException;

    /**
     * 根据部门ID获取该部门下权限资源
     * @param departmentId
     * @return
     */
    List<Resource> getResourceList(String departmentId);

    /**
     * 获取部门列表
     * @return
     */
    List<Department> getDepartmentList();

    /**
     * 检查部门名称是否有效
     * @param departmentName
     * @return
     * @throws SnoopyException
     */
    boolean checkDepartmentName(String departmentName);


    /**
     * 获取部门列表
     * @return
     */
    List<DepartmentVo> getDepartmentList(Map<String, String> param, int pageIndex, int pageSize);

    /**
     * 获取部门数目
     * @param param
     * @return
     */
    int getDepartmentCount(Map<String, String> param);

    /**
     * 获取部门详情
     * @param departmentId
     * @return
     */
    Department getDepartment(String departmentId);

    void syncDeleteResource(String departId);
}
