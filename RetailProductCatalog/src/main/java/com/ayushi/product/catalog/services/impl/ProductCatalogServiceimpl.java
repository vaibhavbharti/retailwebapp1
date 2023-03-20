package com.ayushi.product.catalog.services.impl;

import java.util.List;
import java.util.stream.Collectors;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ayushi.product.catalog.entities.ProductCatalog;
import com.ayushi.product.catalog.payloads.ProductCatalogDto;
import com.ayushi.product.catalog.repositories.ProductCatalogRepo;
import com.ayushi.product.catalog.services.ProductCatalogService;

@Service
public class ProductCatalogServiceimpl implements ProductCatalogService{
	@Autowired
	private ProductCatalogRepo userRepo;
	
	@Autowired
	private ModelMapper modelMapper;

	@Override
	public List<ProductCatalogDto> getAllProducts() {
		// TODO Auto-generated method stub
		List<ProductCatalog> products = this.userRepo.findAll();

		List<ProductCatalogDto> productDtos = products.stream().map(product -> this.productToDto(product)).collect(Collectors.toList());

		return productDtos;
	}

	

//	private ProductCatalog dtoToProduct(ProductCatalogDto productDto) {
////Using ModelMapper
//		ProductCatalog product = this.modelMapper.map(productDto,  ProductCatalog.class);
//		return product;
//	}

	public ProductCatalogDto productToDto(ProductCatalog product) {
		ProductCatalogDto productDto = this.modelMapper.map(product,  ProductCatalogDto.class);
		return productDto;
	}

}