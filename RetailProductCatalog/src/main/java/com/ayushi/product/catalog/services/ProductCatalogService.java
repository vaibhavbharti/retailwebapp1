package com.ayushi.product.catalog.services;

import java.util.List;

import com.ayushi.product.catalog.payloads.ProductCatalogDto;

public interface ProductCatalogService {

	List<ProductCatalogDto> getAllProducts();

}
