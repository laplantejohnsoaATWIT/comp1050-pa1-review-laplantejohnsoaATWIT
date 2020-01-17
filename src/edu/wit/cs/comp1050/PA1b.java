package edu.wit.cs.comp1050;

import java.util.Scanner;

//TODO: document this class
public class PA1b {
	
	/**
	 * Error message to display for any non-negative counts 
	 */
	public static final String ERR_MSG = "All coin counts must be non-negative!";

	/**
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		int q, d, n, p;
		double price;
		System.out.print("Enter number of quarters: ");
		q = input.nextInt();
		System.out.print("Enter number of dimes: ");
		d = input.nextInt();
		System.out.print("Enter number of nickels: ");
		n = input.nextInt();
		System.out.print("Enter number of pennies: ");
		p = input.nextInt();
		
		if (q < 0 || d < 0 || n < 0 || p < 0) {
			System.out.println(ERR_MSG);
		} else {
			price = (q*.25 + d*.1 + n*.05 + p*.01);
			System.out.printf("You have $%.2f in coins.%n", price);
		}
		
		
		
	}

}