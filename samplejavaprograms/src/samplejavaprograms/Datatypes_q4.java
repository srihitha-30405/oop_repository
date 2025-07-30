package samplejavaprograms;
import java.util.*;
public class Datatypes_q4 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

        System.out.print("Enter value: ");
        double doubleValue = scanner.nextDouble();

        int intValue = (int) doubleValue;

        System.out.println("\nBefore: " + doubleValue);
        System.out.println("After: " + intValue);

        scanner.close();

	}

}