package com.system.leaveManagement.EmployeeDeashboard.Entity.Request;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class RequestForLogin {

    private String emailEmployee;
    private String password;
}
