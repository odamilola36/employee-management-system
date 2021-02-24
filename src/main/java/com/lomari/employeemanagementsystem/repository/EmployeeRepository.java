package com.lomari.employeemanagementsystem.repository;

import com.lomari.employeemanagementsystem.dto.UserLoginDTO;
import com.lomari.employeemanagementsystem.model.Employee;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface EmployeeRepository extends CrudRepository<Employee, Long> {
    Optional<Employee> findByEmail(String emailAddress);
}
