package com.example.Advertisment.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.Advertisment.models.Categories;

public interface CategoriesRepository extends JpaRepository<Categories,Long> {
    
}
