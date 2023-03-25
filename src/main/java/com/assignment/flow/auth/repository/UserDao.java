package com.assignment.flow.auth.repository;

import com.assignment.flow.auth.model.UserDto;
import org.springframework.stereotype.Repository;

@Repository
public class UserDao {
    public void insert(UserDto userDto) {
//        String sql = "INSERT INTO users (username, password) VALUES(?,?)";
//        jdbcTemplate.update(sql,userDto.getId(),userDto.getPassword());
    }
}
