package com.system.leaveManagement.EmployeeDeashboard.Entity.Controller;

import com.system.leaveManagement.EmployeeDeashboard.Entity.Interface.EmployeeInterface;
import com.system.leaveManagement.EmployeeDeashboard.Entity.Entity.Employee;
import com.system.leaveManagement.EmployeeDeashboard.Entity.Request.EmployeeDto;
import com.system.leaveManagement.EmployeeDeashboard.Entity.Request.RequestForEmployee;
import com.system.leaveManagement.EmployeeDeashboard.Entity.Request.RequestForLogin;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/employee")
@CrossOrigin(origins = "http://localhost:5173")
public class EmployeeController {

    @Autowired
    private EmployeeInterface employeeInterface;


    @PostMapping("/signup")
    public Employee signup(@RequestBody RequestForEmployee requestForEmployee){
        return employeeInterface.signup(requestForEmployee);
    }

    @PostMapping("/login")
    public EmployeeDto loginEmployee(@RequestBody RequestForLogin requestForLogin){
        return employeeInterface.loginEmployee(requestForLogin);
    }
}
