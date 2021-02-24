package com.lomari.employeemanagementsystem.controllers;

import com.lomari.employeemanagementsystem.dto.UserLoginDTO;
import com.lomari.employeemanagementsystem.services.AuthService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
//@RequestMapping("/auth")
public class LoginController {

    private final Logger logger = LoggerFactory.getLogger(LoginController.class);

    private AuthService authService;

    @Autowired
    public LoginController(AuthService authService) {
        this.authService = authService;
    }

    @GetMapping({"", "/" })
    public String renderLogin(Model model){
        model.addAttribute("user", new UserLoginDTO());
        return "index";
    }
    @PostMapping("/login")
    public String loginUser(@ModelAttribute UserLoginDTO userLoginDTO, Model model){
        model.addAttribute("user", userLoginDTO);
        model.addAttribute("validUser", authService.isValid(userLoginDTO));
        model.addAttribute("admin", authService.isAdmin(userLoginDTO));
        String page = authService.loginUser(userLoginDTO);
//        logger.info(page);
        return page;
    }
}
