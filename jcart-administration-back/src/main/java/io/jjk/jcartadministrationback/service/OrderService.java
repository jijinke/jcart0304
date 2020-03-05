package io.jjk.jcartadministrationback.service;

import com.github.pagehelper.Page;
import io.jjk.jcartadministrationback.dto.out.OrderListOutDTO;
import io.jjk.jcartadministrationback.dto.out.OrderShowOutDTO;
import io.jjk.jcartadministrationback.po.Order;

public interface OrderService {

    Page<OrderListOutDTO> search(Integer pageNum);

    OrderShowOutDTO getById(Long orderId);

    void update(Order order);

}
