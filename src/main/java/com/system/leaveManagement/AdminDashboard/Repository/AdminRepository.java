package com.system.leaveManagement.AdminDashboard.Repository;

import com.system.leaveManagement.AdminDashboard.Entity.Admin;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface AdminRepository extends JpaRepository<Admin, String> {

    @Query("select a from Admin a where a.adminEmail=?1")
    Admin findByAdminEmail(String adminEmail);
}
