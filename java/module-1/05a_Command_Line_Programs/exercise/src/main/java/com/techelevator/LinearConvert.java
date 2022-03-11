package com.techelevator;
import java.util.Scanner;

//m = f * 0.3048
//f = m * 3.2808399



public class LinearConvert {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		final double METER_CONVERSION = 3.2808399;
		final double FEET_CONVERSION = 0.3048;

		System.out.println("Let's convert meters and feet! ");
		System.out.println("Enter your numerical measurement here: ");
		String userMeasurement = scanner.nextLine();
		System.out.println("Now enter 'm' for meters or 'f' for feet: ");
		String userMeasurementType = scanner.nextLine();
		double finalConversion = 0;
		if (userMeasurementType.equals("m")) {
			finalConversion = Integer.parseInt(userMeasurement)*METER_CONVERSION;
			System.out.println(userMeasurement+userMeasurementType+" is "+finalConversion+"f");
		} else {
			finalConversion = Integer.parseInt(userMeasurement)*FEET_CONVERSION;
			System.out.println(userMeasurement+userMeasurementType+" is "+finalConversion+"m");
		}
	}

}
