package com.sunglowsys.test;

import com.sunglowsys.domain.Customer;
import com.sunglowsys.repository.CustomerRepositoryImpl;
import com.sunglowsys.service.CustomerServiceImpl;

public class DeleteCustomer {
    public static void main(String[] args) {
        new CustomerServiceImpl().deleteById(10L);
    }
}
