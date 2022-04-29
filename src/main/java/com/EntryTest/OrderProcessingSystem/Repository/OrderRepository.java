package com.EntryTest.OrderProcessingSystem.Repository;

import com.EntryTest.OrderProcessingSystem.Model.Order;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OrderRepository extends CrudRepository<Order, Long> {

}
