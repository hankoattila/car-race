package com.carRace;

import java.util.Random;

public class Car implements Racer {
    private static int speedLimit = 110;
    private static boolean isRaining;
    private String name;
    private int distanceTraveled;
    private int normalSpeed;
    Random rnd = new Random();

    static void setSpeedLimit(int limit){
        speedLimit = limit;
    }

    Car(String name){
        this.name= name;
        this.normalSpeed = rnd.nextInt(31) + 80;
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

    @Override
    public void setIsRaining(boolean isRaining) {

    }
}
