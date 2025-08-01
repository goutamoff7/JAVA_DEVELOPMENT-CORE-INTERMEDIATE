package multiThreadingAdvance;

import java.util.concurrent.atomic.AtomicInteger;

// Class that uses AtomicInteger for thread-safe counter
class VolatileCounter {
    // AtomicInteger ensures atomic (thread-safe) operations on the counter
    private final AtomicInteger counter = new AtomicInteger(0);

    // Atomically increments the counter by 1
    public void increment() {
        counter.incrementAndGet(); // Equivalent to ++counter, but atomic
    }

    // Gets the current value of the counter
    public int getCounter() {
        return counter.get();
    }
}

public class AtomicIntegerDemo {
    public static void main(String[] args) throws InterruptedException {
        VolatileCounter volatileCounter = new VolatileCounter();

        // Thread t1 will increment the counter 1000 times
        Thread t1 = new Thread(() -> {
            for (int i = 0; i < 1000; i++) {
                volatileCounter.increment();
            }
        });

        // Thread t2 will also increment the counter 1000 times
        Thread t2 = new Thread(() -> {
            for (int i = 0; i < 1000; i++) {
                volatileCounter.increment();
            }
        });

        // Start both threads
        t1.start();
        t2.start();

        // Wait for both threads to complete
        t1.join();
        t2.join();

        // Final counter should be 2000 (1000 + 1000)
        System.out.println("counter : " + volatileCounter.getCounter());
    }
}

/*
What is AtomicInteger?
AtomicInteger is a class in java.util.concurrent.atomic package used for lock-free,
thread-safe operations on integers.

🔸 Why Not Just int or Integer?
If you use a plain int with multiple threads incrementing it (e.g., counter++), race conditions may occur.

counter++ is not atomic — it's a read-modify-write operation.

Threads may overwrite each other's updates, resulting in incorrect counts.

✅ Key Features of AtomicInteger :

| Method                          | Description                                                    |
| ------------------------------- | -------------------------------------------------------------- |
| `incrementAndGet()`             | Atomically increments the value by 1 and returns the result    |
| `decrementAndGet()`             | Atomically decrements the value by 1 and returns the result    |
| `addAndGet(int delta)`          | Atomically adds `delta` and returns the result                 |
| `get()`                         | Returns the current value                                      |
| `getAndSet(int newValue)`       | Sets to new value atomically and returns old value             |
| `compareAndSet(expect, update)` | Atomically sets value to `update` if current value is `expect` |

🔒 Atomic vs synchronized

| Feature     | `AtomicInteger`              | `synchronized` block                   |
| ----------- | ---------------------------- | -------------------------------------- |
| Performance | Faster (lock-free)           | Slower (uses locks)                    |
| Granularity | Fine (per-variable)          | Coarse (entire code block/method)      |
| Use case    | Simple counters, flags, etc. | Complex logic needing mutual exclusion |

*/