package com.example.backendspring.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.backendspring.model.Seller;
import com.example.backendspring.service.SellerService;

@RestController
@CrossOrigin(origins="http://localhost:4200")
@RequestMapping(value="/api")
public class SellerController {
	
	
	@Autowired
	private SellerService sellerService;
	
	@PostMapping("/Post")
	public Seller sellPost(@RequestBody Seller seller) {
		return sellerService.sellerPost(seller);
	}
	
	public Seller sellerGet(@PathVariable Long id) {
		return sellerService.sellergetById(id);
	}
	
	

}
