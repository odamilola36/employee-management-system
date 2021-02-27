package com.lomari.employeemanagementsystem.model;

import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;
import java.util.UUID;

@Getter
@Setter
@Entity
@NoArgsConstructor
public class Employee {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
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
    private String department;
//    private int leaveDays;
    // TODO: change database property to update before pushing to github
    @OneToMany(mappedBy = "id", cascade = CascadeType.ALL)
    private List<Salary> salaries;

    @OneToMany(mappedBy = "id", cascade = CascadeType.ALL)
    private List<EmployeeLeave> leaves;

    @OneToMany(mappedBy = "id", cascade = CascadeType.ALL)
    private List<Attendance> attendances;

    public Employee(String email, String password, String role) {
        this.email = email;
        this.password = password;
        this.role = role;
    }
}
