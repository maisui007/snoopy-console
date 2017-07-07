package com.snoopy.console.core.service.impl;

import com.snoopy.console.core.dao.ResourceDao;
import com.snoopy.console.core.model.Resource;
import com.snoopy.console.core.service.ResourceService;
import com.snoopy.console.core.utils.IdGenerator;
import com.snoopy.console.core.exception.SnoopyException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by V on 2017/6/27.
 */
@Service
public class ResourceServiceImpl implements ResourceService {

    @Autowired
    private ResourceDao resourceDao;

    @Override
    public List<Resource> getResourceList() {
        return resourceDao.getResourceList();
    }

    @Override
    public List<Resource> getResourceList(String departmentId) {
        return resourceDao.getResourceListByDepartmentId(departmentId);
    }

    @Override
    public Resource get(String resourceId) {
        return resourceDao.getResourceById(resourceId);
    }

    @Override
    public void delete(String resourceId) throws SnoopyException {

    }

    @Override
    public void save(Resource resource) throws SnoopyException {
        resourceDao.save(resource);
    }

    @Override
    public void update(Resource resource) throws SnoopyException {
        resourceDao.update(resource);
    }

    @Override
    public String getNextResourceId() {
        return IdGenerator.getUUID();
    }
}
