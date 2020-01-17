package edu.wit.cs.comp1050;
import java.util.Scanner;

/**
 * 
 * @author laplantejohnsoa
 *
 */
public class PA1e {
	
	/**
	 * Counts the number of upper case characters
	 * within the supplied string
	 * 
	 * @param s input string
	 * @return number of upper case characters
	 */
	public static int numUpperCase(String s) {
		int u = 0;
		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) >= 65 && s.charAt(i) <= 90) {
				u++;
			}
		}
		return u;
	}

	/**
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a string: ");
		String s = input.nextLine();
		int u = numUpperCase(s);
		
		if (u == 0) {
			System.out.println("There are no uppercase characters.");
		} else if (u == 1) {
			System.out.println("There is 1 uppercase character in the string.");
		} else {
			System.out.printf("There are %d uppercase characters in the string.%n", u);
		}
		
	}

}