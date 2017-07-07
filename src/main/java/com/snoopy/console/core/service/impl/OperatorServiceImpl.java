package com.snoopy.console.core.service.impl;

import com.snoopy.console.core.model.Operator;
import com.snoopy.console.core.model.OperatorRole;
import com.snoopy.console.core.model.Resource;
import com.snoopy.console.core.service.OperatorService;
import com.snoopy.console.core.exception.SnoopyException;
import com.snoopy.console.web.vo.OperatorVo;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

/**
 * Created by V on 2017/6/29.
 */
@Service
public class OperatorServiceImpl implements OperatorService {
    @Override
    public void save(Operator oper, List<String> roleIds) throws SnoopyException {

    }

    @Override
    public Operator get(String operId) {
        return null;
    }

    @Override
    public List<OperatorVo> getOperList(Map<String, String> params, int pageIndex, int pageSize) {
        return null;
    }

    @Override
    public OperatorVo getOperDtl(String operId, String operType) {
        return null;
    }

    @Override
    public int getOperCount(Map<String, String> params) {
        return 0;
    }

    @Override
    public List<Resource> getResourceListByOperId(String operId) {
        return null;
    }

    @Override
    public List<OperatorRole> getRoleListByOperId(String operId) {
        return null;
    }

    @Override
    public boolean checkOperatorPwd(String operId, String pwd) {
        return false;
    }
}
