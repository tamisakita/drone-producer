package com.fiapproject.droneproducer.controller;

import com.fiapproject.dto.DroneDataDto;
import com.fiapproject.droneproducer.service.QueueSender;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/drone")
public class DroneController {

    @Autowired
    private QueueSender queueSender;

//    @PostMapping(value = "/send-data")
//    private ResponseEntity sendData(@RequestBody DroneDataDto droneDataDto) {
//        System.out.println(droneDataDto.getId_drone());
//        this.queueSender.sendMessage(droneDataDto);
//        return new ResponseEntity(HttpStatus.CREATED);
//    }

    @GetMapping
    public String send(DroneDataDto droneDataDto){
        queueSender.sendMessage(droneDataDto);
        return "ok. done";
    }

//    @GetMapping
//    public String send(){
//        queueSender.send("test message");
//        return "ok. done";
//    }
}
