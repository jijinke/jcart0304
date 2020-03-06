package io.jjk.jcartstoreback.service;

import io.jjk.jcartstoreback.po.ReturnHistory;

import java.util.List;

public interface ReturnHistoryService {

    List<ReturnHistory> getByReturnId(Integer returnId);

}
