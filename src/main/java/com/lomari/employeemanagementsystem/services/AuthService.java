package com.lomari.employeemanagementsystem.services;

import com.lomari.employeemanagementsystem.dto.UserLoginDTO;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;

import javax.servlet.http.HttpSession;

@Service
public interface AuthService {
    String loginUser(UserLoginDTO userLoginDTO, HttpSession session, Model model);
    boolean isValid(UserLoginDTO user);
    boolean isAdmin(UserLoginDTO user);

}
