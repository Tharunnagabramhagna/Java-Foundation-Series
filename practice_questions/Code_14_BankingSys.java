/* Create a Java program for an online banking system that accepts the account balance and
withdrawal amount from the user. If the withdrawal amount is greater than the available balance, 
handle the situation using exception handling and display an appropriate message. 
Also handle invalid numerical input using a suitable exception. */

import java.util.InputMismatchException;
import java.util.Scanner;

class Bank {
    private double balance;

    public Bank(double balance) {
        this.balance = balance;
    }

    public void withdraw(double amount) throws Exception {
        if (amount > balance)
            throw new Exception("Insufficient Balance! You cannot withdraw more than your balance.");
        balance -= amount;
        System.out.println("Success! Remaining balance: " + balance);
    }
}

public class Code_14_BankingSys {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            System.out.print("Enter initial account balance: ");
            double balance = sc.nextDouble();
            Bank account = new Bank(balance);

            System.out.print("Enter withdrawal amount: ");
            double amount = sc.nextDouble();

            account.withdraw(amount);

        } catch (InputMismatchException e) {
            System.out.println("Error: Please enter numbers only.");
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        } finally {
            sc.close();
        }
    }
}
