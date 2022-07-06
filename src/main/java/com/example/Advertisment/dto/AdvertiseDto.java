package com.example.Advertisment.dto;

import java.time.LocalDate;

import org.springframework.web.multipart.MultipartFile;

import lombok.Data;

@Data
public class AdvertiseDto {
    private long id;
    private String tittle;
    private String details;
    private String categories;
    private LocalDate posteDate;
    private MultipartFile image;
}
