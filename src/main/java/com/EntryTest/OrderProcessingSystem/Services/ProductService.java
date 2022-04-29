package com.EntryTest.OrderProcessingSystem.Services;

import com.EntryTest.OrderProcessingSystem.Model.Order;
import com.EntryTest.OrderProcessingSystem.Model.Product;

import java.util.List;
import java.util.Optional;

public interface ProductService {

    List<Product> findAllProducts();

    void save(Product entity);

    List<Product> saveAll(Iterable<Product> entities);

    Optional<Product> findById(Integer integer);

    boolean existsById(Long aLong);

    Iterable<Product> findAll();

    Iterable<Product> findAllById(Iterable<Integer> longs);

    long count();
    List<Order> findAllOrders();
}
