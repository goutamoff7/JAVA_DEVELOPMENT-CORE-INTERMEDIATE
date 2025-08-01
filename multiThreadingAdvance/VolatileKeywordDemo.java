package multiThreadingAdvance;

// SharedObject with a volatile boolean flag
class SharedObject {
    // Volatile ensures visibility of changes to 'flag' across threads
    private volatile boolean flag = false;

    // Method to set the flag to true
    public void setFlagTrue() {
        System.out.println(Thread.currentThread().getName() + " made the flag true");
        flag = true; // Writer thread sets the flag
    }

    // Method to wait until flag becomes true
    public void printIfFlagTrue() {
        while (!flag) {
            // Busy-wait: continuously checking flag (can cause high CPU usage)
        }
        System.out.println(Thread.currentThread().getName() + " read the flag");
        System.out.println("Flag is True!");
    }
}

public class VolatileKeywordDemo {
    public static void main(String[] args) {
        SharedObject resource = new SharedObject();

        // Writer thread will change the flag after 1 second
        Thread writerThread = new Thread(() -> {
            try {
                Thread.sleep(1000); // Simulate delay
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
            resource.setFlagTrue(); // Set the flag to true
        });

        // Reader thread will keep checking the flag until it becomes true
        Thread readerThread = new Thread(resource::printIfFlagTrue);

        writerThread.setName("Writer-Thread");
        readerThread.setName("Reader-Thread");

        // Start both threads
        writerThread.start();
        readerThread.start();
    }
}
/*
 Explanation of volatile Keyword
The volatile keyword in Java is used to ensure visibility of changes to variables across threads.

🔸 Problem Without volatile
If flag were not marked as volatile, the readerThread might:

Cache the value of flag in its CPU core.

Never see the update made by writerThread, leading to an infinite loop in while (!flag).

This is due to CPU-level caching and compiler optimizations in a multithreaded environment.

🔸 What volatile Does:
Prevents Caching: Tells the JVM that flag is shared, so it must always read the latest value from main memory.

Guarantees Visibility: Any write to a volatile variable by one thread is visible to all other threads.

Does NOT Provide Atomicity: volatile is not suitable for operations like count++ or check-then-act, which require atomicity (use AtomicInteger or synchronized blocks for that).

✅ When to Use volatile
Use volatile when:

Only one thread writes, others only read.

The variable is used as a flag or signal (as in our example).

Operations on the variable are independent (no compound actions).
 */
