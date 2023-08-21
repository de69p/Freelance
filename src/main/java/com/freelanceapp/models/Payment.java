package com.freelanceapp.models;

import jakarta.persistence.*;
import lombok.Data;

import java.util.Date;

@Entity
@Data
public class Payment {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private Double amount;

    private String status;

    private Date paymentDate;

    @ManyToOne
    private User client;

    @ManyToOne
    private User freelancer;
}
