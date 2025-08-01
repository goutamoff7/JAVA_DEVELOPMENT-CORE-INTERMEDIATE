package multiThreadingAdvance.executorFramework;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class CachedThreadPoolExample {
    public static void main(String[] args) {
        ExecutorService executor = Executors.newCachedThreadPool();

        // Submit 10 tasks rapidly
        for (int i = 1; i <= 1000; i++) {
            int taskId = i;
            executor.submit(() -> {
                System.out.println("Task " + taskId + " is running on thread " +
                        Thread.currentThread().getName());
                try {
                    Thread.sleep(2000); // Simulate some work
                } catch (InterruptedException e) {
                    Thread.currentThread().interrupt();
                }
            });
        }

        executor.shutdown(); // Don't forget to shut it down
    }
}

/*
+-----------------------------+---------------------------------------------------------------+
|           Use              |                         Explanation                           |
+-----------------------------+---------------------------------------------------------------+
| ✅ Use when                |                                                               |
+-----------------------------+---------------------------------------------------------------+
| Many short tasks           | Threads reused quickly, ideal for lightweight operations      |
| Bursty traffic             | Handles sudden surges of jobs without queueing                |
| Low latency needed         | Avoids queuing; immediately executes tasks                    |
| Need dynamic scaling       | Automatically increases/decreases threads as required         |
+-----------------------------+---------------------------------------------------------------+
| ❌ Avoid when              |                                                               |
+-----------------------------+---------------------------------------------------------------+
| Long-running tasks         | Too many threads may pile up, exhausting CPU or memory        |
| Need fixed thread limits   | Cannot control maximum thread count                           |
| System resource constraints| No bound → risk of memory leaks or performance degradation    |
| Predictable throughput     | Fixed or bounded pools give more consistent performance       |
+-----------------------------+---------------------------------------------------------------+

*/
