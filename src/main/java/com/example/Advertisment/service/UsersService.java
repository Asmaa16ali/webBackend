package com.example.Advertisment.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.Advertisment.models.User;
import com.example.Advertisment.repository.UsersRepository;

@Service
public class UsersService {
    private final UsersRepository usersRepository;

    public UsersService(UsersRepository usersRepository){
        this.usersRepository = usersRepository;
    }

    public void add(User users){
        usersRepository.save(users);
    }

    public List<User> getList(){
        return usersRepository.findAll();
    }
}
