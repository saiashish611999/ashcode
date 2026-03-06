package com.ashcode.ashcode.dtos.member;

import com.ashcode.ashcode.enums.ProjectRole;

public record InviteMemberRequest(
        String email,
        ProjectRole role) {

}
