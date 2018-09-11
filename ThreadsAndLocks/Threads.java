/*Threads and Locks*/

/* Every thread in java is controlled by a unique object of the java.lang.Thread class. When a standalone application is run, a user
thread automatically gets created to execute the main() method. This thread is called the main thread. */

/*IMPLEMENTATION ONE: Runnable Interface*/

/* 1. Create a class which implements the runnable interface. An object of this class is a Runnable object.
2. Create an object of Thread by passing a Runnable object as argument to the Thread constructor. The thread object has a Runnable object
that implements the run method. 
3. The start() method is invoked on the Thread object created in the previous step. */

public class RunnableThreadExample implements Runnable {
    public int count;

    public void run() {
        System.out.print("Runnable Thread starting.");
        try {
            while (count < 5){
                Thread.sleep(500);
                count++;
            }
        }
        catch (InterruptedException exe) {
            System.out.print("Runnable Thread Interrupted");
        }
        System.out.print("Runnable Thread Terminating");
    }
}

public static void main(String[] args) {
    RunnableThreadExample instance = new RunnableThreadExample();
    Thread thread = new Thread();
    thread.start();
    while (instance.count != 5) {
        try {
            Thread.sleep(250);
            count++;
        }
        catch {
            exc.printStackTrace();
        }
    }
}

/*EXTENDING THE THREAD CLASS */

public class ThreadExample extends Thread {
    int count = 0;

    public void run() {
        System.out.print("Thread starting.");
        try {
            while (count<5){
                Thread.sleep(500);
                count++;
            }
        } catch {
            System.out.println("Thread terminating");
        }
    }
}

public class ExampleB {

    public static void main(String[] args) {
        ThreadExample instance = new ThreadExample();
        instance.start();

        while (instance.count != 5) {
            try {
                Thread.sleep(250);
            }
            catch (InterruptedException exc) {
                exc.printStackTrace();
            }
        }
    }
}
/*call start on the instance itself*/


/*Discussion of Extending vs Implementing the Runnable*/
1) Java does not support multiple inheritance and subclass doesn't extend any other class. 
2) A class might only be interested in being runnable therefore inheriting full overhead of Thread class is excessive*/

