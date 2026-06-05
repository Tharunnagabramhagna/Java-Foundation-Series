// Always avoid infinte Loops
// Loops => 3 types -> 1) for loop 2) while loop 3) do-while loop

import java.util.Scanner;

public class Code_05_Loops {
    public static void main(String[] args) {
        // For Loop //

        // Example-1
        for (int i = 0; i < 4; i++)
            System.out.println("Hello World");

        // Example-2
        Scanner input = new Scanner(System.in);

        System.out.println("\n--Printing n numbers using for loop--\n");
        System.out.print("Enter a number : ");
        int n = input.nextInt();
        System.out.print("Output : ");
        for (int i = 0; i <= n; i++)
            System.out.print(i + " ");

        // While Loop //

        // Example-1
        int inc = 1;
        while (inc < 10) {
            System.out.println(inc);
            inc++;
        }

        // Example-2
        System.out.println("\n--Printing n numbers using while loop--\n");
        System.out.print("Enter a number : ");
        int number = input.nextInt();
        System.out.print("Output : ");
        int update = 0;
        while (update <= number) {
            System.out.print(update + " ");
            update++;
        }

        // Example-3
        System.out.println("\n\n--Reverse printing from 10 to 1 : ");
        int a = 10;
        while (a >= 1) {
            System.out.print(a + " ");
            a--;
        }
        System.out.print("\n");

        // Do-while Loop //

        int val = 19;
        System.out.println("\nDo-While Loop");
        do {
            System.out.println(val);
        } while (val < 18);

        // Practice Questions

        // 1) Print the sum of n natural numbers
        // Ans)
        System.out.println("\n--Printing the sum of n natural numbers--\n");
        System.out.print("Enter a number : ");
        int x = input.nextInt();
        int sum = 0;
        for (int i = 1; i <= x; i++)
            sum += i;
        System.out.println("Sum of n natural numbers : " + sum);

        // 2) Print a Table of a number input by the user
        // Ans)
        System.out.println("\n\n--Multiplication Table--\n");
        System.out.print("Enter a number : ");
        int num = input.nextInt();
        System.out.println(num + " Table :");
        for (int i = 1; i <= 10; i++)
            System.out.println((num) + " x " + (i) + " = " + (num * i));

        // 3) Print all even numbers till n
        System.out.println("\n--Printing all even numbers till n--\n");
        System.out.print("Enter a number : ");
        int N = input.nextInt();
        System.out.print("Output : ");
        for (int i = 0; i <= N; i++) {
            if (i % 2 == 0)
                System.out.print(i + " ");
        }
        System.out.print("\n");

        /*
         * 3) Make a menu driven program. The user can enter 2 numbers, either 1 or 0.
         * If the user enters 1 then keep taking input from the user for a student’s
         * marks(out of 100).
         * If they enter 0 then stop.
         * If he/ she scores :
         * Marks >=90 -> print “This is Good”
         * 89 >= Marks >= 60 -> print “This is also Good”
         * 59 >= Marks >= 0 -> print “This is Good as well”
         * Because marks don’t matter but our effort does.
         * (Hint : use do-while loop but think & understand why)
         */
        // Ans)
        System.out.println("\n--Menu Driven Marks input system--\n");
        int marks = 0, z;
        do {
            System.out.print("Enter a number : ");
            z = input.nextInt();
            marks += z;
        } while (z != 0 && z == 1);
        System.out.println("Marks : " + marks);
        if (marks >= 90)
            System.out.println("This is Good");
        else if (marks <= 89 && marks >= 60)
            System.out.println("This is also Good");
        else if (marks <= 59 && marks >= 0)
            System.out.println("This is Good as well");

        input.close();
    }
}
