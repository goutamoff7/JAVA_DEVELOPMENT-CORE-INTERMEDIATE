package multiThreadingAdvance;

public class ThreadMethodInterrupt extends Thread {

    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            Thread thread = Thread.currentThread();
            System.out.println(thread.getName() +
                    " - Priority : " + thread.getPriority() + " - count : " + i);
            try {
                Thread.sleep(1000); // Sleep for 1 second
            } catch (InterruptedException e) {
                System.out.println(thread.getName() + " is Interrupted during sleep");
            }
        }
        System.out.println(Thread.currentThread().getName() + " has exited the run method.");
    }

    public static void main(String[] args) throws InterruptedException {
        ThreadMethodInterrupt t1 = new ThreadMethodInterrupt();
        t1.setName("MyThread");
        t1.start();

        // Main thread sleeps to allow t1 to start and go into sleep
        Thread.sleep(2000); // Let t1 print 2 iterations (approx)

        // Now interrupt t1 while it's likely sleeping
        t1.interrupt();

        // Wait for t1 to finish
        t1.join();

        System.out.println("Main thread exiting.");
    }
}

/*
What does t1.interrupt() do?
It sends an interrupt signal to the thread t1.

This sets the interrupt flag of that thread to true.

If the thread is sleeping, waiting, or blocked,
it will immediately throw an InterruptedException.

If the thread is running normally and not in a sleep/wait/block state,
it does not throw an exception, but the interrupt flag will remain true.
 */
