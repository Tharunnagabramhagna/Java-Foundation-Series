/* Write a Java program to demonstrate the use of try-catch and throws together. Create a method
withdraw(int balance, int amount) that uses the throws keyword in its method declaration and throws
an exception if the withdrawal amount is greater than the available balance. Call the withdraw()
method from the main() method and use a try-catch block to handle the exception. If the withdrawal is
successful, display the remaining balance; otherwise, display an appropriate error message. */

import java.util.Scanner; // to import input object

public class Code_19_Withdraw {

    void withdraw(int bal, int amt) throws IllegalArgumentException {
        if(amt > bal)
            throw new IllegalArgumentException("Error : Insufficient Balance.");
        System.out.println("Remaining Balance : "+bal);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Code_19_Withdraw atm = new Code_19_Withdraw();

        try {
            System.out.print("Enter your amount and balance : ");
            int balance = sc.nextInt();
            int amount = sc.nextInt();
            atm.withdraw(balance, amount);
        } catch(IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }

        sc.close();
    }
}
