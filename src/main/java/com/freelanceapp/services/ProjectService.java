package com.freelanceapp.services;

import com.freelanceapp.models.Project;
import com.freelanceapp.models.enums.ProjectStatus;

import java.util.List;
import java.util.Optional;

public interface ProjectService {

    /**
     * Retrieves all projects.
     *
     * @return  a list of projects
     */
    List<Project> getAllProjects();

    /**
     * Retrieves a project by its ID.
     *
     * @param  id  the ID of the project to retrieve
     * @return     an optional containing the project with the specified ID, or empty if no project is found
     */
    Optional<Project> getProjectById(Long id);

    Project saveProject(Project project);

    void deleteProject(Long id);

    List<Project> getProjectsByClientId(Long clientId);

    List<Project> getProjectsByStatus(ProjectStatus status);
}

