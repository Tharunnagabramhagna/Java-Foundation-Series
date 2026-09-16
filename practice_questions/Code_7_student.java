/* Write a Java program for a class Student having overloaded display()
methods: 
• display(String name)
• display(String name, int rollNo)
• display(String name, int rollNo, double marks)
Demonstrate compile-time polymorphism by calling all three methods. */

class Student {
    void display(String name) {
        System.out.println("Name of the Student : " + name);
    }

    void display(String name, int rollNo) {
        display(name);
        System.out.println("Roll Number of the Student : " + rollNo);
    }

    void display(String name, int rollNo, double marks) {
        display(name, rollNo);
        System.out.println("Marks of the student : " + marks);
    }
}

public class Code_7_student {
    public static void main(String[] args) {
        Student s1 = new Student();
        System.out.println("Display-1");
        s1.display("Ravi");
        System.out.println("\nDisplay-2");
        s1.display("Ravi", 678);
        System.out.println("\nDisplay-3");
        s1.display("Ravi", 678, 97);
    }
}
