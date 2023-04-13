package com.assignment.flow.user.dto;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;


@Getter
@Setter
public class UserRequestDto {

    private String loginId;
    private String password;
    private Integer role;

    public UserRequestDto() {};
    @Builder
    public UserRequestDto(String loginId, String password, int role) {
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
