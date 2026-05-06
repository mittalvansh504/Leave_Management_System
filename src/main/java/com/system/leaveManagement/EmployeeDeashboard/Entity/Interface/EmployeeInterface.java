package com.system.leaveManagement.EmployeeDeashboard.Entity.Interface;

import com.system.leaveManagement.EmployeeDeashboard.Entity.Entity.Employee;
import com.system.leaveManagement.EmployeeDeashboard.Entity.Request.EmployeeDto;
import com.system.leaveManagement.EmployeeDeashboard.Entity.Request.RequestForEmployee;
import com.system.leaveManagement.EmployeeDeashboard.Entity.Request.RequestForLogin;

public interface EmployeeInterface {
    Employee signup(RequestForEmployee requestForEmployee);
    EmployeeDto loginEmployee(RequestForLogin requestForLogin);

}
