package io.jjk.jcartadministrationback.dao;

import com.github.pagehelper.Page;
import io.jjk.jcartadministrationback.po.Return;

public interface ReturnMapper {
    int deleteByPrimaryKey(Integer returnId);

    int insert(Return record);

    int insertSelective(Return record);

    Return selectByPrimaryKey(Integer returnId);

    int updateByPrimaryKeySelective(Return record);

    int updateByPrimaryKey(Return record);

    //    custom

    Page<Return> search();
}