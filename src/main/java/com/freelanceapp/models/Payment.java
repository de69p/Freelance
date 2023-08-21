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

    private PaymentStatus status;

    private Date paymentDate;

    @ManyToOne
    private User client;

    @ManyToOne
    private User freelancer;
}
