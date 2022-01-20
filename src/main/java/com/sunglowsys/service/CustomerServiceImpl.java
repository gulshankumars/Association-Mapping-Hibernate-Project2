package com.sunglowsys.service;

import com.sunglowsys.domain.Customer;
import com.sunglowsys.repository.CustomerRepository;
import com.sunglowsys.repository.CustomerRepositoryImpl;

import java.util.List;

public class CustomerServiceImpl implements CustomerService{

    public CustomerRepository customerRepository = new CustomerRepositoryImpl();

    @Override
    public Customer save(Customer customer) {
        return customerRepository.save(customer);
    }

    @Override
    public List<Customer> findAll() {
        List<Customer>customerList = customerRepository.findAll();
        return customerList;
    }

    @Override
    public Customer findById(Long id) {

        return customerRepository.findById(id);
    }

    @Override
    public Customer deleteById(Long id) {
        return customerRepository.deleteById(id);

    }

    @Override
    public Customer update(Customer customer, Long id) {

        return customerRepository.update(customer,id);
    }
}
