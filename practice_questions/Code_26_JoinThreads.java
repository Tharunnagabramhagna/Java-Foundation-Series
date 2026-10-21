/* Write a Java program that creates three threads, A, B, and C. Thread A should print numbers from
1 to 5, thread B should print numbers from 6 to 10, and thread C should print numbers from 11 to 15.
Use the join() method to ensure that the threads execute in the order A, then B, then C. */

class A extends Thread {
    public void run() {
        for(int i = 1; i <= 5; i++)
            System.out.println(i);
    }
}

class B extends Thread {
    public void run() {
        for(int i = 6; i <= 10; i++)
            System.out.println(i);
    }
}

class C extends Thread {
    public void run() {
        for(int i = 11; i <= 15; i++)
            System.out.println(i);
    }
}

public class Code_26_JoinThreads {
    public static void main(String[] args) throws InterruptedException {
        A t1 = new A();
        B t2 = new B();
        C t3 = new C();

        System.out.println("Class-A\n");
        t1.start();
        t1.join();
        
        System.out.println("\nClass-B\n");
        t2.start();
        t2.join();
        
        System.out.println("\nClass-C\n");
        t3.start();
        t3.join();
    }
}
