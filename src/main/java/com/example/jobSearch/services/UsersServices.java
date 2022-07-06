package com.example.jobSearch.services;

import com.example.jobSearch.models.Users;
import com.example.jobSearch.repositories.UsersRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UsersServices {
    @Autowired
    private UsersRepository repo;


    public List<Users> getUsers(){
        return repo.findAll((Sort.by(Sort.Order.desc("username"))));
    }

    public Users SaveNewUser(Users newUser){
        return repo.save(newUser);
    }
}
