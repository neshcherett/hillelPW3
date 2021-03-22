package com.company.entity;

public abstract class Machine {
    private String name;
    private String model;
    private Engine engine;
    private int speed;

    public abstract void move();
}
