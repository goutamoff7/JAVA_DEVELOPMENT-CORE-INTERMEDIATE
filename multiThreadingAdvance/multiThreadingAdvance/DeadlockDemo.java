package multiThreadingAdvance;

class Pen{
    public synchronized void writeWithPenAndPaper(Paper1 paper1){
        System.out.println(Thread.currentThread().getName() +
                " is using " + this.getClass().getName() + " and trying to use " +
                paper1.getClass().getName());
        paper1.finishWriting();
    }

    public synchronized void finishWriting(){
        System.out.println(Thread.currentThread().getName() + " finished using " +
                this.getClass().getName());
    }
}

class Paper {
    public synchronized void writeWithPenAndPaper(Pen1 pen1) {
        System.out.println(Thread.currentThread().getName() +
                " is using " + this.getClass().getName() + " and trying to use " +
                 pen1.getClass().getName());
        pen1.finishWriting();
    }

    public synchronized void finishWriting() {
        System.out.println(Thread.currentThread().getName() + " finished using " +
                this.getClass().getName());
    }
}

    class Task1 implements Runnable{

        private final Pen1 pen1;
        private final Paper1 paper1;

        public Task1(Pen1 pen1, Paper1 paper1) {
            this.pen1 = pen1;
            this.paper1 = paper1;
        }

        @Override
        public void run() {
            pen1.writeWithPenAndPaper(paper1); // Thread-1 locks Pen1 and try to lock Paper1
        }
    }

    class Task2 implements Runnable{

        private final Pen1 pen1;
        private final Paper1 paper1;

        public Task2(Pen1 pen1, Paper1 paper1) {
            this.pen1 = pen1;
            this.paper1 = paper1;
        }

        @Override
        public void run() {
            paper1.writeWithPenAndPaper(pen1); // Thread-2 locks Paper1 and try to lock Pen1
        }
    }


public class DeadlockDemo {
    public static void main(String[] args) {

        Pen1 pen1 = new Pen1();
        Paper1 paper1 = new Paper1();

        Thread thread1 = new Thread(new Task1(pen1, paper1),"Thread-1");
        Thread thread2 = new Thread(new Task2(pen1, paper1),"Thread-2");

        thread1.start();
        thread2.start();

    }
}

/*
Output :
Thread-1 is using Pen1 and trying to use Paper1
Thread-2 is using Paper1 and trying to use Pen1
// the program never ends, causing Deadlock
 */

/*
Deadlock Reason :
1. Mutual Exclusion: Only one thread can access a resource at any given time.

2. Hold and Wait: A thread holds at least one resource while waiting to acquire
   additional resources held by other threads.

3. No Preemption: Resources cannot be forcibly taken away from a thread;
   they must be released voluntarily.

4. Circular Wait: A circular chain of threads exists,
   where each thread is waiting for a resource held by the next thread in the chain.

All four conditions must be present simultaneously for a deadlock to occur.
To prevent deadlocks, strategies often focus on eliminating one or more of these conditions.
For example:
Resource Allocation Graphs can detect circular waits.
Preemption allows the system to reclaim resources.
Ordering Resources can break circular wait chains.
 */
