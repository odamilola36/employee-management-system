package com.lomari.employeemanagementsystem.controllers;

import com.lomari.employeemanagementsystem.model.EmployeeLeave;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class LeaveController {

    @GetMapping("/leave")
    public String getLeave(Model model){
        model.addAttribute("leave", new EmployeeLeave());
        return "leave";
    }

    @PostMapping("/leave-application")
    public String addLeave(@ModelAttribute EmployeeLeave employeeLeave){

        return "redirect:/";
    }
}
