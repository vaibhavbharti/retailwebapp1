package com.ayushi.product.detail.services.impl;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ayushi.product.detail.entities.ProductDetail;
import com.ayushi.product.detail.exceptions.ResourceNotFoundException;
import com.ayushi.product.detail.payloads.ProductDetailDto;
import com.ayushi.product.detail.repositories.ProductDetailRepo;
import com.ayushi.product.detail.services.ProductDetailService;


@Service
public class ProductDetailServiceimpl implements ProductDetailService{
	@Autowired
	private ProductDetailRepo userRepo;
	
	@Autowired
	private ModelMapper modelMapper;

	@Override
	public ProductDetailDto getProductById(Integer id) {
		// TODO Auto-generated method stub
		ProductDetail product = this.userRepo.findById(id).orElseThrow(()-> new ResourceNotFoundException("Product", "id", id));

		return this.productToDto(product);
	}



	public ProductDetailDto productToDto(ProductDetail product) {
		ProductDetailDto productDto = this.modelMapper.map(product,  ProductDetailDto.class);
		return productDto;
	}

}