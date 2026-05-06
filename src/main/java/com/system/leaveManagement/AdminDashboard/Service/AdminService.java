package com.system.leaveManagement.AdminDashboard.Service;


import com.system.leaveManagement.AdminDashboard.Entity.Admin;
import com.system.leaveManagement.AdminDashboard.Interface.AdminInterface;
import com.system.leaveManagement.AdminDashboard.Repository.AdminRepository;
import com.system.leaveManagement.AdminDashboard.Request.AdminDTO;
import com.system.leaveManagement.AdminDashboard.Request.RequestByAdmin;
import com.system.leaveManagement.AdminDashboard.Request.RequestForLoginByAdmin;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AdminService implements AdminInterface {

    @Autowired
    private AdminRepository adminRepository;

    @Override
    public Admin adminaccount(RequestByAdmin requestByAdmin){
        Admin admin = new Admin();
        admin.setAdminName(requestByAdmin.getAdminName());
        admin.setAdminEmail(requestByAdmin.getAdminEmail());
        admin.setPassword(requestByAdmin.getPassword());
        admin.setConfirm(requestByAdmin.getConfirm());
        adminRepository.save(admin);
        return admin;
    }

    @Override
    public AdminDTO loginadmin(RequestForLoginByAdmin requestForLoginByAdmin) {
        Admin admin = adminRepository
                .findByAdminEmail(requestForLoginByAdmin.getAdminEmail().trim());

        if(admin == null){
            throw new RuntimeException("Invalid Email");
        }

        if(!admin.getPassword().equals(requestForLoginByAdmin.getPassword())){
            throw new RuntimeException("Invalid Password");
        }

        return new AdminDTO(
                admin.getAdminId(),
                admin.getAdminName()
        );
    }

}
