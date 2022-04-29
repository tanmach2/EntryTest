package com.EntryTest.OrderProcessingSystem.Repository;


import com.EntryTest.OrderProcessingSystem.Model.Product;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductRepository extends CrudRepository<Product, Integer> {
}
