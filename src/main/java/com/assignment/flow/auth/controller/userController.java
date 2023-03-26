package com.assignment.flow.auth.controller;

import com.assignment.flow.auth.model.UserDto;
import com.assignment.flow.util.ResponseMapper;
import com.fasterxml.jackson.core.JsonProcessingException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import com.assignment.flow.auth.service.UserService;

import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/api/user")
public class userController {
    @Autowired
    private UserService userService;

    ResponseMapper responseMapper = new ResponseMapper();

    @GetMapping("/signup")
    public String signupPage () {
        return "signup";
    }

    @PostMapping("/signup")
    public Object signupUser (@RequestBody UserDto user) {
        try {
            var newUser = userService.createUser(user);
            var response = responseMapper.messageAndData("회원 가입완료",newUser);
            return ResponseEntity.ok(response);
        } catch (JsonProcessingException e) {
            throw new RuntimeException(e);
        }
    }

    @GetMapping("/find")
    public Object findUser(@RequestParam("userId") String userId) {
        try {
            var findUser = userService.findUser(userId);
            var response = responseMapper.messageAndData("회원 검색 완료",findUser);
            return ResponseEntity.ok(response);
        } catch (JsonProcessingException e) {
            throw new RuntimeException(e);
        }
    }

    @PostMapping("/signin")
    public Object signinUser(@RequestBody UserDto userDto) {
        try {
            var signedUser = userService.findUser(userDto.getUserId());
            if(signedUser.getPassword().equals(userDto.getPassword())) {
                var response = responseMapper.messageAndData("로그인 성공",signedUser);
                return ResponseEntity.ok(response);
            } else {
                return ResponseEntity.status(HttpStatus.BAD_REQUEST).body("로그인 실패");
            }
        } catch (JsonProcessingException e) {
            throw new RuntimeException(e);
        }
    }
}
