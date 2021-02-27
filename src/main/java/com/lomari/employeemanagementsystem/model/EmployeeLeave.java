package com.lomari.employeemanagementsystem.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Setter
@Getter
@Entity
public class EmployeeLeave {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

//    private String employeeEmail;
    private String leaveType;
    private String startDate;
    private String endDate;
    private String approvalStatus;
    private String reason;

    @ManyToOne
    private Employee employee;
}
