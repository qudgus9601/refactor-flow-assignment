package com.assignment.flow.user.service;

import com.assignment.flow.user.dto.UserDto;
import lombok.Builder;
import org.springframework.stereotype.Service;

@Service
@Builder
public class UserServiceImpl implements UserService{

    public UserDto signin (UserDto user) {
        return UserDto.builder()
                .email(user.getEmail())
                .password(user.getPassword())
                .role(user.getRole())
                .build();
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
