package io.jjk.jcartstoreback.service.impl;

import io.jjk.jcartstoreback.dao.ReturnHistoryMapper;
import io.jjk.jcartstoreback.po.ReturnHistory;
import io.jjk.jcartstoreback.service.ReturnHistoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ReturnHistoryServiceImpl implements ReturnHistoryService {

    @Autowired
    private ReturnHistoryMapper returnHistoryMapper;

    @Override
    public List<ReturnHistory> getByReturnId(Integer returnId) {
        List<ReturnHistory> returnHistories = returnHistoryMapper.selectByReturnId(returnId);

        return returnHistories;
    }
}
