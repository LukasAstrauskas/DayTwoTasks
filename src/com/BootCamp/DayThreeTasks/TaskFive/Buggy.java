package com.BootCamp.DayThreeTasks.TaskFive;

public class Buggy extends Car {

    private boolean offRoadMode;

    public Buggy(String name, int mass, int yearProduced, int speed,
                 int seatsNumber, int maxSpeed, int numberOfGears) {
        super(name, mass, yearProduced, speed, seatsNumber, maxSpeed, numberOfGears);
        this.offRoadMode = false;
    }

    public void setOffRoadMode(boolean onOff){
        this.offRoadMode = onOff;
        if(offRoadMode){
            System.out.println("Off road mode active.");
        } else {
            System.out.println("On road mode.");
        }
    }
}
