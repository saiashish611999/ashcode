package com.ashcode.ashcode.dtos.auth;

public record UserProfileResponse(
        Long id,
        String email,
        String name,
        String avatarUrl) {

}
