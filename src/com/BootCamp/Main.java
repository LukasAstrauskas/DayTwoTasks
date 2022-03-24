package com.BootCamp;

import com.BootCamp.DayFour.SecondTask;
import com.BootCamp.DayThreeTasks.DayThreeTasksOneAndTwo;

public class Main {

    public static void main(String[] args) {
        // write your code here
        SecondTask sT = new SecondTask();
        int count0 = sT.count("junit high cola cola santa   main");
        int count1 = sT.count("Alica junit checks high " +
                "cola cola    santa   main     all less alica");
        int count2 = sT.count("cola cOla ColA all less");
        System.out.println("0: "+count0);
        System.out.println("1: "+count1);
        System.out.println("2: "+count2);
    }

}
