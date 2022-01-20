package com.sunglowsys.service;

import com.sunglowsys.domain.Order;

import java.util.List;

public interface OrderService {
    Order save(Order order);
    List<Order> findAll();
    Order findById(Long id);
    Order deleteById(Long id);
    Order update(Order order,Long id);
}
