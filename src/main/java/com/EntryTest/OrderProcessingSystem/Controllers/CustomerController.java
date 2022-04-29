package com.EntryTest.OrderProcessingSystem.Controllers;

import com.EntryTest.OrderProcessingSystem.Model.Customer;
import com.EntryTest.OrderProcessingSystem.Services.CustomerService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;

import javax.management.modelmbean.ModelMBean;
import java.util.List;
import java.util.Optional;

@Controller
@RequestMapping("/customers")
public class CustomerController {
    private CustomerService customerService;
    @GetMapping("/add")
    public String add(ModelMap model){
        model.addAttribute("customer", new Customer());
        return "customers/addOrEdit";
    }
    @PostMapping("/saveOrUpdate")
    public String saveOrUpdate(Customer customer) {
        customerService.save(customer);
        return "customers/addOrEdit";
    }
    @GetMapping("/delete/{id}")
    public  String delete(ModelMap model, @PathVariable(name = "id") Integer id){
        customerService.deleteById(id);
        return list(model);
    }
    @GetMapping("/edit/{id}")
    public String edit(ModelMap model, @PathVariable(name = "id") Integer id){
        Optional<Customer> optionalCustomer = customerService.findById(id);
        if (optionalCustomer.isPresent()){
            model.addAttribute("customer", optionalCustomer.get());
        }
        else {
            return list(model);
        }
        return "customers/addOrEdit";
    }
    @RequestMapping("/list")
    public String list(ModelMap model){
        List<Customer> list = (List<Customer>) customerService.findAll();
        model.addAttribute("customers", list);
        return "customers/list";
    }
    @RequestMapping("/find")
    public String find(){
        return "find";
    }
}
