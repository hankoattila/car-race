package com.carRace;

import java.util.ArrayList;
import java.util.List;


public class Main {

    static List<Racer> racers = new ArrayList<>();

    public static void main(String[] args) {
        createVehicles();

    }
    private static void createVehicles(){
        racers.add(new Car("Cobra Exence"));
        racers.add(new Car("Vertex Blaze"));
        racers.add(new Car("Vindicator Freedom"));
        racers.add(new Car("Whirlpool Blade"));
        racers.add(new Car("Specter Fang"));
        racers.add(new Car("Barrage Ethereal "));
        racers.add(new Car("Magic Spirit"));
        racers.add(new Car("Crux Blaze"));
        racers.add(new Car("Hero Eagle"));
        racers.add(new Car("Bullet Dynamo"));

        for(int i =0; i<10;i++){
            racers.add(new Motorcycle());
            racers.add(new Truck());
        }
    }
    void simulateRace(){

    }
    void printResult(){

    }
}
