package multiThreadingAdvance;

public class ThreadMethodYield extends Thread {

    ThreadMethodYield(String name){
        super(name);
    }

    @Override
    public void run() {
        for(int i=0;i<5;i++){
            System.out.println(Thread.currentThread().getName() + " is running ");
            Thread.yield(); // Suggest pausing to allow other Threads
        }
    }

    public static void main(String[] args) throws InterruptedException {

        ThreadMethodYield t1 = new ThreadMethodYield("Thread-0");
        ThreadMethodYield t2 = new ThreadMethodYield("Thread-1");

        t1.start();
        t2.start();

    }
}

/*
yield() method not used
Thread-1 is running
Thread-1 is running
Thread-1 is running
Thread-1 is running
Thread-1 is running
Thread-0 is running
Thread-0 is running
Thread-0 is running
Thread-0 is running
Thread-0 is running
 */

/*
yield() method used
Thread-1 is running
Thread-0 is running
Thread-1 is running
Thread-0 is running
Thread-1 is running
Thread-1 is running
Thread-0 is running
Thread-1 is running
Thread-0 is running
Thread-0 is running
 */

/*
Note :
When Thread.yield() is called:
1. The currently running thread suggests to the JVM that it is okay to pause
and give a chance to other waiting threads.
2. It does not guarantee that the current thread will be paused.
3. It does not release any locks the thread holds.
4. It's a polite request, and the JVM may ignore it.
 */