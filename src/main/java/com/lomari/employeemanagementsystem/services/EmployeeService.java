package com.lomari.employeemanagementsystem.services;

import com.lomari.employeemanagementsystem.model.Attendance;
import com.lomari.employeemanagementsystem.model.Employee;
import com.lomari.employeemanagementsystem.model.EmployeeLeave;
import com.lomari.employeemanagementsystem.model.Salary;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface EmployeeService {
    public void registerEmployee(Employee employee);
    public Iterable<Employee> getAllEmployees();
    public List<EmployeeLeave> getLeaves(Long id);
    public List<Salary> getSalaries(Long id);
    public List<Attendance> getAttendances(Long id);
}
