package com.carRace;
import java.util.*;


public class Main {

    private static List<Racer> racers = new ArrayList<>();
    private static Random rnd = new Random();
    private static boolean isRaining;

    public static void main(String[] args) {
            createVehicles();
            simulateRace();
            printResult();

    }
    private static void createVehicles(){
        for(int i =0; i<10;i++){
            racers.add(new Car());
            racers.add(new Motorcycle());
            racers.add(new Truck());
        }
    }
    private static void simulateRace(){


        for(int round = 0; round < 50; round++){
            //create a random number and set the isRaining variable true if the number smaller then 30 so is raining
            isRaining = rnd.nextInt(100)+ 1 <= 30;
            for(Racer racer: racers){
                racer.setIsRaining(isRaining);
                racer.moveForAnHour();

            }
        }

    }
    private static void printResult(){

        Collections.sort(racers, new Comparator<Racer>() {
            @Override
            public int compare(Racer o1, Racer o2) {
                return o2.getDistanceTraveled() - o1.getDistanceTraveled();
            }
        });
        int counter = 1;
        for(Racer racer: racers){
            System.out.println(String.format(" %4s",counter+". ") + String.format("%-20s",racer.getName())
                    + String.format("%-10s",Integer.toString(racer.getDistanceTraveled()) + " km")
                    + racer.getClass().getSimpleName()

            );
            counter++;
        }


    }
}
