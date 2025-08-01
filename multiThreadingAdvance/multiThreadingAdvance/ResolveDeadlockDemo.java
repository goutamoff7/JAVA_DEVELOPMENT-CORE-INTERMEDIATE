package multiThreadingAdvance;

class Pen1 {
    public synchronized void writeWithPenAndPaper(Paper1 paper1) {
        System.out.println(Thread.currentThread().getName() +
                " is using " + this.getClass().getName() + " and trying to use " +
                paper1.getClass().getName());
        paper1.finishWriting();
    }

    public synchronized void finishWriting() {
        System.out.println(Thread.currentThread().getName() + " finished using " +
                this.getClass().getName());
    }
}

class Paper1 {
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

class Task3 implements Runnable {

    private final Pen1 pen1;
    private final Paper1 paper1;

    public Task3(Pen1 pen1, Paper1 paper1) {
        this.pen1 = pen1;
        this.paper1 = paper1;
    }

    @Override
    public void run() {
        synchronized (pen1) {
            synchronized (paper1) {
                // Now safe: Thread-1 also acquires pen1 first, then paper1.
                // This consistent locking order across threads prevents circular waiting and deadlock.

                pen1.writeWithPenAndPaper(paper1);
            }
        }
    }


}

class Task4 implements Runnable {

    private final Pen1 pen1;
    private final Paper1 paper1;

    public Task4(Pen1 pen1, Paper1 paper1) {
        this.pen1 = pen1;
        this.paper1 = paper1;
    }

    @Override
    public void run() {
        synchronized (pen1) {
            synchronized (paper1) {
                // Now safe: Thread-2 acquires pen1 lock first, then paper1 lock.
                // This prevents deadlock as it follows the same locking order as Thread-1.

                paper1.writeWithPenAndPaper(pen1);
            }
        }
    }

}


public class ResolveDeadlockDemo {
    public static void main(String[] args) {

        Pen1 pen1 = new Pen1();
        Paper1 paper1 = new Paper1();

        Thread thread1 = new Thread(new Task3(pen1, paper1), "Thread-1");
        Thread thread2 = new Thread(new Task4(pen1, paper1), "Thread-2");

        thread1.start();
        thread2.start();


    }
}

/*
Output :
Thread-1 is using Pen1 and trying to use Paper1
Thread-1 finished using Paper1
Thread-2 is using Paper1 and trying to use Pen1
Thread-2 finished using Pen1
// the program never causing Deadlock
uses - Ordering Resources can break circular wait chains.
 */
