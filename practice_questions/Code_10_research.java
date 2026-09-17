/* Write a Java program to demonstrate multiple inheritance using interfaces. Create two interfaces, Teaching and Research, containing methods teaching () and research() respectively.
Create a class Professor that implements both interfaces and provides implementations for both methods. Create an object of Professor and demonstrate both functionalities. Instructions (USE INTERFACES)
• Write and execute all programs in Java.
• Display suitable output for each program.
• Use appropriate class, method and variable names. */

interface Teaching {
    void teaching();
}

interface Research {
    void research();
}

class Professor implements Teaching, Research {
    public void teaching() {
        System.out.println("Professor is teaching.");
    }

    public void research() {
        System.out.println("Professor is doing research.");
    }
}

public class Code_10_research {
    public static void main(String[] args) {
        Professor professor = new Professor();

        professor.teaching();
        professor.research();
    }
}
