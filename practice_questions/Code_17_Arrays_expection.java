/* Write a Java program that accepts an array and an index from the user. 
Use multiple catch blocks to handle ArrayIndexOutOfBoundsException and InputMismatchException. */

import java.util.InputMismatchException;
import java.util.Scanner;

public class Code_17_Arrays_expection {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            int[] arr = new int[5];

            for(int i = 0; i < arr.length; i++)
                arr[i] = 0;

            System.out.println("Array Before Input : ");
            for(int el : arr)
                System.out.print(el+" ");

            System.out.print("\nEnter the value and index number : ");
            int val = sc.nextInt();
            int idx = sc.nextInt();
            arr[idx] = val;

            System.out.println("Array After Input : ");
            for(int el : arr)
                System.out.print(el+" ");
        } catch(ArrayIndexOutOfBoundsException e) {
            System.out.println("Error : The provided index is not in the bound of array size.");
        } catch(InputMismatchException e) {
            System.out.println("Error : You entered an Different Datatype!");
        }

        sc.close();
    }
}
