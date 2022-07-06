package com.example.Advertisment.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Lob;

import lombok.Data;

@Data
@Entity
public class Images {
   @Id
   @GeneratedValue(strategy = GenerationType.IDENTITY)
   private long id;
   @Lob
   private String image;
   private String categories; 
}
