package com.system.leaveManagement.Leave;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ServiceLeave implements LeaveInterface{

    @Autowired
    private LeaveRepository leaveRepository;

    @Override
    public LeaveEntity leaveapplication(RequestForLeave requestForLeave) {
        LeaveEntity leaveEntity = new LeaveEntity();
        leaveEntity.setEmployeeName(requestForLeave.getEmployeeName());
        leaveEntity.setEmployeeEmail(requestForLeave.getEmailEmployee());
        leaveEntity.setReason(requestForLeave.getReason());
        leaveEntity.setDays(requestForLeave.getDays());
        leaveEntity.setStatus("Pending");

        leaveRepository.save(leaveEntity);
        return leaveEntity;

    }
}
