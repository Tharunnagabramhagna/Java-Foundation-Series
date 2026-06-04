import java.util.Scanner;

public class Code_04_Conditional_statements {
    public static void main(String[] args) {
        // if-else statements
        Scanner input = new Scanner(System.in);

        // Example-1
        System.out.println("\n--Age Detection System--\n");
        System.out.print("Enter your age: ");
        int age = input.nextInt();
        System.out.print("Enter your name: ");
        String name = input.next();
        if (age >= 18)
            System.out.println(name + " is an adult");
        else
            System.out.println(name + " is not an adult");

        // Example-2
        System.out.println("\n--Find if a number is even or odd--\n");
        System.out.print("Enter a number: ");
        int num = input.nextInt();
        if (num % 2 == 0)
            System.out.println("Number is Even\n");
        else
            System.out.println("Number is Odd\n");

        // else-if ladder

        // Example-1
        System.out.println("Greatest of two numbers--\n");
        System.out.print("Enter values for a and b: ");
        int a = input.nextInt();
        int b = input.nextInt();
        if (a == b)
            System.out.println("Both are equal\n");
        else if (a > b)
            System.out.println(a + " is greater than " + b);
        else
            System.out.println(b + " is greater than " + a);

        // Practice Question

        // 1) Print the Greeting
        // 1 ---> Hello
        // 2 ---> Namaste
        // 3 ---> Bonjour

        // Ans)
        System.out.println("\nPrinting a Greeting...\n");
        System.out.println("1) English\n2) Hindi\n3) French");
        System.out.print("Enter your choice: ");
        int choice = input.nextInt();
        if (choice == 1)
            System.out.println("Hello");
        else if (choice == 2)
            System.out.println("Namaste");
        else if (choice == 3)
            System.out.println("Bonjour");
        else
            System.out.println("Enter a valid choice.\n");

        // (or)
        // Switch and break statements
        System.out.println("\nPrinting a Greeting in 3 languages...\n");
        System.out.println("1) English\n2) Hindi\n3) French");
        System.out.print("Enter your choice: ");
        int button = input.nextInt();
        switch (button) {
            case 1:
                System.out.println("Hello");
                break;

            case 2:
                System.out.println("Namaste");
                break;

            case 3:
                System.out.println("Bonjour");
                break;

            default:
                System.out.println("Enter a valid choice.\n");
        }

        /*
         * 2) Make a Calculator. Take 2 numbers (a & b) from the user and an operation
         * as
         * follows:
         * 1: + (Addition) a + b
         * 2: - (Subtraction) a - b
         * 3: * (Multiplication) a * b
         * 4: / (Division) a / b
         * 5: % (Modulo or remainder) a % b
         * Calculate the result according to the operation given and display it to the
         * user.
         */

        // Ans)
        System.out.println("\n--Mini Calculator--\n");
        System.out.println("Enter the values of op1 and op2: ");
        int op1 = input.nextInt();
        int op2 = input.nextInt();
        System.out.println("\nCalculator operators:");
        System.out.println("1) Addition: +\n2) Subtraction: -\n3) Multiplication: *");
        System.out.println("4) Division : /\n5) Modulo or remainder : %");
        System.out.print("Enter your choice : ");
        int operator = input.nextInt();
        switch (operator) {
            case 1:
                System.out.println("Result: " + (op1 + op2));
                break;
            case 2:
                System.out.println("Result: " + (op1 - op2));
                break;
            case 3:
                System.out.println("Result: " + (op1 * op2));
                break;
            case 4:
                System.out.println("Result: " + (op1 / op2));
                break;
            case 5:
                System.out.println("Result: " + (op1 % op2));
                break;

            default:
                System.out.println("Enter a valid choice.\n");
        }

        /*
         * 3) Ask the user to enter the number of the month & print the name of the
         * month.
         * For eg - For ‘1’ print ‘January’, ‘2’ print ‘February’ & so on.
         */

        // Ans)
        System.out.println("\n---Month predictor--\n");
        System.out.print("Enter a month number: ");
        int month = input.nextInt();
        switch (month) {
            case 1:
                System.out.println("Result: January");
                break;
            case 2:
                System.out.println("Result: February");
                break;
            case 3:
                System.out.println("Result: March");
                break;
            case 4:
                System.out.println("Result: April");
                break;
            case 5:
                System.out.println("Result: May");
                break;
            case 6:
                System.out.println("Result: June");
                break;
            case 7:
                System.out.println("Result: July");
                break;
            case 8:
                System.out.println("Result: August");
                break;
            case 9:
                System.out.println("Result: September");
                break;
            case 10:
                System.out.println("Result: October");
                break;
            case 11:
                System.out.println("Result: November");
                break;
            case 12:
                System.out.println("Result: December");
                break;

            default:
                System.out.println("Enter a valid choice.\n");
        }

        input.close();
    }
}
