package com.ashcode.ashcode.controllers;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ashcode.ashcode.contracts.ProjectMemberService;
import com.ashcode.ashcode.dtos.member.InviteMemberRequest;
import com.ashcode.ashcode.dtos.member.MemberResponse;
import com.ashcode.ashcode.dtos.member.UpdateMemberRoleRequest;

import lombok.AccessLevel;
import lombok.RequiredArgsConstructor;
import lombok.experimental.FieldDefaults;

@RestController
@RequestMapping(path = "/api/projects/{projectId}/members")
@RequiredArgsConstructor
@FieldDefaults(makeFinal = true, level = AccessLevel.PRIVATE)
public class ProjectMemberController {

    ProjectMemberService projectMemberService;

    @GetMapping
    public ResponseEntity<List<MemberResponse>> getProjectMembers(@PathVariable(name = "projectId") Long projectId) {
        Long userId = 1L;
        return ResponseEntity.ok(projectMemberService.getProjectMembers(projectId, userId));

    }

    @PostMapping
    public ResponseEntity<MemberResponse> inviteMember(
            @PathVariable(name = "projectId") Long projectId,
            @RequestBody InviteMemberRequest request) {
        Long userId = 1L;
        return ResponseEntity.status(HttpStatus.CREATED)
                .body(projectMemberService.inviteMember(projectId, request, userId));
    }

    @PatchMapping(path = "/{memberId}")
    public ResponseEntity<MemberResponse> updateMemberRole(
            @PathVariable(name = "projectId") Long projectId,
            @PathVariable(name = "memberId") Long memberId,
            @RequestBody UpdateMemberRoleRequest request) {
        Long userId = 1L;
        return ResponseEntity.ok(projectMemberService.updateMemberRole(projectId, memberId, request, userId));

    }

    @DeleteMapping(path = "/{memberId}")
    public ResponseEntity<MemberResponse> deleteMember(
            @PathVariable(name = "projectId") Long projectId,
            @PathVariable(name = "memberId") Long memberId) {
        Long userId = 1L;
        return ResponseEntity.ok(projectMemberService.deleteProjectMember(projectId, memberId, userId));
    }

}
