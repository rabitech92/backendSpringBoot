package com.example.backendspring.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.backendspring.model.Customer;
import com.example.backendspring.repository.CustomerRepository;

@Service
public class CustomerService {
	
	@Autowired
	CustomerRepository customerRepository;
	public Customer save( Customer cat) {	    
	    if(!cat.equals(null)) {
	        return customerRepository.save(cat);
	    }
	    return null;
	}

	public Customer getById(Long id) {
	Optional<Customer> op = customerRepository.findById(id);

	if(op.isPresent()) {
	    return op.get();
	}

	return null;
	}

	public List<Customer> getAll(){
	return customerRepository.findAll();
	}

	public Customer delete (Long id) {
	Optional<Customer> op = customerRepository.findById(id);
	if(op.isPresent()) {
		customerRepository.delete(op.get());
	    return null;	       
	}
	return null;
	}


	public Customer update( Customer cat) {
	if(!cat.equals(null)) {
	    return customerRepository.save(cat);
	}
	return null;
	}

	public List<Customer>  listinsert( List<Customer> listofProducts) {

	return customerRepository.saveAll(listofProducts);

	}


}
