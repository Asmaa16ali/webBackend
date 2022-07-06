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

import com.example.Advertisment.models.Images;
import com.example.Advertisment.service.ImagesService;
@CrossOrigin
@RestController
@RequestMapping(path = "images")
public class ImagesController {
   @Autowired
   private ImagesService imagesService;
   
   @PostMapping("post")
   public void post(@RequestBody Images images){
    imagesService.add(images);
   }

   @GetMapping("/{id}")
   public Images findUserById(@PathVariable(value = "id")long id){
    return null;
   }

   @GetMapping("get")
   public List<Images> getAll(){
    return imagesService.getList();
   }
}
