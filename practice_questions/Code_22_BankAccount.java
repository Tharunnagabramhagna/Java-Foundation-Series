/* Write a Java program to create a method withdraw(int balance, int amount) that
declares an exception using the throws keyword. If the withdrawal amount is greater
than the available balance, generate an exception. Call the method from main() using
try-catch-finally. The catch block should display an appropriate error message, while the
finally block must display "Transaction completed."; regardless of whether the
withdrawal is successful or fails. */

public class Code_22_BankAccount {

    static int withdraw(int balance, int amount) throws Exception {
        if (amount > balance) {
            throw new Exception("Insufficient funds. Withdrawal amount exceeds balance.");
        }
        return balance - amount;
    }

    public static void main(String[] args) {
        int balance = 5000;
        int withdrawAmount = 6000;

        try {
            balance = withdraw(balance, withdrawAmount);
            System.out.println("Withdrawal successful. Remaining balance: " + balance);
        } catch (Exception e) {
            System.out.println("Transaction failed: " + e.getMessage());
        } finally {
            System.out.println("Transaction completed.");
        }
    }
}