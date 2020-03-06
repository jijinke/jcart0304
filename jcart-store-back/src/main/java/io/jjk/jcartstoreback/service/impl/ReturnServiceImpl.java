package io.jjk.jcartstoreback.service.impl;

import io.jjk.jcartstoreback.dao.ReturnMapper;
import io.jjk.jcartstoreback.po.Return;
import io.jjk.jcartstoreback.service.ReturnService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ReturnServiceImpl implements ReturnService {

    @Autowired
    private ReturnMapper returnMapper;

    @Override
    public Integer create(Return ireturn) {
        returnMapper.insertSelective(ireturn);
        Integer returnId = ireturn.getReturnId();
        return null;
    }
}
