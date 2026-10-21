/* Write a Java program to create two threads (multi-threading) by extending the Thread class.
Override the run() method to print the odd and even nos from 1 to 100, with a delay of 1000
milliseconds between consecutive numbers. Start the thread using the start() method. */

class oddThread extends Thread {
    @Override
    public void run() {
        for(int i = 1; i <= 100; i += 2) {
            System.out.println("Odd : "+i);
            try {
                Thread.sleep(1000);
            } catch(InterruptedException e) {
                System.out.println("Error : "+e);
            }
        }
    }
}

class evenThread extends Thread {
    @Override
    public void run() {
        for(int i = 2; i <= 100; i += 2) {
            System.out.println("Even : "+i);
            try {
                Thread.sleep(1000);
            } catch(InterruptedException e) {
                System.out.println("Error : "+e);
            }
        }
    }
}

public class Code_24_oddEvenThreads {
    public static void main(String[] args) {
        oddThread t1 = new oddThread();
        evenThread t2 = new evenThread();

        t1.start();
        t2.start();
    }
}