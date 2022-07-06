package com.example.Advertisment.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.Advertisment.models.Images;
import com.example.Advertisment.repository.ImagesRepository;


import lombok.Data;

@Service
@Data
public class ImagesService {
   private final ImagesRepository imagesRepository;
   
   public ImagesService(ImagesRepository imagesRepository){
    this.imagesRepository = imagesRepository;
   }

   public void add(Images images){
    imagesRepository.save(images);
   }

   public List<Images> getList(){
    return imagesRepository.findAll();
   }
}
