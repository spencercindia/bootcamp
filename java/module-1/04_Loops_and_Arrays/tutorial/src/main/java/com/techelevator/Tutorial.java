package com.techelevator;

public class Tutorial {

    public static void main(String[] args) {
        for (int i = 0; i <= 5; i++) {
            System.out.println(i);
        }
        for (int i = 5; i > 0; i--) {
            System.out.println(i);
        }
        int[] forecastTemperatures = new int [5];
        forecastTemperatures[0] = 72;
        forecastTemperatures[1] = 78;
        forecastTemperatures[2] = 58;
        forecastTemperatures[3] = 79;
        forecastTemperatures[4] = 74;
        forecastTemperatures[2] += 10;
        for (int i = 0; i <= forecastTemperatures.length; i++) {
            System.out.println(forecastTemperatures[i]);
        }

    }
}
