package com.example.Advertisment.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.Advertisment.models.Categories;
import com.example.Advertisment.repository.CategoriesRepository;


@Service
public class CategoriesService {
  private final CategoriesRepository categoriesRepository;
  
  public CategoriesService(CategoriesRepository categoriesRepository){
    this.categoriesRepository = categoriesRepository;
  }

  public void add(Categories categories){
    categoriesRepository.save(categories);
  }

  public List<Categories> getList(){
    return categoriesRepository.findAll();
  }
}
