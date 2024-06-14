package com.example.demo1.controler;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo1.dto_request.UserCreationRequest;
import com.example.demo1.dto_request.UserUpdateRequest;
import com.example.demo1.entity.User;
import com.example.demo1.service.UserService;


@RestController
@RequestMapping("/users")
public class UserControler {
    
    @Autowired
    private UserService userService;

    public UserControler() {
    }

    @GetMapping()
    List<User> getUsers(){
        return userService.getUsers();
    }

    @PostMapping
    User createUser(@RequestBody UserCreationRequest request) {

        
        return userService.createUser(request);
    }

    @GetMapping("/{userId}")
    User getUser(@PathVariable("userId")String userId){
        return userService.getUser(userId);
    }

    @PutMapping("/{userId}")
    User updateUser(@PathVariable String userId, @RequestBody UserUpdateRequest request){
        return userService.updateUser(userId, request);
    }

}
