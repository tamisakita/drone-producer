package com.fiapproject.droneproducer.controller;

import com.fiapproject.droneproducer.model.DroneData;
import com.fiapproject.droneproducer.service.QueueSender;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/teste")
public class TestController {

    @Autowired
    private QueueSender queueSender;

    @GetMapping
    public String send(){
        queueSender.send("test message");
        return "ok. done";
    }
//
//    @GetMapping
//    public String sendDroneData(){
//        queueSender.sendDroneData("droneData");
//        return "Sent Drone data";
//    }
}
