package com.iot.platform.model;

public class DeviceState {
    private double temperature;
    private double vibration;
    private double current;
    private String trend;

    public DeviceState() {
        this.temperature = 60 + Math.random() * 5;
        this.vibration = 0.02;
        this.current = 5;
        this.trend = Math.random() > 0.8 ? "degrading" : "normal";
    }

    public double getTemperature() {
        return temperature;
    }

    public void setTemperature(double temperature) {
        this.temperature = temperature;
    }

    public double getVibration() {
        return vibration;
    }

    public void setVibration(double vibration) {
        this.vibration = vibration;
    }

    public double getCurrent() {
        return current;
    }

    public void setCurrent(double current) {
        this.current = current;
    }

    public String getTrend() {
        return trend;
    }

    public void setTrend(String trend) {
        this.trend = trend;
    }

}
