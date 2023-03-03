package com.customer.customers.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.customer.customers.entities.Customer;

public interface CustomerRepository extends JpaRepository<Customer, Long>{

}
