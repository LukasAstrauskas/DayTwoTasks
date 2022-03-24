package com.BootCamp.DayFour;


import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ColorsList {
    private String[] array = {"dark red", "root blue", "magic orange", "ocean pink",
            "deep dark", "cosmic", "absolute black"};

    private ArrayList<String> colors = new ArrayList<>();

    //    Rewriting from Array to list
    public ArrayList<String> rewrite() {
        Stream<String> stream = Arrays.stream(array);
        stream.forEach(s -> colors.add(s));
        return colors;
    }

    //    Removing 3rd element
    public ArrayList<String> remove() {
        colors.remove(2);
        return colors;
    }

    //    Add new color
    public ArrayList<String> addColor(String color) {
        colors.add(color);
        return colors;
    }

    // Add at beginning
    public ArrayList<String> addColorAtBeginning(String color) {
        colors.add(0, color);
        return colors;
    }

    //    Output all values
    public void printAllVals() {
        colors.forEach(System.out::println);
    }

    //    Create new list (colorsSublist) which will be sublist of the colors list
    //    (will contain elements from index 2 to index 5)
    public List<String> subListIndex25() {
        return colors.subList(2, 5);
    }

    //    Use for loop to output each element of colorsSublist list
    public void printSubList() {
        subListIndex25().forEach(System.out::println);
    }


}
