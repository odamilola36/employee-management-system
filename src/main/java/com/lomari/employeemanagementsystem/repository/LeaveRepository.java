package com.lomari.employeemanagementsystem.repository;

import com.lomari.employeemanagementsystem.model.EmployeeLeave;
import org.springframework.data.repository.CrudRepository;

public interface LeaveRepository extends CrudRepository<EmployeeLeave, Long> {
}
