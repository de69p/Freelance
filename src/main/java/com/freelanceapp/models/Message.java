package com.freelanceapp.models;

import jakarta.persistence.*;
import lombok.Data;

import java.util.Date;

@Entity
@Data
public class Message {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String text;

    private Date sendDate;

    @ManyToOne
    private User sender;

    @ManyToOne
    private User recipient;
}
