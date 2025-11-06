package Serialization;
import java.io.*;
import java.util.*;

class Employee implements Serializable {
    private int id;
    private String name;
    private double salary;

    public Employee(int id, String name, double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    public String toString() {
        return "ID: " + id + ", Name: " + name + ", Salary: " + salary;
    }
}

public class EmployeeSerializer {
    public static void main(String[] args) {
        List<Employee> employees = Arrays.asList(
            new Employee(101, "Alice", 75000),
            new Employee(102, "Bob", 68000)
        );

        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("employees.dat"))) {
            oos.writeObject(employees);
            System.out.println("Employee list serialized to employees.dat");
        } catch (IOException e) {
            System.out.println("Serialization error: " + e.getMessage());
        }
    }
}
