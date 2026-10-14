/* Write a Java program containing three methods: main(), calculate(), and divide().
The divide() method should perform division and declare ArithmeticException using the
throws keyword. Allow the exception to propagate through calculate() and handle it in
main() using try-catch. */

public class Code_21_ExceptionPropagation {

    static int divide(int a, int b) throws ArithmeticException {
        return a / b;
    }

    static int calculate(int a, int b) throws ArithmeticException {
        return divide(a, b);
    }

    public static void main(String[] args) {
        try {
            int result = calculate(10, 0);
            System.out.println("Result: " + result);
        } catch (ArithmeticException e) {
            System.out.println("Caught Exception in main: " + e.getMessage());
        }
    }
}