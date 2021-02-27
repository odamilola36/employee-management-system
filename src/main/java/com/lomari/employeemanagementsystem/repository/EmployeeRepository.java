package com.lomari.employeemanagementsystem.repository;

import com.lomari.employeemanagementsystem.model.Employee;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface EmployeeRepository extends CrudRepository<Employee, Long> {
    Optional<Employee> findByEmailAndPassword(String email, String password);

    @Query(value = "Select * from employee where not role = 'Admin'", nativeQuery = true)
    List<Employee> getAllEmployees();
}
