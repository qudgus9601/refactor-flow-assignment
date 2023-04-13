package com.assignment.flow.user.controller;

import com.assignment.flow.user.dto.UserRequestDto;
import com.assignment.flow.user.service.UserServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

@RestController
@RequestMapping("/api/user")
public class UserController {

    @Autowired
    private UserServiceImpl userService;

    @GetMapping("/signin")
    public ModelAndView signinPage () {
        ModelAndView mv = new ModelAndView();
        mv.setViewName("/signin");
        return mv;
    }
    @PostMapping("/signin")
    public ModelAndView signin (@RequestBody UserRequestDto user) {
        System.out.println(user);
        var a = userService.signin(user);
        System.out.println(a);
        ModelAndView mv = new ModelAndView();
        mv.setViewName("/signin");
        return mv;
    }
}
