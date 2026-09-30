/* Write a Java program that accepts two integers from the user and performs division. Use a
try-catch block to handle ArithmeticException when the denominator is zero. */

// Ans)

import java.util.Scanner;

public class Code_15_Division {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the values of a and b : ");
        int a = sc.nextInt();
        int b = sc.nextInt();

        try {
            int result = a / b;
            System.out.println("Result : "+result);
        } catch(ArithmeticException e) {
            System.out.println("Error : Can't be divided with zero.");
        }

        sc.close();
    }
}
