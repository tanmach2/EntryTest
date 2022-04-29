package com.EntryTest.OrderProcessingSystem.Controllers;

import com.EntryTest.OrderProcessingSystem.Model.Customer;
import com.EntryTest.OrderProcessingSystem.Model.Order;
import com.EntryTest.OrderProcessingSystem.Services.OrderService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@Controller
@RequestMapping("/orders")
public class OrderController {
    private OrderService orderService;
    @RequestMapping("/list")
    public String list(ModelMap model){
        model.addAttribute("orders", orderService.findAll());
        return "orders/list";
    }

    @GetMapping("/add")
    public String add(ModelMap model){
        Order order = new Order();
        order.setCustomer(new Customer());
        model.addAttribute("orders", order);
        return "orders/addOrEdit";
    }
    @GetMapping("/edit/{id}")
    public String edit(ModelMap model, @PathVariable(name = "orderId") Long orderId){
        Optional<Order> optionalOrder = orderService.findById(orderId);
        if (optionalOrder.isPresent()){
            model.addAttribute("order", optionalOrder.get());
        }
        else {
            return list(model);
        }
        return "orders/addOrEdit";
    }
    @PostMapping("/saveOrUpdate")
    public String saveOrUpdate(ModelMap model, Order order){
        orderService.save(order);
        return "orders/addOrEdit";
    }
    @ModelAttribute(name = "customers")
    public List<Customer> getCustomer(){
        return orderService.findAllCustomers();
    }
}
