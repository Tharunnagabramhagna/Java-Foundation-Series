import java.util.Scanner;

public class Code_02_Variables_and_Input {
    public static void main(String[] args) {
        /* Variables */

        // General concept:
        // Data types: int, float, String, double, boolean, char
        // Keywords include all of the above plus break, continue, etc.
        // A variable is a container that stores data.
        // Identifiers are names for variables, functions, arrays, etc.

        // int datatype
        int val = 10;
        System.out.println("Value of val is " + val);
        // float datatype
        float price = 110.19f;
        System.out.println("Price of Item : " + price);
        // double datatype
        double amount = 15000.17;
        System.out.println("Amount : " + amount);
        // Char datatype
        char alpha = 'z';
        System.out.println("Value of alpha is " + alpha);
        // String datatype
        String n = "Yummy";
        System.out.println("The food is " + n);
        // boolean datatype
        boolean isChar = true;
        System.out.println("is alpha variable a character : " + isChar);

        // Input in Java

        // Steps:
        // 1) Create a Scanner object using the new keyword.
        // 2) Read input into a variable.
        // 3) Print output using that variable.

        // 1) Addition of two numbers
        int a, b;

        Scanner obj = new Scanner(System.in);
        System.out.println("\n--Addition of two numbers--\n");
        System.out.print("Enter values for a and b: ");
        a = obj.nextInt();
        b = obj.nextInt();
        System.out.println("Sum of a and b: " + (a + b));

        obj.close();

        // 2) Add two strings to form a sentence
        String str1 = "\nCool Code with ";
        String str2 = "Tharun";
        System.out.println(str1 + str2);

        // More Examples of Input (Try them on your own)

        // 1)
        // String str1 = "Code with ";
        // String str2;
        // Scanner str = new Scanner(System.in);
        // System.out.println("\n--Addition of two strings--\n");
        // System.out.print("Enter your name : ");
        // str2 = str.next();
        // System.out.println(str1+str2);

        // str.close();

        // 2)
        // double price1;
        // double price2;
        // double price3;

        // Scanner p = new Scanner(System.in);
        // System.out.println("--Addition of three prices--");
        // System.out.print("Enter the values of three prices : ");
        // price1 = p.nextDouble();
        // price2 = p.nextDouble();
        // price3 = p.nextDouble();
        // System.out.println("Final price : "+(price1+price2+price3));

        // p.close();

        // 3)
        // String str3;
        // String str4 = " -The Great Coder";
        // String age1;

        // Scanner obj1 = new Scanner(System.in);
        // System.out.println("\n--Addition of two strings as a para--\n");
        // System.out.print("Enter your name : ");
        // str3 = obj1.nextLine();
        // System.out.print("Enter your age : ");
        // age1 = obj1.nextLine();
        // System.out.println(str3+"\n"+str4);
        // System.out.println("Age of "+str3+" is "+age1);

        // obj1.close();
    }
}
