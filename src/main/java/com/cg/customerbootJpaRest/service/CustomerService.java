package com.cg.customerbootJpaRest.service;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cg.customerbootJpaRest.entities.Customer;
import com.cg.customerbootJpaRest.repository.ICustomerRepository;


@Service 
public class CustomerService implements ICustomerService{

	@Autowired
	private ICustomerRepository repository;
	
	@Transactional
	@Override
	public Customer add(Customer customer) {
		Customer customerobj=repository.add(customer);
		return customerobj;
	}
	
	@Transactional
	@Override
	public Customer updateName(Customer customer) {
		 repository.update(customer);
		return repository.update(customer);
	}
	@Transactional
	@Override
	public Customer delete(Long id) {
		Customer customer=repository.findById(id);
		return repository.delete(customer);
	}
	

}
