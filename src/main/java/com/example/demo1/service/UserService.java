package com.example.demo1.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo1.dto_request.UserCreationRequest;
import com.example.demo1.dto_request.UserUpdateRequest;
import com.example.demo1.entity.User;
import com.example.demo1.repository.UserRepository;

@Service
public class UserService {
    @Autowired
    private UserRepository userRepository;
    
    public User createUser(UserCreationRequest request){
        User user = new User();

        user.setUsername(request.getUsername());
        user.setPassword(request.getPassword());
        user.setFistname(request.getFistname());
        user.setLastname(request.getLastname());
        user.setDob(request.getDob());

        return  userRepository.save(user);

    }

    public List<User> getUsers(){
        return userRepository.findAll();
    }

    public User getUser(String id){
        return ((Optional<User>) userRepository.findById(id)).orElseThrow(() -> new RuntimeException("User not fond"));
    }
    public User updateUser(String userId, UserUpdateRequest request){
        User user = getUser(userId);

        user.setPassword(request.getPassword());
        user.setFistname(request.getFistname());
        user.setLastname(request.getLastname());
        user.setDob(request.getDob());

        return userRepository.save(user);
    }
}
