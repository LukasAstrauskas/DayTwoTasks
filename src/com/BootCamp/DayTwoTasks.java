package com.BootCamp;

public class DayTwoTasks {
    public String taskOne(int a, int b) {
        boolean equal = a == b;
        boolean aLessThanB = a < b;
        boolean lessOrEqual = a < b || a == b;
        boolean greater = a > b;
        boolean greaterOrEq = a > b || a == b;

        return "Is " + a + " equal to " + b + " - " + equal +
                "\nIs " + a + " less than " + b + " - " + aLessThanB +
                "\nIs " + a + " less or equal " + b + " - " + lessOrEqual +
                "\nIs " + a + " greater than " + b + " - " + greater +
                "\nIs " + a + " greater or equal to " + b + " - " + greaterOrEq;
    }

    public boolean taskTwo(boolean b1, boolean b2) {
        return b1 == b2;
    }

    public boolean taskThree(int wholeNumber) {
        return wholeNumber % 2 == 0;
    }
    public boolean taskFour(int wholeNumber) {
        return wholeNumber % 2 == 1;
    }
    public  boolean taskFive(boolean bool){
        return !bool;
    }

    public boolean taskSix(int a, int b){
        return a==b || (a<0 && b>0) || (a>1001 && b>1001);
    }

}
