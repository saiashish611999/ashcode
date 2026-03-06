package com.ashcode.ashcode.entities;

import java.time.Instant;

import com.ashcode.ashcode.enums.ProjectRole;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.FieldDefaults;

@Getter
@Setter
@FieldDefaults(level = AccessLevel.PRIVATE)
public class ProjectMember {

    ProjectMemberId id;

    Project project;

    User user;

    ProjectRole role;

    Instant invitedAt;

    Instant acceptedAt;

}
