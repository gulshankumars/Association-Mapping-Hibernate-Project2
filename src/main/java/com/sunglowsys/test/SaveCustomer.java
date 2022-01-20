package com.sunglowsys.test;

import com.sunglowsys.domain.Customer;
import com.sunglowsys.domain.Order;
import com.sunglowsys.service.CustomerServiceImpl;

import java.util.HashSet;
import java.util.Set;

public class SaveCustomer {
    public static void main(String[] args) {

        Set<Order> orders = new HashSet<>();
        Order order1 = new Order("stick", "sport", "22h", "990", "ok");
        Order order2 = new Order("mug", "red", "big", "120", "order placed successfully");
        Order order3 = new Order("Shocks", "yellow", "full", "190", "done");
        Customer customer = new Customer("Pravendra", "Singham", "pk@gmail.com", "9988776655");

        orders.add(order1);
        orders.add(order2);
        orders.add(order3);

        customer.setOrders(orders);

        new CustomerServiceImpl().save(customer);
        System.out.println(customer);

    }
}

