package com.sunglowsys.test;

import com.sunglowsys.domain.Customer;
import com.sunglowsys.repository.CustomerRepositoryImpl;


import java.util.List;

public class FindAllCustomer {
    public static void main(String[] args) {
        List<Customer> customerList = new CustomerRepositoryImpl().findAll();
            for(Customer customer : customerList){
                System.out.println(customer);
            }
    }
}
