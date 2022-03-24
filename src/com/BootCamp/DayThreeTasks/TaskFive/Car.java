package com.BootCamp.DayThreeTasks.TaskFive;

public class Car extends Vehicle {

    private final int numberOfSeats;
    private final int numberOfGears;
    private int gear;
    private final int maxSpeed;

    public Car(String name, int mass, int yearProduced,
               int speed, int seatsNumber, int maxSpeed, int numberOfGears) {
        super(name, mass, yearProduced, speed);
        this.numberOfSeats = seatsNumber;
        this.gear = 1;
        this.maxSpeed = maxSpeed;
        this.numberOfGears = numberOfGears;
    }

    @Override
    public void drive(int speed) {
        if (speed <= maxSpeed) {
          super.drive(speed);
        } else {
            System.out.println("Speed limit: " + maxSpeed);
        }
    }

    public void changeGears(int gear) {
        if (gear < 1 || gear > numberOfGears) {
            System.out.println("Can change from 1 to " + numberOfGears);
        } else {
            this.gear = gear;
            System.out.println("Gear changed to: " + gear);
        }
    }

    //To be completed
    public void steer() {

    }



    @Override
    public void info() {
        super.info();
        System.out.println(
                "Maximum speed:" + maxSpeed +
                        "\nSeats:" + numberOfSeats
        );
    }
}
