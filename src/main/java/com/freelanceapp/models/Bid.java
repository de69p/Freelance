package com.freelanceapp.models;

import jakarta.persistence.*;
import lombok.Data;

import java.util.Date;

@Entity
@Data
public class Bid {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private Double amount;

    private Date deliveryDate;

    private String description;

    private Date bidDate;

    @ManyToOne
    private User freelancer;

    @ManyToOne
    private Project project;
}
