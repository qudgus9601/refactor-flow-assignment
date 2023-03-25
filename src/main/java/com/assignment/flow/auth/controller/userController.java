package com.assignment.flow.auth.controller;

import com.assignment.flow.auth.model.UserDto;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import com.assignment.flow.auth.service.UserService;

@RestController
@RequestMapping("/api/user")
public class userController {
    @Autowired
    private UserService userService;

    @GetMapping("/signup")
    public String signupPage () {
        return "signup";
    }

    @PostMapping("/signup")
    public ResponseEntity<String> signupUser (@RequestBody UserDto user) {
        var d = userService.createUser(user);
        return ResponseEntity.ok("회원가입 성공");
    }

    @GetMapping("/find/{userId}")
    public String findUser(@RequestParam("userId") String id) {
        return "";
    }
}
