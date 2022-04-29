package com.EntryTest.OrderProcessingSystem.Services;

import com.EntryTest.OrderProcessingSystem.Model.Order;
import com.EntryTest.OrderProcessingSystem.Model.Product;
import com.EntryTest.OrderProcessingSystem.Repository.OrderRepository;
import com.EntryTest.OrderProcessingSystem.Repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;
import java.util.Optional;

public class ProductServiceImpl implements ProductService{
    @Autowired
    private OrderRepository orderRepository;

    @Autowired
    private ProductRepository productRepository;

    @Override
    public List<Product> findAllProducts() {
        return (List<Product>) productRepository.findAll();
    }
    @Override
    public void save(Product entity) {
        productRepository.save(entity);
    }

    @Override
    public List<Product> saveAll(Iterable<Product> entities) {
        return (List<Product>) productRepository.saveAll(entities);
    }

    @Override
    public Optional<Product> findById(Integer integer) {
        return productRepository.findById(integer);
    }

    @Override
    public boolean existsById(Long aLong) {
        return orderRepository.existsById(aLong);
    }

    @Override
    public Iterable<Product> findAll() {
        return productRepository.findAll();
    }

    @Override
    public Iterable<Product> findAllById(Iterable<Integer> longs) {
        return productRepository.findAllById(longs);
    }

    @Override
    public long count() {
        return orderRepository.count();
    }
    @Override
    public List<Order> findAllOrders() {
        return null;
    }

}
