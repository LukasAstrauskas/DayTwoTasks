package com.BootCamp.DayThreeTasks;

import javax.swing.text.html.HTMLDocument;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class DayThreeTasksOneAndTwo {

    public void taskOne() {
        int[][] table = new int[10][10];
        for (int i = 1; i < 11; i++) {
            for (int j = 1; j < 11; j++) {
                table[i - 1][j - 1] = i * j;
                System.out.print(table[i - 1][j - 1]);
            }
            System.out.println("");
        }


    }

    public int[] taskTwo(int a, int b, int c, int d) {
        int[] arr1 = {a, b, c, d};
        int[] arr = new int[4];
        for (int i = 0; i < 4; i++) {
            arr[i] = arr1[i];
        }
        return arr;
    }


}
