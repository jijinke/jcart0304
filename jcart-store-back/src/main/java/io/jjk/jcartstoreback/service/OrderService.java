package io.jjk.jcartstoreback.service;

import com.github.pagehelper.Page;
import io.jjk.jcartstoreback.dto.in.OrderCheckoutInDTO;
import io.jjk.jcartstoreback.dto.out.OrderShowOutDTO;
import io.jjk.jcartstoreback.dto.out.ProductShowOutDTO;
import io.jjk.jcartstoreback.po.Order;

public interface OrderService {

    Long checkout(OrderCheckoutInDTO orderCheckoutInDTO,
                  Integer customerId);

    Page<Order> getByCustomerId(Integer pageNum, Integer customerId);

    OrderShowOutDTO getById(Long orderId);

}
