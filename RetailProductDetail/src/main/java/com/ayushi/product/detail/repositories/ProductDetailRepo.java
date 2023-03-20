package com.ayushi.product.detail.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ayushi.product.detail.entities.ProductDetail;

public interface ProductDetailRepo extends JpaRepository<ProductDetail, Integer>{

}
