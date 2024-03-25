package multiThreading;

class MyThread2 implements Runnable
{
    public void run()
    {
        try
        {
            System.out.println("Practice Multi-Threading-1");
            System.out.println("Practice Multi-Threading-2");
            Thread.sleep(2000);
            System.out.println("Practice Multi-Threading-3");
            System.out.println("Practice Multi-Threading-4");
            Thread.sleep(1000);
            System.out.println("Practice Multi-Threading-5");
        }
        catch(InterruptedException e)
        {
            System.out.println(Thread.currentThread().getName()+" Inturrupted, no Further Execution");
        }
    }
}
class Thread_InBuilt_Methods
{
    public static void main(String[] args) {
        System.out.println("main Thread Started");
        MyThread2 m2 = new MyThread2();
        Thread t = new Thread(m2);
        System.out.println(t.isAlive()); // checking that the thread is registered to Thread Scheduler or not
        t.setName("My Thread");
        t.start();
        t.interrupt(); // inturrupt the thread (no further execution -> termination), it only works only if the thread is in blocked or waiting state.
        System.out.println(t.isAlive());
        try
        {
            t.join(); // It will put the current thread (here main Thread) on wait until the thread (t) on which it is called is dead.
            
            //t.join(2000); //It will put the current thread (here main Thread) on wait until the thread(t) on which it is called is dead or wait for specified time (here 2000 milliseconds)
            
        }
        catch(InterruptedException e)
        {
            e.printStackTrace();
        }
        

        System.out.println("main thread Ended");
    }
}