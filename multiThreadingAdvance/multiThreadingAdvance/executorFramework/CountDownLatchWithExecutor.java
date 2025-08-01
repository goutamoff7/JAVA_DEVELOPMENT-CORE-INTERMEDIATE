package multiThreadingAdvance.executorFramework;

import java.util.concurrent.*;

// This task simulates a dependent service which takes time to start and notifies when done
class DependentService implements Callable<String> {

    CountDownLatch latch;

    // Constructor takes a latch reference so it can count down after service is ready
    public DependentService(CountDownLatch latch) {
        this.latch = latch;
    }

    @Override
    public String call() throws Exception {
        try {
            // Simulate time-consuming startup
            Thread.sleep(2000);
            System.out.println(Thread.currentThread().getName() + " Service Started....");
            return "ok";
        } finally {
            // Decrease the latch count to signal that this service has finished
            latch.countDown();
        }
    }
}

public class CountDownLatchWithExecutor {
    public static void main(String[] args) throws ExecutionException, InterruptedException {

        int numberOfServices = 3;

        // A fixed thread pool to run 3 services in parallel
        ExecutorService executorService = Executors.newFixedThreadPool(numberOfServices);

        // Create a latch initialized with the number of services
        CountDownLatch latch = new CountDownLatch(numberOfServices);

        // Submit 3 dependent services that will run in parallel
        Future<String> future1 = executorService.submit(new DependentService(latch));
        Future<String> future2 = executorService.submit(new DependentService(latch));
        Future<String> future3 = executorService.submit(new DependentService(latch));

// we don't need future.get() here if we're only waiting for task *completion* (not results)
        // If we want actual results, then use future1.get(), future2.get(), etc.
//        future1.get();
//        future2.get();
//        future3.get();
        
//        latch.await(); // we can use latch.await() to wait indefinitely

        // Wait until either:
        // - All 3 services call latch.countDown(), or
        // - Timeout of 1 second happens
        latch.await(1, TimeUnit.SECONDS);

// Main Thread is waiting here
        System.out.println("All dependent service finished. Started Main service....");

//        executorService.shutdown(); // Use shutdown() for graceful exit.
        // Shutdown all services abruptly (if they are still running).
        executorService.shutdownNow(); // Forces all tasks to stop
    }
}

/*
| Term             | Description                                                                                                                                                            |
| -------------------- | -------------------------------------------------------------------------------------------------------------------------------------------------------------------------- |
| What is it?      | A synchronization aid that allows one or more threads to wait until
|                  | a set of operations being performed in other threads completes.                                        |
| Main Components  | `CountDownLatch(int count)`, `countDown()`, and `await()`                                                                                                                  |
| Typical Use Case | Waiting for several services (or tasks) to finish before proceeding.                                                                                                       |
| How it Works     | 1. Initialize with a count (e.g., 3).
                     2. Each task/thread calls `countDown()` when done.
                     3. The waiting thread calls `await()` and blocks until the count reaches 0. |
*/



