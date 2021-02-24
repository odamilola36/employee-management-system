package com.lomari.employeemanagementsystem.servicesImpl;

import com.lomari.employeemanagementsystem.dto.UserLoginDTO;
import com.lomari.employeemanagementsystem.model.Employee;
import com.lomari.employeemanagementsystem.repository.EmployeeRepository;
import com.lomari.employeemanagementsystem.services.AuthService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.util.Optional;

@Service
public class AuthServiceImpl implements AuthService {
    private EmployeeRepository employeeRepository;

    @Autowired
    public AuthServiceImpl(EmployeeRepository employeeRepository) {
        this.employeeRepository = employeeRepository;
    }

    @Override
    public String loginUser(UserLoginDTO userLoginDTO) {
        if (!isValid(userLoginDTO)) return "redirect:/";
        return "home";
    }
    public boolean isValid(UserLoginDTO user){
        return employeeRepository.findByEmail(user.getEmail()).isPresent();
    }
    public boolean isAdmin(UserLoginDTO user){
        Employee employee = employeeRepository.findByEmail(user.getEmail()).orElse(null);
        if (employee == null ||
                !employee.getRole().equalsIgnoreCase("admin")) return false;
        return true;
    }
//    private boolean hasCookie(UserLoginDTO user, HttpServletRequest request){
//        Cookie[] cookies = request.getCookies();
//        for (Cookie cookie: cookies) {
//            if (cookie.)
//        }
//    }
}
