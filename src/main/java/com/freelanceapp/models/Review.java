package com.freelanceapp.models;

import jakarta.persistence.*;
import lombok.Data;

import java.util.Date;

@Entity
@Data
public class Review {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private Double rating;

    private String text;

    private Date publicationDate;

    @ManyToOne
    private User author;

    @ManyToOne
    private User recipient;
}
