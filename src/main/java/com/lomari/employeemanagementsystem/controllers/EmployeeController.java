package com.lomari.employeemanagementsystem.controllers;

import com.lomari.employeemanagementsystem.model.Employee;
import com.lomari.employeemanagementsystem.services.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class EmployeeController {
    private EmployeeService employeeService;

    @Autowired
    public EmployeeController(EmployeeService employeeService) {
        this.employeeService = employeeService;
    }

    @GetMapping("/employees")
    public String getEmployees(Model model){
        model.addAttribute("newUser", new Employee());
        model.addAttribute("users", employeeService.getAllEmployees());
        return "employees";
    }


    @PostMapping("/employeeReg")
    public String registerUser(@ModelAttribute Employee employee, Model model){
        model.addAttribute("newUser", employee);
        employeeService.registerEmployee(employee);
        return "redirect:/employees";
    }
}
