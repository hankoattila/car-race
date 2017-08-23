package com.carRace;

import java.util.Random;

public class Car implements Racer {
    private int normalSpeed;
    private int distanceTraveled;
    private String name;

    Car(String name){
        Random speed = new Random();
        this.name= name;
        this.normalSpeed = speed.nextInt(31) + 80;
    }


    static void setSpeedLimit(int Limit){

    }

    public void setIsRaining(boolean isRaining){

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

    }
}
