package com.carRace;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;


public class Main {

    static List<Racer> racers = new ArrayList<>();
    static Random rnd = new Random();

    public static void main(String[] args) {
        createVehicles();
        simulateRace();



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
    private static void simulateRace(){
        boolean isRaining;

        for(int round = 0; round < 50; round++){
            //create a random number and set the isRaining variable true if the number smaller then 30 so is raining
            isRaining = rnd.nextInt(100)+ 1 <= 30;


            for(Racer racer: racers){
                racer.moveForAnHour();
                racer.setIsRaining(isRaining);
            }
        }

    }
    void printResult(){

    }
}
