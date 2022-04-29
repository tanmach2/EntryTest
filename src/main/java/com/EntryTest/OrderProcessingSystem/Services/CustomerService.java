package com.EntryTest.OrderProcessingSystem.Services;

import com.EntryTest.OrderProcessingSystem.Model.Customer;

import java.util.List;
import java.util.Optional;

public interface CustomerService {
    Customer save(Customer entity);

    List<Customer> saveAll(List<Customer> entities);

    Optional<Customer> findById(Integer integer);

    boolean existsById(Integer integer);

    Iterable<Customer> findAll();

    List<Customer> findAllById(List<Integer> integers);

    long count();

    void deleteById(Integer integer);

    void delete(Customer entity);

    void deleteAllById(Iterable<? extends Integer> integers);

    void deleteAll(List<Customer> entities);

    void deleteAll();
}
