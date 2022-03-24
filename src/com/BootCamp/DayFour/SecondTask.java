package com.BootCamp.DayFour;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class SecondTask {


    public int count(String text) {
        Set<String> set = new HashSet<>();
        String[] strings = text.split("\s+");
        Arrays.stream(strings)
                .map(String::toLowerCase)
                .forEach(set::add);
        return set.size();
    }


}
