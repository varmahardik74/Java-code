 // Base class
class Person {
    String name;
    int age;

    void displayPerson() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
}

// Single Inheritance: Student inherits from Person
class Student extends Person {
    String course;

    void displayStudent() {
        displayPerson(); // Reuse parent method
        System.out.println("Course: " + course);
    }
}

// Multilevel Inheritance: ResearchStudent inherits from Student
class ResearchStudent extends Student {
    String researchTopic;

    void displayResearchStudent() {
        displayStudent(); // Reuse Student method
        System.out.println("Research Topic: " + researchTopic);
    }
}

// Main class
public class InheritanceDemo {
    public static void main(String[] args) {
        // Single inheritance example
        System.out.println("=== Single Inheritance Example ===");
        Student s = new Student();
        s.name = "Rahul";
        s.age = 20;
        s.course = "Computer Science";
        s.displayStudent();

        // Multilevel inheritance example
        System.out.println("\n=== Multilevel Inheritance Example ===");
        ResearchStudent rs = new ResearchStudent();
        rs.name = "Priya";
        rs.age = 24;
        rs.course = "Data Science";
        rs.researchTopic = "Artificial Intelligence";
        rs.displayResearchStudent();
    }
}
