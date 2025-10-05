package com.example.crud.relearnbasics.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.data.web.SpringDataWebProperties.Sort;
import org.springframework.stereotype.Service;

import com.example.crud.relearnbasics.ProductEntity.ProductEntity;
import com.example.crud.relearnbasics.Repository.ProductDataRepository;

@Service
public class ProductServiceImpl implements ProductService {
    @Autowired
    ProductDataRepository productDataRepository;

    @Override
    public ProductEntity saveProduct(ProductEntity product) {
        return productDataRepository.save(product);
    }

    @Override
    public List<ProductEntity> getAllProduct() {
        return productDataRepository.findAll();
    }

    @Override
    public ProductEntity getProductById(long id) {
        return productDataRepository.getById(id);
    }

    @Override
    public ProductEntity updateProduct(ProductEntity product, long id) {
      return null;
    }

    @Override
    public void deleteProduct(long id) {
        productDataRepository.deleteById(id); 
    }

    @Override
    public List<ProductEntity> getAllProductSorted() {
        return null;
    }

    @Override
    public List<ProductEntity> findBySearchText(String searchText) {
        return productDataRepository.findBySearchText(searchText);
    }
}
