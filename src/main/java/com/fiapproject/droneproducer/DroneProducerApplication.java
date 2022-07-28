package com.fiapproject.droneproducer;

import org.springframework.amqp.rabbit.annotation.EnableRabbit;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@EnableRabbit
@SpringBootApplication
public class DroneProducerApplication {

	public static void main(String[] args) {
		SpringApplication.run(DroneProducerApplication.class, args);
	}

}
