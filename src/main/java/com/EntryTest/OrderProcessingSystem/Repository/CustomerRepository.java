package com.EntryTest.OrderProcessingSystem.Repository;

import com.EntryTest.OrderProcessingSystem.Model.Customer;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CustomerRepository extends CrudRepository<Customer, Integer> {
    List<Customer> findByName(String name);
}
