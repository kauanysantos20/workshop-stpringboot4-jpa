package com.example.workshop.respositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.workshop.entities.OrderItem;
import com.example.workshop.entities.pk.OrderItemPK;

public interface OrderItemRepository extends JpaRepository<OrderItem, OrderItemPK>{
 
}
