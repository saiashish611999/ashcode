package com.ashcode.ashcode.dtos.project;

import java.time.Instant;

import com.ashcode.ashcode.dtos.auth.UserProfileResponse;

public record ProjectResponse(
        Long id,
        String name,
        Instant createdAt,
        Instant updatedAt,
        UserProfileResponse owner) {

}
