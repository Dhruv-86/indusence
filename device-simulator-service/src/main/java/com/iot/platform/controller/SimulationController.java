package com.iot.platform.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SimulationController {
    private final int deviceCount;

    public SimulationController(@Value("${simulator.device-count}") int deviceCount) {
        this.deviceCount = deviceCount;
    }

    @GetMapping("/status")
    public String status() {
        return "Simulator running with " + deviceCount + " devices";
    }
}
