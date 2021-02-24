package com.lomari.employeemanagementsystem.model;

import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.CreationTimestamp;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.sql.Timestamp;
import java.time.LocalDateTime;

@Setter
@Getter
@Entity
public class Attendance {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String employeeId;
    @CreationTimestamp
    private Timestamp clockIn;

    @CreationTimestamp
    private Timestamp clockOut;
}
