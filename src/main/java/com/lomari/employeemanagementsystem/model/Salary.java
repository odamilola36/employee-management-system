package com.lomari.employeemanagementsystem.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Getter
@Setter
@Entity
public class Salary {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String date;
    private String amount;
    private String paymentStatus;

    @ManyToOne
    private Employee employee;
}
