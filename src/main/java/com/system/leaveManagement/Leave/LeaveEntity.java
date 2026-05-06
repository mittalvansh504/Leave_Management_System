package com.system.leaveManagement.Leave;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class LeaveEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private String leaveId;

    private String employeeName;
    private String employeeEmail;
    private String reason;
    private int days;

}
