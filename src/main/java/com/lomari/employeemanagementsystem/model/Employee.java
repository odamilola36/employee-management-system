package com.lomari.employeemanagementsystem.model;

import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.UUID;

@Getter
@Setter
@Entity
@NoArgsConstructor
public class Employee {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String firstName;
    private String lastName;

    @Column(nullable = false, unique = true)
    private String email;

    @Column(nullable = false)
    private String password;

    @Column(nullable = false)
    private String role;
    private String dateOfBirth;
//    @ManyToOne
    private String department;
    private int leaveDays;

    public Employee(String email, String password, String role) {
        this.email = email;
        this.password = password;
        this.role = role;
    }
}
