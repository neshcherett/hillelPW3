package com.company.entity;

public class TruckEngine extends Engine {


    public TruckEngine(String model, double volume) {
        super(model, volume);
    }

    @Override
    public void start() {
        System.out.println("start");
    }

    @Override
    public void stop() {
        System.out.println("stop");
    }
}
