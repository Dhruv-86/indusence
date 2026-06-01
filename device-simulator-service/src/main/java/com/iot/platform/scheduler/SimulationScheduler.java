package com.iot.platform.scheduler;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import com.iot.platform.service.SimulationService;

@Component
public class SimulationScheduler {
    private final SimulationService simulationService;
    private final int deviceCount;

    public SimulationScheduler(
            SimulationService simulationService,
            @Value("${simulator.device-count}") int deviceCount) {
        this.simulationService = simulationService;
        this.deviceCount = deviceCount;
    }

    @Scheduled(fixedRateString = "${simulator.interval-ms}")
    public void simulateDevices() {

        for (int i = 1; i <= deviceCount; i++) {
            String deviceId = "machine-" + i;
            System.out.println(simulationService.generateData(deviceId));
        }

        System.out.println("------");
    }
}
