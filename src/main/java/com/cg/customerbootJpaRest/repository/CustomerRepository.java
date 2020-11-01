package com.cg.customerbootJpaRest.repository;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;

import com.cg.customerbootJpaRest.entities.Customer;

@Repository
public class CustomerRepository implements ICustomerRepository {

	@PersistenceContext
	private EntityManager manager;
	
	
	@Override
	public Customer add(Customer customer) {
		manager.persist(customer);
		return customer;
	}

	@Override
	public Customer update(Customer customer) {
		manager.merge(customer);
		return customer;
		
	}

	@Override
	public Customer findById(Long id) {
		Customer customer=manager.find(Customer.class, id);
		return customer;
		
	}

	@Override
	public Customer delete(Customer customer) {
		manager.remove(customer);
		return customer;
	
	}

}
