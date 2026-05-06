package com.system.leaveManagement.EmployeeDeashboard.Entity.Request;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor

public class RequestForEmployee {

    private String employeeId;
    private String nameEmployee;
    private String emailEmployee;

    private String department;

    private String password;
    private String confirm;
}
