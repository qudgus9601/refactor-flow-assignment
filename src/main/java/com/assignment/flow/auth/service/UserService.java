package com.assignment.flow.auth.service;

import com.assignment.flow.auth.repository.UserDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.assignment.flow.auth.model.UserDto;

@Service
public class UserService {
    @Autowired
    private UserDao userDao;

    public String createUser(UserDto userDto) {
        var result = userDao;
        return "";
    }
}
