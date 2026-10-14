/* Write a Java program to create a single thread by extending the Thread class. The
thread should display the numbers from 1 to 10, with a delay of 500 milliseconds
between each number using sleep function. */

class NumberThread extends Thread {
    @Override
    public void run() {
        for (int i = 1; i <= 10; i++) {
            System.out.println(i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                System.out.println("Thread interrupted: " + e.getMessage());
            }
        }
    }
}

public class Code_23_NumberThread {
    public static void main(String[] args) {
        NumberThread thread = new NumberThread();
        thread.start();
    }
}