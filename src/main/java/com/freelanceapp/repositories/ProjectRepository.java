package com.freelanceapp.repositories;

import com.freelanceapp.models.Project;
import com.freelanceapp.models.enums.ProjectStatus;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ProjectRepository extends JpaRepository<Project, Long> {
    List<Project> findByClient_Id(Long clientId);
    List<Project> findByStatus(ProjectStatus status);
}

