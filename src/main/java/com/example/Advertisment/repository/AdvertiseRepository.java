package com.example.Advertisment.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.Advertisment.models.Advertise;

public interface AdvertiseRepository extends JpaRepository<Advertise,Long> {
    
}
