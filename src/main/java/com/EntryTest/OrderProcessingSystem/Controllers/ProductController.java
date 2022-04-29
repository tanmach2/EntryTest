package com.EntryTest.OrderProcessingSystem.Controllers;


import com.EntryTest.OrderProcessingSystem.Model.Customer;
import com.EntryTest.OrderProcessingSystem.Model.Order;
import com.EntryTest.OrderProcessingSystem.Model.Product;
import com.EntryTest.OrderProcessingSystem.Services.ProductService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@Controller
@RequestMapping("/products")
public class ProductController {
    private ProductService productService;
    @RequestMapping("/list")
    public String list(ModelMap model){
        model.addAttribute("products", productService.findAll());
        return "products/list";
    }

    @GetMapping("/add")
    public String add(ModelMap model){
        Order order = new Order();
        order.setCustomer(new Customer());
        model.addAttribute("orders", order);
        return "products/addOrEdit";
    }
    @GetMapping("/edit/{id}")
    public String edit(ModelMap model, @PathVariable(name = "id") Integer id){
        Optional<Product> optionalProduct = productService.findById(id);
        if (optionalProduct.isPresent()){
            model.addAttribute("product", optionalProduct.get());
        }
        else {
            return list(model);
        }
        return "products/addOrEdit";
    }
    @PostMapping("/saveOrUpdate")
    public String saveOrUpdate(ModelMap model, Product product){
        productService.save(product);
        return "products/addOrEdit";
    }
    @RequestMapping("/find")
    public String find(ModelMap model, @PathVariable(name = "id") Integer id){
        Optional<Product> optionalProduct = productService.findById(id);
        if (optionalProduct.isPresent()){
            model.addAttribute("product", optionalProduct.get());
        }
        else {
            return list(model);
        }
        return "find";
    }

    @ModelAttribute(name = "orders")
    public List<Order> getOrder(){
        return productService.findAllOrders();
    }
}
