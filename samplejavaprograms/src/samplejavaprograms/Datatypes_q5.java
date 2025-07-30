package samplejavaprograms;

import java.util.Scanner;

public class Datatypes_q5{

	public static void main(String[] args) {
		// Create a Scanner object for input
		Scanner scanner = new Scanner(System.in);

		// Accept a character from the user
		System.out.print("Enter a character: ");
		char ch = scanner.next().charAt(0);

		// Get ASCII value and convert to integer
		int asciiValue = (int) ch;

		// Display results
		System.out.println("The ASCII value of '" + ch + "' is: " + asciiValue);
		System.out.println("Converted to integer: " + asciiValue);

		scanner.close();
	}
}