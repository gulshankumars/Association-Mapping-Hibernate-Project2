package com.sunglowsys.repository;

import com.sunglowsys.domain.Customer;
import com.sunglowsys.domain.Order;
import com.sunglowsys.util.HibernateUtil;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.query.Query;


import java.util.List;
import java.util.Set;

public class CustomerRepositoryImpl implements CustomerRepository{

    public SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
    @Override
    public Customer save(Customer customer) {
        Session session = sessionFactory.openSession();
        session.beginTransaction();
        session.save(customer);
        session.getTransaction().commit();
        session.close();
        return customer;
    }

    @Override
    public List<Customer> findAll() {
        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();
        Query query = session.createQuery("from Customer");
        List<Customer>customerList = query.list();
        return customerList;
    }

    @Override
    public Customer findById(Long id) {
        Session session = sessionFactory.openSession();
        Customer customer = session.get(Customer.class,id);
        return customer;
    }

    @Override
    public Customer deleteById(Long id) {
        Session session =sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();
        Customer customer = session.get(Customer.class,id);
        session.delete(customer);
        session.getTransaction().commit();
        session.close();
        System.out.println("Deleted");
        return customer;
    }

    @Override
    public Customer update(Customer customer, Long id) {
        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();
        Customer result = session.get(Customer.class,id);
        result.setLastName(customer.getLastName());
        session.update(result);
        session.getTransaction().commit();
        session.close();
        System.out.println("updated-");
        return null;
    }
}
