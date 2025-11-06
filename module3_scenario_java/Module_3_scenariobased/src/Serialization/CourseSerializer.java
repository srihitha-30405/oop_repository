package Serialization;

import java.io.*;
import java.util.*;

class Course implements Serializable {
    private int courseId;
    private String title;
    private int credits;
    private transient String instructorNotes; // excluded from serialization

    public Course(int courseId, String title, int credits, String instructorNotes) {
        this.courseId = courseId;
        this.title = title;
        this.credits = credits;
        this.instructorNotes = instructorNotes;
    }

    public String toString() {
        return "CourseID: " + courseId + ", Title: " + title + ", Credits: " + credits +
               ", Notes: " + instructorNotes;
    }
}

public class CourseSerializer {
    public static void main(String[] args) {
        List<Course> courses = Arrays.asList(
            new Course(301, "Mathematics", 4, "Focus on calculus"),
            new Course(302, "Physics", 3, "Include lab sessions"),
            new Course(303, "Computer Science", 5, "Project-based learning")
        );

        // Serialize
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("courses.ser"))) {
            oos.writeObject(courses);
            System.out.println("Courses serialized to courses.ser");
        } catch (IOException e) {
            System.out.println("Serialization error: " + e.getMessage());
        }

        // Deserialize
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream("courses.ser"))) {
            List<Course> deserializedCourses = (List<Course>) ois.readObject();
            System.out.println("\nDeserialized Courses:");
            for (Course course : deserializedCourses) {
                System.out.println(course); // instructorNotes will be null
            }
        } catch (IOException | ClassNotFoundException e) {
            System.out.println("Deserialization error: " + e.getMessage());
        }
    }
}
