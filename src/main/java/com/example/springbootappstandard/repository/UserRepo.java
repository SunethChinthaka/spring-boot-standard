package com.example.springbootappstandard.repository;

import com.example.springbootappstandard.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepo extends JpaRepository<User, Integer>{
}
