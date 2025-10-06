package Constructors;

class Student {
    String name;
    int age;

    // Default Constructor
    Student() {
        name = "Unknown";
        age = 0;
    }

    // Parameterized Constructor (1 parameter)
    Student(String n) {
        name = n;
        age = 0; // It's better to initialize age
    }

    // Parameterized Constructor (2 parameters)
    Student(String n, int a) {
        name = n;
        age = a;
    }

    void display() {
        System.out.println("Name is: " + name);
        System.out.println("Age is: " + age);
        System.out.println("--------------------");
    }
}

public class Constructors {
    public static void main(String[] args) {
        // Using 1-parameter constructor
        Student s1 = new Student("Gourav");
        s1.display();

        // Using default constructor
        Student s2 = new Student();
        s2.display();

        // Using 2-parameter constructor
        Student s3 = new Student("Gourav", 20);
        s3.display();

        Student s4 = new Student("Ankit", 22);
        s4.display();

        Student s5 = new Student("sourav");
        s5.display();
    }
}
