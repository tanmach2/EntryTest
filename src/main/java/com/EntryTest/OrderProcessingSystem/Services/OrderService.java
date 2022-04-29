package com.EntryTest.OrderProcessingSystem.Services;


import com.EntryTest.OrderProcessingSystem.Model.Customer;
import com.EntryTest.OrderProcessingSystem.Model.Order;

import java.util.List;
import java.util.Optional;

public interface OrderService {

    List<Customer> findAllCustomers();

    Order save(Order entity);

    List<Order> saveAll(Iterable<Order> entities);

    Optional<Order> findById(Long aLong);

    boolean existsById(Long aLong);

    Iterable<Order> findAll();

    Iterable<Order> findAllById(Iterable<Long> longs);

    long count();

    void deleteById(Long aLong);

    void delete(Order entity);

    void deleteAll(List<Order> entities);

    void deleteAll();

    void deleteAllById(Iterable<? extends Long> longs);
}
