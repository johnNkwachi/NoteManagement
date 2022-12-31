package com.semicolon.notemanagementsystem.services.noteService.userService;

import com.semicolon.notemanagementsystem.dto.request.LoginRequest;
import com.semicolon.notemanagementsystem.dto.request.UserRequest;
import com.semicolon.notemanagementsystem.dto.request.response.UserLoginResponse;
import com.semicolon.notemanagementsystem.dto.request.response.UserResponse;
import com.semicolon.notemanagementsystem.models.User;

import java.util.List;

public interface UserService {
    UserResponse register(UserRequest userRequest);
    UserLoginResponse login(LoginRequest loginRequest);
    void delete();
    void updateProfile();
    List<User>viewAllUsers();
}
