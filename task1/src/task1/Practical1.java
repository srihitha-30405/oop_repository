package task1;

class Student {
    
    private String name;
    private int rollNumber;
    private int[] marks;

    public Student() {
        marks = new int[5]; 
    }
    public String getName() {
        return name;
    }

    public int getRollNumber() {
        return rollNumber;
    }

    public int[] getMarks() {
        return marks;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setRollNumber(int rollNumber) {
        this.rollNumber = rollNumber;
    }

    public void setMarks(int[] marks) {
        this.marks = marks;
    }

    public void displayInfo() {
        System.out.println("Name: " + name);
        System.out.println("Roll Number: " + rollNumber);
        System.out.print("Marks: ");
        for (int mark : marks) {
            System.out.print(mark + " ");
        }
        System.out.println();
    }
}

public class Practical1 {

    public static void main(String[] args) {
       
        Student student = new Student();

        student.setName("Srihitha");
        student.setRollNumber(405);
        student.setMarks(new int[]{100, 100, 100, 100, 100});

        System.out.println("Student Information:");
        System.out.println("Name: " + student.getName());
        System.out.println("Roll Number: " + student.getRollNumber());
        System.out.print("Marks: ");
        for (int mark : student.getMarks()) {
            System.out.print(mark + " ");
        }
        System.out.println();

    }
}