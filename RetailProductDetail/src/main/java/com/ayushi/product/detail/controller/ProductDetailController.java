package com.ayushi.product.detail.controller;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ayushi.product.detail.payloads.ProductDetailDto;
import com.ayushi.product.detail.services.ProductDetailService;



@RestController
@RequestMapping("/api/productdetail")
public class ProductDetailController {

	@Autowired
	private ProductDetailService productService;


 
//	GET - fetching single product  
   
	@GetMapping("/{id}")
	public ResponseEntity<ProductDetailDto> getSinglproduct(@PathVariable Integer id) {
		return ResponseEntity.ok(this.productService.getProductById(id));
	}

 
}

	

