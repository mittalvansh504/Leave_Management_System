package com.system.leaveManagement.EmployeeDeashboard.Entity.Repository;

import com.system.leaveManagement.EmployeeDeashboard.Entity.Entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface EmployeeRepository extends JpaRepository<Employee, String> {

    @Query("select e from Employee e where e.emailEmployee=?1")
    Employee findByEmailEmployee(String emailEmployee);

}