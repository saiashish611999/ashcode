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

import com.ashcode.ashcode.contracts.ProjectService;
import com.ashcode.ashcode.dtos.project.ProjectRequest;
import com.ashcode.ashcode.dtos.project.ProjectResponse;
import com.ashcode.ashcode.dtos.project.ProjectSummaryResponse;

import lombok.AccessLevel;
import lombok.RequiredArgsConstructor;
import lombok.experimental.FieldDefaults;

@RestController
@RequiredArgsConstructor
@RequestMapping(path = "/api/projects")
@FieldDefaults(makeFinal = true, level = AccessLevel.PRIVATE)
public class ProjectController {

    ProjectService projectService;

    @GetMapping
    public ResponseEntity<List<ProjectSummaryResponse>> getMyProjects() {
        Long userId = 1L;
        return ResponseEntity.ok(projectService.getUserProjects(userId));
    }

    @GetMapping(path = "/{id}")
    public ResponseEntity<ProjectResponse> getProjectById(@PathVariable(name = "id") Long id) {
        Long userId = 1L;
        return ResponseEntity.ok(projectService.getUserProjectById(userId, id));
    }

    @PostMapping
    public ResponseEntity<ProjectResponse> createProject(@RequestBody ProjectRequest request) {
        Long userId = 1L;
        return ResponseEntity.status(HttpStatus.CREATED).body(projectService.createProject(request, userId));
    }

    @PatchMapping(path = "/{id}")
    public ResponseEntity<ProjectResponse> updateProject(
            @PathVariable(name = "id") Long id,
            @RequestBody ProjectRequest request) {
        Long userId = 1L;
        return ResponseEntity.ok(projectService.updateProject(id, request, userId));
    }

    @DeleteMapping(path = "/{id}")
    public ResponseEntity<Void> deleteProject(@PathVariable(name = "id") Long id) {
        Long userId = 1L;
        projectService.softDelete(id, userId);
        return ResponseEntity.noContent().build();
    }

}
