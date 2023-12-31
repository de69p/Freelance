package com.freelanceapp.models;

import com.freelanceapp.models.enums.UserRole;
import com.freelanceapp.models.enums.UserStatus;
import jakarta.persistence.*;
import lombok.Data;

import java.util.Date;
import java.util.Set;

@Entity
@Data
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    @Column(unique = true)
    private String email;

    private String password;

    @ManyToMany(fetch = FetchType.LAZY)
    @JoinTable(name = "user_roles",
            joinColumns = @JoinColumn(name = "user_id"),
            inverseJoinColumns = @JoinColumn(name = "role_id"))
    private Set<UserRole> roles;

    private String profileImage;

    private String bio;

    private Double rating;

    @Enumerated(EnumType.STRING)
    private UserStatus status;

    @Column(name = "registration_date")
    private Date registrationDate;
}
