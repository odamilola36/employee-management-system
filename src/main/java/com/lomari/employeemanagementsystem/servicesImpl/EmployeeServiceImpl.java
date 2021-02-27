package com.lomari.employeemanagementsystem.servicesImpl;

import com.lomari.employeemanagementsystem.model.Attendance;
import com.lomari.employeemanagementsystem.model.Employee;
import com.lomari.employeemanagementsystem.model.EmployeeLeave;
import com.lomari.employeemanagementsystem.model.Salary;
import com.lomari.employeemanagementsystem.repository.EmployeeRepository;
import com.lomari.employeemanagementsystem.services.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeServiceImpl implements EmployeeService {
    private final EmployeeRepository employeeRepository;

    @Autowired
    public EmployeeServiceImpl(EmployeeRepository employeeRepository) {
        this.employeeRepository = employeeRepository;
    }

    @Override
    public void registerEmployee(Employee employee) {
        employeeRepository.save(employee);
    }

    @Override
    public List<Employee> getAllEmployees() {
        return employeeRepository.getAllEmployees();
    }

    public List<EmployeeLeave> getLeaves(Long id){
        Employee employee = employeeRepository.findById(id).get();
        return employee.getLeaves();
    }

    @Override
    public List<Salary> getSalaries(Long id) {
        Employee employee = employeeRepository.findById(id).get();
        return employee.getSalaries();
    }

    @Override
    public List<Attendance> getAttendances(Long id) {
        Employee employee = employeeRepository.findById(id).get();
        return employee.getAttendances();
    }
}
