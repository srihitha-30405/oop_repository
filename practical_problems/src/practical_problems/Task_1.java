package practical_problems;

import java.util.Scanner;

class Student {
    String name;
    int rollNo;
    int[] marks;

    void setter(String name, int rollNo, int[] marks) {
        this.name = name;
        this.rollNo = rollNo;
        this.marks = marks;
    }

    void getter() {
        System.out.println("Name of the Student: " + name);
        System.out.println("Roll Number of the Student: " + rollNo);
        System.out.println("Marks of the Student: ");
        for (int m : marks) {
            System.out.print(m + " ");
        }
        System.out.println();
    }
}

public class Task_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Name of Student: ");
        String name = sc.next();

        System.out.print("Enter Roll Number of Student: ");
        int rollNo = sc.nextInt();

        System.out.print("Enter number of subjects: ");
        int n = sc.nextInt();
        int[] marks = new int[n];

        for (int i = 0; i < n; i++) {
            System.out.print("Enter mark for subject " + (i + 1) + ": ");
            marks[i] = sc.nextInt();
        }

        Student student = new Student();
        student.setter(name, rollNo, marks);
        student.getter();

        sc.close();
    }
}