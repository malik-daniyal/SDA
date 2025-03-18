import java.util.*;

class StudentWithCreator {
    private String name;
    private int age;
    private String grade;

    // Constructor to initialize student details
    public StudentWithCreator(String name, int age, String grade) {
        this.name = name;
        this.age = age;
        this.grade = grade;
    }

    // Getter methods to retrieve student information
    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getGrade() {
        return grade;
    }

    // Method to display student details
    public void displayStudentDetails() {
        System.out.println("Student Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Grade: " + grade);
    }
}

class StudentCreator {
    // Method to create a new student
    public StudentWithCreator createStudent(String name, int age, String grade) {
        return new StudentWithCreator(name, age, grade);
    }
}

public class Main {
    public static void main(String[] args) {
        // Create a creator object
        StudentCreator creator = new StudentCreator();

        // Use the creator to make student objects
        StudentWithCreator student1 = creator.createStudent("Alice", 20, "A");
        StudentWithCreator student2 = creator.createStudent("Bob", 22, "B");

        // Display student details
        student1.displayStudentDetails();
        System.out.println();
        student2.displayStudentDetails();
    }
}
