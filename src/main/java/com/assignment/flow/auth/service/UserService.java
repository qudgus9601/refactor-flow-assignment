package com.assignment.flow.auth.service;

import com.assignment.flow.auth.Entity.UserEntity;
import com.assignment.flow.auth.repository.UserRepository;
import org.apache.catalina.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.assignment.flow.auth.model.UserDto;

@Service
public class UserService {
    @Autowired
    private UserRepository userRepository;

    public UserEntity createUser(UserDto userDto) {
        UserEntity user = new UserEntity(userDto);
        var result = userRepository.save(user);
        return result;
    }

    public UserEntity findUser(String userId) {
        var result = userRepository.findByUserId(userId);
        System.out.println(result);
        return result;
    }

    public UserEntity signinUser(String userId, String password) {
        var findUser  = userRepository.findByUserId(userId);
        System.out.println(findUser);
        return findUser;
    }
}
