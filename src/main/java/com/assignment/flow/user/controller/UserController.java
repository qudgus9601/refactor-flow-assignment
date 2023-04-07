package com.assignment.flow.user.controller;

import com.assignment.flow.user.dto.UserDto;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/api/user")
public class UserController {
    @GetMapping("/signin")
    public ModelAndView signinPage () {
        ModelAndView mv = new ModelAndView();
        mv.setViewName("/signin");
        return mv;
    }

    @PostMapping("/signin")
    public ModelAndView signin (@RequestBody UserDto user) {
        ModelAndView mv = new ModelAndView();
        mv.setViewName("/signin");
        return mv;
    }

    @GetMapping("/signup")
    public ModelAndView signupPage () {
        ModelAndView mv = new ModelAndView();
        mv.setViewName("/signup");
        return mv;
    }

}
