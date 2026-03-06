package com.ashcode.ashcode.dtos.member;

import java.time.Instant;

import com.ashcode.ashcode.enums.ProjectRole;

public record MemberResponse(
        Long id,
        String email,
        String name,
        String avatarUrl,
        ProjectRole role,
        Instant invitedAt) {

}
