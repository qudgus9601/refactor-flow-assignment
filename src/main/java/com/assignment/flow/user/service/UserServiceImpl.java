package com.assignment.flow.user.service;

import com.assignment.flow.user.dto.UserDto;
import com.assignment.flow.utils.Encrypt;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService{

    public UserDto signin (UserDto user) {
        UserDto newUser = user.builder()
                .loginId(user.getLoginId())
                .password(user.getPassword())
                .role(user.getRole())
                .build();
        return newUser;
    }

    @Override
    public String findUser() {
        return null;
    }

    @Override
    public String createUser() {
        return null;
    }

    @Override
    public String deleteUser() {
        return null;
    }

    @Override
    public String updateUser() {
        return null;
    }
}
