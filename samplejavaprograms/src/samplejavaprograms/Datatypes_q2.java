package samplejavaprograms;
import java.util.*;
public class Datatypes_q2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input: Student details
        System.out.print("Enter Student Name: ");
        String name = scanner.nextLine();

        System.out.print("Enter Roll Number: ");
        int rollNumber = scanner.nextInt();

        System.out.print("Enter Age: ");
        int age = scanner.nextInt();

        System.out.print("Enter Gender (M/F): ");
        char gender = scanner.next().charAt(0);

        System.out.print("Enter Percentage: ");
        float percentage = scanner.nextFloat();

        // Output: Formatted Student Details
        System.out.println("\n----- Student Details -----");
        System.out.println("Name: " + name);
        System.out.println("Roll Number: " + rollNumber);
        System.out.println("Age: " + age);
        System.out.println("Gender: " + gender);
        System.out.printf("Percentage: %.2f%%\n", percentage);

        scanner.close();
    }
}

