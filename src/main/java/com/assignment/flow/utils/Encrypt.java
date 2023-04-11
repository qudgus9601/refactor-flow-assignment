package com.assignment.flow.utils;

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

public class Encrypt {
    public Encrypt() {};
    public static String encryptPassword (String password) {
        BCryptPasswordEncoder passwordEncoder = new BCryptPasswordEncoder();
        String encrypted = passwordEncoder.encode(password);
        return encrypted;
    }
}
