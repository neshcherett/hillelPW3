package com.company.entity;

public class Truck extends Machine {
    public Truck(String name, String model, TruckEngine engine, int speed) {
        super(name, model, engine, speed);
    }



    @Override
    public void move() {
        TruckEngine engine = new TruckEngine("m1", 6.9);
        engine.start();
        System.out.println("80 km/h");
        engine.stop();
    }
}
