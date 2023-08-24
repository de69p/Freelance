package com.freelanceapp.models;

import com.freelanceapp.models.enums.ProjectStatus;
import jakarta.persistence.*;
import lombok.Data;

import java.util.Date;

@Entity
@Data
@Table(name = "projects")
public class Project {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;


    private String title;

    private String description;

    private Double budget;

    private String currency; // NEW: Currency field

    @Column(name = "publication_date")
    private Date publicationDate;

    private Date deadline;

    @Enumerated(EnumType.STRING)
    private ProjectStatus status;

    @ManyToOne
    private User client;

    private String projectImage; // NEW: Image for the project
}