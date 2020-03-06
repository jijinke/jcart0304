package io.jjk.jcartstoreback.service.impl;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
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

    @Override
    public Page<Return> getPageByCustomerId(Integer customerId, Integer pageNum) {
        PageHelper.startPage(pageNum, 10);
        Page<Return> page = returnMapper.selectPageByCustomerId(customerId);

        return page;
    }
}
