package com.sunglowsys.repository;

import com.sunglowsys.domain.Customer;

import java.util.List;

public interface CustomerRepository {
    Customer save(Customer customer);
    List<Customer> findAll();
    Customer findById(Long id);
    Customer deleteById(Long id);
    Customer update(Customer customer,Long id);
}
