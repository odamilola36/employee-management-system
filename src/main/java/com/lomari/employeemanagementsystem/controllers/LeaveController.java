package com.lomari.employeemanagementsystem.controllers;

import com.lomari.employeemanagementsystem.model.EmployeeLeave;
import com.lomari.employeemanagementsystem.services.EmployeeService;
import com.lomari.employeemanagementsystem.services.LeaveService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class LeaveController {

    EmployeeService employeeService;

    @Autowired
    public LeaveController(EmployeeService employeeService) {
        this.employeeService = employeeService;
    }

    //    @GetMapping("/leave")
//    public String getLeave(Model model){
//        model.addAttribute("leave", new EmployeeLeave());
//        return "leave";
//    }

    @PostMapping("/leave-application")
    public String addLeave(@ModelAttribute EmployeeLeave employeeLeave, Model model){

        return "redirect:/login";
    }

    @GetMapping("/salary-leave-view")
    public String getSalaryLeaveView(@RequestParam("id") Long id, Model model){
        model.addAttribute("leaves", employeeService.getLeaves(id));
        model.addAttribute("salaries", employeeService.getSalaries(id));
        model.addAttribute("attendances", employeeService.getAttendances(id));
        return "leave";
    }
}
