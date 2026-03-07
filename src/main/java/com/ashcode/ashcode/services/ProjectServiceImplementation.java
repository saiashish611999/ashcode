package com.ashcode.ashcode.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.ashcode.ashcode.contracts.ProjectService;
import com.ashcode.ashcode.dtos.project.ProjectRequest;
import com.ashcode.ashcode.dtos.project.ProjectResponse;
import com.ashcode.ashcode.dtos.project.ProjectSummaryResponse;

@Service
public class ProjectServiceImplementation implements ProjectService {

    @Override
    public List<ProjectSummaryResponse> getUserProjects(Long userId) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getUserProjects'");
    }

    @Override
    public ProjectResponse getUserProjectById(Long userId, Long id) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getUserProjectById'");
    }

    @Override
    public ProjectResponse createProject(ProjectRequest request, Long userId) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'createProject'");
    }

    @Override
    public ProjectResponse updateProject(Long id, ProjectRequest request, Long userId) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'updateProject'");
    }

    @Override
    public void softDelete(Long id, Long userId) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'softDelete'");
    }

}
