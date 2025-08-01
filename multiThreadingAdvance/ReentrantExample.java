package multiThreadingAdvance;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class ReentrantExample {

    private final Lock lock = new ReentrantLock();

    public void outerMethod(){
        lock.lock();
        try{
            System.out.println(Thread.currentThread().getName()+ " :accessed Outer Method");
            innerMethod();
        }finally {
            lock.unlock();
        }
    }

    private void innerMethod() {
        lock.lock();
        try{
            System.out.println(Thread.currentThread().getName()+ " :accessed Inner Method");
        }finally {
            lock.unlock();
        }
    }

    public static void main(String[] args) {
        ReentrantExample reentrantExample = new ReentrantExample();

        // using Anonymous inner class
        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                reentrantExample.outerMethod();
            }
        };

        Thread t1 = new Thread(runnable,"T1"); // using Anonymous inner class implementation
        Thread t2 = new Thread(()-> reentrantExample.outerMethod(),"T2"); // using Lambda
        Thread t3 = new Thread(reentrantExample::outerMethod,"T3"); // using method reference

        t1.start();
        t2.start();
        t3.start();


    }
}

/*
The key is the term “Reentrant” in ReentrantLock.
A reentrant lock allows the same thread to acquire the same lock multiple times.

So:
1. When outerMethod() locks the lock, the current thread becomes the owner.
2. When innerMethod() tries to lock again,
    Java checks and sees it's the same thread—so it allows it.
3. Each call to lock() must be paired with a call to unlock(),
    which you correctly do in finally.

Internals of ReentrantLock:
1. Internally, it maintains a hold count.
2. Every time lock() is called by the same thread, the count increases.
3. Every time unlock() is called, the count decreases.
4. When the count reaches zero, the lock is finally released.

If we used a non-reentrant lock, or used synchronized on two different objects
in reverse order (classic deadlock), then deadlock could occur.

Locks are object-level, not class-level — different instances have different locks

If two different instance of ReentrantExample class is used to create two threads then each
thread will operate independently, because each instance has its own separate ReentrantLock
object, so there will be no actual locking between the threads.
 */
