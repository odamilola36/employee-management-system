package com.lomari.employeemanagementsystem;

import com.lomari.employeemanagementsystem.model.Employee;
import com.lomari.employeemanagementsystem.repository.EmployeeRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Bean;

import javax.annotation.PostConstruct;

@SpringBootApplication
public class EmployeeManagementSystemApplication {


    public static void main(String[] args) {
        ConfigurableApplicationContext run = SpringApplication.run(EmployeeManagementSystemApplication.class, args);

//        EmployeeRepository employeeRepository = run.getBean(EmployeeRepository.class);
//
//        Employee employee = employeeRepository.findByEmail("admin@app.com").orElse(employeeRepository.save(new Employee("admin@app.com",
//                "password", "ADMIN")));
    }

}
