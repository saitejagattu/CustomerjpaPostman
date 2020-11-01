package com.cg.customerbootJpaRest.service;

import com.cg.customerbootJpaRest.entities.Customer;

public interface ICustomerService {
	
	public Customer add(Customer customer);
	public Customer updateName(Customer customer);
	public Customer delete(Long id);

}
