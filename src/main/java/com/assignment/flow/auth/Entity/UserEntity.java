package com.assignment.flow.auth.Entity;

import com.assignment.flow.auth.model.UserDto;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.NonNull;

@Entity
@Table(name="users")
@NoArgsConstructor
@Getter
public class UserEntity {
    @Id
    @Column(name="userId", nullable = false, unique = true, length=20)
    private String userId;

    @Column(name="password",nullable = false, length=64, columnDefinition = "VARCHAR(64)")
    private String password;

    @Column(name="role",nullable = false)
    private byte role = 0;

    public UserEntity(UserDto userDto) {
        this.userId = userDto.getUserId();
        this.password = userDto.getPassword();
        this.role = 0;
    }

    @Override
    public String toString() {
        return "UserEntity{" +
                "userId='" + userId + '\'' +
                ", password='" + password + '\'' +
                ", role=" + role +
                '}';
    }
}
