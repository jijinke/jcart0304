package io.jjk.jcartstoreback.service;

import com.github.pagehelper.Page;
import io.jjk.jcartstoreback.po.Return;

public interface ReturnService {

    Integer create(Return ireturn);

    Page<Return> getPageByCustomerId(Integer customerId, Integer pageNum);

}
