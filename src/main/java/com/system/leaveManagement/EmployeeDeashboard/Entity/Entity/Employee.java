package com.system.leaveManagement.EmployeeDeashboard.Entity.Entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Employee {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private String employeeId;
    private String nameEmployee;
    private String emailEmployee;

    private String department;

    private String password;

    @Transient
    private String confirm;

}
