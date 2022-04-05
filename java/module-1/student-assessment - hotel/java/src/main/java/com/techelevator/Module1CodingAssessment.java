package com.techelevator;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Module1CodingAssessment {

	public static void main(String[] args) {
		HotelReservation newReservation = new HotelReservation("Spencer", 2);
		List<HotelReservation> myReservations = new ArrayList<>();

		File reservationFile = new File("data-files/HotelInput.csv");
		try (Scanner dataInput = new Scanner(reservationFile)) {
			while (dataInput.hasNextLine()) {
				String thisLine = dataInput.nextLine();
				String[] thisLineAsArray = thisLine.split(",");
				myReservations.add(new HotelReservation(thisLineAsArray[0], Integer.parseInt(thisLineAsArray[1])));
			}
		} catch (FileNotFoundException exception) {
			exception.getMessage();
		}

		BigDecimal reservationTotal = new BigDecimal("0.00");
		for (HotelReservation reservation : myReservations) {
			reservationTotal = reservationTotal.add(reservation.getEstimatedTotal());
		}
		System.out.println(reservationTotal);
	}

}
