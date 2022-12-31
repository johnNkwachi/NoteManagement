package com.semicolon.notemanagementsystem.services.noteService.userService;

import com.semicolon.notemanagementsystem.dto.request.LoginRequest;
import com.semicolon.notemanagementsystem.dto.request.UserRequest;
import com.semicolon.notemanagementsystem.dto.request.response.UserLoginResponse;
import com.semicolon.notemanagementsystem.dto.request.response.UserResponse;
import com.semicolon.notemanagementsystem.exceptions.UserNotFoundException;
import com.semicolon.notemanagementsystem.models.User;
import com.semicolon.notemanagementsystem.repositories.UserRepository;
import lombok.Builder;
import lombok.extern.slf4j.Slf4j;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Builder
@Slf4j
@Service
public class UserServiceImpl implements UserService{
    @Autowired
    UserRepository userRepository;

    @Override
    public UserResponse register(UserRequest userRequest) {
        User user = new User();
        User findUser = userRepository.findByUsername(userRequest.getUsername());
        if (findUser != null)throw new UserNotFoundException("This " + user + " does not exits");
        ModelMapper modelMapper = new ModelMapper();
        modelMapper.map(userRequest, user);
        User saved = userRepository.save(user);
        modelMapper.map(saved, UserResponse.class);
        return UserResponse.builder().message("Successfully registered!").build();
    }

    @Override
    public UserLoginResponse login(LoginRequest loginRequest) {
        Optional<User> findUser = Optional.ofNullable(userRepository.findByUsername(loginRequest.getUsername()));
        if (findUser.isPresent()&& findUser.get().getPassword().equals(loginRequest.getPassword()));
        log.info("Welcome back :: {}", findUser);
        return UserLoginResponse.builder().message("").build();
    }

    @Override
    public void delete() {

    }

    @Override
    public void updateProfile() {

    }

    @Override
    public List<User> viewAllUsers() {
        return null;
    }
}
