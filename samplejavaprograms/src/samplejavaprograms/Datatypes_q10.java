package samplejavaprograms;
import java.util.*;
public class Datatypes_q10 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.print("Enter number: ");
		int number = scanner.nextInt();

		if (number % 3 == 0 && number % 5 == 0) {
			System.out.println(number + " is divisible by both 3 and 5.");
		} else {
			System.out.println(number + " is not divisible both by 3 and 5.");
		}
		scanner.close();
	}
}