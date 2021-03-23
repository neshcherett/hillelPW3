package com.company;

import com.company.entity.Truck;
import com.company.entity.TruckEngine;

public class Main {

    public static void main(String[] args) {

        TruckEngine truckEngine = new TruckEngine("M1", 6.0);
        Truck ford = new Truck("Ford", "m1", truckEngine, 85);
        Truck volvo = new Truck("Volvo", "model1", truckEngine, 80);
        volvo.move();
    }
}
