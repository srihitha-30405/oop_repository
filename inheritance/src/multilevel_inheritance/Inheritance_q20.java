package multilevel_inheritance;
class Person {
    String name;
    int age;

    Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    void displayInfo() {
        System.out.println("Name: " + name + ", Age: " + age);
    }
}


class Student extends Person {
    String studentID;

    Student(String name, int age, String studentID) {
        super(name, age); 
        this.studentID = studentID;
    }

    @Override
    void displayInfo() {
        super.displayInfo(); 
        System.out.println("Student ID: " + studentID);
    }
}

// Further derived class
class GraduateStudent extends Student {
    String thesisTitle;

    GraduateStudent(String name, int age, String studentID, String thesisTitle) {
        super(name, age, studentID); // call Student constructor
        this.thesisTitle = thesisTitle;
    }

    void submitThesis() {
        System.out.println(name + " submitted thesis: " + thesisTitle);
    }
}

// Main class to test
public class Inheritance_q20 {
    public static void main(String[] args) {
        GraduateStudent gs = new GraduateStudent("Srihitha", 18, "2420030405", "Object oriented programming");

        gs.displayInfo();     
        gs.submitThesis();   
    }
}
