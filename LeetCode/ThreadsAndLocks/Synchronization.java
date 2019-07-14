/*SYNCHRONIZATION */

/* Threads within the same process share the same memory space, which is both a positive and a negative. It enables threads to share data, which
can be valuable. However, it also creates the opportunity for issues when two threads modify a resource at the same time. Java provides 
synchronization in order to control access to shared resources. 

We restrict the access to shared resources through the keyword synchronized. It cn be applied to methods and code blocks, and restricts multiple
threads from executing code simultaneously on same object. */

public class MyClass extends Thread {
    private String name;
    private MyObject myObj;

    public MyClass(MyObject obj, String n) {
        name = n;
        myObj = obj;
    }

    public void run() {
        myObj.foo(name);
    }
}

public class MyObject {
    public synchronized void foo(String name) {
        try {
            
        }catch {
            
        }
    }
}

/*Object methods synchronizing happens when you call methods on the same object. Class synchronization leads to a class lock */
/* You can similarly synchronize a block of code which operates very similarly to synchronizing a method */

