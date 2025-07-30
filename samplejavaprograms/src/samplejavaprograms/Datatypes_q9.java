package samplejavaprograms;
import java.util.*;
public class Datatypes_q9 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.print("Enter first integer: ");
		int a = scanner.nextInt();

		System.out.print("Enter second integer: ");
		int b = scanner.nextInt();

		int andResult = a & b;
		System.out.println("a & b = " + andResult + " (" + Integer.toBinaryString(andResult) + ")");

		int orResult = a | b;
		System.out.println("a | b = " + orResult + " (" + Integer.toBinaryString(orResult) + ")");

		int xorResult = a ^ b;
		System.out.println("a ^ b = " + xorResult + " (" + Integer.toBinaryString(xorResult) + ")");

		int leftShift = a << b;
		System.out.println("a << b = " + leftShift + " (" + Integer.toBinaryString(leftShift) + ")");

		int rightShift = a >> b;
		System.out.println("a >> b = " + rightShift + " (" + Integer.toBinaryString(rightShift) + ")");

		scanner.close();
	}
}