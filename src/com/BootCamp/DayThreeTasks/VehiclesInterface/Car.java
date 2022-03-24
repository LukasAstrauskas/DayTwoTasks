package com.BootCamp.DayThreeTasks.VehiclesInterface;

public class Car implements Vehicle {


    @Override
    public void steer(Direction direction) {
        if (direction.equals(Direction.LEFT)) {
            System.out.println("Turn left");
        }
        if (direction.equals(Direction.RIGHT)) {
            System.out.println("Turn right");
        }
    }

    @Override
    public void changeSpeed(int speed) {

    }
}
