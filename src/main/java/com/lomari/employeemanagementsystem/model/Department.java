//package com.lomari.employeemanagementsystem.model;
//
//
//import lombok.Getter;
//import lombok.Setter;
//
//import javax.persistence.*;
//import java.util.Set;
//
//@Getter
//@Setter
//@Entity
//public class Department {
//
//    @Id
//    @GeneratedValue(strategy = GenerationType.AUTO)
//    private Long id;
//    private String name;
//    @OneToMany(mappedBy = "department")
//    private Set<Employee> employees;
//}
