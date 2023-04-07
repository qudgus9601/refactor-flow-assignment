package com.assignment.flow.user.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class UserDto {
    private String loginId;
    private String password;
    private int role;
}
