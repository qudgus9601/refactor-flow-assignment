package com.assignment.flow.user.dto;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;


@Getter
@Setter
public class UserDto {

    private String loginId;
    private String password;
    private Integer role;

    public UserDto() {};
    @Builder
    public UserDto(String loginId, String password, int role) {
        this.loginId = loginId;
        this.password = password;
        this.role = role;
    }

    @Override
    public String toString() {
        return "UserDto{" +
                "loginId='" + loginId + '\'' +
                ", password='" + password + '\'' +
                ", role=" + role +
                '}';
    }
}
