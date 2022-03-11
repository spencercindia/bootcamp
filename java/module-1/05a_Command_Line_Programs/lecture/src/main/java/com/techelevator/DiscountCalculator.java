package com.techelevator;

import java.util.Scanner;

class DiscountCalculator {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to the Discount Calculator");

        System.out.print("Enter the discount amount (w/out percentage): ");
        String lineInput = scanner.nextLine();
        double discountPercent = Double.parseDouble(lineInput);

        // Prompt the user for a series of prices
        System.out.print("Please provide a series of prices (space separated): ");

        lineInput = scanner.nextLine();

        String[] priceArray = lineInput.split(" ");
        double[] priceArrayDou = new double[priceArray.length];
        for (int i = 0; i < priceArray.length; i++) {
            System.out.println(Double.parseDouble(priceArray[i])*(discountPercent/100));
        }



    }

}