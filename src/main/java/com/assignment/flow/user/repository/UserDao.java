package com.assignment.flow.user.repository;

import com.assignment.flow.user.dto.UserResponseDto;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@Mapper
public class UserDao {
    private final SqlSession sqlSession;
}
