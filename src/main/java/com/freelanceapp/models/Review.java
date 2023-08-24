package com.freelanceapp.models;

import jakarta.persistence.*;
import lombok.Data;

import java.util.Date;

@Entity
@Data
@Table(name = "reviews")
public class Review {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private Double rating;

    private String text;

    @Column(name = "publication_date")
    private Date publicationDate;

    @ManyToOne
    private User author;

    @ManyToOne
    private User recipient;
}
