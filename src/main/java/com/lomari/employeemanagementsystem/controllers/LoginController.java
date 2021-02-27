package com.lomari.employeemanagementsystem.controllers;

import com.lomari.employeemanagementsystem.dto.UserLoginDTO;
import com.lomari.employeemanagementsystem.model.Employee;
import com.lomari.employeemanagementsystem.services.AuthService;


import com.lomari.employeemanagementsystem.services.EmployeeService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;


import javax.servlet.http.HttpSession;

@Controller
public class LoginController {

    private final Logger logger = LoggerFactory.getLogger(LoginController.class);

    private AuthService authService;
    private EmployeeService employeeService;


    @Autowired
    public LoginController(AuthService authService, EmployeeService employeeService) {
        this.authService = authService;
        this.employeeService = employeeService;
    }

    @GetMapping({"", "/" })
    public String renderLogin(Model model){
        model.addAttribute("user", new UserLoginDTO());
        return "index";
    }
    @PostMapping("/dashboard")
    public String loginUser(@ModelAttribute UserLoginDTO userLoginDTO, Model model, HttpSession session){
        model.addAttribute("admin", authService.isAdmin(userLoginDTO));
        model.addAttribute("newUser", new Employee());
        model.addAttribute("users", employeeService.getAllEmployees());
        String page = authService.loginUser(userLoginDTO, session, model);
        return page;
    }
    @GetMapping("/logout")
    public String logout(HttpSession session){
        session.invalidate();
        return "redirect:/";
    }
}
