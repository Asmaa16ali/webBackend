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

import com.example.Advertisment.models.User;
import com.example.Advertisment.service.UsersService;

@CrossOrigin
@RestController
@RequestMapping(path = "users")
public class UsersController {
    @Autowired
    private UsersService usersService;

    @PostMapping("post")
    public void post(@RequestBody User users){
        usersService.add(users);
    }

    @GetMapping("/{id}")
    public User findUserByEmail(@PathVariable(value = "email")long email){
        return null;
    }

    @GetMapping("get")
    public List<User> getAll(){
        return usersService.getUserByEmail(User.getByEmail());
    }
}
