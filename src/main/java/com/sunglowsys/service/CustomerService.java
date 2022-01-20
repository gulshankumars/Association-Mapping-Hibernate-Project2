package com.sunglowsys.service;

import com.sunglowsys.domain.Customer;

import java.util.List;

public interface CustomerService {
    Customer save(Customer customer);
    List<Customer> findAll();
    Customer findById(Long id);
    Customer deleteById(Long id);
    Customer update(Customer customer,Long id);
}
