package com.BootCamp;

import com.BootCamp.DayThreeTasks.DayThreeTasks;

public class Main {

    public static void main(String[] args) {
        // write your code here
        DayThreeTasks dTT = new DayThreeTasks();
        int[] ints = dTT.taskTwo(5, 5, 8, 7);
        for (int i = 0; i < ints.length; i++) {
            System.out.println(ints[i]);
        }

    }

}
