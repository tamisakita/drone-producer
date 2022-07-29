package com.fiapproject.droneproducer;

import com.fiapproject.dto.DroneDataDto;
import org.springframework.amqp.rabbit.annotation.EnableRabbit;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Random;

@EnableRabbit
@SpringBootApplication
public class DroneProducerApplication {

	public static void main(String[] args) {
		SpringApplication.run(DroneProducerApplication.class, args);
	}

}
