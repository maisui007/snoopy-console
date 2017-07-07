package com.snoopy.test.service;

import com.snoopy.test.BaseTest;
import com.snoopy.console.core.dao.DepartmentResourceDao;
import com.snoopy.console.core.model.DepartmentResource;
import com.snoopy.console.core.utils.IdGenerator;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by V on 2017/6/28.
 */
public class TestDepartmentResourceServcie extends BaseTest {
    @Autowired
    private DepartmentResourceDao departmentResourceDao;

    @Test
    public void testAddAll(){

        List<DepartmentResource> list = new ArrayList<>();
        for (int i = 0; i <4 ; i++) {
            DepartmentResource departmentResource = new DepartmentResource();
            departmentResource.setId(IdGenerator.getUUID());
            departmentResource.setDepartmentId("测试" + i);
            departmentResource.setResourceId("资源" + i);
            list.add(departmentResource);
        }

        departmentResourceDao.saveAll(list);
    }

    @Test
    public void testAdd(){

            DepartmentResource departmentResource = new DepartmentResource();
            departmentResource.setId(IdGenerator.getUUID());
            departmentResource.setDepartmentId("测试" );
            departmentResource.setResourceId("资源");
            departmentResourceDao.save(departmentResource);

    }
}
