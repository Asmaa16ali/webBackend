package com.example.Advertisment.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.Data;

@Entity
@Data
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String full_name;
    private int phone_number;
    private String email;
    private String address;
    private String gender;
    private String user_name;
    private String password;
}
