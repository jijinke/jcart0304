package io.jjk.jcartadministrationback.service;

import com.github.pagehelper.Page;
import io.jjk.jcartadministrationback.dto.in.CustomerSetStatusInDTO;
import io.jjk.jcartadministrationback.po.Customer;

public interface CustomerService {

    Page<Customer> search(Integer pageNum);

    Customer getById(Integer customerId);

    void setStatus(CustomerSetStatusInDTO customerSetStatusInDTO);

}
