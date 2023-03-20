package com.ayushi.product.catalog.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ayushi.product.catalog.payloads.ProductCatalogDto;
import com.ayushi.product.catalog.services.ProductCatalogService;


@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/api/productcatalog")
public class ProductCatalogController {


	@Autowired
	private ProductCatalogService productService;



//	GET - fetching all product  

	@GetMapping("/")
	public ResponseEntity<List<ProductCatalogDto>> getAllProducts() {
		return ResponseEntity.ok(this.productService.getAllProducts());
	}


}

	

