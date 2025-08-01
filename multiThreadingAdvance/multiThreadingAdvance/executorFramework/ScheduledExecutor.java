package multiThreadingAdvance.executorFramework;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

import java.util.concurrent.*;

public class ScheduledExecutor {
    public static void main(String[] args) {
        ScheduledExecutorService scheduler = Executors.newScheduledThreadPool(2);

        // 1. scheduleAtFixedRate:
        //    - First run after 2 seconds.
        //    - Then runs every 3 seconds, regardless of task duration.
        scheduler.scheduleAtFixedRate(() -> {
            System.out.println("[FixedRate] Task starts at: " + System.currentTimeMillis()/1000);
            try {
                Thread.sleep(3000); // Simulating 1-second task duration
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        }, 1, 2, TimeUnit.SECONDS);

        // 2. scheduleWithFixedDelay:
        //    - First run after 2 seconds.
        //    - Then runs 3 seconds *after* previous task **completes**.
        scheduler.scheduleWithFixedDelay(() -> {
            System.out.println("[FixedDelay] Task starts at: " + System.currentTimeMillis()/1000);
            try {
                Thread.sleep(3000); // Simulating 2-second task duration
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        }, 1, 2, TimeUnit.SECONDS);

        // 3. schedule (One-time task)
        //    - Executes once after 9 seconds.
        //    - Used here to shutdown the executor after observing a few executions.
        scheduler.schedule(() -> {
            System.out.println("Initiating Shutdown at: " + System.currentTimeMillis()/1000);
            scheduler.shutdown();
        }, 20, TimeUnit.SECONDS);
    }
}

/*
+---------------------------+-------------------+---------------------------+------------------+
| Method                    | Initial Delay     | Subsequent Delay          | Based On         |
+---------------------------+-------------------+---------------------------+------------------+
| scheduleAtFixedRate       | 1 seconds         | Every 2 seconds (fixed)   | Start time       |
| scheduleWithFixedDelay    | 1 seconds         | 2 seconds after task ends | End time         |
| schedule                  | 9 seconds         | None (one-time only)      | One-shot task    |
+---------------------------+-------------------+---------------------------+------------------+

*/