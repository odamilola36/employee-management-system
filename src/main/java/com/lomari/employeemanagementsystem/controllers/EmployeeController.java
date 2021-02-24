package com.lomari.employeemanagementsystem.controllers;

import com.lomari.employeemanagementsystem.model.Employee;
import com.lomari.employeemanagementsystem.servicesImpl.EmployeeServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class EmployeeController {
    private EmployeeServiceImpl employeeService;

    @Autowired
    public EmployeeController(EmployeeServiceImpl employeeService) {
        this.employeeService = employeeService;
    }

    @GetMapping("/employees")
    public String getEmployees(Model model){
        model.addAttribute("newUser", new Employee());
        return "employees";
    }

    @PostMapping("/employeeReg")
    public String registerUser(@ModelAttribute Employee employee, Model model){
        model.addAttribute("newUser", employee);
        employeeService.registerEmployee(employee);
        return "redirect:/home";
    }
}
