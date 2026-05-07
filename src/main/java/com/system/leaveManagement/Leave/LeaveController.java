package com.system.leaveManagement.Leave;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("/leave")
@CrossOrigin(origins = "http://localhost:5173")
public class LeaveController {

    @Autowired
    private LeaveInterface leaveInterface;

    @PostMapping("/issue")
    public LeaveEntity leaveapplication(@RequestBody RequestForLeave requestForLeave){
        return leaveInterface.leaveapplication(requestForLeave);
    }


}
