package com.fiapproject.droneproducer.service;

import com.fiapproject.dto.DroneDataDto;
import org.springframework.amqp.core.Queue;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class QueueSender {

    @Autowired
    private RabbitTemplate rabbitTemplate;

    @Autowired
    private Queue queue;

    public void sendMessage(DroneDataDto droneDataDto) {
        this.rabbitTemplate.convertAndSend(this.queue.getName(), droneDataDto);
    }

}
