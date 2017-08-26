package com.carRace;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Car implements Racer {
    private static int speedLimit = 110;
    private String name;
    private int distanceTraveled;
    private int normalSpeed;
    private static  List<String> usedName = new ArrayList<>();
    private static Random rnd = new Random();

    static void setSpeedLimit(int limit){
        speedLimit = limit;
    }

    Car(){
        this.name= createName();
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
        if(isRaining){

            setSpeedLimit(70);
        } else {
            setSpeedLimit(100);
        }
    }
    private String createName(){
        String name;
        String[] names = {"Vulture","Phenomenom","Silver","Inferno","Paradox","Crusader","Sanctuary","Adventure","Lioness",
                "Quest","Parallel","Utopia","Hero","Albatross","Guardian","Nimbus","Basilisk","Union","Universe","Albatross",
                "Chase","Cosmos","Mythic","Aurora","Bolt","Resolve","Nebula","Moonlight","Encounter","Inferno"};
        String chose = names[rnd.nextInt(names.length)] + " " + names[rnd.nextInt(names.length)];
        while (usedName.contains(chose)){
            chose = names[rnd.nextInt(names.length)] + " " + names[rnd.nextInt(names.length)];
        }
        usedName.add(chose);
        name = chose;
        return name;
    }
}
