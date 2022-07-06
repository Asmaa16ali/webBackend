package com.example.Advertisment.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.Advertisment.models.User;

public interface UsersRepository extends JpaRepository<User,Long> {
    
}
