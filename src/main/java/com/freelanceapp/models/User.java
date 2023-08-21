package com.freelanceapp.models;

import com.freelanceapp.models.enums.Role;
import jakarta.persistence.*;
import lombok.Data;

import java.util.Date;

@Entity
@Data
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    private String email;

    private String password;

    @Enumerated(EnumType.STRING)
    private Role role;

    private String profileImage;

    private String bio;

    private Double rating;

    private Date registrationDate;

}

