package com.assignment.flow.user.dto;

public class UserDto {

    // 선언부
    private String email;
    private String password;
    private int role;

    // 디폴트 생성자
    private UserDto() {}

    // build 메소드 정의 -- UserDto.builder() 이런식으로 쓸려구 사용
    public static Builder builder() {
        // 새로운 Builder 객체 반환
        return new Builder();
    }

    // builder 를 받아서 userDto를 생성한다. 아래의 build 메소드 사용을 위해 생성
    private UserDto(Builder builder) {
        this.email = builder.email;
        this.password = builder.password;
        this.role = builder.role;
    }

    // getter와 setter
    public String getEmail() {
        return email;
    }

    public String getPassword() {
        return password;
    }

    public int getRole() {
        return role;
    }

    // Builder 클래스 정의
    public static class Builder {
        // 선언부
        private String email;
        private String password;
        private int role;

        // 디폴트 생성자
        private Builder() {}

        // setter의 느낌을 가짐
        public Builder email(String email) {
            this.email = email;
            return this;
        }
        public Builder password(String password) {
            this.password = password;
            return this;
        }

        public Builder role(int role) {
            this.role = role;
            return this;
        }

        // 모든 인자를 받아서 userDto 를 생성하고 반환한다.
        public UserDto build() {
            return new UserDto(this);
        }
    }

    // 객체 출력
    @Override
    public String toString() {
        return "UserDto{" +
                "email='" + email + '\'' +
                ", password='" + password + '\'' +
                ", role='" + role + '\'' +
                '}';
    }
}