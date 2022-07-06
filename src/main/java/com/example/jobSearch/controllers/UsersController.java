package com.example.jobSearch.controllers;

import com.example.jobSearch.models.Users;
import com.example.jobSearch.repositories.UsersRepository;
import com.example.jobSearch.services.UsersServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;
import java.util.Map;

@RestController
public class UsersController {

    @Autowired
    private UsersServices service;

    @GetMapping(value = "/users", produces= MediaType.APPLICATION_JSON_VALUE)
    @ResponseStatus(HttpStatus.OK)
    @ResponseBody
    public List<Users> getUsers(){
        System.out.println(service.getUsers());
        return service.getUsers();
    }


    @PostMapping("/users")
    Users newEmployee(@RequestBody Users newUsers) {
        return service.SaveNewUser(newUsers);
    }
}
