package com.snoopy.console.core.service.impl;

import com.snoopy.console.core.dao.DepartmentDao;
import com.snoopy.console.core.model.Department;
import com.snoopy.console.core.model.Resource;
import com.snoopy.console.core.service.DepartmentService;
import com.snoopy.console.core.exception.SnoopyException;
import com.snoopy.console.web.vo.DepartmentVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

/**
 * Created by V on 2017/6/27.
 */
@Service
public class DepartmentServiceImpl implements DepartmentService {
    @Autowired
    private DepartmentDao departmentDao;
    @Override
    public void save(Department department, List<String> resourceId) throws SnoopyException {

    }

    @Override
    public List<Resource> getResourceList(String departmentId) {
        return null;
    }

    @Override
    public List<Department> getDepartmentList() {
        return null;
    }

    @Override
    public boolean checkDepartmentName(String departmentName) {
        return false;
    }

    @Override
    public List<DepartmentVo> getDepartmentList(Map<String, String> param, int pageIndex, int pageSize) {
        return null;
    }

    @Override
    public int getDepartmentCount(Map<String, String> param) {
        return 0;
    }

    @Override
    public Department getDepartment(String departmentId) {
        return null;
    }

    @Override
    public void syncDeleteResource(String departId) {

    }
}
