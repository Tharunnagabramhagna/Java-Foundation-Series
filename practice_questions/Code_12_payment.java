/* Create a Java program for a payment system with a parent class
Payment containing a method makePayment(). Create child classes
UPIPayment, CreditCardPayment, and CashPayment that override the
method. Use a parent class reference to invoke the methods of different
child classes and demonstrate runtime polymorphism. */

class payment {
    void makePayment() {
        System.out.println("Processing General payments...");
    }
}

class UPIPayment extends payment {
    @Override
    void makePayment() {
        System.out.println("Processing only UPI payments...");
    }
}

class CreditCardPayment extends payment {
    @Override
    void makePayment() {
        System.out.println("Processing only Credit Card payments...");
    }
}

class CashPayment extends payment {
    @Override
    void makePayment() {
        System.out.println("Processing only Cash payments...");
    }
}

public class Code_12_payment {
    public static void main(String[] args) {
        payment p1 = new payment();
        p1.makePayment();

        UPIPayment u1 = new UPIPayment();
        u1.makePayment();

        CreditCardPayment c1 = new CreditCardPayment();
        c1.makePayment();

        CashPayment cp1 = new CashPayment();
        cp1.makePayment();
    }
}
