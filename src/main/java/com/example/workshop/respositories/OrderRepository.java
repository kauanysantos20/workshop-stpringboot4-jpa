package com.example.workshop.respositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.workshop.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long>{
 
}
