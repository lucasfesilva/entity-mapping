package com.customer.customers.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.customer.customers.entities.Customer;
import com.customer.customers.repository.CustomerRepository;

@RestController
@RequestMapping(value = "/customers")
public class CustomerController {
	
	@Autowired
	private CustomerRepository customerRepository;
	
	@GetMapping
	public List<Customer> findAll() {
		 List<Customer> result = customerRepository.findAll();
		 return result;
	}
	
	@GetMapping(value = "/{id}")
	public Customer findById(@PathVariable Long id) {
		Customer result = customerRepository.findById(id).get();
		return result;
	}
	
	@PostMapping
	public Customer insert(@RequestBody Customer customer) {
		Customer result = customerRepository.save(customer);
		return result;
	}

}
