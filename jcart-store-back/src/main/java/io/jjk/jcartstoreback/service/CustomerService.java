package io.jjk.jcartstoreback.service;

import io.jjk.jcartstoreback.dto.in.CustomerRegisterInDTO;
import io.jjk.jcartstoreback.po.Customer;

public interface CustomerService {

    Integer register(CustomerRegisterInDTO customerRegisterInDTO);

    Customer getByUsername(String username);

    Customer getById(Integer customerId);

    Customer getByEmail(String email);

    void update(Customer customer);

}
