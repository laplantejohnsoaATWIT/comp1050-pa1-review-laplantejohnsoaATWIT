package edu.wit.cs.comp1050;

import java.util.Scanner;

/**
 * 
 * @author laplantejohnsoa
 *
 */
public class PA1d {
	
	/**
	 * Error message to display for negative amount 
	 */
	public static final String ERR_MSG = "The package cannot be shipped!";
	
	/**
	 * Method to compute shipping cost
	 * 
	 * @param weight, assumed to be in (0, 20]
	 * @return cost to ship
	 */
	public static double shippingCost(double weight) {
		if (weight > 0 && weight <= 1) {
			return 3.5;
		} else if (weight > 1 && weight <= 3) {
			return 5.5;
		} else if (weight > 3 && weight <= 10) {
			return 8.5;
		} else if (weight > 10 && weight <= 20) {
			return 10.5;
		} else {
			return -1;
		}
	}

	/**
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter package weight: ");
		double w = input.nextDouble();
		double cost = shippingCost(w);
		if (cost == -1) {
			System.out.println(ERR_MSG);
		} else {
			System.out.printf("It will cost $%.2f to ship this package.%n", cost);
		}
		
		
	}

}
