package io.jjk.jcartadministrationback.service;

import io.jjk.jcartadministrationback.po.Address;

import java.util.List;

public interface AddressService {

    Address getById(Integer addressId);

    List<Address> getByCustomerId(Integer customerId);

}
