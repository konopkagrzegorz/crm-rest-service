package com.crm.rest.crmrestservice.services;

import com.crm.rest.crmrestservice.exceptions.CustomerNotFoundException;
import com.crm.rest.crmrestservice.model.Customer;
import com.crm.rest.crmrestservice.repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CustomerServiceImplementation implements CustomerService {

    private final CustomerRepository customerRepository;

    @Autowired
    public CustomerServiceImplementation(CustomerRepository customerRepository) {
        this.customerRepository = customerRepository;
    }

    @Override
    public List<Customer> findAll() {
        return (List<Customer>) customerRepository.findAll();
    }

    @Override
    public void save(Customer customer) {
        customerRepository.save(customer);
    }

    @Override
    public void deleteById(int id) {
        Optional<Customer> customer = customerRepository.findById(id);
        if (!customer.isPresent()) {
            throw new CustomerNotFoundException("Customer with id " + id + " doesn't exist. Delete doesn't succeed");
        }
        customerRepository.deleteById(id);
    }

    @Override
    public Customer findById(int id) {
        Optional<Customer> customer = customerRepository.findById(id);
        if (!customer.isPresent()) {
            throw new CustomerNotFoundException("Customer with id " + id + " doesn't exist");
        }
        return customer.get();
    }

    @Override
    public List<Customer> findByOrderByLastName() {
        return customerRepository.findByOrderByLastName();
    }

    @Override
    public List<Customer> findByOrderByFirstName() {
        return customerRepository.findByOrderByFirstName();
    }

    @Override
    public List<Customer> findByOrderByEmail() {
        return customerRepository.findByOrderByEmail();
    }

    @Override
    public List<Customer> findByLastNameContainingIgnoreCase(String like) {
        return customerRepository.findByLastNameContainingIgnoreCase(like);
    }

    @Override
    public List<Customer> findByLastNameOrFirstNameOrEmailContainingIgnoreCase(String like) {
        return customerRepository.findByLastNameOrFirstNameOrEmailContainingIgnoreCase(like,like,like);
    }
}
