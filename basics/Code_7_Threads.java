// Threads ---> They are used to run multiple tasks at a time in a process.
// Types ---> 1) By Extending Thread Class
//            2) By implementing Runnable Interface

// Type-1 :
class ThreadClass1 extends Thread {
    @Override // This Method is always overrided
    public void run() { // run() => Thread method (or) function 
        for(int i = 1; i <= 5; i++) {
            System.out.println("Thread 1 : Washing my Clothes.");
            System.out.println("There are so many clothes. so, I am Sad!");
        }
    }
}

class ThreadClass2 extends Thread {
    @Override 
    public void run() {
        for(int i = 1; i <= 5; i++) {
            System.out.println("Thread 2 : Checking the Cooker Whistles.");
            System.out.println("I got 2 whitles till now!");
        }
    }
}

// Type-2:
class ThreadRunnable1 implements Runnable {
    public void run() {
        for(int i = 1; i <= 10; i++) {
            System.out.println("I am.. Iron man!");
            System.out.println("I love u 3000");
            System.out.println("Hells answer me.. for i am Doom!");
            System.out.println("3000 Universes are Destroyed.");
        }
    }
}

class ThreadRunnable2 implements Runnable {
    public void run() {
        for(int i = 1; i <= 10; i++) {
            System.out.println("I am the Reverse Flash...");
            System.out.println("I am always one step ahead!");
        }
    }
}

/* Thread Priority Class */

class ThreadPriority extends Thread {
    public ThreadPriority(String name) {
        super(name);
    }
    @Override 
    public void run() {
        System.out.println("Avenger Hero Name : "+this.getName());
    }
}

/* Waiting method => join() */
class ThreadWaiting1 extends Thread {
    @Override 
    public void run() {
        System.out.println("\nThread : Thank you\n");
        try {
            Thread.sleep(19000); // 19 seconds
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

class ThreadWaiting2 extends Thread {
    @Override 
    public void run() {
        System.out.println("\nThread : Thank you so much\n");
        try {
            Thread.sleep(2000); // 2 seconds
        } catch(InterruptedException e) {
            e.printStackTrace();
        }
    }
}

public class Code_7_Threads {
    public static void main(String[] args) {
        System.out.println("\nThread method-1\n");

        ThreadClass1 t1 = new ThreadClass1();
        ThreadClass2 t2 = new ThreadClass2();
        // start() => used to make concurrent thread activate (or) true
        t1.start();
        t2.start();

        // Call the methods
        t1.run();
        t2.run();

        System.out.println("\nThread method-2\n");

        ThreadRunnable1 tr1 = new ThreadRunnable1();
        Thread th1 = new Thread(t1);
        ThreadRunnable2 tr2 = new ThreadRunnable2();
        Thread th2 = new Thread(t2);

        th1.start();
        th2.start();

        tr1.run();
        tr2.run();

        System.out.println("\nThread Priority\n");

        ThreadPriority tp1 = new ThreadPriority("Iron man (Most Important)");
        ThreadPriority tp2 = new ThreadPriority("Hulk");
        ThreadPriority tp3 = new ThreadPriority("Thor (Moderate Important)");
        ThreadPriority tp4 = new ThreadPriority("Black Widow");
        ThreadPriority tp5 = new ThreadPriority("Captain America (Least Important)");
        tp1.setPriority(Thread.MAX_PRIORITY);
        tp3.setPriority(Thread.NORM_PRIORITY);
        tp5.setPriority(Thread.MIN_PRIORITY);
        tp1.start();
        tp2.start();
        tp3.start();
        tp4.start();
        tp5.start();

        System.out.println("\nSorry guys.. Hawkeye will Return in Endgame!");

        System.out.println("\nThread Methods\n");

        ThreadWaiting1 tw1 = new ThreadWaiting1();
        ThreadWaiting2 tw2 = new ThreadWaiting2();

        tw1.start(); // first this runs
        try {
            tw1.join();
        } catch(Exception e) {
            System.out.println(e);
        }
        tw2.start(); // after tw1 this runs
    }
}