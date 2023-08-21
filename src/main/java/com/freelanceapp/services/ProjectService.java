package com.freelanceapp.services;

import com.freelanceapp.models.Project;
import com.freelanceapp.models.enums.ProjectStatus;

import java.util.List;
import java.util.Optional;

public interface ProjectService {

    List<Project> getAllProjects();

    Optional<Project> getProjectById(Long id);

    Project saveProject(Project project);

    void deleteProject(Long id);

    List<Project> getProjectsByClientId(Long clientId);

    List<Project> getProjectsByStatus(ProjectStatus status);
}

