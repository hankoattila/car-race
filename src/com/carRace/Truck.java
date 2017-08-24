package com.carRace;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Truck implements Racer {
    private int speed = 100;
    private int distanceTraveled;
    private int breakdownTurnLeft;
    private String name;
    static private List<String> nameOfTrucks = new ArrayList<>();
    Random rnd = new Random();

    Truck(){
        do {
            name = Integer.toString(rnd.nextInt(1001));
        } while (nameOfTrucks.contains(name));
        nameOfTrucks.add(name);
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public int getDistanceTraveled() {
        return distanceTraveled;
    }

    @Override
    public void moveForAnHour() {
        if(breakdownTurnLeft == 0){
            if(rnd.nextInt(100)+1 <=5){
                breakdownTurnLeft = 1;
            } else {
                distanceTraveled += speed;
            }
        } else {
            breakdownTurnLeft--;
        }
    }

    @Override
    public void setIsRaining(boolean isRaining) {

    }
}
