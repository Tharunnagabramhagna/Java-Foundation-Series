/* Write a Java program to demonstrate the use of a finally block. The program should perform an
operation inside try, handle any exception using catch, and display "Program execution completed"
from the finally block. */

import java.util.Scanner;

public class Code_16_Finally {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the values of a and b : ");
        int a = sc.nextInt();
        int b = sc.nextInt();

        try {
            int res = a / b;
            System.out.println("Result of Division between a and b : "+res);
        } catch(ArithmeticException e) {
            System.out.println("Error : Can't be divided with zero.");
        } finally {
            System.out.println("Program execution completed.");
        }

        sc.close();
    }
}
