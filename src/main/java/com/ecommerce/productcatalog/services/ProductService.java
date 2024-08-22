package com.ecommerce.productcatalog.services;


import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Slf4j
public class ProductService {
	
	public List<String> getProducts() {
		return  List.of("Iphone", "Onepluse");
	}



	

}