package com.techelevator.farm;

import java.util.Scanner;

public class PlayingWithSwitchStatements {
    public static void main(String[] args) {
        System.out.println("Movie ticket prices: ");
        System.out.println("1. Adult - $14");
        System.out.println("2. Child - $8");
        System.out.println("3. Senior - $11");
        System.out.println("Please enter your choice: ");

        Scanner scanner = new Scanner(System.in);
        String choice = scanner.nextLine();
        System.out.println("Please enter your quantity: ");
        int quantity = Integer.parseInt(scanner.nextLine());
        int total = 0;

        switch (choice) {
            case "1":
                total = quantity * 14;
                break;
            case "2":
                total = quantity * 8;
                break;
            case "3":
                total = quantity * 11;
                break;
            default:
                System.out.println("Invalid entry");
        }
        System.out.println(total);
    }
}
