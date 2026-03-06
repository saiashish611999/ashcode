package com.ashcode.ashcode.dtos.member;

import com.ashcode.ashcode.enums.ProjectRole;

public record UpdateMemberRoleRequest(
        ProjectRole role) {

}
