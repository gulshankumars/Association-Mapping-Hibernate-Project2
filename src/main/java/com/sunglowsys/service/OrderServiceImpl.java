package com.sunglowsys.service;

import com.sunglowsys.domain.Order;
import com.sunglowsys.repository.OrderRepository;
import com.sunglowsys.repository.OrderRepositoryImpl;

import java.util.List;

public class OrderServiceImpl implements OrderService{

    private OrderRepository orderRepository = new OrderRepositoryImpl();

    @Override
    public Order save(Order order) {
        return orderRepository.save(order);
    }

    @Override
    public List<Order> findAll() {
        List<Order>orderList = orderRepository.findAll();
        return orderList;
    }

    @Override
    public Order findById(Long id) {
        return orderRepository.findById(id);
    }

    @Override
    public Order deleteById(Long id) {
        return orderRepository.deleteById(id);
    }

    @Override
    public Order update(Order order, Long id) {
        return orderRepository.update(order,id);
    }
}
