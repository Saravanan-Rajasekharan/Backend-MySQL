package com.example.sqlConnection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {
    @Autowired
    UserRepository userRepository;

    public String createUser(User user){
        userRepository.save(user);
        return "User added successfully";
    }

    public User getUser(int id){
        User user = userRepository.findById(id).get(); // find the entity by primary key
        return user;
    }

    public List<User> findAllUser(){
        return userRepository.findAll();
    }
}
