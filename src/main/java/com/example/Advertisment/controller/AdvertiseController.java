package com.example.Advertisment.controller;

import java.io.IOException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.Advertisment.dto.AdvertiseDto;
import com.example.Advertisment.models.Advertise;
import com.example.Advertisment.service.AdvertiseService;
@CrossOrigin
@RestController
@RequestMapping(path = "advertise")
public class AdvertiseController {
    @Autowired
    private AdvertiseService advertiseService;

    @PostMapping("post")
    public void post(@ModelAttribute AdvertiseDto advertiseDto) throws IOException{
        advertiseService.add(advertiseDto);
    }

    @GetMapping("/{id}")
    public Advertise findUserById(@PathVariable(value = "id")long id){
        return null;
    }

    @GetMapping("get")
    public List<Advertise> getAll(){
        return advertiseService.getList();
    }
}
