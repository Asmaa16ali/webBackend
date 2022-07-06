package com.example.Advertisment.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.Advertisment.models.Categories;
import com.example.Advertisment.service.CategoriesService;
@CrossOrigin
@RestController
@RequestMapping(path = "categories")
public class CategoriesController {
   @Autowired
   private CategoriesService categoriesService;
   
   @PostMapping("post")
   public void post(@RequestBody Categories categories){
    categoriesService.add(categories);
   }

   @GetMapping("/{id}")
   public Categories findUserById(@PathVariable(value = "id")long id){
    return null;
   }

   @GetMapping("get")
   public List<Categories> getAll(){
    return categoriesService.getList();
   }
}
