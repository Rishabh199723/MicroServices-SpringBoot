package com.example.userservice.controller;

import com.example.userservice.Dto.ResponseTemplate;
import com.example.userservice.entity.User;
import com.example.userservice.service.UserService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/users")
@Slf4j
public class UserController {

    @Autowired
    private UserService userService;

    @PostMapping("/saveUser")
    public User saveUser(@RequestBody User userData) {
        log.info(String.valueOf(userData));
        return userService.saveUser(userData);
    }

    @GetMapping("/fetchUser/{id}")
    public ResponseTemplate fetchUserWithTemplate(@PathVariable("id") Long userId) {
        return userService.fetchUserWithTemplate(userId);
    }
}
