package com.system.leaveManagement.AdminDashboard.Entity;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Admin {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private String adminId;

    private String adminName;
    private String adminEmail;
    private String password;

    @Transient
    private String confirm;
}
