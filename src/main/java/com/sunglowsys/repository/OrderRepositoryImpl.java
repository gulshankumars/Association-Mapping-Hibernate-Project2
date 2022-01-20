package com.sunglowsys.repository;

import com.sunglowsys.domain.Customer;
import com.sunglowsys.domain.Order;
import com.sunglowsys.util.HibernateUtil;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.query.Query;


import java.util.List;

public class OrderRepositoryImpl implements OrderRepository {

    public SessionFactory sessionFactory = HibernateUtil.getSessionFactory();

    @Override
    public Order save(Order order) {
        Session session = sessionFactory.openSession();
        session.beginTransaction();
        session.save(order);
        session.getTransaction().commit();
        session.close();
        return order;
    }

    @Override
    public List<Order> findAll() {
        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();
        Query query = session.createQuery("from order");
        List<Order>orderList = query.list();
        session.getTransaction().commit();
        session.close();
        return orderList;
    }

    @Override
    public Order findById(Long id) {
        Session session = sessionFactory.openSession();
        Order order = session.get(Order.class ,id);
        return order;
    }

    @Override
    public Order deleteById(Long id) {
        Session session =sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();
        Order order = session.get(Order.class,id);
        session.delete(order);
        session.getTransaction().commit();
        session.close();
        return order;
    }

    @Override
    public Order update(Order order, Long id) {
        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();
        Order result = session.get(Order.class,id);
        result.setPrice(order.getPrice());
        session.update(result);
        session.getTransaction().commit();
        session.close();
        return order;
    }
}
