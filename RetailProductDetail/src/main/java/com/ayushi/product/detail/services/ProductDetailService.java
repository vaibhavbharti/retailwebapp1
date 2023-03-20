package com.ayushi.product.detail.services;



import com.ayushi.product.detail.payloads.ProductDetailDto;


public interface ProductDetailService {
	
	ProductDetailDto getProductById(Integer id);

}
