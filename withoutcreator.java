

class WithoutCreator {
    private String name;
    private int age;
    private String grade;

    // Constructor to initialize student details
    public WithoutCreator(String name, int age, String grade) {
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

    public static void main(String[] args) {
        // Create student objects directly
        WithoutCreator student1 = new WithoutCreator("Alice", 20, "A");
        WithoutCreator student2 = new WithoutCreator ("Bob", 22, "B");

        // Display student details
        student1.displayStudentDetails();
        System.out.println();
        student2.displayStudentDetails();
    }
}
