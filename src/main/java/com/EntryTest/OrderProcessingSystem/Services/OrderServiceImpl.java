package com.EntryTest.OrderProcessingSystem.Services;

import com.EntryTest.OrderProcessingSystem.Model.Customer;
import com.EntryTest.OrderProcessingSystem.Model.Order;
import com.EntryTest.OrderProcessingSystem.Repository.CustomerRepository;
import com.EntryTest.OrderProcessingSystem.Repository.OrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class OrderServiceImpl implements OrderService{
    @Autowired
    private OrderRepository orderRepository;

    @Autowired
    private CustomerRepository customerRepository;

    @Override
    public List<Customer> findAllCustomers() {
        return (List<Customer>) customerRepository.findAll();
    }

    @Override
    public Order save(Order entity) {
        return orderRepository.save(entity);
    }

    @Override
    public List<Order> saveAll(Iterable<Order> entities) {
        return (List<Order>) orderRepository.saveAll(entities);
    }

    @Override
    public Optional<Order> findById(Long aLong) {
        return orderRepository.findById(aLong);
    }

    @Override
    public boolean existsById(Long aLong) {
        return orderRepository.existsById(aLong);
    }

    @Override
    public Iterable<Order> findAll() {
        return orderRepository.findAll();
    }

    @Override
    public Iterable<Order> findAllById(Iterable<Long> longs) {
        return orderRepository.findAllById(longs);
    }

    @Override
    public long count() {
        return orderRepository.count();
    }

    @Override
    public void deleteById(Long aLong) {
        orderRepository.deleteById(aLong);
    }

    @Override
    public void delete(Order entity){
        orderRepository.delete(entity);
    }
    @Override
    public void deleteAll(List<Order> entities) {
        orderRepository.deleteAll(entities);
    }

    @Override
    public void deleteAll() {
        orderRepository.deleteAll();
    }
    @Override
    public void deleteAllById(Iterable<? extends Long> longs) {
        orderRepository.deleteAllById(longs);
    }

}
