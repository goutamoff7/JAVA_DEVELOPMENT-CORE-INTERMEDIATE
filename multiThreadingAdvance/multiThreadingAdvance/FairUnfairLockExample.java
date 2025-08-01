package multiThreadingAdvance;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class FairUnfairLockExample {

    private final Lock lock = new ReentrantLock(); // Unfair lock
//    private final Lock lock = new ReentrantLock(true); // fair lock

    public void accessResource() {
        for (int i = 0; i < 3; i++) {
            lock.lock();
            try {
                System.out.println(Thread.currentThread().getName() + " acquired lock." + i);
                Thread.sleep(100);
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            } finally {
                System.out.println(Thread.currentThread().getName() + " released lock."  + i);
                lock.unlock();
            }
        }
    }


    public static void main(String[] args) {
        FairUnfairLockExample fairUnfairLockExample = new FairUnfairLockExample();

        Thread t1 = new Thread(fairUnfairLockExample::accessResource,"Thread 1");
        Thread t2 = new Thread(fairUnfairLockExample::accessResource,"Thread 2");
        Thread t3 = new Thread(fairUnfairLockExample::accessResource,"Thread 3");

        t1.start();
        t2.start();
        t3.start();
    }
}

/*
unfair lock  can cause starvation to Thread 3 - getting chance at 13th position
Thread 1 acquired lock.0
Thread 1 released lock.0
Thread 1 acquired lock.1
Thread 1 released lock.1
Thread 1 acquired lock.2
Thread 1 released lock.2
Thread 2 acquired lock.0
Thread 2 released lock.0
Thread 2 acquired lock.1
Thread 2 released lock.1
Thread 2 acquired lock.2
Thread 2 released lock.2
Thread 3 acquired lock.0
Thread 3 released lock.0
Thread 3 acquired lock.1
Thread 3 released lock.1
Thread 3 acquired lock.2
Thread 3 released lock.2
 */

/*
fair lock   No Starvation to Thread 3 - getting chance at 5th position
Thread 1 acquired lock.0
Thread 1 released lock.0
Thread 2 acquired lock.0
Thread 2 released lock.0
Thread 3 acquired lock.0
Thread 3 released lock.0
Thread 1 acquired lock.1
Thread 1 released lock.1
Thread 2 acquired lock.1
Thread 2 released lock.1
Thread 3 acquired lock.1
Thread 3 released lock.1
Thread 1 acquired lock.2
Thread 1 released lock.2
Thread 2 acquired lock.2
Thread 2 released lock.2
Thread 3 acquired lock.2
Thread 3 released lock.2
 */

