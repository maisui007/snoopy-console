package com.snoopy.console.core.service;

import com.snoopy.console.core.model.Resource;
import com.snoopy.console.core.exception.SnoopyException;

import java.util.List;

/**
 * Created by V on 2017/6/23.
 * 资源服务接口
 */
public interface ResourceService {
    /**
     * 获取所有资源
     * @return
     * @throws SnoopyException
     */
    List<Resource> getResourceList();


    /**
     * 获取部门departmentId所有资源
     * @return
     * @throws SnoopyException
     */
    List<Resource> getResourceList(String departmentId);
    /**
     * 获取单个资源属性
     * @param resourceId
     * @return
     * @throws SnoopyException
     */
    Resource get(String resourceId);

    /**
     * 删除某个资源，仅当无子节点
     * @param resourceId
     * @throws SnoopyException
     */
    void delete(String resourceId) throws SnoopyException;

    /**
     * 保存资源
     * @param resource
     * @throws SnoopyException
     */
    void save(Resource resource)  throws SnoopyException;

    /***
     * 更新资源
     * @param resource
     * @throws SnoopyException
     */
    void update(Resource resource) throws SnoopyException;

    /**
     * 新建时获取资源ID
     * @return
     */
    String getNextResourceId();
}
