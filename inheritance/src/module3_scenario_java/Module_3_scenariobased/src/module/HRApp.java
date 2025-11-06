package module;
import java.io.*;

class Employee implements Serializable {
    private String name;
    private int id;
    private double salary;
    private transient String password; // will not be serialized

    public Employee(String name, int id, double salary, String password) {
        this.name = name;
        this.id = id;
        this.salary = salary;
        this.password = password;
    }

    public void display() {
        System.out.println("Name: " + name + ", ID: " + id + ", Salary: " + salary + ", Password: " + password);
    }
}

public class HRApp {
    public static void main(String[] args) {
        Employee emp = new Employee("John Doe", 101, 75000, "securePass123");

        // Serialize
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("employee.ser"))) {
            oos.writeObject(emp);
            System.out.println("Employee serialized.");
        } catch (IOException e) {
            e.printStackTrace();
        }

        // Deserialize
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream("employee.ser"))) {
            Employee deserializedEmp = (Employee) ois.readObject();
            System.out.println("Employee deserialized:");
            deserializedEmp.display(); // Password will be null
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
