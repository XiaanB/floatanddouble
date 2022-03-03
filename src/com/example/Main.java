package com.example;

public class Main {

    public static void main(String[] args) {
        float myMinFloatValue = Float.MIN_VALUE;
        float myMaxFloatValue = Float.MAX_VALUE;

        System.out.println("Float min " + myMinFloatValue);
        System.out.println("Float max " + myMaxFloatValue);


        Double myMinDoubleValue = Double.MIN_VALUE;
        Double myMaxDoubleValue = Double.MAX_VALUE;

        System.out.println("Double min " + myMinDoubleValue);
        System.out.println("Double max " + myMaxDoubleValue);

        int myIntValue = 5/3;
        float myFloatValue = 5f/3f;
        double myDoubleValue = 5d/3d;

        System.out.println("myIntValue = " + myIntValue);
        System.out.println("myFloatValue = " + myFloatValue);
        System.out.println("myDoubleValue = " + myDoubleValue);

        double numberOfPounds = 1;
        double convertedKilograms = (numberOfPounds * .45359237);
        System.out.println("pounds to kilograms = " + convertedKilograms);
    }
}
