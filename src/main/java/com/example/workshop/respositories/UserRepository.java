package com.example.workshop.respositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.workshop.entities.User;

public interface UserRepository extends JpaRepository<User, Long>{
 
}
