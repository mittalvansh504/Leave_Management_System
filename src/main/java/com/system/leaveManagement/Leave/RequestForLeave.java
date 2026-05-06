package com.system.leaveManagement.Leave;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class RequestForLeave {
    private String employeeName;
    private String employeeEmail;
    private String reason;
    private int days;

}
