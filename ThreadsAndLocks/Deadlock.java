/*Locks*/

/*For more granular control you can utilize a lock. A lock is used to synchronize access to shared resource by associating the resource with 
the lock. A thread gets access to a shared resource by first acquiring the lock associated with the resource. At most one thread can hold 
the lock, and only one thread can access the shared resources. */

/* A lock is used to synchronize access to a shared resource by associating the resource with a lock. A thread gets shared resource access by 
acquiring the lock associated with the resource. At any time, at most one thread can hold the lock, only one thread accesses the shared 
resource 

Use case for a lock is when a resource is accessed from multiple places, but should only be accessed one at a time by the thread.
*/

public class LockedATM {
    private Lock lock;
    private int balance = 10;

    public LockedATM() {
        lock = new ReentrantLock();
    }

    public int withdraw(int value) {
        lock.lock();
        int temp = balance;
        try {
            Thread.sleep(100);
            temp = temp - value;
            balance = temp;
        }
        catch (InterruptedException exc) {
            lock.unlock();
            return temp;
        }
    }

    public int deposit(int value) {
        lock.lock();
        int temp = balance;
        try {
            thread.sleep(100);
            temp = temp + value;
            thread.sleep(300);
            balance = temp;
        }
        catch (InterruptedException e) {
            lock.unlock();
            return temp;
        }
    }
}

/*Deadlocks and Deadlock Prevention */

/* A deadlock is a situation where a thread is waiting for an object lock that another thread holds, and this second thread is waiting for an
object lock that the first thread holds. Each thread is waiting for the other thread to relinquish a lock, they both remain waiting forever.

The Four Conditions Are Met: 

1. Mutual Exclusion: Only one process accesses a resource at a given time.

2. Hold and Wait: Process already holding a resource can request more resources, without relinquishing their current resources. 

3. No Preemption: One process cannot forcibly remove another process's resource.

4. Circular Wait: Two or more processes form a circular chain where each process is waiting on another resource in the chain. 

Deadlock Prevention entails removing any one of the conditions, but it gets tricky because the conditions are difficult to satisfy. 
*/ 