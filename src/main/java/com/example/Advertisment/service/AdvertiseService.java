package com.example.Advertisment.service;

import java.io.IOException;
import java.time.LocalDate;
import java.util.Base64;
import java.util.List;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.Advertisment.dto.AdvertiseDto;
import com.example.Advertisment.models.Advertise;
import com.example.Advertisment.models.Images;
import com.example.Advertisment.repository.AdvertiseRepository;
import com.example.Advertisment.repository.ImagesRepository;

import lombok.Data;

@Data
@Service
public class AdvertiseService {
    private final AdvertiseRepository advertiseRepository;
    private final ModelMapper mapper;
    private final ImagesRepository imagesRepository;
   
    public void add(AdvertiseDto advertiseDto) throws IOException {
        Advertise advertise = mapper.map(advertiseDto, Advertise.class); 
        advertise.setPosteDate(LocalDate.now());
        Images images = mapper.map(advertiseDto, Images.class);
        images.setImage(Base64.getEncoder().encodeToString(advertiseDto.getImage().getBytes()));
        imagesRepository.save(images);
        advertiseRepository.save(advertise);
    }

    public List<Advertise> getList(){
        return advertiseRepository.findAll();
    }
}
