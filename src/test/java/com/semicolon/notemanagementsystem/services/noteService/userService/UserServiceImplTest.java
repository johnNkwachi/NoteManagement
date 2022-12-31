package com.semicolon.notemanagementsystem.services.noteService.userService;

import com.semicolon.notemanagementsystem.dto.request.UserRequest;
import com.semicolon.notemanagementsystem.dto.request.response.UserResponse;
import com.semicolon.notemanagementsystem.repositories.UserRepository;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;
@SpringBootTest
class UserServiceImplTest {
    @Autowired
    UserService userService;
    @Autowired
    UserRepository userRepository;
    private UserRequest userRequest;

    @BeforeEach
    void setUp() {
        userRequest = UserRequest.builder()
                .username("HOPE")
                .password("12345")
                .build();
    }

    @Test
    void createNoteUser() {
        UserResponse response = userService.register(userRequest);
        assertThat(response).isNotNull();
    }
}