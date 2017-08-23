package com.carRace;

import java.util.Random;

public class Motorcycle implements Racer {
    private static int nameNumber = 1;
    private static boolean isRaining;
    private int speed = 100;
    private String name;
    private int distanceTraveled;
    Random rnd = new Random();

    Motorcycle(){
        name = "Motorcycle" + nameNumber;
        nameNumber++;
    }
    public void setIsRaining(boolean isRaining){
        this.isRaining = isRaining;
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
        if(this.isRaining){
            speed = rnd.nextInt(46) + 50;
        } else {
            speed = 100;
        }
        distanceTraveled += speed;
    }
}
