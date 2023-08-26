package com.freelanceapp.models;

import com.freelanceapp.models.enums.PaymentStatus;
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

    private String currency; // NEW: Currency field

    @Enumerated(EnumType.STRING)
    private PaymentStatus status;

    @Column(name = "payment_date")
    private Date paymentDate;

    @ManyToOne
    private User client;

    @ManyToOne
    private User freelancer;

    @ManyToOne
    private Project project;
}
