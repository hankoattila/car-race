package com.carRace;

public class Car implements Racer {
    private int normalSpeed;
    private String name;

    Car(String name){
        this.name= name;
    }


    static void setSpeedLimit(int Limit){

    }

    public void setIsRaining(boolean isRaining){

    }

    @Override
    public String getName() {
        return null;
    }

    @Override
    public int getDistanceTraveled() {
        return 0;
    }

    @Override
    public void moveForAnHour() {

    }
}
