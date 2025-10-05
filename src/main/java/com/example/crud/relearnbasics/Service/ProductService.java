package com.example.crud.relearnbasics.Service;

import java.util.List;

import com.example.crud.relearnbasics.ProductEntity.ProductEntity;

public interface ProductService {
    ProductEntity saveProduct(ProductEntity product);
    List<ProductEntity> getAllProduct();
    ProductEntity getProductById(long id);
    ProductEntity updateProduct(ProductEntity product,long id);
    void deleteProduct(long id);
    List<ProductEntity> getAllProductSorted();
    List<ProductEntity> findBySearchText(String searchText);
}

