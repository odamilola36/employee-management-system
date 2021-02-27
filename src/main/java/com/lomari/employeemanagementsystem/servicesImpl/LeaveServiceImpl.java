package com.lomari.employeemanagementsystem.servicesImpl;

import com.lomari.employeemanagementsystem.model.EmployeeLeave;
import com.lomari.employeemanagementsystem.repository.LeaveRepository;
import com.lomari.employeemanagementsystem.services.LeaveService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class LeaveServiceImpl implements LeaveService {
    LeaveRepository leaveRepository;

    @Autowired
    public LeaveServiceImpl(LeaveRepository leaveRepository) {
        this.leaveRepository = leaveRepository;
    }

//    @Override
//    public List<EmployeeLeave> findAllLeaves(Long id) {
//        leave
//    }
}
