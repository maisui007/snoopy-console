package com.snoopy.test.service;

import com.snoopy.test.BaseTest;
import com.snoopy.console.core.model.Resource;
import com.snoopy.console.core.service.ResourceService;
import com.snoopy.console.core.utils.IdGenerator;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * Created by V on 2017/6/27.
 */
public class TestResourceService extends BaseTest {

    @Autowired
    private ResourceService resourceService;
    @Test
    public void testAddResource(){
        for (int i=5;i<10;i++){
            Resource resource = new Resource();
            resource.setParentId("0");
            resource.setResourceId(IdGenerator.getUUID());
            resource.setHasChild(0);//0:不存在1：存在
            resource.setMenuFlag(1);//0:不是目录1：是目录
            resource.setResourceName("");
            resource.setPath(""+i);//节点路径
            resource.setResourceCode("测试"+i);
            resource.setResourceUrl("#");
            resource.setSortNum(i);
            resourceService.save(resource);
        }
    }

    @Test
    public void testUpdateResource(){
        Resource resource = resourceService.get("5f25ee2b809e491a865bd5a8079b10ef");
        resource.setRemark("测试更新时间");
        resourceService.update(resource);
    }

    @Test
    public void testResourceList(){
        resourceService.getResourceList("0");
    }
}
