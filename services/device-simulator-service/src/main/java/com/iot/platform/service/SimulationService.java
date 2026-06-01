package com.iot.platform.service;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

import org.springframework.stereotype.Service;

import com.iot.platform.model.DeviceState;

@Service
public class SimulationService {
    private final Map<String, DeviceState> deviceStates = new ConcurrentHashMap<>();

    public Map<String, Object> generateData(String deviceId) {

        deviceStates.putIfAbsent(deviceId, new DeviceState());
        DeviceState state = deviceStates.get(deviceId);

        if ("degrading".equals(state.getTrend())) {
            state.setTemperature(state.getTemperature() + 0.2);
            state.setVibration(state.getVibration() + 0.001);
        } else {
            state.setTemperature(state.getTemperature() + (Math.random() - 0.5));
            state.setVibration(state.getVibration() + (Math.random() - 0.5) * 0.001);
        }

        if (Math.random() > 0.98) {
            state.setTemperature(state.getTemperature() + 20);
            state.setVibration(state.getVibration() + 0.1);
        }

        Map<String, Object> data = new HashMap<>();
        data.put("deviceId", deviceId);
        data.put("timestamp", System.currentTimeMillis());
        data.put("temperature", String.format("%.2f", state.getTemperature()));
        data.put("vibration", String.format("%.4f", state.getVibration()));
        data.put("current", String.format("%.2f", state.getCurrent() + Math.random()));

        return data;
    }
}
