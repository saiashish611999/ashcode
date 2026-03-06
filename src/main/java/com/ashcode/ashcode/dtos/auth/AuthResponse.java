package com.ashcode.ashcode.dtos.auth;

public record AuthResponse(
        String token,
        UserProfileResponse user) {

}
