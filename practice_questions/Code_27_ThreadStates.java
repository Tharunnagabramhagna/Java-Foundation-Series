/* Write a Java program to demonstrate different states of a thread. Create a thread, display 
its state before start(), after start(), and after it completes execution. Use Thread.sleep() 
in the run() method to make the thread's state observable. Explain the states observed. */

class Mythread extends Thread {
    public void run() {
        try {
            Thread.sleep(2000);
        } catch(InterruptedException e) {
            System.out.println(e);
        }
    }
}

public class Code_27_ThreadStates {
    public static void main(String[] args) throws InterruptedException {
        Mythread t = new Mythread();

        System.out.println("Before Start : "+t.getState());

        t.start();
        Thread.sleep(500);

        System.out.println("After Start : "+t.getState());

        t.join();

        System.out.println("After Completion : "+t.getState());
    }
}
