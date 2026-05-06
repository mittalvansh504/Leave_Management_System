package com.system.leaveManagement.AdminDashboard.Interface;

import com.system.leaveManagement.AdminDashboard.Entity.Admin;
import com.system.leaveManagement.AdminDashboard.Request.AdminDTO;
import com.system.leaveManagement.AdminDashboard.Request.RequestByAdmin;
import com.system.leaveManagement.AdminDashboard.Request.RequestForLoginByAdmin;

public interface AdminInterface {

    Admin adminaccount(RequestByAdmin requestByAdmin);

    AdminDTO loginadmin(RequestForLoginByAdmin requestForLoginByAdmin);
}
