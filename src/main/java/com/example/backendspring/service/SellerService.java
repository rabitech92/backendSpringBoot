package com.example.backendspring.service;

import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.backendspring.model.Seller;
import com.example.backendspring.repository.SellerRepository;




@Service
public class SellerService {
	
@Autowired	
SellerRepository sellerRepository;  

public Seller sellerPost(Seller seller) {	
	if(!seller.equals(null)) {  
		return sellerRepository.save(seller); 
	}
	return null;
}

public Seller sellergetById(Long id) {
	Optional<Seller> optional = sellerRepository.findById(id);
	if (optional.isPresent()) {
		return optional.get();
	}
	return null;
}

public Seller sellerDelete() {
	
	return null;
}

public Seller sellerUpdate() {
	
	return null;
}

public List<Seller> sellerAllGet() {
	
	
	return sellerRepository.findAll();
}


}
