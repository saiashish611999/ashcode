package com.ashcode.ashcode.contracts;

import java.util.List;

import com.ashcode.ashcode.dtos.member.InviteMemberRequest;
import com.ashcode.ashcode.dtos.member.MemberResponse;
import com.ashcode.ashcode.dtos.member.UpdateMemberRoleRequest;

public interface ProjectMemberService {

    List<MemberResponse> getProjectMembers(Long projectId, Long userId);

    MemberResponse inviteMember(Long projectId, InviteMemberRequest request, Long userId);

    MemberResponse updateMemberRole(Long projectId, Long memberId, UpdateMemberRoleRequest request, Long userId);

    MemberResponse deleteProjectMember(Long projectId, Long memberId, Long userId);

}
