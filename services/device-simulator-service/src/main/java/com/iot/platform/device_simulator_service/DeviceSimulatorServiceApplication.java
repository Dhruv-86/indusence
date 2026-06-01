package com.iot.platform.device_simulator_service;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
public class DeviceSimulatorServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(DeviceSimulatorServiceApplication.class, args);
	}

}
