package multiThreadingAdvance.executorFramework;

import java.util.concurrent.*;

public class CallableVsRunnable {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        // Runnable - Implementation of void run() method
//        CE: Bad return type in lambda expression: String cannot be converted to void
//        Runnable runnable = () -> "Runnable task";
        Runnable runnable = () -> System.out.println("Runnable task");
        new Thread(runnable).start(); // Output : Runnable task

        // Callable
        Callable<String> callable = () -> "Callable result";
        ExecutorService executor = Executors.newSingleThreadExecutor();
        // <T> Future<T> submit(Callable<T> task);
        Future<String> future = executor.submit(callable); // Output : Callable result
        System.out.println(future.get()); // Output : Callable result

        Runnable runnable2 = () -> System.out.println("Runnable task-2"); // Output : Runnable task-2
        Future<?> future2 = executor.submit(runnable2); // Future<?> submit(Runnable task);
        System.out.println(future2.get()); // Output : null

        Runnable runnable3 = () -> System.out.println("Runnable task-3"); // Output : Runnable task-3
        Future<Integer> future3 = executor.submit(runnable2,200); // Future<?> submit(Runnable task);
        System.out.println(future3.get()); // 200

        executor.shutdown();
    }
}


/*
| Feature            | Runnable                                          | Callable                                     |
| ------------------ | ------------------------------------------------- | -------------------------------------------- |
| Return value       | Cannot return a result (`void`)                   | Can return a result (`Generics`)             |
| Exception          | Cannot throw checked exceptions                   | Can throw checked exceptions                 |
| Method to override | `run()`                                           | `call()`                                     |
| Introduced in      | Java 1.0                                          | Java 5 (part of `java.util.concurrent`)      |
| Use case           | Simple tasks with no result or exception handling | Tasks that return result or throw exceptions |
| Used with          | `Thread`, `ExecutorService`                       | `ExecutorService` (with `Future`)            |

 */