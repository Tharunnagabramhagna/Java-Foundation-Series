/* 2. Write a Java program to Create a BankAccount class with Account Number,
Account Holder Name, and Balance. Use a parameterized constructor to
implement three functions Deposit(), Withdraw(), and ShowBalance().
• Prevent withdrawal if balance is insufficient.
• Create at least four account objects.
• Perform multiple deposit and withdrawal operations and show the current
balance.
Sample Output:
Account Number: 1003
Holder Name: Bapan
Current Balance : 18000
Deposit: 7000
Current Balance: 25000
Withdraw: 10000
Current Balance: 15000, (25000-10000)
Withdraw: 30000
Insufficient Balance */

class BankAcc {
    String accHolder;
    int accNo;
    double balance;

    BankAcc(int acc, String name, double bal) {
        accHolder = name;
        accNo = acc;
        balance = bal;
    }

    void Deposit(double amount) {
        if(amount < 0) {
            System.out.println("Invalid, Enter a Valid Amount");
            return;
        }
        balance += amount;
        System.out.println("Deposit : "+amount);
        System.out.println("Current Balance : "+balance);
    }
    
    void withDraw(double amount) {
        if(amount < 0) {
            System.out.println("Invalid, Enter a Valid Amount");
            return;
        }
        if(amount > balance)
            System.out.println("Insufficient Balance");
        else {
            System.out.println("WithDraw : "+amount);
            balance -= amount;
            System.out.println("Current Balance : "+balance);
        }
    }

    void showBalance() {
        System.out.println("Account Number : "+accNo);
        System.out.println("Holder Name : "+accHolder);
        System.out.println("Current Balance : "+balance);
    }
};

public class Code_2_BankAcc {
    public static void main(String[] args) {
        System.out.println("\nBank Account-1 Transaction History : ");
        BankAcc acc1 = new BankAcc(1002,"Tharun",20000);
        acc1.showBalance();
        acc1.Deposit(15000);
        acc1.withDraw(12000);
        
        System.out.println("\nBank Account-2 Transaction History : ");
        BankAcc acc2 = new BankAcc(1003,"Bhargav",50000);
        acc2.Deposit(1000);
        acc2.showBalance();
        acc2.withDraw(2210);

        System.out.println("\nBank Account-3 Transaction History : ");
        BankAcc acc3 = new BankAcc(1003,"Navdeep",3000);
        acc3.Deposit(102);
        acc3.withDraw(10000);
        acc3.showBalance();

        System.out.println("\nBank Account-4 Transaction History : ");
        BankAcc acc4 = new BankAcc(1003,"Vishal",50000);
        acc4.Deposit(1020);
        acc4.withDraw(12000);
        acc4.showBalance();
    }
}