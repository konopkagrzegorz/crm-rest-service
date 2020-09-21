package com.crm.rest.crmrestservice.services;


import com.crm.rest.crmrestservice.model.Customer;

import java.util.List;

public interface CustomerService {

    List<Customer> findAll();
    void save(Customer customer);
    void deleteById(int id);
    Customer findById(int id);
    List<Customer> findByOrderByLastName();
    List<Customer> findByOrderByFirstName();
    List<Customer> findByOrderByEmail();
    List<Customer> findByLastNameContainingIgnoreCase(String like);
    List<Customer> findByLastNameOrFirstNameOrEmailContainingIgnoreCase(String like);
}
