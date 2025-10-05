package com.example.crud.relearnbasics.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.bind.annotation.RestController;

import com.example.crud.relearnbasics.ProductEntity.ProductEntity;
import com.example.crud.relearnbasics.Service.ProductService;

@RestController
@RequestMapping("/erp/api/products")
public class ProductController {
    @Autowired
    ProductService productService;

    @PostMapping
    public ProductEntity createProduct(@RequestBody ProductEntity product){
        return productService.saveProduct(product);
    }

    @GetMapping
    public List<ProductEntity> getAllProduct(){
        return productService.getAllProduct();
    }
    
    @GetMapping("{id}")
    public ProductEntity getProductById(@PathVariable("id")Long id){
        return productService.getProductById(id);
    }

    @PutMapping("/{id}")
    public ProductEntity updateProduct(@PathVariable Long id, @RequestBody ProductEntity product){
        return productService.updateProduct(product, id);
    }

    @DeleteMapping("/{id}")
    public void deleteProduct(@PathVariable Long id){
        productService.deleteProduct(id);
    }

    @GetMapping("/products-desc")
    public List<ProductEntity>getAllProductsSorted(){
        return productService.getAllProductSorted();
    }
        
    @GetMapping("/search")
    public ResponseEntity<List<ProductEntity>>findBySearchText(@RequestParam String searchText){
        List<ProductEntity> foundProducts=productService.findBySearchText(searchText);
        if(!foundProducts.isEmpty())
            return ResponseEntity.ok(foundProducts);
        else
            return ResponseEntity.noContent().build();
    }
}
