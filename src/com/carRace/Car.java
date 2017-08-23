package com.carRace;

import java.util.Random;

public class Car implements Racer {
    private static int speedLimit = 110;
    private String name;
    private int distanceTraveled;
    private int normalSpeed;

    static void setSpeedLimit(int limit){
        speedLimit = limit;
    }

    Car(String name){
        Random speed = new Random();
        this.name= name;
        this.normalSpeed = speed.nextInt(31) + 80;
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
        if (speedLimit < normalSpeed){
            distanceTraveled += speedLimit;
        } else {
            distanceTraveled += normalSpeed;
        }
    }
}
