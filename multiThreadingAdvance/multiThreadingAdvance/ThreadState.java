package multiThreadingAdvance;

public class ThreadState extends Thread{
    @Override
    public void run(){
        System.out.println("RUNNING");
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

    }
    public static void main(String[] args) throws InterruptedException {
        ThreadState t1 = new ThreadState();
        System.out.println(t1.getState());
        t1.start();
        System.out.println(t1.getState());
        Thread.sleep(100);
        System.out.println(t1.getState());
        t1.join();
        System.out.println(t1.getState());
    }
}

/*
- New: A thread is in this state when it is created but not yet started.
- Runnable: After the start method is called, the thread becomes runnable.
            It's ready to run and is waiting for CPU time.
- Running: The thread is in this state when it is executing.
NOTE : in java the State enum has no RUNNING state as this state means the thread is in execution
- Blocked/Waiting: A thread is in this state when it is waiting for a resource or
                    for another thread to perform an action.
- Terminated: A thread is in this state when it has finished executing.
 */
