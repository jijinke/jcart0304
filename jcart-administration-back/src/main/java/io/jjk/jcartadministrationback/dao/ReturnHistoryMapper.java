package io.jjk.jcartadministrationback.dao;

import io.jjk.jcartadministrationback.po.ReturnHistory;

import java.util.List;

public interface ReturnHistoryMapper {
    int deleteByPrimaryKey(Long returnHistoryId);

    int insert(ReturnHistory record);

    int insertSelective(ReturnHistory record);

    ReturnHistory selectByPrimaryKey(Long returnHistoryId);

    int updateByPrimaryKeySelective(ReturnHistory record);

    int updateByPrimaryKey(ReturnHistory record);

    // custom

    List<ReturnHistory> selectListByReturnId(Integer returnId);
}