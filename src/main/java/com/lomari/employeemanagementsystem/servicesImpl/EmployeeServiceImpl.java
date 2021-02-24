package com.lomari.employeemanagementsystem.servicesImpl;

import com.lomari.employeemanagementsystem.model.Employee;
import com.lomari.employeemanagementsystem.repository.EmployeeRepository;
import com.lomari.employeemanagementsystem.services.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmployeeServiceImpl implements EmployeeService {
    private final EmployeeRepository employeeRepository;

    @Autowired
    public EmployeeServiceImpl(EmployeeRepository employeeRepository) {
        this.employeeRepository = employeeRepository;
    }

    public void registerEmployee(Employee employee){
        employeeRepository.save(employee);
    }
}
