package com.example.crud.relearnbasics.ProductEntity;

//import jakarta.annotation.sql.DataSourceDefinition;
import jakarta.persistence.Entity;
import jakarta.persistence.*;
import lombok.*;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name="product_entity")
//@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"}) 
public class ProductEntity {
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    public Long id;

    @Column(name="servicename",nullable=false)
    private String serviceName;

    @Column(name="productType", nullable=false)
    private String productType;

    @Column(name="warranty", nullable=false)
    private String warranty;

    @Column(name="deliveryTime",nullable=false)
    private String deliveryTime;
}

// I created a product entity class which has the attributes id, serviceName, productType, warranty and deliveryTime. I used lombok annotations to reduce boilerplate code like getters and setters. I also used JPA annotations to map the class to a database table named "product_entiy".
//@Entity to mark it as a JPA entity.
//@Data to generate getters, setters, toString, equals and hashCode methods.
//@AllArgsConstructor to generate a constructor with all fields.
//@NoArgsConstructor to generate a default constructor.
//@Table to specify the table name in the database.
//@Id to mark the primary key field.
//@GeneratedValue to specify the generation strategy for the primary key.
//@Column to specify the column name and constraints in the database.
// so say my product name is casio gmt 500, product type is watch, warranty is 1 year and delivery time is 3 days. so when i create a new product entity object with these values and save it to the database, it will be stored in the product_entity table with the corresponding columns and values.
//This is the first class to be created in the project.
//Doubt why do i have to create this class first before creating the repository and service class?