package samplejavaprograms;
import java.util.*;

public class Datatypes_q11 {
    public static void main(String[] args) {
        final double PI = 3.14159;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter radius: ");
        double r = sc.nextDouble();

        double area = PI * r * r;
        double circumference = 2 * PI * r;

        System.out.printf("Area: %.2f\nCircumference: %.2f\n", area, circumference);
        sc.close();
    }
}