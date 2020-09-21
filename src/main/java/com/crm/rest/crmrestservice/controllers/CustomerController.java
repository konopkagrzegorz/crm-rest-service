package com.crm.rest.crmrestservice.controllers;

import com.crm.rest.crmrestservice.exceptions.WrongQueryException;
import com.crm.rest.crmrestservice.model.Customer;
import com.crm.rest.crmrestservice.services.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class CustomerController {

    private final CustomerService customerService;

    @Autowired
    public CustomerController(CustomerService customerService) {
        this.customerService = customerService;
    }

    @GetMapping("/customers")
    public List<Customer> getCustomers() {
        return customerService.findAll();
    }

    @GetMapping("/customers/{id}")
    public Customer getCustomer(@PathVariable int id) {
        return customerService.findById(id);
    }

    @DeleteMapping("/customers/delete/{id}")
    public void deleteCustomer(@PathVariable int id) {
        customerService.deleteById(id);
    }

    @GetMapping("/customers/order_by={order}")
    public List<Customer> getOrderedCustomers(@PathVariable String order) {
        if (order.equals("last_name")) {
            return customerService.findByOrderByLastName();
        } else if (order.equals("first_name")) {
            return customerService.findByOrderByFirstName();
        } else if (order.equals("email")) {
            return customerService.findByOrderByEmail();
        } else {
            throw new WrongQueryException("Wrong query parameters");
        }
    }

    @GetMapping("/customers/find_by_last_name={phase}")
    public List<Customer> getCustomersWithLastNameContains(@PathVariable String phase) {
        return customerService.findByLastNameContainingIgnoreCase(phase);
    }

    @GetMapping("/customers/find={phase}")
    public List<Customer> getCustomersContains(@PathVariable String phase) {
        return customerService.findByLastNameOrFirstNameOrEmailContainingIgnoreCase(phase);
    }

    @PostMapping("/customers/add-new")
    public void addNewCustomer(@RequestBody Customer customer) {
        customerService.save(customer);
    }

    @PutMapping("/customers/update/{id}")
    public void updateCustomer(@PathVariable int id, @RequestBody Customer customer) {
        Customer temp = customerService.findById(id);
        customerService.save(customer);
    }
}
