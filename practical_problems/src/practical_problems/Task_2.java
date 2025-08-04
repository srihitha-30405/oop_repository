package practical_problems;

import java.util.Scanner;

public class Task_2 {
    static class Course {
        private String courseCode;
        private String courseName;

        public Course(String courseCode, String courseName) {
            this.courseCode = courseCode;
            this.courseName = courseName;
        }

        public String getCourseCode() {
            return courseCode;
        }

        public String getCourseName() {
            return courseName;
        }

        public String toString() {
            return courseCode + " - " + courseName;
        }
    }

    static class StudentCourse {
        private String studentId;
        private String studentName;
        private Course[] enrolledCourses;
        private int courseCount;

        public StudentCourse(String studentId, String studentName, int maxCourses) {
            this.studentId = studentId;
            this.studentName = studentName;
            this.enrolledCourses = new Course[maxCourses];
            this.courseCount = 0;
        }

        public void enroll(Course course) {
            if (courseCount < enrolledCourses.length) {
                enrolledCourses[courseCount++] = course;
                System.out.println("Enrolled in: " + course.getCourseName());
            } else {
                System.out.println("Cannot enroll. Maximum course limit reached.");
            }
        }

        public void listCourses() {
            System.out.println("\nCourses enrolled by " + studentName + " (" + studentId + "):");
            if (courseCount == 0) {
                System.out.println("No courses enrolled.");
            } else {
                for (int i = 0; i < courseCount; i++) {
                    System.out.println("  - " + enrolledCourses[i]);
                }
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Student ID: ");
        String studentId = sc.nextLine();
        System.out.print("Enter Student Name: ");
        String studentName = sc.nextLine();
        System.out.print("Enter max number of courses to enroll: ");
        int maxCourses = sc.nextInt();
        sc.nextLine();

        StudentCourse student = new StudentCourse(studentId, studentName, maxCourses);

        Course[] courseList = {
            new Course("CSE101", "Course1"),
            new Course("CSE102", "Course2"),
            new Course("CSE103", "Course3")
        };

        System.out.println("\nAvailable Courses:");
        for (int i = 0; i < courseList.length; i++) {
            System.out.println((i + 1) + ". " + courseList[i]);
        }

        System.out.print("\nHow many courses do you want to enroll in? ");
        int enrollCount = sc.nextInt();

        if (enrollCount > maxCourses) {
            System.out.println("You can only enroll in up to " + maxCourses + " courses.");
            enrollCount = maxCourses;
        }

        for (int i = 0; i < enrollCount; i++) {
            System.out.print("Enter course number to enroll (1 to 3): ");
            int courseNum = sc.nextInt();
            if (courseNum >= 1 && courseNum <= 3) {
                student.enroll(courseList[courseNum - 1]);
            } else {
                System.out.println("Invalid course number.");
            }
        }

        student.listCourses();
        sc.close();
    }
}