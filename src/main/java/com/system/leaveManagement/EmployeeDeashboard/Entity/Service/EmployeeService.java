package com.system.leaveManagement.EmployeeDeashboard.Entity.Service;

import com.system.leaveManagement.Leave.LeaveEntity;
import com.system.leaveManagement.EmployeeDeashboard.Entity.Interface.EmployeeInterface;
import com.system.leaveManagement.EmployeeDeashboard.Entity.Repository.EmployeeRepository;
import com.system.leaveManagement.EmployeeDeashboard.Entity.Entity.Employee;
import com.system.leaveManagement.EmployeeDeashboard.Entity.Request.EmployeeDto;
import com.system.leaveManagement.EmployeeDeashboard.Entity.Request.RequestForEmployee;
import com.system.leaveManagement.Leave.RequestForLeave;
import com.system.leaveManagement.EmployeeDeashboard.Entity.Request.RequestForLogin;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmployeeService implements EmployeeInterface {

    @Autowired
    private EmployeeRepository employeeRepository;

    @Override
    public Employee signup(RequestForEmployee requestForEmployee){

        Employee employee = new Employee();

        employee.setNameEmployee(requestForEmployee.getNameEmployee());
        employee.setEmailEmployee(requestForEmployee.getEmailEmployee());
        employee.setDepartment(requestForEmployee.getDepartment());
        employee.setPassword(requestForEmployee.getPassword());
        employee.setConfirm(requestForEmployee.getConfirm());

        employeeRepository.save(employee);

        return employee;
    }

    @Override
    public EmployeeDto loginEmployee(RequestForLogin requestForLogin) {

        Employee employee = employeeRepository
                .findByEmailEmployee(requestForLogin.getEmailEmployee().trim());

        if(employee == null){
            throw new RuntimeException("Invalid Email");
        }

        if(!employee.getPassword().equals(requestForLogin.getPassword())){
            throw new RuntimeException("Invalid Password");
        }

        return new EmployeeDto(
                employee.getEmployeeId(),
                employee.getNameEmployee()
        );
    }




}