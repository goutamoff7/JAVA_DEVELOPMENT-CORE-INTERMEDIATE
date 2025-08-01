package multiThreadingAdvance.executorFramework;

import java.sql.SQLOutput;
import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.CyclicBarrier;

// Represents a subsystem that takes some time to initialize
class Subsystem implements Runnable {

    String name;
    long initializationTime;
    CyclicBarrier barrier;

    // Constructor takes a name, simulated init time, and a barrier to wait on
    public Subsystem(String name, long initializationTime, CyclicBarrier barrier) {
        this.name = name;
        this.initializationTime = initializationTime;
        this.barrier = barrier;
    }

    @Override
    public void run() {
        try {
            // Simulating initialization time
            System.out.println(name + " initialization started.");
            Thread.sleep(initializationTime);
            System.out.println(name + " initialization complete.");

            // Subsystem waits at the barrier until all other subsystems reach this point
            barrier.await(); // Once all reach, the barrier’s action runs (Runnable)

        } catch (InterruptedException | BrokenBarrierException e) {
            System.out.println("Exception occurred : " + e);
        }
    }
}

public class CyclicBarrierDemo {
    public static void main(String[] args) {
        int numberOfSystems = 4;

        // Create a CyclicBarrier that waits for 4 threads,
        // then runs the barrier action once all reach the barrier
        CyclicBarrier barrier = new CyclicBarrier(numberOfSystems, new Runnable() {
            @Override
            public void run() {
                // This runs after all subsystems complete initialization
                System.out.println("All subsystems are up and running. System Startup complete.");
            }
        });

        // Create and start threads simulating different subsystems
        Thread webServerThread         = new Thread(new Subsystem("Web Server", 2000, barrier));
        Thread databaseThread          = new Thread(new Subsystem("Database", 4000, barrier));
        Thread cacheThread             = new Thread(new Subsystem("Cache", 3000, barrier));
        Thread messagingServiceThread  = new Thread(new Subsystem("Messaging Service", 3500, barrier));

        webServerThread.start();
        databaseThread.start();
        cacheThread.start();
        messagingServiceThread.start();

        System.out.println("Main Thread Ends..."); // Main Thread is not waiting here
    }
}

/*
Concept              | Method / Usage                         | Description
---------------------+----------------------------------------+-------------------------------------------------------------
Barrier Creation     | new CyclicBarrier(int parties)         | Creates a barrier for a fixed number of threads to wait.
Barrier with Action  | new CyclicBarrier(int, Runnable)       | Executes the given action after all threads reach the barrier.
Thread Waiting       | barrier.await()                        | Called by threads to wait at the barrier.
Barrier Triggered    | After N await() calls                  | When all threads arrive, the barrier releases them together.
Barrier Reuse        | CyclicBarrier is reusable              | Can be reused again after releasing all waiting threads.
Exception Handling   | BrokenBarrierException                 | Thrown if one thread is interrupted or timeout occurs.
Interrupted Handling | InterruptedException                   | If a thread is interrupted while waiting at the barrier.
Example Use Case     | Wait for multiple subsystems to finish | Wait until all services initialize before starting main system.
*/

/*
Feature                | CountDownLatch            | CyclicBarrier
----------------------+---------------------------+--------------------------------
Reusability           | One-time use              | Can be reused after all threads reach the barrier
Waiting Thread Role   | Main thread usually waits | All participating threads must wait
Triggering Action     | No built-in action        | Optional action executed after all threads reach
Decrement Trigger     | Manual countDown()        | Automatic via await() calls

*/