package com.system.leaveManagement.Leave;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/leave")
public class LeaveController {

    @Autowired
    private LeaveInterface leaveInterface;

    @PostMapping("/issue")
    public LeaveEntity leaveapplication(@RequestBody RequestForLeave requestForLeave){
        return leaveInterface.leaveapplication(requestForLeave);
    }
}
