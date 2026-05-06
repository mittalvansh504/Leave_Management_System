package com.system.leaveManagement.AdminDashboard.Controller;


import com.system.leaveManagement.AdminDashboard.Entity.Admin;
import com.system.leaveManagement.AdminDashboard.Interface.AdminInterface;
import com.system.leaveManagement.AdminDashboard.Request.AdminDTO;
import com.system.leaveManagement.AdminDashboard.Request.RequestByAdmin;
import com.system.leaveManagement.AdminDashboard.Request.RequestForLoginByAdmin;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("/admin")
@CrossOrigin(origins = "http://localhost:5173")
public class AdminController {


    @Autowired
    private AdminInterface adminInterface;

    @PostMapping("/signup")
    public Admin adminsignup(@RequestBody RequestByAdmin requestByAdmin){
        return adminInterface.adminaccount(requestByAdmin);
    }

    @PostMapping("/loginadmin")
    public AdminDTO adminlogin(@RequestBody RequestForLoginByAdmin requestForLoginByAdmin){
        return adminInterface.loginadmin(requestForLoginByAdmin);
    }
}
