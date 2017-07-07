package com.snoopy.test.service;

import com.alibaba.fastjson.JSON;
import com.snoopy.test.BaseTest;
import com.snoopy.console.core.dao.DepartmentDao;
import com.snoopy.console.core.model.Department;
import com.snoopy.console.core.service.DepartmentService;
import com.snoopy.console.core.utils.IdGenerator;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

/**
 * Created by V on 2017/6/27.
 */
public class TestDepartmentService extends BaseTest {

    @Autowired
    private DepartmentService departmentService;

    @Autowired
    private DepartmentDao departmentDao;


    @Test
    public void testAddDepartment(){
        for (int i = 6; i < 12; i++) {
            Department department = new Department();
            department.setDepartmentId(IdGenerator.getUUID());
            department.setDepartmentName("部门"+i);
            department.setRemark("部门测试数据"+i);
            departmentDao.save(department);
        }
    }

    @Test
    public void testQueryByPageDepartment(){
        logger.info("分页查询|测试|start");
        logger.debug("分页查询|测试|start");
            int pageNo = 1;
            int pageSize = 3;
            int limit = (pageNo-1)*pageSize;
            Department department = new Department();
            Date beginTs = null;
            Date endTs = null;
            SimpleDateFormat sdf =new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        try {
            beginTs = sdf.parse("2017-06-28 14:32:49");
            endTs = sdf.parse("2017-06-28 14:32:51");
        } catch (ParseException e) {
            e.printStackTrace();
        }
      List<Department>  departments =departmentDao.getDepartmentByPage(department, limit, pageSize, beginTs, endTs);
        System.out.println(JSON.toJSONString(departments));
        logger.info("分页查询|测试|end");
        logger.debug("分页查询|测试|end");

    }
}
