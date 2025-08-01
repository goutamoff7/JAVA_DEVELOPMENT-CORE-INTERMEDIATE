package multiThreading;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReadWriteLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;

class ReadWriteCounter{
    private int count = 0;

    private final ReadWriteLock lock = new ReentrantReadWriteLock();

    private final Lock readLock = lock.readLock();
    private final Lock writeLock = lock.writeLock();

    public void increment(){
        writeLock.lock();
        try{
            count++;
            try {
                Thread.sleep(50);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }finally {
            writeLock.unlock();
        }
    }

    public int getCount(){
        readLock.lock();
        try{
            return count;
        }finally {
            readLock.unlock();
        }
    }
}

public class ReadWriteLockDemo {

    public static void main(String[] args)throws InterruptedException {
        ReadWriteCounter readWriteCounter = new ReadWriteCounter();

        Runnable readTask = () ->{
            for (int i = 0; i < 10; i++)
                System.out.println(Thread.currentThread().getName() +
                        " read : "+ readWriteCounter.getCount());
        };

        Runnable writeTask = () ->{
            for (int i = 0; i < 10; i++) {
                readWriteCounter.increment();
                System.out.println(Thread.currentThread().getName() + " incremented");
            }
        };

        Thread writeThread1 = new Thread(writeTask,"writeThread1");
        Thread writeThread2 = new Thread(writeTask,"writeThread2");
        Thread readThread1 = new Thread(readTask,"readThread1");
        Thread readThread2 = new Thread(readTask,"readThread2");

        writeThread1.start();
        writeThread2.start();
        readThread1.start();
        readThread2.start();

        writeThread1.join();
        writeThread2.join();
        readThread1.join();
        readThread2.join();

        System.out.println("Final count : "+readWriteCounter.getCount());


    }
}

/*
Why Use ReadWriteLock?
Using synchronized or a normal ReentrantLock would block all threads (readers and writers).
But:
1. ReentrantReadWriteLock allows high concurrency by letting multiple readers read
in parallel.

2. Writers still block everyone to prevent inconsistency.

This improves performance when reads are more frequent than writes.

Lock Type	                Allows	                    Blocks
readLock()	-> Multiple readers at the same time ->   All writers
writeLock() ->	Only one writer at a time ->          All readers and other writers
 */