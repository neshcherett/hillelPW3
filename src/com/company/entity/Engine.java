package com.company.entity;

public abstract class Engine {
    private String model;
    private double volume;
    private int power;
    private EnginesType enginesType;

    public abstract void start();
    public abstract void stop();

    public Engine(String model, double volume) {
        this.model = model;
        this.volume = volume;
    }
}
