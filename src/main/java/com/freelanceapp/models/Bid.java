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

    @Column(name = "delivery_date")
    private Date deliveryDate;

    private String description;

    @Column(name = "bid_date")
    private Date bidDate;

    @ManyToOne
    private User freelancer;

    @ManyToOne
    private Project project;
}
