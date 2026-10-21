/* Write a Java program to create two threads by implementing the Runnable interface. Each thread
should print its name five times. Start both threads and observe their execution. */

class MyThread implements Runnable {
    public void run() {
        for(int i = 1; i <= 5; i++)
            System.out.println(Thread.currentThread().getName());
    }
}

public class Code_25_RunnableThreads {
    public static void main(String[] args) {
        MyThread obj = new MyThread();

        Thread mt1 = new Thread(obj, "Thread-1");
        Thread mt2 = new Thread(obj, "Thread-2");

        mt1.start();
        mt2.start();
    }
}
