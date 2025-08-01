package multiThreadingAdvance;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

class BankAccount {
    private int balance = 50;
    private final Lock lock = new ReentrantLock();  // Create a reentrant lock

    public void withdraw(int amount) {
        String threadName = Thread.currentThread().getName();
        System.out.println(threadName + " attempting to withdraw ₹" + amount);

        try {
            // Acquires the lock if it is free within 1 Second else go to else block
            if (lock.tryLock(1000, TimeUnit.MILLISECONDS)) {
                try {
                    if (balance >= amount) {
                        System.out.println(threadName +
                                " proceeding with withdrawal ₹" + amount);
                        Thread.sleep(3000);  // Simulate delay
                        balance -= amount;
                        System.out.println(threadName +
                                " completed withdrawal. Remaining balance: ₹" + balance);
                    } else {
                        System.out.println(threadName +
                                " - Insufficient balance. Current balance: ₹" + balance);
                    }
                } finally {
                    lock.unlock();  // Always release the lock
                }
            } else {
                System.out.println(threadName +
                        " could not acquire the lock. Will try later.");
            }
        } catch (InterruptedException e) {
            System.out.println(threadName + " was interrupted.");
            Thread.currentThread().interrupt();
        }
    }
}

public class CustomLocks {
    public static void main(String[] args) {
        BankAccount account = new BankAccount();

        Runnable task = () -> account.withdraw(50);

        Thread t1 = new Thread(() -> account.withdraw(50), "Thread 1");
        Thread t2 = new Thread(task, "Thread 2");

        t1.start();
        t2.start();
    }
}
