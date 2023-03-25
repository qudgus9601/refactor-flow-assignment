package com.assignment.flow.auth.model;
public class UserDto {
    private UserDto() {
        this.id=null;
        this.password=null;
        this.role=0;
    }
    public UserDto(String id, String password) {
        this.id = id;
        this.password = password;
        this.role = 0;
    }
    private String id;
    private String password;
    private Integer role;

    public String getId() {
        return id;
    }

    public String getPassword() {
        return password;
    }

    public Integer getRole() {
        return role;
    }

    @Override
    public String toString() {
        return "userDto{" +
                "id='" + id + '\'' +
                ", role=" + role +
                '}';
    }
}
