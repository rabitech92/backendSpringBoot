package com.example.backendspring.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Getter
@Setter
@Entity
@Table(name ="product")
public class Product {
	
	@Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String pId;
    private String pName;
    private String pType;
    private String pBrand;
    private int pQty;
    private int pInvPrice;
    private int pSelPrice;
    private String suppliarName;
    private String suppliarAddress;
    
    
       
}
