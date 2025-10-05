package com.example.crud.relearnbasics.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.example.crud.relearnbasics.ProductEntity.ProductEntity;

@Repository
public interface ProductDataRepository extends JpaRepository<ProductEntity, Long> {
   // List<ProductEntity> findByProductType(String productType);
   // List<ProductEntity> findByServiceName(String serviceName);

   // @Query("SELECT a FROM ProductEntity a WHERE " +
   //      "LOWER(a.serviceName) LIKE LOWER(CONCAT('%', :searchText, '%')) OR " +
   //      "LOWER(a.deliveryTime) LIKE LOWER(CONCAT('%', :searchText, '%')) OR " +
   //      "LOWER(a.warranty) LIKE LOWER(CONCAT('%', :searchText, '%')) OR " +
   //      "LOWER(a.productType) LIKE LOWER(CONCAT('%', :searchText, '%'))")
   // List<ProductEntity> findBySearchText(@Param("searchText") String searchText);
}


//Doubt why do i have to create this class after creating the product entity class?
//I created a product repository interface which extends JpaRepository to provide CRUD operations for the ProductEntity class. This interface will allow me to perform database operations such as saving, finding, updating and deleting product entities.
//@Repository to mark it as a Spring Data repository.
//JpaRepository<ProductEntity, Long> to specify the entity type and primary key type.
//Doubt: are all these methods available by default in jpa repository or do i have to create them manually? 
