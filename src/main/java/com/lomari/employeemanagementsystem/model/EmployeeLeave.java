package com.lomari.employeemanagementsystem.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Setter
@Getter
@Entity
public class EmployeeLeave {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String employeeId;
    private String leaveType;
    private String startDate;
    private String endDate;
    private String approvalStatus;
    private String reason;
//    private String approvalStatus;
}
