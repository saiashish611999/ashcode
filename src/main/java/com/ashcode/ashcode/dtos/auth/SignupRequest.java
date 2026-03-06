package com.ashcode.ashcode.dtos.auth;

public record SignupRequest(
        String email,
        String name,
        String password) {

}
