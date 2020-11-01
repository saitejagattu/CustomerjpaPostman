package com.cg.customerbootJpaRest.repository;

import java.util.List;

import com.cg.customerbootJpaRest.entities.Customer;

public interface ICustomerRepository {
	public Customer add(Customer customer);
	public Customer update(Customer customer);
	public Customer findById(Long id);
	public Customer delete(Customer customer);
	
}
