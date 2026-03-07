package com.ashcode.ashcode.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.ashcode.ashcode.contracts.ProjectMemberService;
import com.ashcode.ashcode.dtos.member.InviteMemberRequest;
import com.ashcode.ashcode.dtos.member.MemberResponse;
import com.ashcode.ashcode.dtos.member.UpdateMemberRoleRequest;

@Service
public class ProjectMemberServiceImplementation implements ProjectMemberService {

    @Override
    public List<MemberResponse> getProjectMembers(Long projectId, Long userId) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getProjectMembers'");
    }

    @Override
    public MemberResponse inviteMember(Long projectId, InviteMemberRequest request, Long userId) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'inviteMember'");
    }

    @Override
    public MemberResponse updateMemberRole(Long projectId, Long memberId, UpdateMemberRoleRequest request,
            Long userId) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'updateMemberRole'");
    }

    @Override
    public MemberResponse deleteProjectMember(Long projectId, Long memberId, Long userId) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'deleteProjectMember'");
    }

}
