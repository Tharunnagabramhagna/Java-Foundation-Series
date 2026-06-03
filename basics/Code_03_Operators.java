// Basic Concepts:
// a + b = c
// a, b, c are operands
// +, = are operators

import java.util.Scanner;

public class Code_03_Operators {
    public static void main(String[] args) {
        // Types of Operators

        // 1) Arithmetic operators (+,-,*,/,%,++,--)
        System.out.println("11+10 : " + (11 + 10));
        System.out.println("100-76 : " + (100 - 76));
        System.out.println("20*10 : " + (20 * 10));
        System.out.println("8/4 : " + (8 / 4));
        System.out.println("9%4 : " + (9 % 4)); // Modulo operator => gives remainder
        int inc = 10;
        System.out.println("Value of inc before increment : " + inc);
        inc++;
        System.out.println("Value of inc after increment : " + inc);
        double dec = 10007.6;
        System.out.println("Value of dec before decrement: " + dec);
        dec--;
        System.out.println("Value of dec after decrement: " + dec);

        // 2) Assignment Operators (=, +=, -=, *=, /=, %=)
        int a = 10;
        System.out.println("\nValue assigned to a: " + a);
        int b = 3;
        System.out.println("Original value of b : " + b);
        b += a;
        System.out.println("Changed value of b : " + b);
        b -= a;
        System.out.println("Changed value of b : " + b);
        b *= a;
        System.out.println("Changed value of b : " + b);
        b /= a;
        System.out.println("Changed value of b : " + b);
        b %= a;
        System.out.println("Changed value of b : " + b);

        // 3) Relational Operators (==,>=,<=,!=)
        System.out.println("\n3 == b : " + (3 == b));
        System.out.println("10 >= 5 : " + (10 >= 5));
        System.out.println("100 <= 50 : " + (100 <= 50));
        System.out.println("5 != 7 : " + (5 != 7));

        // 4) Logical Operators (&& , || , !)
        System.out.println("(a == 5) && (a >= b) : " + (a == 5 && a >= b));
        System.out.println("(a == 10) || (a >= b) : " + (a == 10 || a >= b));
        System.out.println("!false : " + (!false));

        // 5) Bitwise Operators (&,|)
        System.out.println("\n5 & 2 : " + (5 & 2));
        System.out.println("12 | 10 : " + (12 | 10));

        // Operator Precedence and Associativity

        // Example-1
        int exp = 6 * 5 - 34 / 2;
        // 30 - (34/2)
        // 30 - 17
        // 13
        System.out.println("\nValue of exp: " + exp);

        // Example-2
        int exp0 = 60 / 5 - 3 * 12;
        // 12 - 36
        // -24
        System.out.println("Value of exp0: " + exp0);

        // Practice Question

        /*
         * 1) Write a user input java program to calculate the
         * determinant of a quadratic equation
         */

        // Ans)
        int x, y, z;
        System.out.println("\n--Determinant of a quadratic equation--\n");
        Scanner obj = new Scanner(System.in);
        System.out.print("Enter the values of x, y and z: ");
        x = obj.nextInt();
        y = obj.nextInt();
        z = obj.nextInt();
        int det = (y * y - 4 * x * z) / (2 * x);
        System.out.println("Determinant of the equation: " + det);
        obj.close();
    }
}
