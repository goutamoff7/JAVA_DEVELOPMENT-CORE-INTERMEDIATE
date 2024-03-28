package multiThreading;
class Daemon1 implements Runnable
{
    public void run()
    {
        if(Thread.currentThread().isDaemon())
            System.out.println("Daemon Thread");
        else
            System.out.println("Child Thread");
    }
}
class DaemonThread_Case1
{
    public static void main(String[] args) 
    {
        System.out.println("Main Thread");
        
        Daemon1 d1 = new Daemon1();
        Thread t = new Thread(d1);
        t.start(); 
        t.setDaemon(true);  // set thread as Deamon Thread after starting cause java.lang.IllegalThreadStateException
       


    }
}