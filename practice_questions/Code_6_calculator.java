/* Write a Java program to create a class Calculator with overloaded add() methods to perform
addition of:
• two integers,
• three integers, and
• two double values.
Create objects and demonstrate all three methods. */

class Calculator {
    void add(int a, int b) {
        System.out.println("Addition of 2 numbers : "+(a+b));
    }
    void add(int a, int b, int c) {
        System.out.println("Addition of 3 numbers : "+(a+b+c));
    } 
    void add(double a, double b) {
        System.out.println("Addition of 2 double values : "+(a+b));
    }
}

public class Code_6_calculator {
    public static void main(String[] args) {
        Calculator cul = new Calculator();
        cul.add(2,3);
        cul.add(2,3,4);
        cul.add(2.5,3.5);
    }
}
