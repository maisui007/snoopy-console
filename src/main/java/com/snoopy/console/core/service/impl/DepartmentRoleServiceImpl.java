package com.snoopy.console.core.service.impl;

import com.snoopy.console.core.model.DepartmentRole;
import com.snoopy.console.core.model.RoleResource;
import com.snoopy.console.core.service.DepartmentRoleService;
import com.snoopy.console.core.exception.SnoopyException;
import com.snoopy.console.web.vo.DepartmentRoleVo;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

/**
 * Created by V on 2017/6/29.
 */
@Service
public class DepartmentRoleServiceImpl implements DepartmentRoleService {
    @Override
    public void save(DepartmentRole departRole, List<String> resourceIdList) throws SnoopyException {

    }

    @Override
    public List<DepartmentRoleVo> getDepartmentRoleList(String departmentId) {
        return null;
    }

    @Override
    public void deleteResourceByResourceId(String resourceId) throws SnoopyException {

    }

    @Override
    public void deleteResourceByRoleId(String roleId) throws SnoopyException {

    }

    @Override
    public DepartmentRole getDepartmentRole(String roleId) {
        return null;
    }

    @Override
    public List<RoleResource> getRoleResourceList(String roleId) {
        return null;
    }

    @Override
    public List<DepartmentRoleVo> getDepartmentRoleList(Map<String, String> param, int pageIndex, int pageSize) {
        return null;
    }

    @Override
    public int getDepartmentRoleCount(Map<String, String> param) {
        return 0;
    }
}
