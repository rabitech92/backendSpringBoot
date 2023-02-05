package com.example.backendspring.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.backendspring.model.Customer;
import com.example.backendspring.service.CustomerService;


@RestController
@CrossOrigin(origins="http://localhost:4200" ,allowedHeaders = "*")
@RequestMapping(value="/apa")
public class CustomerController {
	

	@Autowired
	private CustomerService customerService;
	
	@PostMapping("/save")
    public Customer save(@RequestBody Customer cat) {
        
        
        return customerService.save(cat);
    }
    
    @GetMapping("/get/{id}")
    public Customer getById (@PathVariable Long id) {
        
        return customerService.getById(id);
    }
    
    @PutMapping("/update")
    public Customer update(@RequestBody Customer cat) {
        
        return customerService.update(cat);
    }
    
    @DeleteMapping("/delete/{id}")    //browser theke del korte gele @GetMapping dite hobe 
    public String delete (@PathVariable Long id) {
        
    	customerService.delete(id);
//         wareRepo.deleteById(id);
         return null;
    }
    
    @GetMapping("/getAll")
    public List<Customer> modelget () {
        
        return customerService.getAll();
    }

	
	

}