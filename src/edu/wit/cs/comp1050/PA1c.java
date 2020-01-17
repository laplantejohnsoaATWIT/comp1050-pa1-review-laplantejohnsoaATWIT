package edu.wit.cs.comp1050;

import java.util.Scanner;

//TODO: document this class
public class PA1c {
	/**
	 * Error message to display for negative amount 
	 */
	public static final String ERR_MSG = "Dollar amount must be non-negative!";
	/**
	 * Method to convert a double to
	 * an integer
	 * 
	 * @param num number to convert
	 * @return converted value
	 */
	public static int convertToInt(double num) {
		return (int) Math.round(num);
	}
	/**
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter total amount: $");
		double priceD = input.nextDouble();
		if (priceD < 0) {
			System.out.println(ERR_MSG);
		} else {
			int q, d, n, p, price;
			price = convertToInt(priceD*100);
			q = price/25;
			price %= 25;
			d = price/10;
			price %= 10;
			n = price/5;
			price %= 5;
			p = price;
			String qplural, dplural, nplural, pplural;
			if (q == 1) {
				qplural = "quarter";
			} else {
				qplural = "quarters";
			}
			if (d == 1) {
				dplural = "dime";
			} else {
				dplural = "dimes";
			}
			if (n == 1) {
				nplural = "nickel";
			} else {
				nplural = "nickels";
			}
			if (p == 1) {
				pplural = "penny";
			} else {
				pplural = "pennies";
			}
			System.out.printf("You have %d %s, %d %s, %d %s, and %d %s.%n", q, qplural, d, dplural, n, nplural, p, pplural);
		}
	}
}
