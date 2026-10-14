/* Write a Java program to create a method validateMarks(int marks) that validates a
student's marks. If the marks are less than 0 or greater than 100, use the throw keyword
to explicitly generate an IllegalArgumentException. Handle the exception in main()
using try-catch. */

public class Code_20_Valid_marks {

    static void validateMarks(int marks) {
        if (marks < 0 || marks > 100) {
            throw new IllegalArgumentException("Invalid marks: " + marks + ", Marks must be between 0 and 100.");
        }
        System.out.println("Valid marks: " + marks);
    }

    public static void main(String[] args) {
        int[] marks = {85, -5, 105};

        for (int mark : marks) {
            try {
                validateMarks(mark);
            } catch (IllegalArgumentException e) {
                System.out.println("Error: " + e.getMessage());
            }
        }
    }
}