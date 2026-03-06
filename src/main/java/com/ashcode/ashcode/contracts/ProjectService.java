package com.ashcode.ashcode.contracts;

import java.util.List;

import com.ashcode.ashcode.dtos.project.ProjectRequest;
import com.ashcode.ashcode.dtos.project.ProjectResponse;
import com.ashcode.ashcode.dtos.project.ProjectSummaryResponse;

public interface ProjectService {

    List<ProjectSummaryResponse> getUserProjects(Long userId);

    ProjectResponse getUserProjectById(Long userId, Long id);

    ProjectResponse createProject(ProjectRequest request, Long userId);

    ProjectResponse updateProject(Long id, ProjectRequest request, Long userId);

    void softDelete(Long id, Long userId);

}
