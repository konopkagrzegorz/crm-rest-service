package com.crm.rest.crmrestservice.repository;

import com.crm.rest.crmrestservice.model.Customer;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CustomerRepository extends CrudRepository<Customer, Integer> {

    List<Customer> findByOrderByLastName();
    List<Customer> findByOrderByFirstName();
    List<Customer> findByOrderByEmail();
    List<Customer> findByLastNameContainingIgnoreCase(String like);
    List<Customer> findByLastNameOrFirstNameOrEmailContainingIgnoreCase(String phase1,String phase2,String phase3);
}
