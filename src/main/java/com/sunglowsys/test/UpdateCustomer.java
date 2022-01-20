package com.sunglowsys.test;

import com.sunglowsys.domain.Customer;
import com.sunglowsys.repository.CustomerRepositoryImpl;
import com.sunglowsys.service.CustomerServiceImpl;

public class UpdateCustomer {
    public static void main(String[] args) {
        Customer customer = new Customer();
        customer.setLastName("Jallad");
        new CustomerRepositoryImpl().update(customer,11L);

    }
}
