package com.cg.customerbootJpaRest.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.cg.customerbootJpaRest.customerDto.AddCustomer;
import com.cg.customerbootJpaRest.customerDto.CustomerDetails;
import com.cg.customerbootJpaRest.entities.Customer;
import com.cg.customerbootJpaRest.service.ICustomerService;



@RequestMapping("/customer")
@RestController
public class CustomerController {
	
	@Autowired
	private ICustomerService service;
	
	
	@ResponseStatus(HttpStatus.CREATED)
	@PostMapping("/add")
	public CustomerDetails add(@RequestBody AddCustomer addcustomer)
	{
		Customer customer = new Customer(addcustomer.getName());
		customer = service.add(customer);
		CustomerDetails details = todetails(customer);
		return details;
	}
	
	
	@PutMapping("/update")
	public CustomerDetails update(@RequestBody Customer addcustomer) {
		Customer customer = new Customer(addcustomer.getName());
		customer.setId(addcustomer.getId());
		customer = service.updateName(customer);
		CustomerDetails details= todetails(customer);
		return details;
	}
	
	@DeleteMapping("/delete/{id}")
	public String delete(@PathVariable Long id) {
		service.delete(id);
		return "deleted";
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	public CustomerDetails todetails(Customer customer) {
		CustomerDetails  details= new CustomerDetails(customer.getId(), customer.getName());
		return details;
	}

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
