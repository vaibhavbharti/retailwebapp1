package com.ayushi.product.catalog.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ayushi.product.catalog.entities.ProductCatalog;

public interface ProductCatalogRepo extends JpaRepository<ProductCatalog, Integer>{

}
