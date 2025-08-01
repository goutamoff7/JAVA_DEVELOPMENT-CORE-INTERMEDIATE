package multiThreadingAdvance.executorFramework;

import java.util.List;
import java.util.concurrent.*;

public class FutureDemo {
    public static void main(String[] args) throws ExecutionException, InterruptedException {

        // Create a thread pool with a single worker thread
        ExecutorService executorService = Executors.newSingleThreadExecutor();

        // Submit a simple task that returns 25; submit() returns a Future object
        Future<Integer> future = executorService.submit(() -> 25);

        // Check if the task is already done at this moment
        if (future.isDone())
            System.out.println("Task is Done!"); // May or may not print depending on timing

        // Blocks and waits for the result; will wait if task is not yet done
        System.out.println(future.get()); // Prints 25

        // After get(), task is definitely done
        if (future.isDone())
            System.out.println("Task is Done!"); // Will definitely print

        // Graceful shutdown: tells executor to stop accepting new tasks and finish existing
        executorService.shutdown();

        // Forcefully shut down now: interrupts running tasks if any (won’t do much here)
        executorService.shutdownNow();

        // Give some time to allow termination
        Thread.sleep(100);

        // Check if all tasks are finished and executor is fully shut down
        System.out.println(executorService.isTerminated()); // true if all tasks finished
        System.out.println(executorService.isShutdown());   // true (since shutdown was called)

        // Wait at most 100ms for the executor to terminate after shutdown
        System.out.println(executorService.awaitTermination(100, TimeUnit.MILLISECONDS));
        // returns true if terminated within time, false otherwise


        // ---------- SECOND EXECUTOR AND MULTIPLE TASKS using invokeAll()--------------

        // Create another single-threaded executor
        ExecutorService executor = Executors.newSingleThreadExecutor();

        // Three simple tasks returning integers
        Callable<Integer> callable1 = () -> {
            System.out.println("Task-1");
            Thread.sleep(100);
            return 1;
        };

        Callable<Integer> callable2 = () -> {
            System.out.println("Task-2");
            Thread.sleep(100);
            return 2;
        };

        Callable<Integer> callable3 = () -> {
            System.out.println("Task-3");
            Thread.sleep(100);
            return 3;
        };

        // Immutable list of callables created using Java 9's List.of
        List<Callable<Integer>> callableList = List.of(callable1, callable2, callable3);

        // invokeAll submits all tasks and waits for all to finish
        // Returns a list of Future objects in the same order as submitted
        // Submits a collection of Callable tasks, executes them, and waits for all to complete.
        // Blocks the current thread (Main Thread) until all tasks are finished.
        List<Future<Integer>> futures = executor.invokeAll(callableList);

        // Get results from all futures
        for (Future<Integer> f : futures) {
            System.out.println(f.get()); // Will print 1, 2, 3 (in order)
        }

        // ---------- invokeAll() with TimeOuts --------------
        try {
            // Submits a list of Callable tasks and waits up to 100ms for completion
            List<Future<Integer>> futures2 = executor
                    .invokeAll(callableList, 100, TimeUnit.MILLISECONDS);

            // Iterates through the results
            for (Future<Integer> f : futures2) {
                // Will throw ExecutionException if task failed, or CancellationException if timeout
                System.out.println(f.get());
            }
        } catch (CancellationException e) {
            // This will not catch timeout exceptions from invokeAll
            // Timeout will cause individual tasks to be cancelled and get() to throw exceptions
            System.out.println("invokeAll timeouts");
        }

// ---------- invokeAny() --------------
        try {
            // Returns result of the first successfully completed task from the list
            Integer i = executor.invokeAny(callableList);
            System.out.println(i);
        } catch (InterruptedException | ExecutionException e) {
            System.out.println(e.getMessage());
        }

// ---------- invokeAny() with timeouts --------------
        try {
            // Waits up to 100ms for any one task to complete successfully
            Integer i = executor.invokeAny(callableList, 100, TimeUnit.MILLISECONDS);
            System.out.println(i);
        } catch (InterruptedException | ExecutionException | TimeoutException e) {
            // Handles case where no task completes in time or other failures
            System.out.println("Exception Occurred : " + e);
        }

// Shutdown the executor after all tasks are complete
        executor.shutdown();


// ---------- future.get() with timeouts --------------
        ExecutorService executor2 = Executors.newSingleThreadExecutor();
        Future<Integer> futureHello = executor2.submit(() -> {
            try {
                // Simulate long task
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                System.out.println("Exception Occurred : " + e);
            }
            return 26;
        });

        try {
            // Waits up to 1000ms (1 sec), task takes 2 sec => TimeoutException
            Integer i = futureHello.get(1000, TimeUnit.MILLISECONDS);
            System.out.println(futureHello.isDone()); // Should be false due to timeout
            System.out.println(i);
        } catch (TimeoutException e) {
            System.out.println("Timeout get : " + e); // Expected due to 2 sec task vs 1 sec wait
        }


// ---------- future.cancel() ---------------------------
        Future<Integer> futureValue = executor2.submit(() -> {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                System.out.println("Exception Occurred : " + e);
            }
            System.out.println("Hello"); // May or may not print depending on cancellation
            return 42;
        });
        try {
            // Sleep main thread to allow task some time to run
            Thread.sleep(2000); // Task should have completed by now
        } catch (InterruptedException e) {
            System.out.println("Exception Occurred : " + e);
        }

//        If the task is currently running, it should be interrupted using Thread.interrupt().
        futureValue.cancel(true);
//         Tries to cancel the task, but will not interrupt it if it's already running.
        futureValue.cancel(false);

// Prints true if task was cancelled before completing
        System.out.println(futureValue.isCancelled());

// Prints true if task completed (normally or via cancellation)
        System.out.println(futureValue.isDone());

        executor2.shutdown();
        System.out.println("Exits..."); // Final confirmation print

    }
}

