package com.lomari.employeemanagementsystem.servicesImpl;

import com.lomari.employeemanagementsystem.dto.UserLoginDTO;
import com.lomari.employeemanagementsystem.model.Employee;
import com.lomari.employeemanagementsystem.repository.EmployeeRepository;
import com.lomari.employeemanagementsystem.services.AuthService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;

import javax.servlet.http.HttpSession;

@Service
public class AuthServiceImpl implements AuthService {
    private EmployeeRepository employeeRepository;

    @Autowired
    public AuthServiceImpl(EmployeeRepository employeeRepository) {
        this.employeeRepository = employeeRepository;
    }

    @Override
    public String loginUser(UserLoginDTO userLoginDTO, HttpSession session, Model model) {
        if (!isValid(userLoginDTO)){
            model.addAttribute("validUser", isValid(userLoginDTO));
            return "redirect:/";
        }
        else{
            session.setAttribute("emsUser", employeeRepository.findByEmailAndPassword(userLoginDTO.getEmail(),
                    userLoginDTO.getPassword()).get());
            return "employees";
        }
    }
    public boolean isValid(UserLoginDTO user){
        return employeeRepository.findByEmailAndPassword(user.getEmail(), user.getPassword()).isPresent();
    }
    public boolean isAdmin(UserLoginDTO user){
        Employee employee = employeeRepository.findByEmailAndPassword(user.getEmail(), user.getPassword()).orElse(null);
        if (employee == null ||
                !employee.getRole().equalsIgnoreCase("admin")) return false;
        return true;
    }
}
