package com.example.springjwtrolebased.controller;

import com.example.springjwtrolebased.dto.RegisterDto;
import com.example.springjwtrolebased.entity.User;
import com.example.springjwtrolebased.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class LoginController {

    @Autowired
    UserService userService;

    @GetMapping("/users")
    public List<User> getCustomers() {
        return userService.findAll();
    }

    @PostMapping("/register")
    public ResponseEntity<String> registerUser(@RequestBody RegisterDto registerDto) {
        System.out.println(registerDto.toString());
        return userService.registerUser(registerDto);
    }

}
