package com.lomari.employeemanagementsystem.bootstrap;

//import com.lomari.employeemanagementsystem.modl.Employee;
//import com.lomari.employeemanagementsystem.repositories.EmployeeRepository;
import com.lomari.employeemanagementsystem.model.Employee;
import com.lomari.employeemanagementsystem.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.stereotype.Component;

import java.util.UUID;

//@Component
public class AdminDataBootstrap implements ApplicationListener<ContextRefreshedEvent> {

    private final EmployeeRepository employeeRepository;

    //@Autowired
    public AdminDataBootstrap(final EmployeeRepository employeeRepository) {
        this.employeeRepository = employeeRepository;
    }

    @Override
    public void onApplicationEvent(ContextRefreshedEvent contextRefreshedEvent) {
        initializeData();
    }

    private void initializeData() {
        //initialize admin data here for admin to sign in before during database setup
        //var admin = new Employee( "admin@ems.com", "12345", "admin");
        //employeeRepository.save(admin);
    }
}