package com.customer.customers.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.customer.customers.entities.Address;

public interface AddressRepository extends JpaRepository<Address, Long>{

}
