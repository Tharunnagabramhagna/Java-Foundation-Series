/* Write a Java program containing a method calculate(int a, int b). The method should perform
division and declare ArithmeticException using the throws keyword. Call this method from main() and
handle the exception using try-catch. Also demonstrate what happens when b = 0. */

import java.util.Scanner;

public class Code_18_Calculate {
    int calculate(int a,int b) {
        if(b == 0)
            throw new ArithmeticException("Error : Can't Divide with zero.");
        return a / b;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Code_18_Calculate cal = new Code_18_Calculate();

        System.out.print("Enter the values of a and b : ");
        int a = sc.nextInt();
        int b = sc.nextInt();

        try {
            int res = cal.calculate(a, b);
            System.out.println("Result of Division : "+res);
        } catch(ArithmeticException e) {
            System.out.println(e.getMessage());
        }

        sc.close();
    }
}
