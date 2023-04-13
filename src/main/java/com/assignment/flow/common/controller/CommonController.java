package com.assignment.flow.common.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

// 추후에 nginx 로 이양해야 할 부분
@RequestMapping("/")
@Controller
public class CommonController {

    @GetMapping("/")
    public ModelAndView Home() {
        ModelAndView mv = new ModelAndView();
        mv.setViewName("/index");
        return mv;
    }

    @GetMapping("/signup")
    public ModelAndView signupPage () {
        ModelAndView mv = new ModelAndView();
        mv.setViewName("/signup");
        return mv;
    }
}
