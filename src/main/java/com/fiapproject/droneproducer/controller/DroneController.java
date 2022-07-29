package com.fiapproject.droneproducer.controller;

import com.fiapproject.dto.DroneDataDto;
import com.fiapproject.droneproducer.service.QueueSender;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/drone")
public class DroneController {

    @Autowired
    private QueueSender queueSender;

    @GetMapping
    public ResponseEntity send(DroneDataDto droneDataDto){
        System.out.println(droneDataDto);
        queueSender.sendMessage(droneDataDto);
        return new ResponseEntity(HttpStatus.CREATED);
    }
}
