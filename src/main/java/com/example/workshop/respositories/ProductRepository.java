package com.example.workshop.respositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.workshop.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long>{
 
}
