package com.lomari.employeemanagementsystem.services;

import com.lomari.employeemanagementsystem.dto.UserLoginDTO;
import org.springframework.stereotype.Service;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@Service
public interface AuthService {
    String loginUser(UserLoginDTO userLoginDTO);
    boolean isValid(UserLoginDTO user);
    boolean isAdmin(UserLoginDTO user);
}
