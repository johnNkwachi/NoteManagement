package com.semicolon.notemanagementsystem.controller;

import com.semicolon.notemanagementsystem.dto.request.UserRequest;
import com.semicolon.notemanagementsystem.dto.request.response.UserResponse;
import com.semicolon.notemanagementsystem.services.noteService.userService.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {
    @Autowired
    UserService userService;
    @PostMapping("/user")
    public UserResponse register(@RequestBody UserRequest userRequest){
        return userService.register(userRequest);
    }
}
