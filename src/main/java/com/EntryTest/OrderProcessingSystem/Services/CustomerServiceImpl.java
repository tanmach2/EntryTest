package com.EntryTest.OrderProcessingSystem.Services;

import com.EntryTest.OrderProcessingSystem.Model.Customer;
import com.EntryTest.OrderProcessingSystem.Repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CustomerServiceImpl implements CustomerService{
    @Autowired
    private CustomerRepository customerRepository;

    @Override
    public Customer save(Customer entity) {
        return customerRepository.save(entity);
    }

    @Override
    public List<Customer> saveAll(List<Customer> entities) {
        return (List<Customer>) customerRepository.saveAll(entities);
    }

    @Override
    public Optional<Customer> findById(Integer integer) {
        return customerRepository.findById(integer);
    }

    @Override
    public boolean existsById(Integer integer) {
        return customerRepository.existsById(integer);
    }

    @Override
    public Iterable<Customer> findAll() {
        return customerRepository.findAll();
    }

    @Override
    public List<Customer> findAllById(List<Integer> integers) {
        return (List<Customer>) customerRepository.findAllById(integers);
    }

    @Override
    public long count() {
        return customerRepository.count();
    }

    @Override
    public void deleteById(Integer integer) {
        customerRepository.deleteById(integer);
    }

    @Override
    public void delete(Customer entity) {
        customerRepository.delete(entity);
    }

    @Override
    public void deleteAllById(Iterable<? extends Integer> integers) {
        customerRepository.deleteAllById(integers);
    }

    @Override
    public void deleteAll(List<Customer> entities) {
        customerRepository.deleteAll(entities);
    }

    @Override
    public void deleteAll() {
        customerRepository.deleteAll();
    }
}