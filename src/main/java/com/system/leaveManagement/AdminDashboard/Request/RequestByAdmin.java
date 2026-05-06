package com.system.leaveManagement.AdminDashboard.Request;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class RequestByAdmin {
    private String adminName;
    private String adminEmail;
    private String password;
    private String confirm;
}
